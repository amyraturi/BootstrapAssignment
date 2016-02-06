//3. Create a set from a list containing duplicate elements. What do you observe? How can you achieve the same result without converting a list to a set?

List list=[1,1,2,3,2,3,4,4,4,5]
Set set=list as Set
println set
/*
OutPut
[1, 2, 3, 4, 5]
no dublicacy
*/

println list.unique{it}
/*
output
[1, 2, 3, 4, 5]
*/