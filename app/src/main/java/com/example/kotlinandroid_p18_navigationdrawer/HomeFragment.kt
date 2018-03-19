package com.example.kotlinandroid_p18_navigationdrawer

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by Dima on 20.03.2018.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_home, null)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnClickHome.setOnClickListener {
            Toast.makeText(activity, "You just clicked !!!", Toast.LENGTH_SHORT).show()
            tvHomeFragment.text = "This is tre HomeFragment"
        }
    }
}