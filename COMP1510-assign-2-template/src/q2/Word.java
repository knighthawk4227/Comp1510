
package q2;



/** <p> This is the word class used to check how many 
 * unique words there are in a file, it also gives the most frequent ones. </p>
 * @author Mitchell Schaeffer
 * @version 1.0*/

public class Word implements Comparable<Word> {
    
    

    
    /** <p> The frequency of word.</p> */
    private int freq;
    
    /** <p> The string for words.</p>*/
    
    private final String word;
    
    
    /** <p> Constructor for word.</p>
     * @param word word inputted by user*/
    public Word(String word) {
        this.word = word;
        this.freq = 1;
        
    }
        
    /** <p> This gets the word set. </p>
     * @return word returns word that was set.*/
    
    public String getWord() {
        return this.word;
    }
    
    /** <p> The amount of times word happens. </p>
     * @return frequency*/
    
    public int getFreq() {
        return this.freq;
    }
    
    /** increase frequency of word. */
    
    public void increaseFreq() {
        this.freq++;
    }
    
    /** <p> to String method.</p>
     * @return string of word and freq*/
    
    public String toString() {
        return ("The frequency of the word \"" + this.word + "\" "
                + "of the word is: " + this.freq);
    }
    

    @Override
    public int compareTo(Word o) {
        return  o.freq - this.freq;
    }
    
   
    
}
