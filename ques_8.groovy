//8. Write a closure which checks if a value is contained within a list where the closure accepts two parameters
class ExClosure {
     
      void findElement(List list,int findme)
      {
      
       if (findme in list) { println("founded") }
      }

}
 def List list = new ArrayList();
 list.add(1)
  list.add(2)
   list.add(3)
    list.add(4)
     list.add(5)
 int findme=3;
 new  ExClosure().findElement(list,findme)