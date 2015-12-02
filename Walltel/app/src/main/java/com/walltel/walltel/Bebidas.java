package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Bebidas extends WalltelActivity {

    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bebidas);
        final_text = (TextView)findViewById(R.id.final_bebidas);
        final_text.setEnabled(false);
    }
    public void onclickbebidas(View v) {
            Intent l = new Intent();
            l.setClass(this, Menu.class);
            startActivity(l);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.pedidosucolaranja:
                if (checked) {
                    selectionBebidas.add("Suco de Laranja");
                } else {
                    selectionBebidas.remove("Suco de Laranja");
                }
                break;
            case R.id.pedidocafé:
                if (checked) {
                    selectionBebidas.add("Café");
                } else {
                    selectionBebidas.remove("Café");
                }
                break;
            case R.id.pedidoleite:
                if (checked) {
                    selectionBebidas.add("Leite");
                } else {
                    selectionBebidas.remove("Leite");
                }
                break;
            case R.id.pedidococa:
                if (checked) {
                    selectionBebidas.add("Coca-Cola");
                } else {
                    selectionBebidas.remove("Coca-Cola");
                }
                break;
            case R.id.pedidocha:
                if (checked) {
                    selectionBebidas.add("Chá");
                } else {
                    selectionBebidas.remove("Chá");
                }
                break;
            case R.id.pedidocaipirinha:
                if (checked) {
                    selectionBebidas.add("Caipirinha");
                } else {
                    selectionBebidas.remove("Caipirinha");
                }
                break;
            case R.id.pedidowhiskey:
                if (checked) {
                    selectionBebidas.add("Whiskey");
                } else {
                    selectionBebidas.remove("Whiskey");
                }
                break;
        }
    }

    public void finalbebidas(View view){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Pedido Enviado");
        alertDialog.setMessage("Seu Pedido: \n" + selectionBebidas + "\n");
        alertDialog.show();
        String final_selection = "";
        for (String Selections : selectionBebidas) {
            final_selection = final_selection + Selections + "\n";
        }
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);

    }
}