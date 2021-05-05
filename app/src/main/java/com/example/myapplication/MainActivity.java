package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.idname);
        password = (EditText) findViewById(R.id.idpassword);
        login = (Button) findViewById(R.id.idbutton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(), password.getText().toString());

            }
        });

    }

    private void validate(String username, String userpassword) {
        if ((username.equals("Ghada")) && (userpassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
            //Toast.makeText(this,"Success Login ",Toast.LENGTH_SHORT).show();    }
        }
    }
}

 //   public void idbutton(View view) {
     //   Intent intent = new Intent( this,SecondActivity.class);
       // startActivity(intent);
  //  }
