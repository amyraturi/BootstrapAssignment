//24. Write a method which retruns the value of passed key from a search string of the form "http://www.google.com?name=johny&age=20&hobby=cricket" 
String value="http://www.google.com?name=johny&age=20&hobby=cricket" 
List list=value.toList()
int flag=0;
String key=""
list.each{String temp='';
           if(it[0]=='?'){
            temp=it[0];   
           }
           if((flag==1)&&(it[0]!="=")){
           key=key+it
           }
           if(it[0]=="=")
           {
              flag=0
              println key 
              key=""
           }
            if((temp=='?')||(it[0]=='&')){
            flag=1
           }
          }
