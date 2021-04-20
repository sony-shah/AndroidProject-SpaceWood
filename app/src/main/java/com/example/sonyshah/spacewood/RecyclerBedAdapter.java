package com.example.sonyshah.spacewood;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sony Shah on 30-03-2019.
 */

public class RecyclerBedAdapter extends RecyclerView.Adapter<RecyclerBedAdapter.MyViewHolder>{

    private Context mContext;
    private List<furniturebed> bed;

    public RecyclerBedAdapter(Context mContext, List<furniturebed> bed) {
        this.mContext = mContext;
        this.bed = bed;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view =mInflater.inflate(R.layout.cardview_item_bed,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.bed_title.setText(bed.get(position).getTitle());
        holder.bed_descr.setText(bed.get(position).getDescription());
        holder.bed_img.setImageResource(bed.get(position).getImg());

        //set onclick
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(mContext,SelectTable.class);

                //passing data to the table activityvv
                t.putExtra("Title",bed.get(position).getTitle());
                //t.putExtra("Price",table.get(position).getDescription());
                t.putExtra("Description",bed.get(position).getDescription());
                t.putExtra("Imagedesc",bed.get(position).getImg());
                mContext.startActivity(t);

            }
        });


    }

    @Override
    public int getItemCount() {
        return bed.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView bed_title,bed_descr;
        ImageView bed_img;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            bed_title = (TextView) itemView.findViewById(R.id.bed_title_id);
            bed_descr = (TextView) itemView.findViewById(R.id.bed_desc_id);
            bed_img = (ImageView) itemView.findViewById(R.id.bed_img_id);
            cardView=(CardView)itemView.findViewById(R.id.cardviewbed_id);

        }
    }




}
