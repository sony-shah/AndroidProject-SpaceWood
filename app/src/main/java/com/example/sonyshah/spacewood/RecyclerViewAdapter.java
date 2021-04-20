package com.example.sonyshah.spacewood;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sony Shah on 28-03-2019.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    private Context mContext;
    private List<furnituretable> table;

    public RecyclerViewAdapter(Context mContext, List<furnituretable> table) {
        this.mContext = mContext;
        this.table = table;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view =mInflater.inflate(R.layout.cardview_item_table,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.table_Title_id.setText(table.get(position).getTitle());
        holder.table__descr_id.setText(table.get(position).getDescription());
        holder.table_img_id.setImageResource(table.get(position).getImg());

        //set onclick
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(mContext,SelectTable.class);

                //passing data to the table activityvv
                t.putExtra("Title",table.get(position).getTitle());
                //t.putExtra("Price",table.get(position).getDescription());
                t.putExtra("Description",table.get(position).getDescription());
                t.putExtra("Imagedesc",table.get(position).getImg());
                mContext.startActivity(t);




            }
        });



    }

    @Override
    public int getItemCount() {
        return table.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView table_img_id;
        TextView table_Title_id,table__descr_id;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            table_Title_id=(TextView)itemView.findViewById(R.id.table_title_id);
            table_img_id=(ImageView)itemView.findViewById(R.id.table_img_id);
            table__descr_id=(TextView)itemView.findViewById(R.id.table__desc_id);
            cardView=(CardView)itemView.findViewById(R.id.cardview_id);
        }
    }


}
