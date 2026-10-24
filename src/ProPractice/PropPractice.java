package ProPractice;

import java.io.File;
import java.io.IOException;

public class PropPractice {


    public static void main(String args[]) throws IOException
    {
        //creating propertise file object
        File file = new File("dbConfig.properties");
        if(!file.exists())
            //creating propertise file
            file.createNewFile();
        System.out.println(file.exists());

        //Deleting propertise file
        //file.delete();
       // System.out.println(file.exists());

    }
}
