package com.example.philipsstudygrouphelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton ourButton;
    private TextView ourMessage;
    private TextView at;
    private ImageView Philips;

    private String[] wordList1 = {"24/7", "multi-Tier", "30,00 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
    private String[] wordList2 = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positive", "networked", "focused", "below the line", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
    private String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mind-share", "portal", "space", "vision", "paradigm", "mission"};

    private int oneLength = wordList1.length;
    private int twoLength = wordList2.length;
    private int threeLength = wordList3.length;

    private int rand1;
    private int rand2;
    private int rand3;

    private String phrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ourButton = (ImageButton) findViewById(R.id.button);
        ourMessage = (TextView) findViewById(R.id.textView);
        at = (TextView) findViewById(R.id.textView4);
        Philips = (ImageView) findViewById(R.id.imageView2);

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rand1 = (int) (Math.random() * oneLength);
                rand2 = (int) (Math.random() * twoLength);
                rand3 = (int) (Math.random() * threeLength);

                phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
                at.setText("AT");
                Philips.setImageResource(R.mipmap.phulpu);

                ourMessage.setText("what we need is a " + phrase + ".");

            }
        };

        ourButton.setOnClickListener(ourOnClickListener);
    }
}

