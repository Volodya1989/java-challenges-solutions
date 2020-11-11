package src.main.java;

import java.io.*;

public class WordsInFile {
    public static void main(String[] args) throws IOException {
        var f1 = new File("input.txt"); //Creation of File Descriptor for input file
        String[] words = null;    //Intialize the word Array
        int wc = 0;     //Intialize word count to zero
        var fr = new FileReader(f1);    //Creation of File Reader object
        var br = new BufferedReader(fr);    //Creation of BufferedReader object
        String s;
        while ((s = br.readLine()) != null)    //Reading Content from the file
        {
            words = s.split(" ");   //Split the word using space
            wc = wc + words.length;   //increase the word count for each word
        }
        fr.close();
        System.out.println("Number of words in the file:" + wc);    //Print the word count
    }



}
