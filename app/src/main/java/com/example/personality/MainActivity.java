package com.example.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{


            TextView rubrique1,rubrique2,rubrique3,rubrique4,rubrique5;

            @Override
            protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                rubrique1 = findViewById(R.id.rubrique1);
                rubrique2 = findViewById(R.id.rubrique2);
                rubrique3 = findViewById(R.id.rubrique3);
                rubrique4 = findViewById(R.id.rubrique4);
                rubrique5 = findViewById(R.id.rubrique5);

                rubrique1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent clic = new Intent(MainActivity.this, page2.class);
                        startActivity(clic);
                    }
                });
                rubrique2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent clic = new Intent(MainActivity.this, page2.class);
                        startActivity(clic);
                    }
                });
                rubrique3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent clic = new Intent(MainActivity.this, page2.class);
                        startActivity(clic);
                    }
                });
                rubrique4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent clic = new Intent(MainActivity.this, page2.class);
                        startActivity(clic);
                    }
                });
                rubrique5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent clic = new Intent(MainActivity.this, page2.class);
                        startActivity(clic);
                    }
                });
            }
        }


