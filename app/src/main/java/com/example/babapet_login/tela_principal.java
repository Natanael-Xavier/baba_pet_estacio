package com.example.babapet_login;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tela_principal extends AppCompatActivity {

    Button contratar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        contratar = (Button) findViewById(R.id.buttonViewContratar);

        contratar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast solicitacaoEnviada = Toast.makeText(tela_principal.this,getResources().getString(R.string.activity_main_solicitacao_enviada),Toast.LENGTH_SHORT);
                solicitacaoEnviada.show();
            }
        });
    }
}