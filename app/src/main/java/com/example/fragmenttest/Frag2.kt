package com.example.fragmenttest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.frag2.*

class Frag2 : Fragment() {

//    lateinit var count: Count
    var count = 0
    val TAG = "frag2"
//    fun newInstance(param: Count): Frag2? {
//        val args = Bundle()
//        args.putParcelable("count", param)
//        val fragment = Frag2()
//        fragment.arguments = args
//        return fragment
//    }
    fun newInstance(param: Int): Frag2?{
    val args = Bundle()
        args.putInt("count", param)
        val fragment = Frag2()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        arguments?.let{
//            count = it.getParcelable<Count>("count")?: Count(0)
//        }
        arguments?.let{
            count = it.getInt("count")?: 0
        }
        return inflater.inflate(R.layout.frag2, container, false)
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        tv_content.text = count.cnt.toString()
        tv_content.text = count.toString()
        btn_add.setOnClickListener {
//            count.cnt += 1
//            tv_content.text = count.cnt.toString()
            count+= 1
            tv_content.text = count.toString()
        }
    }
    override fun onStart() {
        Log.i(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause")

        val main = activity as MainActivity
//        main.countData = count
        main.cnt = count
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }
}