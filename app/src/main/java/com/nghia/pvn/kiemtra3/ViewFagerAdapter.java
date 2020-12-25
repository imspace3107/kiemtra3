package com.nghia.pvn.kiemtra3;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class ViewFagerAdapter extends FragmentStatePagerAdapter {

    public ViewFagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new fm_tintuc();
            case 1:
                return new fm_dathang();
            case 2:
                return new fm_cuahang();
            case 3:
                return new fm_taikhoan();
            default: new fm_tintuc();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
