//22. Consider the following map: Map m = [‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300], ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100], ‘Management’ : [‘Management’ : 800] ] 22a) How many university departments are there? 22b) How many programs are delivered by the Computing department? 22c) How many students are enrolled in the Civil Engineering program?

Map m = ['Computing' : ['Computing' : 600, 'Information Systems' : 300], 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management' : ['Management' : 800]];


//24a) How many university departments are there?
int department=0
 m.each{ department++}
 println"number of university departments are  : "+ department
 
 //24b) How many programs are delivered by the Computing department?
 
 int comptngDprtPrgrm=0
 m.'Computing'.each{comptngDprtPrgrm++}
 println "programs are delivered by the Computing department are  : "+comptngDprtPrgrm;
 
// 24c) How many students are enrolled in the Civil Engineering program? 

println "students are enrolled in the Civil Engineering program are : "+m.'Engineering'.'Civil'
