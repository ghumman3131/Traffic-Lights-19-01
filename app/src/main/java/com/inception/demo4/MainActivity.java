package com.inception.demo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Boolean red = true;

    Boolean yellow = false;

    Boolean green = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runLights(View view) {

        ImageView red_light = findViewById(R.id.red_light);

        ImageView yellow_light = findViewById(R.id.yellow_light);

        ImageView green_light = findViewById(R.id.green_light);



        if(red)
        {
            red_light.setImageDrawable(getResources().getDrawable(R.drawable.off_red ));

            yellow_light.setImageDrawable(getResources().getDrawable(R.drawable.on_yellow));

            yellow = true;

            red = false;

            green = false;

            return;

        }

        if(yellow)
        {
            green_light.setImageDrawable(getResources().getDrawable(R.drawable.on_green ));

            yellow_light.setImageDrawable(getResources().getDrawable(R.drawable.off_yellow));

            red_light.setImageDrawable(getResources().getDrawable(R.drawable.off_red));

            yellow = false;

            red = false;

            green = true;

            return;

        }

        if(green)
        {
            red_light.setImageDrawable(getResources().getDrawable(R.drawable.on_red));

            yellow_light.setImageDrawable(getResources().getDrawable(R.drawable.off_yellow));

            green_light.setImageDrawable(getResources().getDrawable(R.drawable.off_green));

            red = true;

            yellow = false;

            green =false;

            return;

        }


    }
}
