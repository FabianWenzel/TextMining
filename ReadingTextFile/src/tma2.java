import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class tma2 {
    public static void main(String[] args){

        // http://www.mkyong.com/java/how-to-read-utf-8-encoded-data-from-a-file-java/

        try {
            File fileDir = new File("C:\\Users\\fuexle\\Documents\\Textmining\\TXT\\historical\\The Second Part of King Henry VI.txt");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileDir), "UTF_16LE"));

            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }

            in.close();
        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}