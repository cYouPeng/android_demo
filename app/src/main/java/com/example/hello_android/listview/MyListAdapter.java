package com.example.hello_android.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hello_android.R;

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutIntflater;

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutIntflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null) {
            view = mLayoutIntflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();;
            holder.imageView = view.findViewById(R.id.iv);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            holder.tvTime = view.findViewById(R.id.tv_time);
            holder.tvContent = view.findViewById(R.id.tv_content);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        // 给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2022-20-12");
        holder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://www.baidu.com/img/PC_880906d2a4ad95f5fafb2e540c5cdad7.png").into(holder.imageView);
        return view;
    }
}
