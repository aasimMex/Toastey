package com.mexcelle.toastey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mexcelle.toaster.Toaster;

public class MainActivity extends AppCompatActivity {
    private Button succesBtn,defaultBtn,erreBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        succesBtn=findViewById(R.id.succes_btn);
        defaultBtn=findViewById(R.id.default_btn);
        erreBtn=findViewById(R.id.error_button);


        erreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(MainActivity.this, "This is Error Toast", Toaster.LENGTH_LONG, Toaster.ERROR, true).show();

            }
        });

        defaultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(MainActivity.this, "This is Default Toast", Toaster.LENGTH_LONG, Toaster.DEFAULT, true).show();

            }
        });


        succesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toaster.makeText(MainActivity.this, "This is Success Toast", Toaster.LENGTH_LONG, Toaster.SUCCESS, true).show();

            }
        });

    }
}