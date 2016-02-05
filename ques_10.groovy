//10. Create a file which contains all the odd numbered lines of a given file. Each line should be numbered at the beginning of line viz : 1, 3, 5.....
class FileExample {
 void fileEx() {
      File file = new File("/home/amit/abc.txt")
      println "Below is the content of the file ${file.absolutePath}"
      def lineNo = 1
      def line
      file.withReader { reader ->
         while ((line = reader.readLine())!=null) {
             if((lineNo%2)!=0)
         {
            println "${lineNo}. ${line}"
           
            } 
            lineNo++
         }
      }
   }
}
        
         
new  FileExample().fileEx() 