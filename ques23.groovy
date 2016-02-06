//23. Conside a class named "Employee" which has the following properties: 1) Name 2) Age 3) DepartmentName 4) EmployeeNumber 5) Salary Let's say that there's a list of 50 employees available. Perform the following operations on the list of employees: a) Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on. b) Get a count of the number of employees in each department c) Get the list of employees whose age is between 18 and 35 d) Group the employees according to the alphabet with which their first name starts and display the number of employees in each group whose age is greater than 20 e) Group the employees according to their department. 
class Employee{
    String name;
    int    age;
    String departmentName;
    int    employeeNumber
    int    salary;
 }  
 List < Employee> employeeRecords=new ArrayList < Employee> ()
 employeeRecords.add(name:'rajesh',age:21,departmentName:'IT',employeeNumber:36,salary:2500);
 employeeRecords.add(name:'raghu',age:19,departmentName:'managment',employeeNumber:137,salary:12500);
 employeeRecords.add(name:'akash',age:43,departmentName:'CS',employeeNumber:66,salary:15500);
 employeeRecords.add(name:'aditya',age:32,departmentName:'IT',employeeNumber:37,salary:5500);
 employeeRecords.add(name:'sahil',age:26,departmentName:'managment',employeeNumber:126,salary:3500);
 employeeRecords.add(name:'vinod',age:24,departmentName:'CS',employeeNumber:68,salary:6500);
 employeeRecords.add(name:'sameer',age:42,departmentName:'IT',employeeNumber:39,salary:13500);
 employeeRecords.add(name:'varun',age:33,departmentName:'IT',employeeNumber:33,salary:16500);
 
 //a) Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on.
 
 println employeeRecords.groupBy{
                        
                         if((0<it.salary)&&(it.salary<=5000))
                         {
                           "0to5000"
                        
                         }
     
                         else  if((5000<it.salary)&&(it.salary<=10000))
                         {
                           "5000to10000"
                        
                         }

                          else  if((5000<it.salary)&&(it.salary<=10000))
                         {
                           "5000to10000"
                        
                         }
                          else  if((10000<it.salary)&&(it.salary<=15000))
                         {
                           "10000to15000"
                        
                         }
                          else  if((15000<it.salary)&&(it.salary<=20000))
                         {
                           "15000to20000"
                        
                         }                         
  }
  
  
 // b) Get a count of the number of employees in each department
 
 int departmentCount=0; 
 //employeeRecords.each{}
 Set set= employeeRecords.departmentName as Set
 set.each{
          temp=it;
           departmentCount=0;
          employeeRecords.departmentName.each{
                                         if(temp==it){
                                          departmentCount++;
                                         }
          }
          println(temp+" : "+ departmentCount)
 }         
 
 
// c) Get the list of employees whose age is between 18 and 35

println employeeRecords.age.findAll{(18<it)&&(it<35)}


//d) Group the employees according to the alphabet with which their first name starts and display the number of employees in each group whose age is greater than 20 
 Map m= employeeRecords.groupBy{
    it.name.getAt(0).each{}
}   
int count=0
m.each{
    it.value.each{
        if(it.age>20){count++}
    }
    println "${it.key}:${count}"
    count=0
}

//e) Group the employees according to their department.

 employeeRecords.groupBy{ it.departmentName}
