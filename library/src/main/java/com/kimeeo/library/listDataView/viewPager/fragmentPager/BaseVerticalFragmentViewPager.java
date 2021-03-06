package com.kimeeo.library.listDataView.viewPager.fragmentPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kimeeo.library.R;

/**
 * Created by bhavinpadhiyar on 1/21/16.
 */
abstract public class BaseVerticalFragmentViewPager extends DefaultFragmentViewPager {
    protected View createRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView;
        if(getDataManager().getRefreshEnabled())
            rootView= inflater.inflate(R.layout._fragment_vertical_page_view_with_swipe_refresh_layout, container, false);
        else
            rootView= inflater.inflate(R.layout._fragment_vertical_page_view, container, false);
        return rootView;
    }
}
