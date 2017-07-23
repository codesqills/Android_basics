package org.codesqills.sendemail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    private Button send_button;
    private EditText send_name;
    private EditText send_email;
    private EditText send_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* on button Click */
        send_button=(Button)findViewById(R.id.send);
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Retrieve the form details */
                send_name=(EditText) findViewById(R.id.name);
                send_email=(EditText) findViewById(R.id.email);
                send_message=(EditText) findViewById(R.id.message);

                String name=send_name.getText().toString();
                String email=send_email.getText().toString();
                String message=send_message.getText().toString();

                /* intiate email */
                Intent open_email=new Intent(Intent.ACTION_SEND);

                /* email type , to, pass the form details inside Email */
                open_email.setType("plain/text");
                open_email.putExtra(Intent.EXTRA_EMAIL, new String[]{"XXXX@yyy.com"});
                open_email.putExtra(Intent.EXTRA_SUBJECT,"Form Details");
                open_email.putExtra(Intent.EXTRA_TEXT,"name: " + name + '\n' + "email: " + email + '\n' + "Message: " + message + '\n');

                /* capture the result if the email is sent or not*/
                try {
                    startActivityForResult(Intent.createChooser(open_email, "Send Email"), 1);
                }catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_LONG).show();
                }
             }


        });

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /* if Email sent successfully then open a new window with confirmation message */
        if (requestCode==1) {
            Intent thankYouintent =new Intent(MainActivity.this,Thankyou.class);
            startActivity(thankYouintent);
        }
    }
}
