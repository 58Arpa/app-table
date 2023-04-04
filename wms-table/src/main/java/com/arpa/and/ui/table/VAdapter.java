package com.arpa.and.ui.table;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * Created by Jonney on 2016/9/26.
 */
public class VAdapter extends RecyclerView.Adapter<VAdapter.ViewHoder> {
    Context context;
    CustomRecyclerView recyclerView;

    public VAdapter(CustomRecyclerView recyclerView) {
        this.context = recyclerView.getContext();
        this.recyclerView = recyclerView;
    }

    @Override
    public ViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHoder(LayoutInflater.from(context).inflate(R.layout.v_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHoder holder, int position) {
        holder.titleTv.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return 1000;
    }

    @Override
    public void onViewRecycled(ViewHoder holder) {
        super.onViewRecycled(holder);
        //        Log.w("onViewRecycled","scrollY="+ getScrollY(holder.listView)+",position"+holder.postion);

    }

    class ViewHoder extends RecyclerView.ViewHolder {
        int postion;
        RecyclerView listView;
        TextView titleTv;

        public ViewHoder(View itemView) {
            super(itemView);
            listView = (RecyclerView) itemView.findViewById(R.id.h_list);
            titleTv = (TextView) itemView.findViewById(R.id.v_item_id);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            listView.setLayoutManager(linearLayoutManager);
            listView.setAdapter(new HAdapter(context));
            recyclerView.addRecyclerView(listView);
        }
    }
}
