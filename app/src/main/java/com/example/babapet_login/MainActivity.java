package com.example.babapet_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cadastrese;
    EditText usuario;
    EditText senha;
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.editTextUsuario);
        senha = (EditText) findViewById(R.id.editTextSenha);
        entrar = (Button) findViewById(R.id.buttonViewEntrar);
        cadastrese = (Button) findViewById(R.id.buttonViewCadastrese);

        cadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,tela_cadastro.class));
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("admin".equals(usuario.getText().toString()) && "1234".equals(senha.getText().toString())){

                    startActivity(new Intent(MainActivity.this,tela_principal.class));

                }else{
                    Toast falhaAutenticacao = Toast.makeText(MainActivity.this,getResources().getString(R.string.activity_main_falha_autenticao),Toast.LENGTH_SHORT);
                    falhaAutenticacao.show();
                }
            }
        });

        cadastrese.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,tela_cadastro.class));
            }
        });
    }
}