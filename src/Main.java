import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Created by Admin on 5/16/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String prepositions = "RoastMe/src/prepositions.txt";
        String dictionary = "https://github.com/joseb2/RoastMe/blob/master/src/brit-a-z.txt";
        String opener = "https://github.com/joseb2/RoastMe/blob/master/src/opener.txt";


        // fix index
        String[] openWords = new String[0];
        String[] prepWords = new String[prepositions.length()];
        String[] dictWords = new String[dictionary.length()];
        String[] articles = { "a", "the"};

        int openLen = openWords.length-1;
        int prepLen = prepWords.length-1;
        int dictLen = dictWords.length-1;


        // Copying of text file elements to array(s)

        // preposition Words
        prepWords = refArray(prepositions, prepWords);
        // dictionary Words (british)
        dictWords = refArray(dictionary, dictWords);
        // opener Words
        openWords = refArray(opener, openWords);


        // random collection of strings for specificed arrays


       // todo** test random integers for fix on selecting random words

        String randomPrep = prepWords[((int)(Math.random() * prepLen))];
        String randomDictWords = dictWords[((int)(Math.random() * dictLen))];
        String randomOpen = openWords[((int)(Math.random()*openLen))];
        String randomArticle = articles[((int)(Math.random()*articles.length))];


        System.out.println("you look like" + randomArticle + " " + " " + randomDictWords + " " + randomPrep + " " + randomDictWords);

    }


    // todo**  replace reference array and try/catch with URLReader with http, reference strings at beginning.

    public static String[] refArray(String filename, String[] arr){
        // try-catch method for reading file, placing it in given array, and/or printing error message
            try {
                URLreader file = new URLreader(filename);
                arr = file.OpenFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        //returns String array
            return arr;
    }
}
