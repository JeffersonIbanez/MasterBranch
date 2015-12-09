package com.walltel.walltel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by marcinho on 05/12/2015.
 */
public class BD {

    private SQLiteDatabase db;
    public String produto;


    public BD(Context context) {
        DataBase auxDb = new DataBase(context);
        db = auxDb.getWritableDatabase();
    }

    public void inserir() {
        ContentValues registro = new ContentValues();
        for(int i=0; i<Cafe.selectionPedido.size(); i++)
        {
            registro.put("produto", "'" + Cafe.selectionPedido.get(i) + "'");
            registro.put("preco", "'" + Cafe.selectionPreco.get(i) + "'");
            db.insert("TB_PEDIDO", null, registro);
        }
    }

    public String buscar() {
        String pedido = new String();
        String[] colunas = new String[]{"produto"};
        Cursor cursor = db.query("TB_PEDIDO", colunas, null, null, null, null, null);
        if(cursor.getCount() > 0){
            cursor.moveToFirst();
            do {
                produto = cursor.getString(0);
            }while(cursor.moveToNext());
        }
        return (produto);
    }
}