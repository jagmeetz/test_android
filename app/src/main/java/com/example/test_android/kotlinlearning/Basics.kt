package com.example.test_android.kotlinlearning



object Basics {
    @JvmStatic
    fun main(args: Array<String>) {

        val employee1: Employee =Contractor("John", "Contractor", 123, 'J')
        val employee2: Employee =Intern("Smith", "Full Time", 456, 'S')
        val employee3: Employee = FullTime("Sara", "Intern", 789, 'S')

        // print employee1
        println(employee1)
        println(employee2)
        println(employee3)
//----------------------------------------------
        //output hello world
        //System.out.printf("Hello world");
//-------------------------------------------------
        //output string, int and char basic way
//        String employeeName = "John Smith";
//        char employeeFirstChar = 'J';
//        int employeeId = 1234;
//        System.out.println(employeeName);
//        System.out.println(employeeFirstChar);
//        System.out.println(employeeId);

        //------------------------------------------
        // using class to output employee name , id ,etc
//        Employee employee1= new Employee("John Smith", "Contractor",123,'J');
//        System.out.println("hello");
//        System.out.println(employee1);
//        System.out.println("world");
//        System.out.println(employee1.EmployeeName);
//        System.out.println(employee1.toString());

        //-----------------------------------
        // mathematical operations
//
//        System.out.println(1+1);
//        System.out.println(1*1);
//        System.out.println(1-1);

        //-----------------------------------------
// int return function
//       int result= calculator(2,5);
//        System.out.println("calculator1 add: "+result);
//        // void return function
//        calculator2(1,4);

        //-------------------------------------------------------
        // CONVERTING EMPLOYEES INTO A ARRAY
//        Employee employee1= new Employee("John Smith", 'J',123);
//        Employee employee2= new Employee("asd", 'A',176);
//        Employee employee3= new Employee("qwerty", 'Q',7564);
////
//
//        ArrayList<Employee> employeeList= new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//
//        System.out.println(employeeList);

        ///////////////////////////////////////////////////
//        // issue in converting to list - not resolved
//        ArrayList<Employee> employeeArrayList2= (ArrayList<Employee>) Arrays.asList(employee1,employee2,employee3);
//        System.out.println(employeeArrayList2);
        ///////////////////////////////////////////////////////
    } //    // int function can return a value
    //    // public means open and static is used as main is static and only static can be called by static..... maybe
    //    public static int calculator(int a, int b){
    //        return a+b;
    //    }
    //    //void does not return anything and not storing but just printing
    //    public static void calculator2(int a, int b){
    //        System.out.println(a+b);
    //    }
    // for loop and concatenation in print
    //    public static void printHelloWorld(){
    //        for (int i=0;i<5;i++){
    //            System.out.println("Hello World" + i);
    //        }
    //    }
    /// function to check salary of an employee~~ messy way , better way is extending using inheritance with employee class
    //    public static void printEmployeeSalary(Employee employee){
    //        if (employee.employeetype.equals("Contractor")) {
    //            System.out.println("Contractor Salary: $100,000");
    //        } else if (employee.employeetype.equals("Full Time")) {
    //            System.out.println("Full Time Salary: $150,000");
    //        } else if (employee.employeetype.equals("Intern")) {
    //            System.out.println("Intern Salary: $50,000");
    //        }
    //    }
}

 open class Employee    //constructor
     (//data
     var EmployeeName: String,
     employeetype: String,
     var employeeId: Int,
     var employeefirstchar: Char
) {
    var employeetype: String? = null

    //to string method
    override fun toString(): String {
        return "Employee Name:$EmployeeName\nEmployee Id: $employeeId"
    }
}

internal class Contractor(
    employeeName: String,
    employeeType: String,
    employeeId: Int,
    employeefirstchar: Char
) :
    Employee(employeeName, employeeType, employeeId, employeefirstchar) {
    var salary = "$100,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

internal class Intern(
    employeeName: String,
    employeeType: String,
    employeeId: Int,
    employeefirstchar: Char
) :
    Employee(employeeName, employeeType, employeeId, employeefirstchar) {
    var salary = "$50,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

internal class FullTime(
    employeeName: String,
    employeeType: String,
    employeeId: Int,
    employeefirstchar: Char
) :
    Employee(employeeName, employeeType, employeeId, employeefirstchar) {
    var salary = "$150,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}