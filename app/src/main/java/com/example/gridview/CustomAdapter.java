package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    private Context context;
    private int[] icon;
    private String[] versityName;
    private LayoutInflater inflater;



    public CustomAdapter(Context context, int[] icon, String[] versityName) {
        this.context=context;
        this.icon=icon;
        this.versityName=versityName;
    }

    @Override
    public int getCount() {
        return versityName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.sample_view,parent,false);
        }
        ImageView imageView=convertView.findViewById(R.id.sampleImageId);
        TextView textView= convertView.findViewById(R.id.sampleTextViewId);

        imageView.setImageResource(icon[position]);
        textView.setText(versityName[position]);

        return convertView;
    }
}
