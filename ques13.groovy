//13. Find the number of occurences of a character in a string 
String name="hello how are you and would went to school yesterday"
List list=name.toList();
Set set=list as Set
int numOfOccrnc=0;
set.each{
           temp=it
           numOfOccrnc=0
          list.each{if(temp==it)
                      numOfOccrnc++;      
          }
     println(temp +" "+ numOfOccrnc)
}