package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Sobremesa extends WalltelActivity {

    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobremesa);
        final_text = (TextView)findViewById(R.id.final_sobremesa);
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
            case R.id.pedidosorvete:
                if (checked) {
                    selectionSobremesa.add("Sorvete");
                } else {
                    selectionSobremesa.remove("Sorvete");
                }
                break;
            case R.id.pedidotorta:
                if (checked) {
                    selectionSobremesa.add("Torta de Limão");
                } else {
                    selectionSobremesa.remove("Torta de Limão");
                }
                break;
            case R.id.pedidobolo:
                if (checked) {
                    selectionSobremesa.add("Bolo");
                } else {
                    selectionSobremesa.remove("Bolo");
                }
                break;
            case R.id.pedidosonho:
                if (checked) {
                    selectionSobremesa.add("Sonho");
                } else {
                    selectionSobremesa.remove("Sonho");
                }
                break;
            case R.id.pedidobrigadeiro:
                if (checked) {
                    selectionSobremesa.add("Brigadeiro");
                } else {
                    selectionSobremesa.remove("Brigadeiro");
                }
                break;
            case R.id.pedidopave:
                if (checked) {
                    selectionSobremesa.add("Pave");
                } else {
                    selectionSobremesa.remove("Pave");
                }
                break;
            case R.id.pedidopudim:
                if (checked) {
                    selectionSobremesa.add("Pudim");
                } else {
                    selectionSobremesa.remove("Pudim");
                }
                break;
        }
    }

    public void finalsobremesa(View view){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Pedido Enviado");
        alertDialog.setMessage("Seu Pedido:\n" + selectionSobremesa + "\n");
        alertDialog.show();
        String final_selection = "";
        for (String Selections : selectionSobremesa) {
            final_selection = final_selection + Selections + "\n";
        }
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);

    }
}