package org.codesqills.listviewcsutomadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kamalshree on 7/30/2017.
 */

public class CustomAdapter extends ArrayAdapter<Courses> {


    public CustomAdapter(Activity context, ArrayList<Courses> courses) {
        super(context, 0, courses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.mylistitems, parent, false);
        }

        Courses currentCourses = getItem(position);

        TextView coursetextview=(TextView)listItemView.findViewById(R.id.courses);
        coursetextview.setText(currentCourses.getCourses());


        ImageView arrowimageview=(ImageView)listItemView.findViewById(R.id.arrowimageView);
        arrowimageview.setImageResource(currentCourses.getImageid());

        return listItemView;
    }
}
