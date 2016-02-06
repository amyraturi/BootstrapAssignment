//16. Consider a class named "Stack" that holds a list of objects and has the following operations associated: 1) POP - Pops the last element off the stack 2) PUSH - Pushes an element on top of the stack 3) TOP - Returns the element at the top of the list Implement the aforesaid class
class Stack {
      List <Stack>list=new ArrayList<Stack>();
      void pop(){
           try {
                StackValues object=list.pop()
              println "Object deleted is =  "+object +"  And its value is "+ object.element;
           }catch(Exception e){
                      print "Empty Stack"       
             } 
      
       }
       void push(StackValues element){
            list.push(element)
       
       }
       
       StackValues top(){
             try{
            return list.last();
                }catch(Exception e){
                       println "empty stack"
                     
                 }
      }
}
class StackValues{
      int element;
}
Stack stack=new Stack();
StackValues object;
StackValues value1=new StackValues(element:1)
stack.push(value1);
object=stack.top();
println("Top = "+object.element)

StackValues value2=new StackValues(element:2)
stack.push(value2);
object=stack.top();
println("Top = "+object.element)

stack.pop();
object=stack.top();
println("Top = "+object.element)
