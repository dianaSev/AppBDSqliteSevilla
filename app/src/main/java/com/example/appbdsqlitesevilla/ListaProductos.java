package com.example.appbdsqlitesevilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaProductos extends AppCompatActivity {
    public TextView tvSalidaPrecio;
    public ListView lvProductos;
    //Arreglo para lista de productos
    public String productos [] = {"Smart TV", "Tablet", "PC", "Radio", "Smart watch"};
    //Arreglo para imprimir precios
    public String precio [] = {"10000", "900", "4000", "500", "300"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);
        //Integrar elementos de XML a JAVA
        tvSalidaPrecio = findViewById(R.id.tvSalidaPrecio);
        lvProductos = (ListView)findViewById(R.id.lvProductos);

        //Definicion de un adapter para lista de productos
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productos);

        lvProductos.setAdapter(adapter); //Integra informacion de productos

        //Programar evento clic para seleccionar un producto y se imprima precio
        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            tvSalidaPrecio.setText("Precio de venta: "+precio[position]);
        }
    });
    }
}