package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class WordCounter {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    private static ArrayList<Word> wordList;
    
   
    /** <p> File of Bible. </p>*/

    private static String file = "C:/School/comp1510/COMP1510"
            + "-assign-2-template/COMP1510-assign-2-template/src/bible.txt";
    
    /** <p> Takes a string parses it and returns the frequency of the word.</p>
     * @param files file to open. 
     * @return word 
     * @throws FileNotFoundException Throws exception if no file */
    
    public static int parseBook(String files) throws FileNotFoundException {
        //[^a-zA-Z] <-- Regex I am going to use. 
        wordList = new ArrayList<>();
        Scanner myFile = new Scanner(new File(files));
        while (myFile.hasNext()) {
            String wordNow = myFile.next().replaceAll("[^a-zA-Z]", 
                    "").toLowerCase().strip();
            if (wordNow.isEmpty()) {
                continue;
            }
            
            boolean validator = false;
            if (wordList.size() != 0) {
                for (int i = 0; i < wordList.size(); i++) {
                    Word singleWord = wordList.get(i);
                    if (wordNow.equals(singleWord.getWord())) {
                        singleWord.increaseFreq();
                        validator = true;
                    }
                }
                if (!validator) {
                    Word toAdd = new Word(wordNow);
                    wordList.add(toAdd);
                    
                }
            } else {
                Word toAdd = new Word(wordNow);
                wordList.add(toAdd);
            }
            
        }
        return wordList.size();
    }
    
    /** <p> Prints top words in order based on input.</p>
     * @param n number of words in list */
    public static void printTopWords(int n) {
        wordList.sort(null);
        for (int i = 0; i < n; i++) {
            System.out.println(wordList.get(i));
        }
       
        
    }
    
    
    
    /** Drives the program.
     * @param args unused
     * @throws FileNotFoundException exception if file not found
     * */
    
    public static void main(String[] args) throws FileNotFoundException {
        final int ten = 10;
        
        System.out.println(parseBook(file));
        printTopWords(ten);
      
        System.out.println("Question two was called and ran sucessfully.");
    }

}
