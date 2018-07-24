package com.custometablayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class NavigationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        for (int i = 1; i <= 10; i++) {
            final Button myButton = new Button(this);
            myButton.setText("Button number :" + i);
            myButton.setId(i);
            final int id_ = myButton.getId();

            LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
            myButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            layout.addView(myButton);


            myButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (view.getId()==id_) {
                        myButton.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    }else {
                        myButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    }
                    Toast.makeText(NavigationActivity.this,
                            "Button clicked index = " + id_, Toast.LENGTH_SHORT)
                            .show();
                }
            });



        }
    }
}

