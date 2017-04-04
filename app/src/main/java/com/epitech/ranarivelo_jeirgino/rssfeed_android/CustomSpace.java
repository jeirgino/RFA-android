package com.epitech.ranarivelo_jeirgino.rssfeed_android;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Jeirgino on 03/04/2017.
 */
public class CustomSpace extends RecyclerView.ItemDecoration {
    int space;
    CustomSpace(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.bottom = space;
        outRect.right = space;
        if (parent.getChildLayoutPosition(view) == 0) {
            outRect.top = space;
        }
    }
}
