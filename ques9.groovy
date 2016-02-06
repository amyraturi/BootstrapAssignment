/*9. Consider a class Employee with following details * Name * Age * Salary Create a list consisting of 10 Employee objects. 6(a). Get a list of employees who earn less than 5000 6(b). Get the name of the youngest employee and oldest employee 6(c). Get the employee with maximum salary 6(d). Get the list of names of all the employees*/

class Employee {
      String name;
      int    age;
      int    salary;
}
List<Employee> list = new ArrayList<Employee>();

  list.add(name:"akash",age:23,salary:3000)
  list.add(name:"abhi",age:33,salary:45000)
  list.add(name:"basant",age:43,salary:19000)
  list.add(name:"chanakya",age:19,salary:2000)
  list.add(name:"emril",age:29,salary:88000)
  list.add(name:"farukh",age:31,salary:78000)
  list.add(name:"govind",age:29,salary:98000)
  list.add(name:"neekita",age:56,salary:18000)
  list.add(name:"waseem",age:23,salary:128000)
  list.add(name:"yashwant",age:32,salary:28000)
  
  
  //(a). Get a list of employees who earn less than 5000
         println list.findAll{it.salary<5000}
         
   
   //(b). Get the name of the youngest employee and oldest employee
    println list.min{it.age}.name 
    println list.max{it.age}.name
    
    
    //(c). Get the employee with maximum salary
           println list.max{it.salary}
           
           
   //(d). Get the list of names of all the employees
   
           println list*.name;
                     