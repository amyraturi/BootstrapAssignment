//21. Find if a map contains a particular key. 
Map m = ['1' : 2, '1' : 3, '3' : 4, '1':5]  
println m.'1'
/*output 5
that is only last element with the same  key is stored
*/
Map m1 = ['1' : 2, '2' : 3, '3' : 4, '5':5] 
Map m2 = ['5' : 2, '2' : "changed", '3' : 4, '4':5] 
Map m3 = m1+m2
println m3.'2' /*now both m1 and m2 have same key '2' but the output is changed
                  that is only second maps value is now associated the key '2'
                  so map has a partcular key*/ 
