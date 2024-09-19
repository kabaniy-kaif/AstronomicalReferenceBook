package com.example.astronomical_reference_book

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var glSurfaceView: MyGLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        glSurfaceView = MyGLSurfaceView(this)
        setContentView(glSurfaceView)
    }
}