package com.example.cicek_bakim;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> image = new ArrayList<>();
    ArrayList<String> textName = new ArrayList<>();

    RecyclerView recyclerView;

    flowers flowers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        image.add(R.drawable.lale);
        image.add(R.drawable.menekse);
        image.add(R.drawable.pptya);
        image.add(R.drawable.gul);
        image.add(R.drawable.zambak);

        textName.add("Lale Çiceği");
        textName.add("Menekşe Çiçeği");
        textName.add("Papatya Çiçeği");
        textName.add("Gül Çiçeği");
        textName.add("Zambak Çiçeği");

        flowers = new flowers(image,textName,MainActivity.this);
        recyclerView.setAdapter(flowers);

    }
}