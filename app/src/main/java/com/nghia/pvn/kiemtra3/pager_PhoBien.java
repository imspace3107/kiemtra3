package com.nghia.pvn.kiemtra3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class pager_PhoBien extends Fragment {

    private View view;
    private GridView grid;
    String[] title =
            {
                   "Cà phê Lúa Mạch nóng",
                    "Cà phê Lúa Mạch nóng",
                    "Socôla Lúa Mạch đá xay",
                    "Socôla Lúa Mạch nóng",
                    "Macca Phủu sôcôla",
                    "Cà phê Lúa Mạch nóng",
                    "Cà phê Lúa Mạch nóng",
                    "Socôla Lúa Mạch đá xay",
            };
    String[] tv =
            {
                    "69.000 đ",
                    "69.000 đ",
                    "69.000 đ",
                    "69.000 đ",
                    "45.000 đ",
                    "69.000 đ",
                    "69.000 đ",
                    "69.000 đ",
            };
    Integer[] imageId =
            {
                    R.drawable.pb1,
                    R.drawable.pb2,
                    R.drawable.pb3,
                    R.drawable.pb4,
                    R.drawable.pb5,
                    R.drawable.pb1,
                    R.drawable.pb2,
                    R.drawable.pb3,
            };
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.pager_phobien,container,false);
        ArrayList<product> arrayList = new ArrayList<>();
        CustomGrid adapter = new CustomGrid(getActivity(), title, tv, imageId);
        grid =  view.findViewById(R.id.grid1);
        grid.setAdapter(adapter);
        return view;
    }

}
