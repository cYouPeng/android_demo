package com.example.hello_android.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hello_android.R;

import org.w3c.dom.Text;

public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private OnItemClickListener mListener;
    public LinearAdapter(Context context, OnItemClickListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == 0) {
            return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_recycler_item,parent,false));
        }else{
            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_recycler_item2,parent,false));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position) == 0) {
            ((LinearViewHolder)holder).textView.setText("hello world");

        }else{
            ((LinearViewHolder2)holder).textView.setText("你好大马虫");
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
//                Toast.makeText(mContext, "click.."+position,Toast.LENGTH_SHORT).show();
            }
        });


    }

    public int getItemViewType(int position) {
        if(position % 2 == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_linear);
        }
    }
    class LinearViewHolder2 extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;
        public LinearViewHolder2(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_linear);
            imageView = itemView.findViewById(R.id.iv_image);
        }
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
