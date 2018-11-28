
package com.example.multiplebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //渡された値取得
        String text =  String.valueOf(getIntent().getIntExtra("NUM", -999) + "番目のボタンが押されました");
        TextView tx = (TextView)findViewById(R.id.textView);
        tx.setText(text);
    }
}
