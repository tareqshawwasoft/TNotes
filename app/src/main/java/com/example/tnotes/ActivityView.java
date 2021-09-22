package com.example.tnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ActivityView extends AppCompatActivity {
TextView title,des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent intent=getIntent();
        title=findViewById(R.id.showtitle);
        des=findViewById(R.id.showdescription);
        title.setMovementMethod(new ScrollingMovementMethod());
        title.setText(intent.getStringExtra("title"));
        des.setMovementMethod(new ScrollingMovementMethod());
        des.setText(intent.getStringExtra("description"));


    }
}