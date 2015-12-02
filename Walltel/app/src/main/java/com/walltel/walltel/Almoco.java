package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Almoco extends WalltelActivity {
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
                    selectionAlmoco.add("Macarrão");
                } else {
                    selectionAlmoco.remove("Macarrão");
                }
                break;
            case R.id.pedidoarroz:
                if (checked) {
                    selectionAlmoco.add("Arroz");
                } else {
                    selectionAlmoco.remove("Arroz");
                }
                break;
            case R.id.pedidofeijão:
                if (checked) {
                    selectionAlmoco.add("Feijão");
                } else {
                    selectionAlmoco.remove("Feijão");
                }
                break;
            case R.id.pedidobife:
                if (checked) {
                    selectionAlmoco.add("Bife");
                } else {
                    selectionAlmoco.remove("Bife");
                }
                break;
            case R.id.pedidopeixe:
                if (checked) {
                    selectionAlmoco.add("Peixe");
                } else {
                    selectionAlmoco.remove("Peixe");
                }
                break;
            case R.id.pedidopicanha:
                if (checked) {
                    selectionAlmoco.add("Picanha");
                } else {
                    selectionAlmoco.remove("Picanha");
                }
                break;
            case R.id.pedidolasanha:
                if (checked) {
                    selectionAlmoco.add("Lasanha");
                } else {
                    selectionAlmoco.remove("Lasanha");
                }
                break;
        }
    }

    public void finalalmoco(View view){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Pedido Enviado");
        alertDialog.setMessage("Seu Pedido: \n" + selectionAlmoco + "\n");
        alertDialog.show();
        String final_selection ="";
        for(String Selections : selectionAlmoco){
            final_selection = final_selection + Selections + "\n";
        }
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