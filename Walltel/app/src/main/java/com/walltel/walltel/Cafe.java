package com.walltel.walltel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.app.AlertDialog;
import java.util.Vector;

public class Cafe extends Menu{
    public static Vector<String> selectionPedido = new Vector<String>();
    public static Vector<Float> selectionPreco = new Vector<Float>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe);
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
                    selectionPedido.add("Pão");
                    selectionPreco.add(1.50f);
                } else {
                    selectionPedido.remove("Pão");
                    selectionPreco.remove(1.50f);
                }
                break;
            case R.id.pedidomanteiga:
                if (checked) {
                    selectionPedido.add("Manteiga");
                    selectionPreco.add(0.50f);
                } else {
                    selectionPedido.remove("Manteiga");
                    selectionPreco.remove(0.50f);
                }
            break;
            case R.id.pedidomel:
                if (checked) {
                    selectionPedido.add("Mel");
                    selectionPreco.add(1.50f);
                } else {
                    selectionPedido.remove("Mel");
                    selectionPreco.remove(1.50f);
                }
                break;
            case R.id.pedidoovos:
                if (checked) {
                    selectionPedido.add("Ovos");
                    selectionPreco.add(3.50f);
                } else {
                    selectionPedido.remove("Ovos");
                    selectionPreco.remove(3.50f);
                }
                break;
            case R.id.pedidofrios:
                if (checked) {
                    selectionPedido.add("Frios");
                    selectionPreco.add(6.50f);
                } else {
                    selectionPedido.remove("Frios");
                    selectionPreco.remove(6.50f);
                }
                break;
            case R.id.pedidopanqueca:
                if (checked) {
                    selectionPedido.add("Panquecas");
                    selectionPreco.add(8.50f);
                } else {
                    selectionPedido.remove("Panquecas");
                    selectionPreco.remove(8.50f);
                }
                break;
            case R.id.pedidotorrada:
                if (checked) {
                    selectionPedido.add("Torrada");
                    selectionPreco.add(1.50f);
                } else {
                    selectionPedido.remove("Torrada");
                    selectionPreco.remove(1.50f);
                }
                break;
        }
    }

    public void finalSelection(View view)
    {
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);

    }


    public static Vector<String> getPedidos()
    {
        return selectionPedido;
    }

    public static Vector<Float> getPreco()
    {
       return selectionPreco;
    }

    public static void setPedidos()
    {
        selectionPedido.clear();
    }

    public static void setPreco()
    {
        selectionPreco.clear();
    }
    public void detalhes(View v) {
        switch (v.getId()) {
            case R.id.detalhepao:
                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Farinha de trigo enriquecida com ferro e ácido fólico, açúcar cristal, glúten de trigo, " +
                        "soro de leite em pó, gordura vegetal, fécula de mandioca, sal iodado, fermento biológico. Fomoso pão fracês " +
                        "fesquinho e crocante.");
                alertDialog.show();
                break;

            case R.id.detalhemanteiga:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("A pura manteiga, saborosa em embalagem porcionada de 10g.");
                alertDialog.show();
                break;
            case R.id.detalhemel:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Único alimento naturalmente doce que contém proteínas e sais minerais, que fortalece o sistema " +
                        "imune para começar bem o dia.");
                alertDialog.show();
                break;
            case R.id.detalheovo:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("O tipo de alimento bom para a memória, concentração, desenvolvimento cerebral, feito com uma pitada de sal.");
                alertDialog.show();
                break;
            case R.id.detalhefrio:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Fatia de queijo, apresuntado e mortadela para acompanhar nosso delicioso pão francês");
                alertDialog.show();
                break;
            case R.id.detalhepanquecas:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Nossa famosa panqueca de frango com cebola, tomate, brócolis e molho quatro queijos");
                alertDialog.show();
                break;
            case R.id.detalhetorrada:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Feita na hora com um molho que é o toque do chefe.");
                alertDialog.show();
                break;

        }
    }
}