package br.com.theoldpinkeye.listviewdemo2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myPeople = new ArrayList<>();

        myPeople.add("Pessoa 0");
        myPeople.add("Pessoa 1");
        myPeople.add("Pessoa 2");
        myPeople.add("Pessoa 3");
        myPeople.add("Pessoa 5");
        myPeople.add("Pessoa 6");
        myPeople.add("Pessoa 7");
        myPeople.add("Dante");

        for (String s: myPeople){
            Log.i("Pessoa", s);
        }



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myPeople);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("Pessoa tocada: ", myPeople.get(position));
            }
        });
        

        
        
        
    }
}
