package com.example.multiplebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Object object;
    Button button;
    int choice_button_num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);
        for(int i = 1; i < 4; i++) {

            choice_button_num = i;
            button = new Button(this);
            button.setText(String.valueOf(i));
            object = i;
            button.setTag(object);
            button.setGravity(Gravity.CENTER);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(MainActivity.this,SubActivity.class);
                    object = v.getTag();
                    String evauate_string = object.toString();
                    int id = Integer.parseInt(evauate_string);
                    intent.putExtra("NUM",id);
                    startActivity(intent);

                }
            });
            linearLayout.addView(button);
        }

    }
}
