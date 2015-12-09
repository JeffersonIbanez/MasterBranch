package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Finalizar extends WalltelActivity {
    TextView test;
    TextView test1;
    Float total = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalizar);
        test = (TextView) findViewById(R.id.textView2);
            for (int i = 0; i < Cafe.getPedidos().size(); i++) {
                test.append(Cafe.getPedidos().get(i).toString() + System.getProperty("line.separator"));
                total = total + Cafe.getPreco().get(i);
            }
            DecimalFormat df = new DecimalFormat("0.00");
            test1 = (TextView) findViewById(R.id.textView);
            test1.append("Total R$" + df.format(total));
    }


    public void onclick(View v) throws InterruptedException {

        switch (v.getId())
        {
            case R.id.buttonvoltar:
                Intent a = new Intent();
                a.setClass(this, Menu.class);
                startActivity(a);
                break;
            case R.id.buttoncancelar:
                Cafe.setPedidos();
                Cafe.setPreco();
                Intent b = new Intent();
                b.setClass(this, Menu.class);
                startActivity(b);
                break;
            case R.id.Finalizar:
                BD bd = new BD(this);
                bd.inserir();
                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(this).create();
                if(Cafe.getPedidos().size() != 0) {
                    Cafe.setPedidos();
                    Cafe.setPreco();
                    Intent c = new Intent();
                    c.setClass(this, Menu.class);
                    startActivity(c);
                    break;
                }
                else {
                    alertDialog.setTitle("Atenção");
                    alertDialog.setMessage("Nenhum pedido foi realizado.");
                    alertDialog.show();
                }

        }
    }
}
