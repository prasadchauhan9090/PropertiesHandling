package ProPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

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
        prop.setProperty("username","prasad");
       prop.setProperty("password","@Chauhan99");

        FileOutputStream fos = new FileOutputStream(file);

       prop.store(fos, "New Properties file is created");

        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
//       Set<Object> keys =  prop.keySet();
//       System.out.println(keys);

        Collection<Object> c = prop.values();
        System.out.print(c);

        System.out.print("\n");

        System.out.println(prop.getProperty("username"));

        System.out.println(prop.getProperty("MachineName","HP LAPTOP"));

        System.out.println(prop.getProperty("urls","192.198.28.50"));




        for(Object key : prop.keySet())
        {
            System.out.println(key+">>>>>>>>>>>> "+prop.getProperty((String)(key)));
        }



    }
}
