# botones-audio



 ![Screenshot](botones-audio_1.png) 


# AndroidManifest.xml

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.laaar.botonesaudio">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.BotonesAudio">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>



# MainActivity.kt

package com.laaar.botonesaudio

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

 ![Screenshot](screenshot.png) 
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
        mediaPlayer1 = MediaPlayer.create(this, R.raw.Si)

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


# main_activity.xml


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="0.3"
        android:layout_gravity="center_vertical"
        android:text="@string/buttonn1"
        tools:layout_editor_absoluteX="63dp"
        tools:layout_editor_absoluteY="272dp" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="0.3"
        android:layout_gravity="center_vertical"
        android:text="@string/buttonn2"
        tools:layout_editor_absoluteX="176dp"
        tools:layout_editor_absoluteY="275dp" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="0.3"
        android:layout_gravity="center_vertical"
        android:text="@string/buttonn3"
        tools:layout_editor_absoluteX="286dp"
        tools:layout_editor_absoluteY="275dp" />

</LinearLayout>






# string.xml

<resources>
    <string name="app_name">botones audio</string>
    <string name="buttonn1">boton uno</string>
    <string name="buttonn2">boton dos</string>
    <string name="buttonn3">boton tres</string>
</resources>



# Los arvhivos mp3

botones-audio/botonesaudio/app/src/main/res/raw/
