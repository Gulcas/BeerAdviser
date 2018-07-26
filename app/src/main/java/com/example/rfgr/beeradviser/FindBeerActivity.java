package com.example.rfgr.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert(); //dodanie nowej instancji klasy BeerExpert jako prywatne pole klasy

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    //poniżej tworzę metodę która zostanie zaimplementowana po wciśnieciu guzika
    public void onClickFindBeer(View view) {

        TextView brands = (TextView) findViewById(R.id.brands); //pobieram referencję do odnalezionego textView
        Spinner color = (Spinner) findViewById(R.id.color); //pobieram referencję do spinnera
        String beerType = String.valueOf(color.getSelectedItem()); //pobieram wartość wybraną w spinnerze i konwertuję ją na string
        // brands.setText(beerType); //wyświetlam wybraną wartość

        List<String> brandList = expert.getBrands(beerType); //używa klasy BeerExpert do pobrania listy array
        StringBuilder brandsFormatted = new StringBuilder(); //konstruuje stringa w którym zostaną zapisane wartości z listy array
        for (String brand : brandList) {
            brandsFormatted.append(brand).append('\n'); //wyświetla każdą pozycję z listy array w nowym wierszu
        }
        brands.setText(brandsFormatted); //wyświetla wyniki
    }
}
