package com.ardakazanci.segmentedbuttongroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.addisonelliott.segmentedbutton.SegmentedButtonGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SegmentedButtonGroup s = findViewById(R.id.btnSegmentedButtonGroup);
        s.setOnPositionChangedListener(new SegmentedButtonGroup.OnPositionChangedListener() {
            @Override
            public void onPositionChanged(int position) {
                if(position ==0){
                    Toast.makeText(MainActivity.this, "Login Clicked", Toast.LENGTH_SHORT).show();
                }else if(position == 1){
                    Toast.makeText(MainActivity.this, "Register Clicked", Toast.LENGTH_SHORT).show();
                }else if(position == 2){
                    Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });


       

    }
}
