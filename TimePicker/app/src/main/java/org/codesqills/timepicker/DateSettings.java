package org.codesqills.timepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by kamalshree on 8/11/2017.
 */

public class DateSettings implements DatePickerDialog.OnDateSetListener{
    Context context;
    public DateSettings(Context context){
        this.context=context;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthofyear, int dayofmonth) {
        Toast.makeText(context,"Selected Date is "+dayofmonth+"/"+monthofyear+"/"+year,Toast.LENGTH_LONG).show();
    }
}
