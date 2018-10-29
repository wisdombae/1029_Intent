package com.bjh.www.a1029_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        Intent intent;

        switch (id) {
            case R.id.button1:
                intent = new Intent(this, SubActivity1.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(this, SubActivity2.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(this, SubActivity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
