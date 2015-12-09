package com.walltel.walltel;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import static com.walltel.walltel.Cafe.selectionPedido;
import static com.walltel.walltel.Cafe.selectionPreco;


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
                    selectionPedido.add("Sorvete");
                    selectionPreco.add(8.50f);
                } else {
                    selectionPedido.remove("Sorvete");
                    selectionPreco.remove(8.50f);
                }
                break;
            case R.id.pedidotorta:
                if (checked) {
                    selectionPedido.add("Torta de Limão");
                    selectionPreco.add(3.50f);
                } else {
                    selectionPedido.remove("Torta de Limão");
                    selectionPreco.remove(3.50f);
                }
                break;
            case R.id.pedidobolo:
                if (checked) {
                    selectionPedido.add("Bolo");
                    selectionPreco.add(2.50f);
                } else {
                    selectionPedido.remove("Bolo");
                    selectionPreco.remove(2.50f);
                }
                break;
            case R.id.pedidosonho:
                if (checked) {
                    selectionPedido.add("Sonho");
                    selectionPreco.add(3.50f);
                } else {
                    selectionPedido.remove("Sonho");
                    selectionPreco.remove(3.50f);
                }
                break;
            case R.id.pedidobrigadeiro:
                if (checked) {
                    selectionPedido.add("Brigadeiro");
                    selectionPreco.add(1.50f);
                } else {
                    selectionPedido.remove("Brigadeiro");
                    selectionPreco.remove(1.50f);
                }
                break;
            case R.id.pedidopave:
                if (checked) {
                    selectionPedido.add("Pave");
                    selectionPreco.add(4.50f);
                } else {
                    selectionPedido.remove("Pave");
                    selectionPreco.remove(4.50f);
                }
                break;
            case R.id.pedidopudim:
                if (checked) {
                    selectionPedido.add("Pudim");
                    selectionPreco.add(4.50f);
                } else {
                    selectionPedido.remove("Pudim");
                    selectionPreco.remove(4.50f);
                }
                break;
        }
    }

    public void finalsobremesa(View view){
        Intent l = new Intent();
        l.setClass(this, Menu.class);
        startActivity(l);

    }

    public void detalhes(View v) {
        switch (v.getId()) {
            case R.id.detalhesorvete:
                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Três bolas de sorvete cremoso de creme acompanhado com calda de chocolate.");
                alertDialog.show();
                break;

            case R.id.detalhetorta:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Massa leve e crocante rechada com uma mousse de limão que deixa água na boa.");
                alertDialog.show();
                break;
            case R.id.detalhebolo:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Bolo caseiro de chocolate.");
                alertDialog.show();
                break;
            case R.id.detalhesonho:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Sonho fresquinho, bem recheado e com açúcar de confeiteiro.");
                alertDialog.show();
                break;
            case R.id.detalhebrigadeiro:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Tradicional brigadeiro, que nos faz lembrar momentos de festas.");
                alertDialog.show();
                break;
            case R.id.detalhepave:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Feito com chocalate meio amargo e chocolate branco para ter uns contraste de sabor e" +
                        " bolachas maizena para deixar a crocância.");
                alertDialog.show();
                break;
            case R.id.detalhepudim:
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Detalhes");
                alertDialog.setMessage("Pudim de doce de leite, cargo chefe da casa.");
                alertDialog.show();
                break;

        }
    }
}