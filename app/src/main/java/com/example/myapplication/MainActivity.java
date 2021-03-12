package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Áo thun nam đen","8$", R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Goods("Áo thun nam trắng","5$", R.drawable.android_mobile_app_developer));
        arrayList.add(new Goods("Áo thun nam màu","7$", R.drawable.android_software_developer));
        arrayList.add(new Goods("Áo thun nam","10$", R.drawable.android_studio_t_shirt_golden_yellow));
        arrayList.add(new Goods("Áo thun nam xinh","15$", R.drawable.computer_engineer_mens_sport));
        arrayList.add(new Goods("Áo thun nam phong cách","20$", R.drawable.custom_tshirt_1));

        adt = new CustomGoodsAdapter(this, R.layout.item_listview, arrayList);

        lvGoods.setAdapter(adt);
    }
}