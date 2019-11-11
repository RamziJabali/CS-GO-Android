package com.jabali.ramzi.csgo_guns.gun_list_page;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jabali.ramzi.csgo_guns.R;
import com.jabali.ramzi.csgo_guns.models.Gun;
import com.jabali.ramzi.csgo_guns.utilities.StringUtil;

import java.util.List;

public class GunRecyclerViewAdapter extends RecyclerView.Adapter<GunItemView> {

    private final List<Gun> gunList;
    private final GunRecyclerViewAdapterListener listener;

    public GunRecyclerViewAdapter(List<Gun> gunList, GunRecyclerViewAdapterListener listener) {
        this.listener = listener;
        this.gunList = gunList;
    }

    @NonNull
    @Override
    public GunItemView onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        final View viewHolder = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view_gun, parent, false);
        return new GunItemView(viewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull GunItemView holder, int position) {
        // get the gun at position from our gun list
        final Gun gunAtPosition = gunList.get(position);

        // populate the views in the viewholder per the gun's properties
        holder.gun_name.setText(gunAtPosition.getName());
        holder.gun_price.setText(gunAtPosition.getGunCost());
        holder.tv_team.setText(gunAtPosition.getGunCost());
        holder.tv_category.setText(gunAtPosition.getGunCategory());
        holder.tv_team.setText(StringUtil.getConcatinate(gunAtPosition.getGun_used_by(), "gun used by ", " and "));
        // TODO: Populate the gun image

        // Set the click listener for the current ItemViewHolder
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.gunWasClicked(gunAtPosition);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gunList.size();
    }

}
