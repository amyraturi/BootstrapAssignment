//1. Create a class in Java along with follwing fields. classname: Person fields: name, age, gender, address Access the fields in all known ways: like through getter , by dot operator

class Person {

      String name;
      int    age;
      String gender;
      String address;
      
      
      
      void setName( String name) {
           this.name=name;
       }
      void   setAge( int age){
           this.age=age;
       }
       void  setGender( String gender)
       {
           this.gender=gender;
       }
       void  setAddress( String address)
       {
           this.address=address;
       }
       String getName()
       {
           return name;
       }
       int  getAge( )
       {
            return age;
       }
       String getGender( )
       {
           return gender;
       }
       String  getAddress( )
       {
           println("hello")
           return address;
       }
       
}
       
     def person1= new Person(name:"abhinav",age:23,gender:"male",address:"nanital")
      println(person1.name);
     println(person1.age);     
     println(person1.gender);
      println(person1.address);    

     Person obj=new Person();
     obj.name="akash" 
     obj.age=25
     obj.gender="male"
     obj.address="Delhi"
     println(obj.name);
     println(obj.age);     
     println(obj.gender);
      println(obj.address);    