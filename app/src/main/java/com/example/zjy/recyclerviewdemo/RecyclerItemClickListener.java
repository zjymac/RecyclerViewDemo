package com.example.zjy.recyclerviewdemo;

import android.view.View;

/**
 * 描述：
 * 作者：zjy on 2017/11/30 15:12
 */

public interface RecyclerItemClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
