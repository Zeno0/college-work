import java.io.*;
import java.util.*;

public class test4 {
    //instance variables
    StringTokenizer stringtoken = null;
    ArrayList<String> wordlist = null;
    ArrayList<Character> characterlist = null;
    File f = null;
    BufferedReader bre = null;
    String line = null;
    char[] array = null;
    String data = "";
    
     // Constructor
     public test4() {
        f = new File("sample.txt");
        wordlist = new ArrayList<String>();
        characterlist = new ArrayList<Character>();
    }

    // To Convert String to Array method
    public char[] stringT0Char(String in) {
        char[] arr = new char[in.length()];
        for (int i = 0; i < in.length(); i++) {
            arr[i] = in.charAt(i);
        }
        return arr;
    }
    // To read data from .txt file
    public String read() {
        try {
            bre = new BufferedReader(new FileReader(f));
            line = bre.readLine();
            
            while( line != null){
               
                data = data +" "+ line ;
                line = bre.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("sample.txt contains: " + data);
        return data;

    }
   // To create words list
   public ArrayList wordlist() {
    stringtoken = new StringTokenizer(data, " ");
    while (stringtoken.hasMoreTokens()) {
        wordlist.add(stringtoken.nextToken());
    }
  //  System.out.println(wordlist.toString());
    return wordlist;
}

// To create character list
public ArrayList characterlist() {
    array = stringT0Char(data);
    for (int i = 0; i < array.length; i++) {
        char temp = array[i];

        if (temp == ' ') {

        } else {
            characterlist.add(array[i]);
        }
    }
  //  System.out.println(characterlist.toString());
    return characterlist;
}

    public static void main(String args[]) {
        test4 t = new test4();
        t.read();
        t.wordlist();
        t.characterlist();
        System.out.println("NUmber of words in sample,txt is: "+t.wordlist.size());
        System.out.println("NUmber of characters in sample,txt is: "+t.characterlist.size());
        
        

        /*
         * while(stringtoken.hasMoreTokens()){
         * System.out.println(stringtoken.nextToken()); }
         */
        

    }
}