package com.example.matiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help_ex2 extends AppCompatActivity {

    private Button botao_entendi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_ex2);

        getSupportActionBar().hide();
        IniciarComponentes();

        botao_entendi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Help_ex2.this, Fracao2.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        botao_entendi = findViewById(R.id.bt_entendi);
    }
}