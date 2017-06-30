package com.chenenyu.router.app

import android.app.Activity
import android.support.v4.app.Fragment
import com.chenenyu.router.Router

/**
 * @author guozhong
 * @date 2017/6/30
 */
inline fun <reified T : Activity> Fragment.startActivity(vararg params: Pair<String, Any>) {
    Router.build(T::class.java.name).go(this)
}

fun Fragment.router(block:Params.() -> Unit) {
    block.invoke()
}

Router.build(uri).go(this)
class Params{
    var url:String? = null
    var params:Pair<String,Any>? = null
}

