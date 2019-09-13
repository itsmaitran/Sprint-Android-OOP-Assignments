package com.lambdaschool.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GenericFunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic_functions)
    }

    override fun onStart() {
        super.onStart()
//        val mySingleList = singleList("a")
//        val myOtherSingleList = singleList(1)
//        Toast.makeText(this, "Our single list contains ${mySingleList[0]}\n" +
//                "Our second list contains ${myOtherSingleList[0]}", Toast.LENGTH_SHORT).show()

//        val intBox = Box(1)
    }

    fun <K, V> singleList(k: K, v: V): Map<K, V> {
        val theList = mutableMapOf<K, V>()
        theList[k] = v
        return theList

    }

    open class Ball
    class Volleyball: Ball()
    open class GolfBall: Ball()
    class TitleistBall: GolfBall()

    class Box<T: Ball>(private var item: Ball)

    val ball = Ball()
    val volleyball = Volleyball()
    val golfBall = GolfBall()
    val titleistBall = TitleistBall()

    val ballBox = Box<Ball>(ball)
    val volleyballBox = Box<Ball>(volleyball)
    val golfBallBox = Box<Ball>(golfBall)
    val titleistBallBox = Box<Ball>(titleistBall)

//    class Box<Ball>(private var item: Ball) {
//
//        var open = false
//        // private var item: T= item
//
//        fun fetch(): Ball? {
//            return item.takeIf { open }
//        }
//    }
}
