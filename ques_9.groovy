// 9. Combine content of all the files in a specific directory to another new file



class FileHandlng {
      void fileCopyData()
         {
         def dst = new File('/home/amit/dst.txt')
      def src = new File("/home/amit/amy/").eachFile{ dst << it.text} 
      
     
         }
}
new  FileHandlng().fileCopyData()