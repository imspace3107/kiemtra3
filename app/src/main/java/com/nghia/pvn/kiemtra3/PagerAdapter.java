package com.nghia.pvn.kiemtra3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {

    private String listTab[] = {"Phổ biến", "Thức uống","Đồ ăn"};
    private pager_PhoBien pager_phoBien;
    private pager_ThucUong pager_thucUong;
    private pager_DoAn pager_doAn;

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        pager_phoBien =new pager_PhoBien();
        pager_thucUong =new pager_ThucUong();
        pager_doAn =new pager_DoAn();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return pager_phoBien;
        } else if (position == 1) {
            return pager_thucUong;
        } else if (position==2){
            return pager_doAn;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}