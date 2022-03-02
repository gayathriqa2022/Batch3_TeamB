package day15fileinputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.IOException;

public class FileHanding {
    public static void main(String[] args) {
        //writing to the existing file
        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/FileRead_Write.txt"));
            bufferedWriter.write("welcome");
            bufferedWriter.write("\nHello Java");
            bufferedWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
