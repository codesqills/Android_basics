package org.codesqills.timepicker;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TimePicker extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
    }

    public void ShowTimeDialog(View v){
        DialogHandler dialog=new DialogHandler();
        dialog.show(getSupportFragmentManager(),"Show_time_dialog");
    }
}
