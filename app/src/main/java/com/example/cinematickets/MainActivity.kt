package com.example.cinematickets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var list= ArrayList<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateList()
        var adapter = MoviesAdapter(list)
        moviesRecyclerView.adapter  = adapter

    }

    fun populateList(){
        list.add(Movie("Good Boys",R.drawable.good_boys_poster,"Action","Drama","History"))
        list.add(Movie("Joker",R.drawable.joker_poster,"Action","Drama","History"))
        list.add(Movie("The Hustle",R.drawable.hustle_poster,"Action","Drama","History"))
    }
}