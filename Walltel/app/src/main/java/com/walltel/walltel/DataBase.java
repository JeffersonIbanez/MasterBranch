package com.walltel.walltel;

import android.content.Context;
import android.database.sqlite.*;

public class DataBase extends SQLiteOpenHelper{
        private static final String NOME_BD = "PEDIDO";
        private static final int VERSAO_BD = 6;

    public DataBase(Context context ) {
        super(context,NOME_BD , null, VERSAO_BD);
    }

    public void onCreate(SQLiteDatabase db)
    {

        db.execSQL("CREATE TABLE TB_PEDIDO (id_pedido INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, produto VARCHAR(200), preco DECIMAL(18,2));");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("Drop Table if exists TB_PEDIDO;");
        onCreate(db);

    }
}
