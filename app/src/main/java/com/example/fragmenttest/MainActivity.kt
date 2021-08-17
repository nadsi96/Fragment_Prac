package com.example.fragmenttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var countData = Count(0)
    var cnt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener {
            setFrag(0)
        }

        btn_2.setOnClickListener {
            setFrag(1)
        }
    }

    fun setFrag(num: Int) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        when (num) {
//            0 -> Frag1().newInstance(countData)?.let { transaction.replace(R.id.frame, it) }
//            1 -> Frag2().newInstance(countData)?.let { transaction.replace(R.id.frame, it) }
            0 -> Frag1().newInstance(cnt)?.let { transaction.replace(R.id.frame, it) }
            1 -> Frag2().newInstance(cnt)?.let { transaction.replace(R.id.frame, it) }
        }
        transaction.commit()
    }
}