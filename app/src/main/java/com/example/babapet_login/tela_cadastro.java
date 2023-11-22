package com.example.babapet_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class tela_cadastro extends AppCompatActivity {

    DatabaseHelper helper;

    EditText usuario;
    EditText senha;
    EditText datanascimento;
    EditText nomepet;
    Spinner portepet;


    Button salvarcadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        usuario = findViewById(R.id.editTextTelaCadastroUsuario);
        senha = findViewById(R.id.editTextTelaCadastroSenha);
        datanascimento = findViewById(R.id.editTextTelaCadastroDataNascimento);
        nomepet = findViewById(R.id.editTextTelaCadastroNomePet);
        portepet = findViewById(R.id.spinnerTelaCadastroPortePet);
        salvarcadastro = findViewById(R.id.buttonViewCadastrarUsuario);

        helper = new DatabaseHelper(this);



        salvarcadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(tela_cadastro.this,tela_principal.class));
            }
        });
    }

    public void  setSalvarcadastro(View view){
        SQLiteDatabase db = helper.getReadableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("usuario",usuario.getText().toString());
        valores.put("senha",senha.getText().toString());
        valores.put("datanascimento",datanascimento.getText().toString());
        valores.put("nomepet",nomepet.getText().toString());
        valores.put("portepet",portepet.getSelectedItem().toString());

        long resultado = db.insert("usuario", null, valores);

        if(resultado != -1){
            Toast.makeText(this, getString(R.string.activity_tela_cadastro_usuario_salvo), Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, getString(R.string.activity_tela_cadastro_usuario_nao_salvo), Toast.LENGTH_SHORT).show();
        }

    }
}