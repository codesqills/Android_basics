package org.codesqills.timepicker;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;

/**
 * Created by kamalshree on 8/11/2017.
 */

public class DialogHandler extends android.support.v4.app.DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){
        Calendar cal=Calendar.getInstance();
        int hour=cal.get(Calendar.HOUR_OF_DAY);
        int min=cal.get(Calendar.MINUTE);

        TimePickerDialog dialog;
        TimeSettings timeSettings=new TimeSettings(getActivity());

        dialog=new TimePickerDialog(getActivity(),timeSettings,hour,min, android.text.format.DateFormat.is24HourFormat(getActivity()));

        return dialog;
    }
}
