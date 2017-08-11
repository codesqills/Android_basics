package org.codesqills.listviewarrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        /* create the ArrayList */
        ArrayList<String> Languages=new ArrayList<String>();
        Languages.add("Android");
        Languages.add("Java");
        Languages.add("HTML5");
        Languages.add("CSS");
        Languages.add("JavaScript");
        Languages.add("Php");
        Languages.add("Jquery");
        Languages.add("Ruby");

        /* create the ArrayAdapter and add the ArrayList Languages */
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Languages);

        /* get teh reference of the list view from the layout file */
        ListView mylistview=(ListView)findViewById(R.id.mylistview);
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              public void onItemClick(AdapterView<?> parent, View view,
                                      int position, long id) {
                  view.setSelected(true);
                  Intent newActivity = new Intent(view.getContext(), sample.class);
                  startActivity(newActivity);

              }
          });
        /* set the Adapter on the ListView */
        mylistview.setAdapter(myAdapter);

    }
}
