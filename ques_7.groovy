// 7. Print multiple of 3 upto 10 terms in at least three different ways using groovy special methods
class MultipleOfThree {
     void findMultiple()
      {
      int i=1;
       10.times{ println(i*3);i++}
       (1..10).collect{println(it * 3)}
       i=0;
       int j=i+2;
       while(i<10)
       {
      println((i..j).sum())
      i++;j++;
      }
      }
      
      

}
new  MultipleOfThree().findMultiple()