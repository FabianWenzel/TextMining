/**
 * Created by fuexle on 06.04.2016.
 */
// package ReadingTextFile;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadFile {

    private String path;

    public ReadFile (String file_path){
        path = file_path;
    }

    public String[] OpenFile() throws IOException{

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[ ] textData = new String[numberOfLines];

        int i;

        for (i=0; i < numberOfLines; i++) {
            textData[ i ] = textReader.readLine();

        }

        textReader.close();
        return textData;
    }

    int readLines() throws IOException{

        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);

        String aLine;
        int numberOfLines = 0;

        while((aLine = bf.readLine()) != null){

           // String line = "This order was placed for QT3000! OK?";
            String pattern = "^<([^/>a-z]+)>";

            // Create a Pattern object
            Pattern r = Pattern.compile(pattern);

            // Now create matcher object.
            Matcher m = r.matcher(aLine);
            if (m.find( )) {
                System.out.println("Found value: " + m.group(0) );
            } else {
                System.out.println("NO MATCH");
            }
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;

    }

}
