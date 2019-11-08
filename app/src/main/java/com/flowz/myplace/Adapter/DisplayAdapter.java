package com.flowz.myplace.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.flowz.myplace.Model.ModelOfDisplay;
import com.flowz.myplace.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.HousesViewHolder> {

    int mdisplayColour;
    List<ModelOfDisplay>myModels;

    public DisplayAdapter(List<ModelOfDisplay> models){
        myModels = models;
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class HousesViewHolder extends RecyclerView.ViewHolder {
        CardView myCardView;
        TextView prices;
        TextView unitsOfHouses;
        ImageView picsOfHouses;

        public HousesViewHolder(View flowzView){
            super(flowzView);
            prices= flowzView.findViewById(R.id.price_of_houses);
            unitsOfHouses = flowzView.findViewById(R.id.house_unit_description);
            picsOfHouses = flowzView.findViewById(R.id.pics_of_houses);

        }

    }

    @NonNull
    @Override
    public HousesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_design, parent, false);
        HousesViewHolder myHVH = new HousesViewHolder(myView);
        return myHVH;
    }

    @Override
    public void onBindViewHolder(@NonNull HousesViewHolder holder, int position) {
        holder.unitsOfHouses.setText(myModels.get(position).myUnit);
        holder.prices.setText(myModels.get(position).myPrice);
        holder.picsOfHouses.setImageResource(myModels.get(position).mydisplayedPic);

    }

    @Override
    public int getItemCount() {
        return myModels.size();
    }
}
