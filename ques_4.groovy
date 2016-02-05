//4. GString... override the toString() of the Person class to return something like... "Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and draws $$$$$$$ lots of money !!!!." 

class PersonInfo {

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
     String toString(){
     println("$name is a man aged $age who lives at $address. He works for Intelligrape with employee id 12 and draws"+'$$$$$$$ lots of money !!!!');
     
     }  
}
       
     PersonInfo obj=new PersonInfo();
     obj.name="akash" 
     obj.age=25
     obj.gender="male"
     obj.address="Delhi"
     obj.toString()   
