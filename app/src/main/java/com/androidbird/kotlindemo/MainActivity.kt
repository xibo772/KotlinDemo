package com.androidbird.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sum = sum(4)
        var s: (Int, Int) -> Int = { x, y -> x + y }
        var m = { x: Int, y: Int -> x + y }
        val s1 = s(1, 2)
        val m1 = m(2, 1)
        print(sum)
    }

    private fun sum(n: Int): Int {
        var i = 1
        var s: Int = 0
        do {
            s = s + fac(i)
            i++;
        } while (i <= n)
        return s

    }

    private fun fac(n: Int): Int {
        var i: Int = 1
        var f: Int = 1
        for (hh in i..n) {
            f *= i
            i++
        }
        return f
    }
}
