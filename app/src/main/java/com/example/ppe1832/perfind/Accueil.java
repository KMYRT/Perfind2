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
    private Button button13, button12, button11, button9, button8, button7, button6, button5, button4, button3, button2;


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

        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });
        
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Faire quelque chose en réponse au clic
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    
}
