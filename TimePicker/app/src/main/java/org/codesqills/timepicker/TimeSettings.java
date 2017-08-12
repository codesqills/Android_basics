package org.codesqills.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.*;
import android.widget.TimePicker;

/**
 * Created by kamalshree on 8/11/2017.
 */

public class TimeSettings implements TimePickerDialog.OnTimeSetListener{
    Context context;

    public TimeSettings(Context context){
        this.context=context;
    }
    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int min) {
        Toast.makeText(context,"Selected Hour is "+hour+ " and the minute is "+min,Toast.LENGTH_LONG).show();
    }
}
