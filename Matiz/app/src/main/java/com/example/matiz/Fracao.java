package com.example.matiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.app.AlertDialog;

import com.google.android.material.snackbar.Snackbar;

public class Fracao extends AppCompatActivity {

    private ImageView voltar;
    private ImageView ajuda;
    private EditText exa;
    private EditText exb;
    private EditText exc;
    private EditText exd;
    private EditText exe;
    private EditText exf;
    private EditText exg;
    private EditText exh;
    private EditText exi;
    private Button finaliza;
    private String respa;
    private String respb;
    private String respc;
    private String respd;
    private String respe;
    private String respf;
    private String respg;
    private String resph;
    private String respi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fracao);

        getSupportActionBar().hide();
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fracao.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ajuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fracao.this, Help_ex1.class);
                startActivity(intent);
            }
        });

        finaliza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exa.getText().toString();
                exb.getText().toString();
                exc.getText().toString();
                exd.getText().toString();
                exe.getText().toString();
                exf.getText().toString();
                exg.getText().toString();
                exh.getText().toString();
                exi.getText().toString();

                if(exa.getText().toString().equals("8/18")){
                    respa = "a) Você acertou! A resposta é 8/18\n";
                }else{
                    respa = "a) Você errou! A resposta era 8/18\n";
                }

                if(exb.getText().toString().equals("6/8")){
                    respb = "b) Você acertou! A resposta é 6/8\n";
                }else{
                    respb = "b) Você errou! A resposta era 6/8\n";
                }

                if(exc.getText().toString().equals("4/9")){
                    respc = "c) Você acertou! A resposta é 4/9\n";
                }else{
                    respc = "c) Você errou! A resposta era 4/9\n";
                }

                if(exd.getText().toString().equals("4/10")){
                    respd = "d) Você acertou! A resposta é 4/10\n";
                }else{
                    respd = "d) Você errou! A resposta era 4/10\n";
                }

                if(exe.getText().toString().equals("3/6")){
                    respe = "e) Você acertou! A resposta é 3/6\n";
                }else{
                    respe = "e) Você errou! A resposta era 3/6\n";
                }

                if(exf.getText().toString().equals("4/5")){
                    respf = "f) Você acertou! A resposta é 4/5\n";
                }else{
                    respf = "f) Você errou! A resposta era 4/5\n";
                }

                if(exg.getText().toString().equals("6/16")){
                    respg = "g) Você acertou! A resposta é 6/16\n";
                }else{
                    respg = "g) Você errou! A resposta era 6/16\n";
                }

                if(exh.getText().toString().equals("2/6")){
                    resph = "h) Você acertou! A resposta é 2/6\n";
                }else{
                    resph = "h) Você errou! A resposta era 2/6\n";
                }

                if(exi.getText().toString().equals("1/2")){
                    respi = "i) Você acertou! A resposta é 1/2\n";
                }else{
                    respi = "i) Você errou! A resposta era 1/2\n";
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respa,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },1000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respb,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },3000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respc,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },5000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respd,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },7000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respe,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },9000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respf,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },11000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respg,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },13000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,resph,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },15000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Snackbar snackbar = Snackbar.make(view,respi,Snackbar.LENGTH_LONG);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();
                    }
                },17000);

                finaliza.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Fracao.this, MainActivity.class);
                        startActivity(intent);
                    }
                });



            }

        });

    }

    private void IniciarComponentes() {
        voltar = findViewById(R.id.back);
        ajuda = findViewById(R.id.help);
        exa = findViewById(R.id.a);
        exb = findViewById(R.id.b);
        exc = findViewById(R.id.c);
        exd = findViewById(R.id.d);
        exe = findViewById(R.id.e);
        exf = findViewById(R.id.f);
        exg = findViewById(R.id.g);
        exh = findViewById(R.id.h);
        exi = findViewById(R.id.i);
        finaliza = findViewById(R.id.bt_finalizar);

    }
}