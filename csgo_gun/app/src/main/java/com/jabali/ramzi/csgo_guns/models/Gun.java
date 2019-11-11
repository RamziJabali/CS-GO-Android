package com.jabali.ramzi.csgo_guns.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.workday.postman.Postman;
import com.workday.postman.annotations.Parceled;

import java.util.List;

@Parceled
public class Gun implements Parcelable {


    @SerializedName("name")
    String name;

    @SerializedName("gun_category")
    String gunCategory;

    @SerializedName("alternate_names")
    List<String> alternate_names;

    @SerializedName("made_in_country")
    String madeInCountry;

    @SerializedName("gun_caliber")
    float gunCalibur;

    @SerializedName("gun_cost")
    String gunCost;

    @SerializedName("magazine_capacity")
    String magazine_capacity;

    @SerializedName("magazine_cost")//
    String magazineCost;

    @SerializedName("gun_firing_mode")
    List<String> gun_firing_mode;

    @SerializedName("gun_rate_fire_per_minute_automatic")
    String gun_rate_fire_per_minute_automatic;

    @SerializedName("gun_weight_loaded")
    String gun_weight_loaded;

    @SerializedName("projectile_weight")
    float projectile_weight;

    @SerializedName("gun_used_by")
    List<String> gun_used_by;

    @SerializedName("gun_reload_time")
    String gun_reload_time;

    @SerializedName("gun_kill_award_competitive")
    String gun_kill_award_competitive;

    @SerializedName("gun_kill_award_casual")
    String gun_kill_award_casual;

    @SerializedName("gun_damage")
    String gun_damage;

    @SerializedName("gun_recoil_control")
    String gun_recoil_control;

    @SerializedName("gun_accurate_range")
    String gun_accurate_range;

    @SerializedName("gun_armor_penetration")
    String gun_armor_penetration;

    @SerializedName("gun_penetration_power")
    String gun_penetration_power;

    @SerializedName("gun_entity_csgo")
    String gun_entity_csgo;


    public String getGunCategory() {
        return gunCategory;
    }

    public String getName() {
        return name;
    }

    public String getMagazineCost() {
        return magazineCost;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }

    public float getGunCalibur() {
        return gunCalibur;
    }

    public String getGunCost() {
        return gunCost;
    }

    public List<String> getAlternate_names() {
        return alternate_names;
    }

    public String getMagazine_capacity() {
        return magazine_capacity;
    }

    public List<String> getGun_firing_mode() {
        return gun_firing_mode;
    }

    public String getGun_rate_fire_per_minute_automatic() {
        return gun_rate_fire_per_minute_automatic;
    }

    public String getGun_weight_loaded() {
        return gun_weight_loaded;
    }

    public float getProjectile_weight() {
        return projectile_weight;
    }

    public List<String> getGun_used_by() {
        return gun_used_by;
    }

    public String getGun_reload_time() {
        return gun_reload_time;
    }

    public String getGun_kill_award_competitive() {
        return gun_kill_award_competitive;
    }

    public String getGun_kill_award_casual() {
        return gun_kill_award_casual;
    }

    public String getGun_damage() {
        return gun_damage;
    }

    public String getGun_recoil_control() {
        return gun_recoil_control;
    }

    public String getGun_accurate_range() {
        return gun_accurate_range;
    }

    public String getGun_armor_penetration() {
        return gun_armor_penetration;
    }

    public String getGun_penetration_power() {
        return gun_penetration_power;
    }

    public String getGun_entity_csgo() {
        return gun_entity_csgo;
    }

    public static final Creator<Gun> CREATOR = Postman.getCreator(Gun.class);

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Postman.writeToParcel(this, dest);
    }
}
