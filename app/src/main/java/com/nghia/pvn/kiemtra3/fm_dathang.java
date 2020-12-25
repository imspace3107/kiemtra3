package com.nghia.pvn.kiemtra3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class fm_dathang  extends Fragment {
    private View view;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.dathang,container,false);
        InitView();
        return view;
    }
    private void InitView() {
        viewPager= (ViewPager) view.findViewById(R.id.viewp);
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager())) ;
        tabLayout= (TabLayout) view.findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }
}
