import java.io.*;
import java.util.*;

public class test6 {
    // instance variables
    StringTokenizer stringtoken = null;
    ArrayList<String> wordlist = null;
    File f = null;
    BufferedReader bre = null;
    String line = null;
    String data = "";

    // Constructor
    public test6() {
        f = new File("sample.txt");
        wordlist = new ArrayList<String>();
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

    // To find a word
    public String find(String x) {
        if(wordlist.contains(x)){
            int pos= wordlist.indexOf(x)+1;
            return x+" is found at "+ pos + " position";
        }
        else{
            return "Not found";
        }
    }

    public void replace(String x, String y){
        System.out.println("Wordlist before: "+ wordlist.toString());
        if(wordlist.contains(x)){
            wordlist.add(wordlist.indexOf(x), y);
        }
        else{
            System.out.println("Not found");
        }
        System.out.println("Wordlist after: "+ wordlist.toString());


    }

    public static void main(String args[]) {
        test6 t = new test6();
        t.read();
        t.wordlist();
        System.out.println(t.find("number"));
        t.replace("number" , "uber");

        /*
         * while(stringtoken.hasMoreTokens()){
         * System.out.println(stringtoken.nextToken()); }
         */

    }
}