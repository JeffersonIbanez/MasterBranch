package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import static com.walltel.walltel.Cafe.selectionPedido;
import static com.walltel.walltel.Cafe.selectionPreco;

public class Almoco  extends WalltelActivity{
    TextView final_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.almoco);
        final_text = (TextView)findViewById(R.id.final_almoco);
        final_text.setEnabled(false);

    }

    public void onclickalmoco(View v) {
            Intent l = new Intent();
            l.setClass(this, Menu.class);
            startActivity(l);
    }



    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.pedidomacarrao:
                if (checked) {
                    selectionPedido.add("Macarrão");
                    selectionPreco.add(20.00f);
                } else {
                    selectionPedido.remove("Macarrão");
                    selectionPreco.remove(20.00f);
                }
                break;
            case R.id.pedidoarroz:
                if (checked) {
                    selectionPedido.add("Arroz");
                    selectionPreco.add(4.00f);
                } else {
                    selectionPedido.remove("Arroz");
                    selectionPreco.remove(4.00f);
                }
                break;
            case R.id.pedidofeijão:
                if (checked) {
                    selectionPedido.add("Feijão");
                    selectionPreco.add(3.00f);
                } else {
                    selectionPedido.remove("Feijão");
                    selectionPreco.remove(3.00f);
                }
                break;
            case R.id.pedidobife:
                if (checked) {
                    selectionPedido.add("Bife");
                    selectionPreco.add(6.00f);
                } else {
                    selectionPedido.remove("Bife");
                    selectionPreco.remove(6.00f);
                }
                break;
            case R.id.pedidopeixe:
                if (checked) {
                    selectionPedido.add("Peixe");
                    selectionPreco.add(7.50f);
                } else {
                    selectionPedido.remove("Peixe");
                    selectionPreco.remove(7.50f);
                }
                break;
            case R.id.pedidopicanha:
                if (checked) {
                    selectionPedido.add("Picanha");
                    selectionPreco.add(15.00f);
                } else {
                    selectionPedido.remove("Picanha");
                    selectionPreco.remove(15.00f);
                }
                break;
            case R.id.pedidolasanha:
                if (checked) {
                    selectionPedido.add("Lasanha");
                    selectionPreco.add(22.00f);
                } else {
                    selectionPedido.remove("Lasanha");
                    selectionPreco.remove(22.00f);
                }
                break;
        }
    }

    public void finalalmoco(View view){
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);
    }
    public void detalhes(View v) {
        switch (v.getId()) {
            case R.id.detalhemacarrao:
                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Que tal fazer uma receita simples e fácil, para relembrar aquela macarronada de domingo na casa da vovó? A Molho Caseiro, uma franquia de restaurante de massa em São Paulo e região.");
                alertDialog.show();
                break;

            case R.id.detalhesarroz:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("O arroz melhor preparado e com melhor sabor em São Paulo e região.");
                alertDialog.show();
                break;
            case R.id.detalhesfeijao:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("O melhor feijão feito em São Paulo e região.");
                alertDialog.show();
                break;
            case R.id.detalhesbife:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Bife de cozinheiro profissional é diferente, mas não posso negar que também gosto daquele caseirinho.");
                alertDialog.show();
                break;
            case R.id.detalhespeixe:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("O clássico Peixe Frito.");
                alertDialog.show();
                break;
            case R.id.detalhespicanha:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Filet de 230g, macio, preparado no estilo Gaúcho.");
                alertDialog.show();
                break;
            case R.id.detalheslasanha:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Molho bolonhesa (tomate, carne bovina, cebola, açúcar, sal, amido modificado, óleo de soja, salsa, alho, calda de carne, realçadores de sabor glutamato monossódico e inosinato dissódico) massa para lasanha (farinha de trigo enriquecida com ferro e ácido fólico, ovo em pós pasteurizado, óleo vegetal, sal, corante natural betacaroteno, realçador de sabor glutamato monossódico) e queijos tipo muçarela.");
                alertDialog.show();
                break;

        }
    }
}