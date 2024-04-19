package com.example.note_page;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Login extends Activity {
    Button b1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_teacher);
        b1= (Button) findViewById(R.id.button);
        EditText userenter = (EditText) findViewById(R.id.user);
        EditText password = (EditText) findViewById(R.id.NumberPassword);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userenter.getText().toString().equals("Teacher") && password.getText().toString().equals("12345")){
                    Intent i1 = new Intent(Login.this,Section_selection.class);
                    startActivity(i1);
                }
                else{
                    Toast.makeText(Login.this, "Wrong Credentials", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
