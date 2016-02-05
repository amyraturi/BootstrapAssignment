//3. Print this pattern : * ** **** ******** 
class StarBuilder {
    StarBuilder()
    {
    int i=0,j=0,limit=1  ;
    for(i=1;i<=4;i++)
   {
    for(j=1;j<=limit;j++)
    {
     print( "*")
    }
     print( " ")
    limit=limit*2;
   }
}
}
new StarBuilder()