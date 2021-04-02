package com.example.android42_day03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvMovieCode;
    List<Movie> movieList;
    AdapterMovie adapterMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovieCode = findViewById(R.id.lvMovie);

        Movie movie = new Movie("Phantoms", "Action", "Đây là mô tả của bộ phim này","1h30m", R.drawable.phantoms);
        Movie movie1 = new Movie("Doctor who", "Action", "Đây là mô tả của bộ phim này","1h30m", R.drawable.doctor);
        Movie movie2 = new Movie("Avengers", "Action", "Đây là mô tả của bộ phim này","1h30m", R.drawable.transformer);

        movieList = new ArrayList<>();
        movieList.add(movie);
        movieList.add(movie1);
        movieList.add(movie2);

        // khởi tạo adapter
        adapterMovie = new AdapterMovie(movieList);
        lvMovieCode.setAdapter(adapterMovie);

    }

}