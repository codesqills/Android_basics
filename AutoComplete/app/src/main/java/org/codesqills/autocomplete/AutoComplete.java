package org.codesqills.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoComplete extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] countryname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_keyboards);

        /* Instantiate the object */
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autocompletefield);

        /* get the list of countries from the resource file */
        countryname=getResources().getStringArray(R.array.countries);

        /* create the adapter that reference the resources file */
        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countryname);

        autoCompleteTextView.setAdapter(myadapter);
    }
}
