//15.Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print "FizzBuzz".
List list=1..100
list.each{ 
     
     if(it%3==0){
     print("\n");
     print("Fizz")
     }
     if(it%5==0){
     print("Buzz")
     }
     else{
          println("\n"+it);
     }
    
}
     
