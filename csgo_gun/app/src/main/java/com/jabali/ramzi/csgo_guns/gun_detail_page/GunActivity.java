package com.jabali.ramzi.csgo_guns.gun_detail_page;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.jabali.ramzi.csgo_guns.R;
import com.jabali.ramzi.csgo_guns.models.Gun;
import com.jabali.ramzi.csgo_guns.utilities.StringUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GunActivity extends AppCompatActivity {

    private static final String GUN_TO_SHOW = "gun-to-show";

    public static Bundle getArgumentsForLaunch(Gun gunToShow) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(GUN_TO_SHOW, gunToShow);
        return bundle;
    }

    @BindView(R.id.tv_gun_rate_fire)
    TextView tv_gun_rate_fire;
    @BindView(R.id.tv_gun_made_in)
    TextView tv_gun_made_in;
    @BindView(R.id.tv_gun_price)
    TextView tv_gun_price;
    @BindView(R.id.tv_magazine_cost)
    TextView tv_magazine_cost;
    @BindView(R.id.tv_magazine_capacity)
    TextView tv_magazine_capacity;
    @BindView(R.id.tv_gun_caliber)
    TextView tv_gun_caliber;
    @BindView(R.id.tv_gun_firing_mode)
    TextView tv_gun_firing_mode;
    @BindView(R.id.tv_gun_category)
    TextView tv_gun_category;
    @BindView(R.id.tv_gun_weighted_loaded)
    TextView tv_gun_weighted_load;
    @BindView(R.id.tv_projectile_weight)
    TextView tv_projectile_weight;
    @BindView(R.id.tv_gun_used_by)
    TextView tv_gun_used_by;
    @BindView(R.id.tv_gun_reload_time)
    TextView tv_gun_reload_time;
    @BindView(R.id.tv_gun_kill_award_competitive)
    TextView tv_gun_kill_award_competitive;
    @BindView(R.id.tv_gun_kill_award_casual)
    TextView tv_gun_kill_award_casual;
    @BindView(R.id.tv_gun_damage)
    TextView tv_gun_damage;
    @BindView(R.id.tv_gun_recoil_control)
    TextView tv_gun_recoil_control;
    @BindView(R.id.tv_gun_accurate_range)
    TextView tv_gun_accurate_range;
    @BindView(R.id.tv_gun_armor_penetration)
    TextView tv_gun_armor_penetration;
    @BindView(R.id.tv_gun_penetration_power)
    TextView tv_gun_penetration_power;
    @BindView(R.id.tv_gun_entity_csgo)
    TextView tv_gun_entity_csgo;
    @BindView(R.id.tv_alternate_gun_names)
    TextView tv_alternate_gun_names;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun);
        showBackButton();
        ButterKnife.bind(this);
        showGunDetails();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    private void showBackButton() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private Gun getGunFromArguments() {
        return getIntent().getExtras().getParcelable(GUN_TO_SHOW);
    }

    private void showGunDetails() {
        final Gun gunToShow = getGunFromArguments();
        getSupportActionBar().setTitle(gunToShow.getName());
        tv_gun_rate_fire.setText(gunToShow.getGun_rate_fire_per_minute_automatic());
        tv_gun_made_in.setText(gunToShow.getMadeInCountry());
        tv_gun_price.setText(gunToShow.getGunCost());
        tv_magazine_cost.setText(gunToShow.getMagazineCost());
        tv_magazine_capacity.setText(gunToShow.getMagazine_capacity());
        tv_gun_caliber.setText(String.valueOf(gunToShow.getGunCalibur()));//Float
        tv_gun_firing_mode.setText(StringUtil.getConcatinate(gunToShow.getGun_firing_mode(), "", " and "));//List
        tv_gun_category.setText(gunToShow.getGunCategory());
        tv_gun_weighted_load.setText(gunToShow.getGun_weight_loaded());
        tv_gun_weighted_load.setText(gunToShow.getGun_weight_loaded());
        tv_projectile_weight.setText(String.valueOf(gunToShow.getProjectile_weight()));
        tv_gun_used_by.setText(StringUtil.getConcatinate(gunToShow.getGun_used_by(), "gun used by", " and "));//List
        tv_gun_reload_time.setText((gunToShow.getGun_reload_time()));
        tv_gun_kill_award_competitive.setText((gunToShow.getGun_kill_award_competitive()));
        tv_gun_kill_award_casual.setText((gunToShow.getGun_kill_award_casual()));
        tv_gun_damage.setText((gunToShow.getGun_damage()));
        tv_gun_recoil_control.setText((gunToShow.getGun_recoil_control()));
        tv_gun_accurate_range.setText((gunToShow.getGun_accurate_range()));
        tv_gun_armor_penetration.setText((gunToShow.getGun_armor_penetration()));
        tv_gun_penetration_power.setText((gunToShow.getGun_penetration_power()));
        tv_gun_entity_csgo.setText((gunToShow.getGun_entity_csgo()));
        tv_alternate_gun_names.setText(StringUtil.getConcatinate(gunToShow.getAlternate_names(),"", " and "));


        // TODO: Show image
    }
}
