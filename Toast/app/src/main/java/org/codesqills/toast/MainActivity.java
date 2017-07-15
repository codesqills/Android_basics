package org.codesqills.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowLongToast(View v){
        Toast toast = Toast.makeText(getApplicationContext(), "This is a long toast Message", Toast.LENGTH_LONG);
        toast.show();
    }

    public void ShowShortToast(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"This is a short Toast Message",Toast.LENGTH_SHORT);
        toast.show();
    }
}
