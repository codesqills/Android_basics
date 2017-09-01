package org.codesqills.androidlocaldb;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamalshree on 9/1/2017.
 */

public class ContactAdapter extends ArrayAdapter {
    List list=new ArrayList();
    ContactHolder contactHolder;
    public ContactAdapter( Context context,  int resource) {
        super(context, resource);
    }


    public void add(Contacts object){
      super.add(object);
        list.add(object);
  }

    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row;
        row=convertView;
        if(row==null){
            LayoutInflater layoutInflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.listviewlayout,parent,false);
            contactHolder=new ContactHolder();
            contactHolder.name=(TextView)row.findViewById(R.id.name);
            contactHolder.emailaddress=(TextView)row.findViewById(R.id.emailaddress);
            row.setTag(contactHolder);
        }
        else{
            contactHolder=(ContactHolder)row.getTag();
        }
        Contacts contacts=(Contacts)this.getItem(position);
        contactHolder.name.setText(contacts.getName());
        contactHolder.emailaddress.setText(contacts.getEmailaddress());

            return row;
    }

    static class ContactHolder{

        TextView name,emailaddress;
    }
}
