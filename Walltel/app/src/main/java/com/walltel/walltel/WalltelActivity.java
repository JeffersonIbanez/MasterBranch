package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;
import android.app.AlertDialog;

import java.util.ArrayList;

public class WalltelActivity extends AppCompatActivity {
    private EditText senha;
    public ArrayList<String> selectionAlmoco = new ArrayList<String >();
    public ArrayList<String> selectionBebidas = new ArrayList<String >();
    public ArrayList<String> selectionCafe = new ArrayList<String >();
    public ArrayList<String> selectionSobremesa = new ArrayList<String >();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walltel);

        senha = (EditText) findViewById(R.id.senha);
    }

    public void onclickmenu(View v) {
        String senhal = senha.getText().toString();
        if ("123".equals(senhal))
        {
            Intent i = new Intent();
            i.setClass(this, Menu.class);
            startActivity(i);
            stopService(i);
        }
        else if ("321".equals(senhal))
        {
            Intent i = new Intent();
            i.setClass(this, Menu.class);
            startActivity(i);
            stopService(i);
        }
        else if ("456".equals(senhal))
        {
            Intent i = new Intent();
            i.setClass(this, Menu.class);
            startActivity(i);
            stopService(i);
        }
        else
        {
          AlertDialog alertDialog;
            alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Erro");
            alertDialog.setMessage("Senha Incorreta!                      " +"                   Entre em contato com a recepção");
            alertDialog.show();
        }
    }
}
