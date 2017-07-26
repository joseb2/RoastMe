/**
 * Created by Admin on 7/11/2017.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    // Local drive "path"
    private String path;
    public ReadFile(String file_path){
        path = file_path;
    }
    public String[] OpenFile() throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        // initialize numberOfLines (Not hard-coded)
        // textData Array created for textfile(file_name)
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];

        int i;
        //For loop to search through array, calling readLine for BufferedReader object
        for ( i =0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }

        // Closing method for textReader (stops reading file)
        textReader.close();
        // returning textData
        return textData;
    }

    int readLines() throws IOException {

        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);

        String aLine;
        int numberOfLines = 0;

        //read each line of text stop when null value is reached
        while (( aLine = bf.readLine()) != null) {
            numberOfLines++;
        }

        //BufferedReader object closed method
        bf.close();
        // readLines method returns number of lines from designated path_file
        return numberOfLines;
    }

}
