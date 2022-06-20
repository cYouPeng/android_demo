package com.example.hello_android.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello_android.R;

public class StaggeredAdapter extends RecyclerView.Adapter<StaggeredAdapter.StaggeredViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;

    public StaggeredAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public StaggeredAdapter.StaggeredViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StaggeredViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_pu_recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredAdapter.StaggeredViewHolder holder, int position) {
        if(position % 2 != 0) {
            holder.imageView.setImageResource(R.drawable.image);
        }else{
            holder.imageView.setImageResource(R.drawable.image2);
        }
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

    class StaggeredViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public StaggeredViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_pu);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
