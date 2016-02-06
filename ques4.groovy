//4. Given two lists [11, 12, 13, 14] and [13, 14, 15], how would we obtain the list of items from the first that are not in the second?

List list1=[11, 12, 13, 14]
List list2=[13, 14, 15]
println list1-list1.intersect(list2) 
/*outPut
[11, 12]
*/