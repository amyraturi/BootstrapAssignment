// 11. Write a method which removes all the white spaces in a file and writes the output to another file. Suppose white space characters are Space, Tab and Enter

class RemoveSpaces {
      void removingSpaces() {
            File srcF = new File("/home/amit/abc.txt");
            
            File desFile = new File("/home/amit/Untitled.txt");
            
            srcF.eachLine {line ->   
            desFile << line.replaceAll(" ", "") <<"\n";
                                          
                            }

        }
}
 
 new  RemoveSpaces().removingSpaces();