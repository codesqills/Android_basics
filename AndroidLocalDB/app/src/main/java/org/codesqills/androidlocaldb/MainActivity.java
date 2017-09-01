package org.codesqills.androidlocaldb;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    EditText ET_NAME,ET_PASS;
    String login_name,login_pass;
    String JSON_String,JSON_ParsedVal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_NAME = (EditText)findViewById(R.id.name);
        ET_PASS = (EditText)findViewById(R.id.emailaddress);
    }

    public void userLogin(View v){
        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,login_name,login_pass);
    }

    public void userRegsiter(View v){
        startActivity(new Intent(this,Register.class));
    }

    public void showuser(View v){

        BackgroundJson BJ = new BackgroundJson(this);
        BJ.execute();

}
    class BackgroundJson extends AsyncTask<Void,Void,String>{
            String json_url;
        Context ctx;

        BackgroundJson(Context ctx)
        {
            this.ctx =ctx;
        }

        @Override
        protected void onPreExecute() {
            json_url="http://codesqills.org/get_json.php";
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected String doInBackground(Void... voids) {
         try{
             URL url = new URL(json_url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder=new StringBuilder();
             while((JSON_String=bufferedReader.readLine())!=null){

                 stringBuilder.append(JSON_String+"\n");

             }
            bufferedReader.close();
             inputStream.close();
             httpURLConnection.disconnect();
             return stringBuilder.toString().trim();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
        }

        @Override
        protected void onPostExecute(String result) {
            JSON_ParsedVal=result;
            if(JSON_ParsedVal!=null){
                Intent i=new Intent(ctx,ShowUser.class);
                i.putExtra("json_data",JSON_ParsedVal);
                startActivity(i);
            }
            else{
                Toast.makeText(getApplicationContext(),"No json Data",Toast.LENGTH_LONG).show();
            }
        }
    }


}
