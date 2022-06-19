package com.example.hello_android.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello_android.R;

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.HorViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;
    public HorAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public HorAdapter.HorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hot_recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorAdapter.HorViewHolder holder, int position) {
        holder.textView.setText("hello");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               mListener.onClick(position);
           }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class HorViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public HorViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_hor_title);
        }
    }
    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
