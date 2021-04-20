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

public class RecyclerSofaAdapter extends RecyclerView.Adapter<RecyclerSofaAdapter.MyViewHolder>{
    private Context mContext;
    private List<furnituresofa> sofa;

    public RecyclerSofaAdapter(Context mContext, List<furnituresofa> sofa) {
        this.mContext = mContext;
        this.sofa = sofa;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view =mInflater.inflate(R.layout.cardview_item_sofa,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.sofa_title.setText(sofa.get(position).getTitle());
        holder.sofa_descr.setText(sofa.get(position).getDescription());
        holder.sofa_img.setImageResource(sofa.get(position).getImg());

        //set onclick
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(mContext, SelectSofa.class);

                //passing data to the table activityvv
                t.putExtra("Title", sofa.get(position).getTitle());
                //t.putExtra("Price",table.get(position).getDescription());
                t.putExtra("Description", sofa.get(position).getDescription());
                t.putExtra("Imagedesc", sofa.get(position).getImg());
                mContext.startActivity(t);
            }

        });
    }

    @Override
    public int getItemCount() {
        return sofa.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView sofa_title,sofa_descr;
        ImageView sofa_img;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            sofa_title = (TextView) itemView.findViewById(R.id.sofa_title_id);
            sofa_descr = (TextView) itemView.findViewById(R.id.sofa_desc_id);
            sofa_img = (ImageView) itemView.findViewById(R.id.sofa_img_id);
            cardView=(CardView)itemView.findViewById(R.id.cardviewsofa_id);

        }
    }
}
