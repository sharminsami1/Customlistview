package com.sharmin.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SHARMIN AKTAR on 2/10/2018.
 */

public class CustomAdapter extends BaseAdapter {

    String countryList[];
    int flag[];
    LayoutInflater inflator;




    CustomAdapter(Context context,String[]countryList,int[]flag)


    {

       this.countryList=countryList;
       this.flag=flag;
       inflator=(LayoutInflater.from(context));


    }








    @Override
    public int getCount() {



        return  countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view=inflator.inflate(R.layout.list_item,viewGroup,false);
        ImageView imageView=(ImageView)view.findViewById(R.id.img_flag);
        TextView name=(TextView) view.findViewById(R.id.txt_name);


        imageView.setImageResource(flag[position]);
        name.setText(countryList[position]);



        return view;
    }
}
