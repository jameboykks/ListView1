package com.example.grs.listview1.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.grs.listview1.R;
import com.example.grs.listview1.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gr's on 03/03/18.
 */

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrContact = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact,parent,false);
        TextView tv_name = convertView.findViewById(R.id.tv_name);
        TextView tv_item = convertView.findViewById(R.id.tv_item);
        Contact contact = arrContact.get(position);
        tv_name.setText(contact.getmName());
        tv_item.setText(contact.getmItem());

        return convertView;
    }
}
