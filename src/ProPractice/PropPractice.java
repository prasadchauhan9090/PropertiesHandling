package ProPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropPractice {

    public static void main(String args[]) throws IOException
    {
        //creating propertise file object
        File file = new File("dbConfig.properties");
        if(!file.exists())
            //creating propertise file
            file.createNewFile();
        //System.out.println(file.exists());

        //Deleting propertise file
        //file.delete();
       // System.out.println(file.exists());


        Properties prop = new Properties();

        prop.setProperty("url","localhost");
        prop.setProperty("user","prasad");
        prop.setProperty("password","@Chauhan99");

        FileOutputStream fos = new FileOutputStream(file);

        prop.store(fos, " ");



    }
}
