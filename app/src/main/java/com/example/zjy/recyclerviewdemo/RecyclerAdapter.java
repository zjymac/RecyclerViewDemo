package com.example.zjy.recyclerviewdemo;

import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * 描述：
 * 作者：zjy on 2017/11/30 15:01
 */

public class RecyclerAdapter extends BaseRecyclerViewAdapter<String> {
    private RecyclerItemClickListener mRecyclerItemClickListener;

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public RecyclerAdapter(List<String> datas) {
        super(datas);
    }

    @Override
    protected void bindData(final BaseViewHolder viewHolder, int position) {
        ((TextView) viewHolder.getView(R.id.tv)).setText(mData.get(position));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRecyclerItemClickListener.onClick(viewHolder.itemView, viewHolder.getAdapterPosition());
            }
        });
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mRecyclerItemClickListener.onLongClick(viewHolder.itemView, viewHolder.getAdapterPosition());
                return false;
            }
        });
    }

    public void setOnItemClickListener(RecyclerItemClickListener recyclerItemClickListener) {
        this.mRecyclerItemClickListener = recyclerItemClickListener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.recycler_view_item;
    }
}
