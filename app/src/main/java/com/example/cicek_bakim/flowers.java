package com.example.cicek_bakim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class flowers extends RecyclerView.Adapter<flowers.viewflower> {
    @NonNull
    @Override
    public viewflower onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new viewflower(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewflower holder, @SuppressLint("RecyclerView") int position) {
holder.textView.setText(textName.get(position));
holder.imageView.setImageResource(image.get(position));

holder.textView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String verial = textName.get(position);
        if (verial.equalsIgnoreCase("Lale Çiceği"))
        {
            Intent intent = new Intent(context, lale.class);
            context.startActivity(intent);
        } else if (verial.equalsIgnoreCase("Menekşe Çiçeği"))
        {
         Intent intent = new Intent(context, menekse.class);
         context.startActivity(intent);
        }
        else if (verial.equalsIgnoreCase("Papatya Çiçeği"))
        {
            Intent ppp = new Intent(context, papatya.class);
            context.startActivity(ppp);
        }
        else if (verial.equalsIgnoreCase("Gül Çiçeği"))
        {
            Intent gul = new Intent(context, gul.class);
            context.startActivity(gul);
        }
        else if (verial.equalsIgnoreCase("Zambak Çiçeği"))
        {
            Intent zambak5 = new Intent(context, zambak5.class);
            context.startActivity(zambak5);
        }
    }
});
    }

    @Override
    public int getItemCount() {
        return textName.size();
    }

    ArrayList<Integer> image = new ArrayList<>();
    ArrayList<String> textName = new ArrayList<>();
    Context context;

    public flowers(ArrayList<Integer> image, ArrayList<String> textName, Context context) {
        this.image = image;
        this.textName = textName;
        this.context = context;
    }


    public class viewflower extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public viewflower(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
