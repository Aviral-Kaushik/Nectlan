package com.aviral.netclan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.netclan.Models.RecyclerModel;
import com.aviral.netclan.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final ArrayList<RecyclerModel> recyclerModelArrayList;

    public RecyclerViewAdapter(ArrayList<RecyclerModel> recyclerModelArrayList) {
        this.recyclerModelArrayList = recyclerModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_snippet_recycler_view,
                parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        setAnimation(holder.itemView.getContext(), holder.itemView);

        holder.name.setText(recyclerModelArrayList.get(position).getUserName());
        holder.address.setText(recyclerModelArrayList.get(position).getLocation());
        holder.intro.setText(recyclerModelArrayList.get(position).getIntro());
        holder.caption.setText(recyclerModelArrayList.get(position).getCaption());


    }

    private void setAnimation(Context context, View itemView) {
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);

        itemView.startAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return recyclerModelArrayList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView address;
        private final TextView intro;
        private final TextView caption;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);

            address = itemView.findViewById(R.id.address);

            intro = itemView.findViewById(R.id.intro);

            caption = itemView.findViewById(R.id.caption);

        }
    }
}
