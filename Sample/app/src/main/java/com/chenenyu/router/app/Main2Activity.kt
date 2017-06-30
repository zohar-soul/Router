package com.chenenyu.router.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.chenenyu.router.Router
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        test()
        btn_kt.setOnClickListener {
            Router.build(testActivity).go(this)
        }
    }
}
