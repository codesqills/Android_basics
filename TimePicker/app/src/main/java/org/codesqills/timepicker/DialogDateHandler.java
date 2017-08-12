package org.codesqills.timepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by kamalshree on 8/11/2017.
 */

public class DialogDateHandler extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DateSettings dateSetting=new DateSettings(getActivity());
        Calendar cal=Calendar.getInstance();
        int Day=cal.get(Calendar.DAY_OF_MONTH);
        int Month=cal.get(Calendar.MONTH);
        int Year=cal.get(Calendar.YEAR);


        DatePickerDialog dialog=new DatePickerDialog(getActivity(),dateSetting,Year,Month,Day);
        return dialog;
    }



}
