package com.example.test_android

object Driver {
    @JvmStatic
    fun main(args: Array<String>) {

        // challenge -> figure out a way to print salaries of each employee based on
        //  1. Contractor
        // 2. Full Time
        // 3. Intern
        val employee1: Employee = Contractor("John", "Contractor", 123, 'J')
        val employee2: Employee = Intern("Smith", "Full Time", 456, 'S')
        val employee3: Employee = FullTime("Sara", "Intern", 789, 'S')

        // print employee1
        println(employee1)
        println(employee2)
        println(employee3)
    }
}