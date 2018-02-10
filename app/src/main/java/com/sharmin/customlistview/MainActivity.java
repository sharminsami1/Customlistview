package com.sharmin.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView customlist;
    String countryList[]={"Bangladesh", "India", "China", "Usa", "New Zealand", "Australia", "portogal"};
    int flag[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.america,R.drawable.australia,R.drawable.new_zealand,R.drawable.portugle,};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        customlist=(ListView)findViewById(R.id.listview);
CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countryList,flag);
customlist.setAdapter(customAdapter);






    }
}
