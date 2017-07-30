package org.codesqills.listviewcsutomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<Courses> mylistitems=new ArrayList<Courses>();
        mylistitems.add(new Courses("Java",R.drawable.ic_action_right_arrow));
        mylistitems.add(new Courses("Android",R.drawable.ic_action_right_arrow));
        mylistitems.add(new Courses("JavaScript",R.drawable.ic_action_right_arrow));
        mylistitems.add(new Courses("HTMl5",R.drawable.ic_action_right_arrow));
        mylistitems.add(new Courses("CSS",R.drawable.ic_action_right_arrow));
        mylistitems.add(new Courses("Php",R.drawable.ic_action_right_arrow));
        mylistitems.add(new Courses("Ruby",R.drawable.ic_action_right_arrow));

        CustomAdapter myadapter=new CustomAdapter(this,mylistitems);

        ListView mylistview=(ListView)findViewById(R.id.mylistview);
        mylistview.setAdapter(myadapter);
    }
}
