package com.example.pays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView Lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Pays.listPays.add(new Pays(R.drawable.maroc,"+212","Maroc","Rabat","Afrique"));
        Pays.listPays.add(new Pays(R.drawable.algerie,"+213","Algérie","Alger","Afrique"));
        Pays.listPays.add(new Pays(R.drawable.esp,"+34","Espagne","Madrid","Europe"));
        Pays.listPays.add(new Pays(R.drawable.italy,"+39","Italy","Rome","Europe"));
        Pays.listPays.add(new Pays(R.drawable.tunsie,"+216","Tunisie","Tunis","Afrique"));
        Pays.listPays.add(new Pays(R.drawable.uk,"+44"," United Kingdom","London","Europe"));
        Pays.listPays.add(new Pays(R.drawable.usa,"+1","United States","Washington","North America"));
        Pays.listPays.add(new Pays(R.drawable.pladetine,"+970","Palestine","Gaza","Asie "));
        Pays.listPays.add(new Pays(R.drawable.russie,"+7","Russie","Moscou ","Europe"));
        Pays.listPays.add(new Pays(R.drawable.krnd,"+850","Corée du Nord","Pyongyang","Asie"));


        Lv=findViewById(R.id.LVPays);
        PaysAdapter AA= new PaysAdapter(getApplicationContext());
        Lv.setAdapter(AA);



    }
}