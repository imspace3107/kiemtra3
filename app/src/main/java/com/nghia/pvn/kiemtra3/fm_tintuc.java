package com.nghia.pvn.kiemtra3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fm_tintuc extends Fragment {
    private View view;
    private GridView list;
    String[] title =
            {
                    "The Coffee House đồng hành cùng bạn \"Go Green\"!",
                    "Top 10 cửa hàng The Coffee House bạn nên trải nghiệm tại Hà Nội",
                    "7 NGÀY FREE UPSIZE - YÊU BẠN NỮ KHÔNG THỂ NÀO CAI",
                    "KHÔNG GIAN THE COFFEE HOUSE MỚI: HIỆN ĐẠI, SANG TRỌNG VÀ ẤM ÁP",
                    "CÂU CHUYỆN SƠ RI THE COFFEE HOUSE \"100% TỰ NHIÊN - TƯƠI NGON MÁT LẠNH\"",
            };
    String[] tv =
            {
                    "Tại The Coffee House, hành trình \"Go Green\" được lan toả mỗi ngày bằng những hành động thiết thực mang tính cộng đồng. Chúng tôi mong muốn truyền cảm hứng...",
                    "Dạo quanh các con phố Hà Nội, bạn nhất định phải ghé qua 10 cửa hàng The Coffee House sau đây để vừa nhâm nhi thức uống yêu thích, vừa...",
                    "Tuần này, The Coffee House thật háo hức để gửi tặng một nửa Thế giới xinh đẹp chương trình vô cùng ngọt ngào \"7 ngày Free Upsize - Yêu bạn nữ...",
                    "Hiện đại và sang trọng là cảm giác khách hàng sẽ cảm nhận được ngay khi bước vào những cửa hàng The Coffee House mới. Mô hình thiết kế mới tại...",
                    "Chẳng phải tự nhiên The Coffee House chọn Sơ ri Gò Công - Tiền Giang chứ không phải Sơ ri ở những vùng đất khác để tạo nên bộ đôi...",
            };
    Integer[] imageId =
            {
                    R.drawable.a5,
                    R.drawable.a2,
                    R.drawable.a3,
                    R.drawable.a4,
                    R.drawable.a5,
            };

    @Nullable
    @Override


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.tintuc,container,false);

        CustomList adapter1 = new CustomList(getActivity(), title, tv, imageId);
        list =  view.findViewById(R.id.grid_1);
        list.setAdapter(adapter1);
        CustomList adapter2 = new CustomList(getActivity(), title, tv, imageId);
        list =  view.findViewById(R.id.grid_2);
        list.setAdapter(adapter2);



        return view;
    }

}
