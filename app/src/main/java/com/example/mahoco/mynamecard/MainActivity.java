package com.example.mahoco.mynamecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nickname = (Button)findViewById(R.id.nickname);
        nickname.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText("まほこ");
            }
        });
    }
}
