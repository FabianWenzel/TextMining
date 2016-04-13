import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShakespeareParser {
    public static void main(String[] args){

        // http://www.mkyong.com/java/how-to-read-utf-8-encoded-data-from-a-file-java/
        String fulltext ="";


        try {
            StringBuilder ftBuilder = new StringBuilder();
            File fileDir = new File("C:\\Users\\fuexle\\Documents\\Textmining\\TXT\\\\historical\\\\The Tragedy of King Richard II.txt");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileDir), "UTF_16LE"));

            String line;

            while ((line = in.readLine()) != null) {

                //System.out.println(line);
                ftBuilder.append(line).append("\n");
            }
            fulltext = ftBuilder.toString();

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
        // \n Matches a LINE FEED Charakter, \w machtes any word charakter
        // \W matches any charakter that is not a word character underscore
        // \s matches any white space
        Pattern p1 = Pattern.compile("<STAGE DIR>[\\n\\w\\W\\s]*?</STAGE DIR>");
        Matcher m1 = p1.matcher(fulltext);
        fulltext = m1.replaceAll("\t");

        // Ab hier wieder alte Strategie, zeilenweise Verarbeitung
        List<String> path = new ArrayList<String>();
        StringBuffer tmp = new StringBuffer();

        System.out.println(fulltext);
    }
}