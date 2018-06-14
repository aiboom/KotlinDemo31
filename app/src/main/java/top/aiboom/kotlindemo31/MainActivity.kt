package top.aiboom.kotlindemo31

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import top.aiboom.kotlindemo31.day1to10.generateRect

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateRect(12,22,32,43)
    }
}
