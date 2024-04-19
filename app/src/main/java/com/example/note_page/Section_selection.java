package com.example.note_page;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Section_selection extends Activity {

Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_selection);
        b1= (Button) findViewById(R.id.SE_sem1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Section_selection.this,Upload.class);
                startActivity(i1);
            }
        });
    }
}

