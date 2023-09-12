package com.example.test_android

object Area {
    @JvmStatic
    fun main(args: Array<String>) {
        val square: Area_calculator = Square(5f)
        val rectangle: Area_calculator = Rectangle(5f, 2f)
        val triangle: Area_calculator = Triangle(5f, 4f)

//        println(square.area_calc())
//        println(rectangle.area_calc())
//        println(triangle.area_calc())

        //toString function override kr denda sab as iss name de function nal bina method define kite v output andi
        // whereas area_calc naam de function naal output nhi aa rhi  without defining it as square.area_calc().... etc
        // toString vich .toString paan di lorh hi nhi
        println(square)
        println(rectangle)
        println(triangle)
    }
}