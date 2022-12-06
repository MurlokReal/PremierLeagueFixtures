package com.example.premierleaguefixtures.skrypnik

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

    }

    fun onClickNextViewButton(view : View) {
        val firstFrag = FirstFragment.newInstance()
        val secondFrag = SecondFragment.newInstance()

        var myCurrentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        Log.d("MyTag", myCurrentFragment.toString())

        if (myCurrentFragment.toString().startsWith("FirstFragment")) supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, secondFrag)
            .commit()
        else supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, firstFrag)
            .commit()
    }
    
}


