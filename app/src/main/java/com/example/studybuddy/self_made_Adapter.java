package com.example.studybuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class self_made_Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<self_made_Adapter.VH> {
        Context context;
        ArrayList<constructeor_wali_class> arry;

        public self_made_Adapter(Context context, ArrayList<constructeor_wali_class> arry) {

            this.context = context;
            this.arry = arry;
        }

        @NonNull
        @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
            VH vh = new VH(view);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull VH holder, int position) {
            holder.img.setImageResource(arry.get(position).img);
            holder.name.setText(arry.get(position).name);
            holder.number.setText(arry.get(position).number);


        }

        @Override
        public int getItemCount() {
            return arry.size();
        }

        public class VH extends RecyclerView.ViewHolder {
            ImageView img;
            TextView name, number;

            public VH(@NonNull View itemView) {
                super(itemView);
                img = itemView.findViewById(R.id.img);
                name = itemView.findViewById(R.id.name);
                number = itemView.findViewById(R.id.number);

            }
        }
    }

