package com.example.sanyanote;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Item> items;
    ItemAdapter(Context context, List<Item> items){
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.textView.setText(item.getText());
        holder.textViewDate.setText(item.getDate());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        final TextView textView;
        final TextView textViewDate;
        final RelativeLayout relativeLayout;
        private final Context context;

        ViewHolder(final View itemView){
            super(itemView);
            context = itemView.getContext();
            textView = itemView.findViewById(R.id.text_recycle_view);
            textViewDate = itemView.findViewById(R.id.date_recycle_view);
            relativeLayout = itemView.findViewById(R.id.buttonToNote);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,Note_Page.class);
            context.startActivity(intent);
        }
    }
}
