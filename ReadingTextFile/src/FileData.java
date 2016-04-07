/**
 * Created by fuexle on 06.04.2016.
 */
//package ReadingTextFile;
import java.io.IOException;



public class FileData {
    public static void main(String[] args) throws IOException {

        String file_name = "C:/Users/student/Documents/TXT/historical/The First Part of King Henry IV_characters/QUICKLY.txt";


        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();

            int i;
            for (i=0;i < aryLines.length; i++){
                System.out.println(aryLines[i]);
            }


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}

