package com.example.pavelgrynko.prog2hwx2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeL = (RelativeLayout)findViewById(R.id.relativeLayaout1);



// кнопка


        LinearLayout liner = new LinearLayout(this);
        liner.setOrientation(LinearLayout.VERTICAL);
        ViewGroup.LayoutParams layoutParams1 = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT  );
        liner.setBackgroundColor(Color.GREEN);
        relativeL.addView(liner, layoutParams1);


        Button but2 = new Button(this);
        but2.setText("Some text");
        liner.addView(but2);

        Button but3 = new Button(this);
        but3.setText("Some text");
        liner.addView(but3);

        Button but4 = new Button(this);
        but4.setText("Some text");
        liner.addView(but4);

        ImageButton imgB3= new ImageButton(this);
        imgB3.setImageResource(R.mipmap.robot2);
        liner.addView(imgB3);










    }
}
