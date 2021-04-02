package com.example.android42_day03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMovie extends BaseAdapter {

    List<Movie> movieList;

    public AdapterMovie(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_item_movie, parent,false );

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvCategory = view.findViewById(R.id.tvCategory);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        TextView tvHour = view.findViewById(R.id.tvHour);

        ImageView imgAvatar = view.findViewById(R.id.imgAvatar);

        Movie movie = movieList.get(position);

        tvName.setText(movie.getName());
        tvCategory.setText(movie.getCategory());
        tvDescription.setText(movie.getDescription());
        tvHour.setText(movie.getHour());
        imgAvatar.setImageResource(movie.getAvatar());

        return view;
    }
}
