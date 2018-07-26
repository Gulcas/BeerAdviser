package com.example.rfgr.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    //poniżej tworzę metodę która zostanie zaimplementowana po wciśnieciu guzika
    public void onClickFindBeer(View view) {

        TextView brands = (TextView) findViewById(R.id.brands); //tworzę odwołanie do odnalezionego textView
        Spinner color = (Spinner) findViewById(R.id.color); //tworzę odwołanie do spinnera
        String beerType = String.valueOf(color.getSelectedItem()); //konwertuję wybranego spinnera na string
        brands.setText(beerType); //podmieniam TextView na skonwertowanego spinnera

    }
}
