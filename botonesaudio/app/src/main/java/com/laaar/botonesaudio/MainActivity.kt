package com.laaar.botonesaudio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    private lateinit var mediaPlayer1 : MediaPlayer
    private lateinit var mediaPlayer2 : MediaPlayer
    private lateinit var mediaPlayer3 : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tomo los botones del archivo main_activity.xml
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        // Asignar un audio al boton 1
        mediaPlayer1 = MediaPlayer.create(this, R.raw.Si_)

        // Asignar un audio al boton 2
        mediaPlayer2 = MediaPlayer.create(this, R.raw.No)

        // Asignar un audio al boton 3
        mediaPlayer3 = MediaPlayer.create(this, R.raw.Talvez)

        // Si se presiona uno de los tres botones
        setOnClickListeners(this)
    }

    private fun setOnClickListeners(context: Context) {

        // Reproduciendo Audio 1
        button1.setOnClickListener {
            mediaPlayer.start()
            Toast.makeText(context, "Reproduciendo Audio 1...", Toast.LENGTH_SHORT).show()
        }

        // Reproduciendo Audio 2
        button2.setOnClickListener {
            mediaPlayer.start()
            Toast.makeText(context, "Reproduciendo Audio 2...", Toast.LENGTH_SHORT).show()
        }

        // Reproduciendo Audio 1
        button3.setOnClickListener {
            mediaPlayer.start()
            Toast.makeText(context, "Reproduciendo Audio 3...", Toast.LENGTH_SHORT).show()
        }
    }
}


