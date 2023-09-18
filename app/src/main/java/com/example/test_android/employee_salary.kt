package com.example.test_android

object Employee_salary {
    @JvmStatic
    fun main(args: Array<String>) {

        // challenge -> figure out a way to print salaries of each employee based on
        //  1. Contractor
        // 2. Full Time
        // 3. Intern
        val employee1: Employee = Contractor("John", "Contractor", 123, 'J')
        val employee2: Employee = FullTime("Smith", "Full Time", 456, 'S')
        val employee3: Employee = Intern("Sara", "Intern", 789, 'S')
        //---------------operations to learn concepts of encapsulation and abstraction

        // can be accessed using . operator as variable is protected and can be accessed in the folder(package)
        employee1.employeefirstchar = 'H'
        // can be accessed using . operator as variable is public
        employee1.EmployeeName = "Harshit"

        println(employee1.EmployeeName) // will run
        //println(employee1.employeeId) // will not run
        // employeeId and employee type cannot be edited directly as they are private , to print them or edit them getter or setter is required

        // this wil print as we are getting from getter function, also you can see the statement after . operator is in italics to signify it is coming from a function
        println(employee1.employeetype)
        println(employee2.employeetype)
        // this wont work as employeeId is private variable , we need a setter to change it
        //employee1.employeeId = 3599
        // changed value of employeeId using a setter
        employee1.setEmployeeId(3599)
        employee3.setEmployeeId(2266)
        // Note :: for variables like example -password, to protect them , we will never make a getter, also will keep the variable private , in this way there will be no chance of password getting fetched
        //---------------operations to learn concepts of encapsulation and abstraction

        // print employee1
        println(employee1)
        println(employee2)
        println(employee3)
    }
}