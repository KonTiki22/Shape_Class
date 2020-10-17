package com.company

open class Sqare_Kotlin(var x: Float, var y: Float,  side: Float) {
    var width: Float
    var height: Float
    init {
        this.width = side
        this.height = side
    }

    open fun calcDiagonal(): Float {
        return Math.sqrt((width*width + height*height).toDouble()).toFloat()
    }
}