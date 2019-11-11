package com.jabali.ramzi.csgo_guns.gun_list_page;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jabali.ramzi.csgo_guns.R;
import com.jabali.ramzi.csgo_guns.gun_detail_page.GunActivity;
import com.jabali.ramzi.csgo_guns.models.Gun;
import com.jabali.ramzi.csgo_guns.utilities.GsonUtil;
import com.jabali.ramzi.csgo_guns.utilities.ResourceUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GunListActivity extends AppCompatActivity implements GunRecyclerViewAdapterListener{

    @BindView(R.id.rv_gun_list)
    RecyclerView rvGunList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun_list);
        ButterKnife.bind(this);
        setupRecyclerView();

        GunRecyclerViewAdapter adapter = new GunRecyclerViewAdapter(getGunsFromJson(), this);
        rvGunList.setAdapter(adapter);
    }

    private void setupRecyclerView() {
        rvGunList.setHasFixedSize(true);
        rvGunList.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<Gun> getGunsFromJson() {
        String gunText = ResourceUtil.getRawString(this, R.raw.guns);//converts it from json to string
        return GsonUtil.getModelsFromJsonString(gunText, Gun.class); // becomes an object of gun.class
    }

    @Override
    public void gunWasClicked(Gun gunClickedOn) {
        // declaring intent to go from this activity to GunActivity
        Intent startGunActivityIntent = new Intent(this, GunActivity.class);
        // adding gunClickedOn to intent
        startGunActivityIntent.putExtras(GunActivity.getArgumentsForLaunch(gunClickedOn));
        // adding animation to intent// made a bundle called getArgumentsForlaunch
        Bundle bundleAnimation = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out).toBundle();
        // load intent
        startActivity(startGunActivityIntent, bundleAnimation);
    }

}
