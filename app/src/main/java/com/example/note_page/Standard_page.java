package com.example.note_page;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Standard_page extends Activity {
Button b1,b2,b3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year_page);

        b1=(Button) findViewById(R.id.second);
        b2=(Button) findViewById(R.id.third);
        b3=(Button) findViewById(R.id.forth);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Standard_page.this, Sem.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Standard_page.this, Sem.class);
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Standard_page.this, Sem.class);
                startActivity(i1);
            }
        });

    }

}