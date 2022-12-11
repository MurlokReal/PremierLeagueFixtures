package com.example.premierleaguefixtures.skrypnik

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        val nextViewButton = findViewById<Button>(R.id.nextViewButton)
        val detailScreenFragment = DetailScreenFrag.newInstance(1,
            1,
            "2021-08-13 19:00:00Z",
            "Brentford Community Stadium",
            "Brentford",
            "Arsenal",
            null,
            2,
            0)
//        supportFragmentManager.beginTransaction()
//            .add(R.id.fragmentContainerView, detailScreenFragment)
//            .commit()


        nextViewButton.setOnClickListener() {

            val myCurrentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)

            if (myCurrentFragment.toString().startsWith("DetailScreen")) {
                supportFragmentManager.beginTransaction()
                    .remove(detailScreenFragment)
                    .commit()
                nextViewButton.setText(R.string.next_layout_button)
            }

            else {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainerView, detailScreenFragment)
                    .commit()
                nextViewButton.text = "HIDE DETAILS"
            }
        }

    }

    
}


