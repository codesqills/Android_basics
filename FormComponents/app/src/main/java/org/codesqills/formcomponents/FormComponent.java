package org.codesqills.formcomponents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class FormComponent extends AppCompatActivity {

    ArrayList<String> colorsseclected = new ArrayList<String>();
    TextView Final_text, Final_city_text;
    String selectedtext = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_component);
        Final_text = (TextView) findViewById(R.id.displaytext);
        Final_city_text = (TextView) findViewById(R.id.city_text);
    }

    public void getColors(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.c1:
                if (checked) {
                    colorsseclected.add(getResources().getString(R.string.color1));
                    Log.w("formcompnent", "green Checked");
                } else {
                    colorsseclected.remove(getResources().getString(R.string.color1));
                }
                break;
            case R.id.c2:
                if (checked) {
                    colorsseclected.add(getResources().getString(R.string.color2));
                } else {
                    colorsseclected.remove(getResources().getString(R.string.color2));
                }
                break;
            case R.id.c3:
                if (checked) {
                    colorsseclected.add(getResources().getString(R.string.color3));
                } else {
                    colorsseclected.remove(getResources().getString(R.string.color3));
                }
                break;
            case R.id.c4:
                if (checked) {
                    colorsseclected.add(getResources().getString(R.string.color4));
                } else {
                    colorsseclected.remove(getResources().getString(R.string.color4));
                }
                break;

            default:
                break;
        }
    }

    public void displayColors(View view) {
        String finaltext = "";

        for (String selections : colorsseclected) {
            finaltext += selections + "\n";
        }
        Final_text.setText(finaltext);
    }


    public void selectCity(View view) {
        Boolean isselected = ((RadioButton) view).isChecked();
        Log.w("checkbox", "slected");
        switch (view.getId()) {

            case R.id.r1:
                if (isselected) {
                    selectedtext = getResources().getString(R.string.city1);
                    Final_city_text.setText(selectedtext);
                    Final_city_text.setEnabled(true);
                } else {
                    Final_city_text.setEnabled(false);
                }
                break;
            case R.id.r2:
                if (isselected) {
                    selectedtext = getResources().getString(R.string.city2);
                    Final_city_text.setText(selectedtext);
                    Final_city_text.setEnabled(true);
                } else {
                    Final_city_text.setEnabled(false);
                }
                break;

            case R.id.r3:
                if (isselected) {
                    selectedtext = getResources().getString(R.string.city3);
                    Final_city_text.setText(selectedtext);
                    Final_city_text.setEnabled(true);
                } else {
                    Final_city_text.setEnabled(false);
                }
                break;
            case R.id.r4:
                if (isselected) {
                    selectedtext = getResources().getString(R.string.city4);
                    Final_city_text.setText(selectedtext);
                    Final_city_text.setEnabled(true);
                } else {
                    Final_city_text.setEnabled(false);
                }
                break;
        }
    }

}
