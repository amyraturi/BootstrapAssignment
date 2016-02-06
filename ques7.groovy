//7. Consider the following list: [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ] Print the class name of each element. What's the output of the following statement? list.get(6).get(9)

List list=[1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
list.each{println it.class}
println(list.get(6).get(9))
/*
OutPut
class java.lang.Integer
class java.lang.Integer
class java.lang.Integer
class java.lang.String
class java.math.BigDecimal
class java.util.ArrayList
class groovy.lang.IntRange
9
*/