package org.codesqills.androidlocaldb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by kamalshree on 8/31/2017.
 */

public class Register extends Activity {
    EditText edit_name,edit_email;
    String name,emailaddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        edit_name=(EditText)findViewById(R.id.name);
        edit_email=(EditText)findViewById(R.id.emailaddress);
    }

    public void userRegsiterProcess(View v){
        name=edit_name.getText().toString();
        emailaddress=edit_email.getText().toString();
        String method="register";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,name,emailaddress);
        finish();
    }
}


