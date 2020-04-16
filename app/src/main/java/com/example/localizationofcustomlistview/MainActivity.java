package com.example.localizationofcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "Fruit","Fruit",
            "Insect","Vegetable",
            "Vegetable","Fish","Vegetable",
    };

    String[] subtitle ={
            "Apple","Banana",
            "Beetle","Brinjal",
            "Carrot","Gold Fish","Tomato",
    };

    Integer[] imgid={
            R.drawable.apple_icon,R.drawable.banana_icon,
            R.drawable.beetle_icon,R.drawable.brinjal_icon,
            R.drawable.carrot_icon,R.drawable.goldfish_icon,
            R.drawable.tomato_icon,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListView adapter=new MyListView(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"APPLE",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"BANANA",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"BEETLE",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"BRINJAL",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"CARROT",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {

                    Toast.makeText(getApplicationContext(),"GOLD FISH",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {

                    Toast.makeText(getApplicationContext(),"TOMATO",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


}
