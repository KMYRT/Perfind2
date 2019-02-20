package com.example.ppe1832.perfind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.awt.*;
import java.util.*;



public class Accueil extends AppCompatActivity {

    private TextView mTextMessage;
    private Button buttonHB, buttonD, buttonPC;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        mTextMessage = (TextView) findViewById(R.id.message);

        buttonHB = (Button)findViewById(R.id.buttonHB);
        buttonHB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        buttonD = (Button)findViewById(R.id.button12);
        buttonD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        buttonPC = (Button)findViewById(R.id.button11);
        buttonPC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    
}
