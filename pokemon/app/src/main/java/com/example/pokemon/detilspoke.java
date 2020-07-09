package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detilspoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detilspoke);
        Bundle b = getIntent().getExtras();
      pokemon p = (pokemon) b.getSerializable("pokemon");

        TextView nam = findViewById(R.id.textView);
        TextView str = findViewById(R.id.textView4);
        TextView def = findViewById(R.id.textView5);
        TextView tot = findViewById(R.id.textView6);
        ImageView pic = findViewById(R.id.imageView);

        nam.setText(p.getName()+"");
        str.setText(p.getAttack()+"");
        def.setText(p.getDefence()+"");
        tot.setText(p.getTotal()+"");
        pic.setImageResource(p.getImage());
      //////
    }
}