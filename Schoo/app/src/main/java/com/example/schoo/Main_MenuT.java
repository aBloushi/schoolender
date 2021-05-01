package com.example.schoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.schoolender.R;
import com.google.firebase.auth.FirebaseAuth;

public class Main_MenuT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu_t);

        Button lec = findViewById(R.id.lec);
        Button Task = findViewById(R.id.task);
        Button Class = findViewById(R.id.classss);
        Button misso = findViewById(R.id.misson);
        Button logout = findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent=new Intent(Main_MenuT.this,login.class);
                startActivity(intent);


            }
        });

        misso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_MenuT.this , missions.class);
                startActivity(intent);
            }
        });

        Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_MenuT.this , MainActivity.class);
                startActivity(intent);
            }
        });

        lec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_MenuT.this , notif.class);
                startActivity(intent);
            }
        });

        Task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_MenuT.this , task.class);
                startActivity(intent);
            }
        });
    }
}