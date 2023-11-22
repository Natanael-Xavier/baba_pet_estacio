package com.example.babapet_login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static  String BANCO_DADOS_NOME = "BabaPet";
    private static  int BANCO_DADOS_VERSAO = 1;

    public DatabaseHelper(Context context){
        super(context,BANCO_DADOS_NOME,null, BANCO_DADOS_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE usuario(_id INTEGER PRIMARY KEY, senha TEXT, datanascimento INTERGE, nomepet TEXT, portepet TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versaoAnterior, int versaoProxima){

    }

}