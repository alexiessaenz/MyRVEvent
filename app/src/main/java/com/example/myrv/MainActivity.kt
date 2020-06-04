package com.example.myrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL, false)
        recycler.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))

        val albums = ArrayList<Album>()
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))
        albums.add(Album("Examen","moviles","23/06/2020",R.drawable.quiz))


        val adapter = AlbumAdapter(albums)
        recycler.adapter=adapter



    }
}