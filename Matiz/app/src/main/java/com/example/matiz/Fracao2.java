package com.example.matiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Fracao2 extends AppCompatActivity {

    private ImageView voltar;
    private ImageView ajuda;
    private Button finaliza;
    private RadioButton radioButton;
    private RadioGroup rg;
    private RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fracao2);

        getSupportActionBar().hide();
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fracao2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ajuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fracao2.this, Help_ex2.class);
                startActivity(intent);
            }
        });

        finaliza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ID = rg.getCheckedRadioButtonId();
                radioButton = findViewById(ID);
                if (radioButton.getText().equals("Própria")) {
                    Snackbar snackbar = Snackbar.make(view, "Você acertou! 2/4 é uma fração própria", Snackbar.LENGTH_LONG);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else {
                    Snackbar snackbar = Snackbar.make(view, "Você errou! 2/4 é uma fração própria", Snackbar.LENGTH_LONG);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }

                finaliza.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Fracao2.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }

    private void IniciarComponentes() {
        voltar = findViewById(R.id.back);
        ajuda = findViewById(R.id.help);
        finaliza = findViewById(R.id.bt_finalizar);
        rg = findViewById(R.id.rg_1);
        rb = findViewById(R.id.rb_1);
    }

}