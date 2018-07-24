package com.custometablayout;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    Button firstButton,secondButton,thirdButton,forthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // tabs
        firstButton = (Button) findViewById(R.id.firstButton);
        secondButton = (Button) findViewById(R.id.secondButton);
        thirdButton = (Button) findViewById(R.id.thirdButton);
        forthButton = (Button) findViewById(R.id.forthButton);

        Resources res = getResources(); // Resource object to get Drawables
        final TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        intent = new Intent().setClass(this, NavigationActivity.class);
        spec = tabHost.newTabSpec("first").setIndicator("First").setContent(intent);
        tabHost.addTab(spec);
        intent = new Intent().setClass(this, NavigationActivity.class);
        spec = tabHost.newTabSpec("second").setIndicator("Second").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, NavigationActivity.class);
        spec = tabHost.newTabSpec("third").setIndicator("Third").setContent(intent);
        tabHost.addTab(spec);


        intent = new Intent().setClass(this, NavigationActivity.class);
        spec = tabHost.newTabSpec("forth").setIndicator("Forth").setContent(intent);
        tabHost.addTab(spec);


        tabHost.setCurrentTab(0);

        firstButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                tabHost.setCurrentTab(0);
                firstButton.setBackgroundResource(R.drawable.shape);
                secondButton.setBackgroundResource(R.drawable.shape_off);
                thirdButton.setBackgroundResource(R.drawable.shape_off);
                forthButton.setBackgroundResource(R.drawable.shape_off);
            }

        });


        secondButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                tabHost.setCurrentTab(1);
                firstButton.setBackgroundResource(R.drawable.shape_off);
                secondButton.setBackgroundResource(R.drawable.shape);
                thirdButton.setBackgroundResource(R.drawable.shape_off);
                forthButton.setBackgroundResource(R.drawable.shape_off);

            }

        });


        thirdButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                tabHost.setCurrentTab(3);
                firstButton.setBackgroundResource(R.drawable.shape_off);
                secondButton.setBackgroundResource(R.drawable.shape_off);
                thirdButton.setBackgroundResource(R.drawable.shape);
                forthButton.setBackgroundResource(R.drawable.shape_off);

            }

        });


        forthButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                tabHost.setCurrentTab(4);
                firstButton.setBackgroundResource(R.drawable.shape_off);
                secondButton.setBackgroundResource(R.drawable.shape_off);
                thirdButton.setBackgroundResource(R.drawable.shape_off);
                forthButton.setBackgroundResource(R.drawable.shape);

            }

        });
    }
}
