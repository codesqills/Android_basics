package org.codesqills.multipleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private  Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFirstActivity(View v) {
        intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void openSecondActivity(View v) {

        intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void openThirdActivity(View v) {

        intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}