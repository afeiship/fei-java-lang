/**
 * Created by feizheng on 2018-07-29.
 */

import java.io.File;
import java.util.UUID;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class UploadFileName {
    // 获取随机名称 a.txt
   public static String getUUIDFileName(String filename) {
      int index= filename.lastIndexOf(".");
      if (index!= -1) {
         return UUID.randomUUID()+ filename.substring(index);
      } else {
         return UUID.randomUUID().toString();
      }
   }

    public static String getDateFolder(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format(formatter);
    }

    public static String getDateFolder(String inFormatter){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(inFormatter);
        return date.format(formatter);
    }
 
    public static void main(String [] args){
        System.out.println( UploadFileName.getDateFolder() );
        System.out.println( UploadFileName.getDateFolder("yyyyMMdd") );
        System.out.println( UploadFileName.getUUIDFileName("test.txt") );
    }
}
