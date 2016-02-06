//6. Remove all records from a list whose index is odd
List list=[11, 12, 13, 14,15,16,17,18,19]
list.eachWithIndex {
                   value,index-> if(index%2==0){list=list-value}  
                            
 } 
 println(list)
 /*
 OutPut
 [12, 14, 16, 18]
 */
 