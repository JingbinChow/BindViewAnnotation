package com.jingbin.activity;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jingbin.bindviewannotation.R;
import com.jingbin.tools.BindView;
import com.jingbin.tools.InitBindView;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv_annotation)
    private TextView tvAnnotation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitBindView.initBindView(this);

        tvAnnotation.setText("Hello Annotation!!!");
    }
}
