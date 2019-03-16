package com.example.colores;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Integer> rojos = new ArrayList<>();
    ArrayList<Integer> azules = new ArrayList<>();
    ArrayList<Integer> verdes = new ArrayList<>();
    Button btn_rojo, btn_verde, btn_azul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn_rojo = findViewById(R.id.red_button);
        btn_verde = findViewById(R.id.green_button);
        btn_azul = findViewById(R.id.blue_button);

        btn_rojo.setOnClickListener(this);
        btn_verde.setOnClickListener(this);
        btn_azul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        rojos.add(R.color.red_1);
        rojos.add(R.color.red_2);
        rojos.add(R.color.red_3);
        rojos.add(R.color.red_4);
        rojos.add(R.color.red_5);
        rojos.add(R.color.red_6);

        azules.add(R.color.blue_1);
        azules.add(R.color.blue_2);
        azules.add(R.color.blue_3);
        azules.add(R.color.blue_4);
        azules.add(R.color.blue_5);
        azules.add(R.color.blue_6);

        verdes.add(R.color.green_1);
        verdes.add(R.color.green_2);
        verdes.add(R.color.green_3);
        verdes.add(R.color.green_4);
        verdes.add(R.color.green_5);
        verdes.add(R.color.green_6);

        int B = v.getId();
        int num = (int)(Math.random()*5);
        switch (B){
            case R.id.red_button:
                btn_rojo.setBackground(getResources().getDrawable(rojos.get(num)));
                break;
            case  R.id.blue_button:
                btn_azul.setBackground(getResources().getDrawable(azules.get(num)));
                break;
            case  R.id.green_button:
                btn_verde.setBackground(getResources().getDrawable(verdes.get(num)));
                break;
        }
    }
}
