//2. Extend the Person class in Groovy Add following fields to it: empId, company, salary Access the fields in all known ways: like through getter , by dot operator, by @ operator. 
class Employee extends Person
{
    int empId;
    String company;
    int salary;

    int getEmpId()
    {
        return empId;
    }
    
    String getCompany()
    {
        return company;
    }    
    
    int getSalary()
    {
        return salary;
    }
    
    void setEmpId(int empId)
    {
        this.empId = empId;
    }
    
    void setCompany(String company)
    {
        this.company = company;
    }
    
    void setSalary(int salary)
    {
        this.salary = salary;
    }
    
}


Employee emp = new Employee([name : 'akshay', age : 23, gender : 'Male', address : 'New Delhi', empId : 160012, company : 'TTN', salary : 15000]);

println "Age : " + emp.getAge();
println "Name : " + emp.name;
println "Salary : " + emp.@salary;