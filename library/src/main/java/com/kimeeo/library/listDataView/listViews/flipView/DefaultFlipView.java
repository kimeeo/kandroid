package com.kimeeo.library.listDataView.listViews.flipView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimeeo.library.listDataView.listViews.BaseItemHolder;
import com.kimeeo.library.listDataView.listViews.BaseListViewAdapter;
import com.kimeeo.library.listDataView.listViews.DefaultListViewAdapter;
import com.kimeeo.library.listDataView.listViews.IViewProvider;

/**
 * Created by bhavinpadhiyar on 1/27/16.
 */
abstract public class DefaultFlipView extends BaseFlipView implements IViewProvider {

    abstract public View getItemView(int viewType,LayoutInflater inflater,ViewGroup container);
    abstract public BaseItemHolder getItemHolder(int viewType,View view);
    abstract public int getTotalViewTypeCount();
    abstract public int getListItemViewType(int viewType,Object data);


    protected BaseListViewAdapter createListViewAdapter()
    {
        return new DefaultListViewAdapter(getDataManager(),this,this);
    }
}
