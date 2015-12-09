package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import static com.walltel.walltel.Cafe.selectionPedido;
import static com.walltel.walltel.Cafe.selectionPreco;

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
                    selectionPedido.add("Suco de Laranja");
                    selectionPreco.add(7.00f);
                } else {
                    selectionPedido.remove("Suco de Laranja");
                    selectionPreco.remove(7.00f);
                }
                break;
            case R.id.pedidocafé:
                if (checked) {
                    selectionPedido.add("Café");
                    selectionPreco.add(4.50f);
                } else {
                    selectionPedido.remove("Café");
                    selectionPreco.remove(4.50f);
                }
                break;
            case R.id.pedidoleite:
                if (checked) {
                    selectionPedido.add("Leite");
                    selectionPreco.add(3.50f);
                } else {
                    selectionPedido.remove("Leite");
                    selectionPreco.remove(3.50f);
                }
                break;
            case R.id.pedidoRefri:
                if (checked) {
                    selectionPedido.add("Refrigerante");
                    selectionPreco.add(6.80f);
                } else {
                    selectionPedido.remove("Refrigerante");
                    selectionPedido.remove(6.80f);
                }
                break;
            case R.id.pedidocha:
                if (checked) {
                    selectionPedido.add("Chá");
                    selectionPreco.add(4.50f);
                } else {
                    selectionPedido.remove("Chá");
                    selectionPreco.remove(4.50f);
                }
                break;
            case R.id.pedidocaipirinha:
                if (checked) {
                    selectionPedido.add("Caipirinha");
                    selectionPreco.add(11.00f);
                } else {
                    selectionPedido.remove("Caipirinha");
                    selectionPreco.remove(11.00f);
                }
                break;
            case R.id.pedidowhiskey:
                if (checked) {
                    selectionPedido.add("Whiskey");
                    selectionPreco.add(25.00f);
                } else {
                    selectionPedido.remove("Whiskey");
                    selectionPreco.remove(25.00f);
                }
                break;
        }
    }

    public void finalbebidas(View view){
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);

    }
    public void detalhes(View v) {
        switch (v.getId()) {
            case R.id.detalhessuco:
                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Copo de 350ml, com suco natural da fruta acompanhado com sachê de açúcar.");
                alertDialog.show();
                break;

            case R.id.detalhescafe:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Delicioso café puro, feito com grãos moidos na hora.");
                alertDialog.show();
                break;
            case R.id.detalhesleite:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Leite quente para acompanhar o café.");
                alertDialog.show();
                break;
            case R.id.detalherefri:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Refrigerente das marcas tradicionais.");
                alertDialog.show();
                break;
            case R.id.detalhescha:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Chá de limão quentinho, com aquele gosto de que foi feito pela vovó.");
                alertDialog.show();
                break;
            case R.id.detalhescaipirinha:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Caipirinha caprichada, no sabor limão.");
                alertDialog.show();
                break;
            case R.id.detalheswiskey:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("para aqueles que gostam de uma bebida alcoólica mais refinada.");
                alertDialog.show();
                break;

        }
    }
}