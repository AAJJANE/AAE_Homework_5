package com.example.aae_homework_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShipAdapter extends RecyclerView.Adapter<ShipAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Ship> ships;

    public ShipAdapter(Context context, List<Ship> ships) {
        this.inflater = LayoutInflater.from(context);
        this.ships = ships;
    }

    @Override
    public ShipAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ship_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ShipAdapter.ViewHolder holder, int position) {
        Ship ship = ships.get(position);
        holder.shipView.setImageResource(ship.getShipResource());
        holder.nameView.setText(ship.getName());
        holder.shipDescriptionView.setText(ship.getShipDescription());
    }

    @Override
    public int getItemCount() {
        return ships.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView shipView;
        final TextView nameView, shipDescriptionView;

        ViewHolder(View view) {
            super(view);
            shipView = view.findViewById(R.id.shipResource);
            nameView = view.findViewById(R.id.name);
            shipDescriptionView = view.findViewById(R.id.plantDescription);
        }
    }
}
