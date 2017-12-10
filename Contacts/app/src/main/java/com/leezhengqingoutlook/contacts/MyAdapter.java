package com.leezhengqingoutlook.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 李正庆 on 2017/12/10.
 */

public class MyAdapter extends BaseAdapter {
    private List<PhoneInfo> list;
    private Context context;
    public MyAdapter(List<PhoneInfo> list,Context context)
    {
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater=LayoutInflater.from(context);
//        layout= (LinearLayout) inflater.inflate(R.layout.call,null);
//        TextView nametv=(TextView) layout.findViewById(R.id.Phonename);
//        TextView numbertv=(TextView)layout.findViewById(R.id.Phonenumber);
//        nametv.setText(list.get(position).getName());
//        numbertv.setText(list.get(position).getNumber());
        ViewHolder holder;
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(R.layout.call,null);
            holder=new ViewHolder();
            holder.nametv=(TextView) convertView.findViewById(R.id.Phonename);
            holder.numbertv=(TextView)convertView.findViewById(R.id.Phonenumber);
            holder.nametv.setText(list.get(position).getName());
            holder.numbertv.setText(list.get(position).getNumber());
            convertView.setTag(holder);
        }
        else
        {
            holder=(ViewHolder) convertView.getTag();
            holder.nametv.setText(list.get(position).getName());
            holder.numbertv.setText(list.get(position).getNumber());
        }
        return convertView;
    }
    private static class ViewHolder
    {
        private TextView nametv;
        private TextView numbertv;
    }
}
