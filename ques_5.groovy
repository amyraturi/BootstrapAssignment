//5. Groovy Truth: if('test') { printlnn "test evaluated to true inside if" } try replacing test with various objects and observe its behaviour. a) "Test" b)'null' c) null d) 100 e) 0 f) empty list g) list with all vaues as null List list = new ArrayList()


class TruthClass
{
void truthCase()
{
if("Test")
    println "Test evaluated to true inside if"
    
if('null')
    println "'null' evaluated to true inside if"
    
if(null)
    println "null evaluated to true inside if"
    
if(100)
    println "100 evaluated to true inside if"

if(0)
    println "0 evaluated to true inside if"

List emptyList = [];

if(emptyList)
    println "emptyList evaluated to true inside if"

List nullList = null;

if(nullList)
    println "null evaluated to true inside if"

List list = new ArrayList();
list. add(null);

if(list)
    println "list evaluated to true inside if"
    }
 }
    new TruthClass().truthCase();