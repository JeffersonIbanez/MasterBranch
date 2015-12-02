package com.walltel.walltel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.app.AlertDialog;

import java.util.ArrayList;

public class Cafe extends WalltelActivity {

    TextView final_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe);
        final_text = (TextView)findViewById(R.id.final_cafe);
        final_text.setEnabled(false);
    }

    public void onclickcafe(View v) {
            Intent l = new Intent();
            l.setClass(this, Menu.class);
            startActivity(l);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.pedidopao:
                if (checked) {
                    selectionCafe.add("Pão");
                } else {
                    selectionCafe.remove("Pão");
                }
                break;
            case R.id.pedidomanteiga:
                if (checked) {
                    selectionCafe.add("Manteiga");
                } else {
                    selectionCafe.remove("Manteiga");
                }
                break;
            case R.id.pedidomel:
                if (checked) {
                    selectionCafe.add("Mel");
                } else {
                    selectionCafe.remove("Mel");
                }
                break;
            case R.id.pedidoovos:
                if (checked) {
                    selectionCafe.add("Ovos");
                } else {
                    selectionCafe.remove("Ovos");
                }
                break;
            case R.id.pedidofrios:
                if (checked) {
                    selectionCafe.add("Frios");
                } else {
                    selectionCafe.remove("Frios");
                }
                break;
            case R.id.pedidopanqueca:
                if (checked) {
                    selectionCafe.add("Panquecas");
                } else {
                    selectionCafe.remove("Panquecas");
                }
                break;
            case R.id.pedidotorrada:
                if (checked) {
                    selectionCafe.add("Torrada");
                } else {
                    selectionCafe.remove("Torrada");
                }
                break;
        }
    }

    public void finalSelection(View view){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Pedido Enviado");
        alertDialog.setMessage("Seu Pedido:\n" + selectionCafe + "\n");
        alertDialog.show();
        String final_selection = "";
        for (String Selections : selectionCafe) {
            final_selection = final_selection + Selections + "\n";
        }
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);

    }
}