package com.arpa.and.ui.table;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Jonney on 2016/9/26.
 */
public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.ViewHolder> {

    private final Context context;


    public TitleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.h_item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText("列标题" + (position + 1));
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    //    @Override
    //    public int getCount() {
    //        return 10;
    //    }
    //
    //    @Override
    //    public Object getItem(int i) {
    //        return null;
    //    }
    //
    //    @Override
    //    public long getItemId(int i) {
    //        return 0;
    //    }
    //
    //
    //
    //    @Override
    //    public View getView(int i, View view, ViewGroup viewGroup) {
    //        ViewHolder viewHoder=null;
    //        if (view==null){
    //            viewHoder=new ViewHolder();
    //            view= LayoutInflater.from(context).inflate(R.layout.h_item,viewGroup,false);
    //            viewHoder.textView=(TextView) view.findViewById(R.id.h_item_id);
    //            view.setTag(viewHoder);
    //        }else {
    //            viewHoder=(ViewHolder) view.getTag();
    //        }
    //        viewHoder.textView.setText("row"+i);
    //        return view;
    //    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.h_item_id);
        }
    }
}
