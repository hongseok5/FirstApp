package com.example.abreak.firstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn1 = (Button) findViewById(R.id.btn1);

        setContentView(R.layout.activity_main);
    }

    public void onBtn1Clicked(View v){
            inflateLayout();
    }

    private void inflateLayout(){
        LinearLayout contentsLayout = (LinearLayout) findViewById(R.id.contentsLayout);
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button, contentsLayout, true);

        Button selectButton = (Button) findViewById(R.id.selectButton);
        final CheckBox allDay = (CheckBox) findViewById(R.id.allDay);
        selectButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(allDay.isChecked()){
                    allDay.setChecked(false);
                } else {
                    allDay.setChecked(true);
                }
            }



         });

    }
}
