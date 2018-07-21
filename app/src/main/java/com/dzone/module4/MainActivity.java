package com.dzone.module4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton ar,bsf,cisf,crsf,icg,itbp,ndrf,nsg,rpf,sff,spg,ssb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nsg = (ImageButton)findViewById(R.id.nsg);
        nsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NsgActivity.class));
            }
        });

        spg = (ImageButton)findViewById(R.id.spg);
        spg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        rpf = (ImageButton)findViewById(R.id.rpf);
        rpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ndrf = (ImageButton)findViewById(R.id.ndrf);
        ndrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
