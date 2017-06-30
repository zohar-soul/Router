package com.chenenyu.router.app

/**
 * @author guozhong
 * @date 2017/6/30
 */
val testActivity: String = "123"


fun test() {
    routerAdd {
        config {
            key = testActivity
            value = TestActivity::class.java

        }
    }

}