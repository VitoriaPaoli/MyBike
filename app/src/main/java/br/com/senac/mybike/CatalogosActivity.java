package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CatalogosActivity extends AppCompatActivity {
    RecyclerView idRecCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogos_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);

        // Montando do layout que será utilizado na lista
        idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //Vai deixar a lista mais eficiente
        idRecCatalogo.hasFixedSize();

        //Instanciar o adaptador
        MyAdapter adapter = new MyAdapter();

        //Executar a montagem da lista com o modelo
        idRecCatalogo.setAdapter();
    }
}