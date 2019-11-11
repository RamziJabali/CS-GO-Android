package com.jabali.ramzi.csgo_guns.gun_list_page;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jabali.ramzi.csgo_guns.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GunItemView extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_gun_name)
    TextView gun_name;

    @BindView(R.id.tv_gun_price)
    TextView gun_price;

    @BindView(R.id.iv_gun_pic)
    ImageView ivGunPic;

    @BindView(R.id.tv_team)
    TextView tv_team;

    @BindView(R.id.tv_category)
    TextView tv_category;

    public GunItemView(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}
