package com.company

class Rectangle_Kotlin(xcoord: Float, ycoord: Float, width: Float, height: Float) : Sqare_Kotlin(xcoord, ycoord, width) {
    init {
        this.height = height
    }

    fun calcArea(): Float {
        return width * height
    }


}