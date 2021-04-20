package com.example.sonyshah.spacewood;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sony Shah on 29-03-2019.
 */

public class RecyclerDingAdapter extends RecyclerView.Adapter<RecyclerDingAdapter.MyViewHolder>{


    private Context mContext;
    private List<furnituredinning> dinning;

    public RecyclerDingAdapter(Context mContext, List<furnituredinning> dinning) {
        this.mContext = mContext;
        this.dinning = dinning;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view =mInflater.inflate(R.layout.cardview_item_dinning,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.dinning_title.setText(dinning.get(position).getTitle());
        holder.dinning_descr.setText(dinning.get(position).getDescription());
        holder.dinning_img.setImageResource(dinning.get(position).getImg());

        //set onclick
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(mContext,SelectTable.class);

                //passing data to the table activityvv
                t.putExtra("Title",dinning.get(position).getTitle());
                //t.putExtra("Price",table.get(position).getDescription());
                t.putExtra("Description",dinning.get(position).getDescription());
                t.putExtra("Imagedesc",dinning.get(position).getImg());
                mContext.startActivity(t);




            }
        });

    }

    @Override
    public int getItemCount() {
        return dinning.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView dinning_title,dinning_descr;
        ImageView dinning_img;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);
            dinning_title = (TextView) itemView.findViewById(R.id.dinning_title_id);
            dinning_descr = (TextView) itemView.findViewById(R.id.dinning_desc_id);
            dinning_img = (ImageView) itemView.findViewById(R.id.dinning_img_id);
            cardView=(CardView)itemView.findViewById(R.id.cardviewdinning_id);
        }
    }
}
