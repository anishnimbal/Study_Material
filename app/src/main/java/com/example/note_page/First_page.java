package com.example.note_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class First_page extends AppCompatActivity {
ImageButton b1,b2;
BottomNavigationView nav;
HomeFragment h1 = new HomeFragment();
BackFragment back = new BackFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        b1=(ImageButton) findViewById(R.id.imageButton1);
        b2=(ImageButton) findViewById(R.id.imageButton2);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(First_page.this, Standard_page.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(First_page.this, Login.class);
                startActivity(i1);
            }
        });

    }
}