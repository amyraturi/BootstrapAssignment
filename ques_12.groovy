//12. Make copy of an image type file byte by byte 

class CopyImg {
                 void copyImg() {
                      File srcFile = new File("/home/amit/dest.jpeg");

                      File desFile = new File("/home/amit/copyImg.jpeg");

                       desFile.bytes = srcFile.bytes;
                       
        
                 
                 }
                
}

new CopyImg().copyImg();