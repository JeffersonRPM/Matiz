package com.example.matiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ic_user_white;
    private CardView card_view;
    private CardView card_view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        IniciarComponentes();

        ic_user_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });

        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Help_ex1.class);
                startActivity(intent);
            }
        });

        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Help_ex2.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        ic_user_white = findViewById(R.id.iconeUser);
        card_view = findViewById(R.id.card_nivel1);
        card_view2 = findViewById(R.id.card_nivel2);
    }
}