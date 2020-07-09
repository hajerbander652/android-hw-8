package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> mypoke = new ArrayList<>();
        pokemon poke1 = new pokemon("Charmander",R.drawable.poke1,52,43,309);
        pokemon poke2 = new pokemon("Moltres ",R.drawable.poke2,100,90,580);
        pokemon poke3 = new pokemon("Squirtle ",R.drawable.squirtle,48,65,314);
        pokemon poke4 = new pokemon("Meowth ",R.drawable.meowth,45,35,290);
        pokemon poke5 = new pokemon("Pikachu ",R.drawable.pikachu,55,40,
                320);
        mypoke.add(poke1);
        mypoke.add(poke2);
        mypoke.add(poke3);
        mypoke.add(poke4);
        mypoke.add(poke5);


        RecyclerView rv = findViewById(R.id.RV);
//
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        MAD adapter = new MAD(mypoke,this);
        rv.setAdapter(adapter);





        ///
    }
}