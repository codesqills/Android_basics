package org.codesqills.androidlocaldb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by kamalshree on 8/31/2017.
 */

public class ShowUser extends Activity {
     String json_string;

    JSONObject jsonObject;
    JSONArray jsonArray;
    ContactAdapter contactAdapter;
    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showuser);

        contactAdapter=new ContactAdapter(this,R.layout.listviewlayout);
        listView=(ListView)findViewById(R.id.listview);

        listView.setAdapter(contactAdapter);

        json_string=getIntent().getExtras().getString("json_data");

        try {
            jsonObject=new JSONObject(json_string);
            jsonArray=jsonObject.getJSONArray("server_response");

            int count=0;
            String name,emailaddress;
            while(count<jsonArray.length()){
                JSONObject jo=jsonArray.getJSONObject(count);
                name=jo.getString("name");
                emailaddress=jo.getString("emailaddress");
                Contacts contacts=new Contacts(name,emailaddress);
                contactAdapter.add(contacts);
                count++;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
