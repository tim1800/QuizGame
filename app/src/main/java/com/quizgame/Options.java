package com.quizgame;

/**
 * Created by Deng on 2017/4/5.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Options extends Activity {

    Button btnhard,btnintermediate,btnsimple,btntime,btnuntime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_menu);

        //show admob ads
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btnhard = (Button) findViewById(R.id.btnhard);
        btnsimple = (Button) findViewById(R.id.btnsimple);
        btnintermediate = (Button) findViewById(R.id.btnintermediate);
        btntime = (Button) findViewById(R.id.btntime);
        btnuntime = (Button) findViewById(R.id.btnuntime);

        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnuntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity1.class);
                startActivity(intent);
                finish();
            }
        });
        btnhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnsimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//please implement your own logic
            }
        });

        btnintermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//please implement your own logic
            }
        });

    }

}
