package com.example.onerow2items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailsListAdapter extends ArrayAdapter<Details> {
    private Context context;
    private int resource;

    public DetailsListAdapter(Context context, int resource, ArrayList<Details> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String pass = getItem(position).getPass();

        Details details = new Details(name, pass);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        TextView tvName = convertView.findViewById(R.id.name);
        TextView tvPass = convertView.findViewById(R.id.pass);

        tvName.setText(name);
        tvPass.setText(pass);

        return convertView;
    }
}
