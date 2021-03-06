import java.io.*;
import java.util.*;

public class test5 {
    // Instance variables
    StringTokenizer stringtoken = null;
    ArrayList<String> wordlist = null;
    ArrayList<Character> characterlist = null;
    File f = null;
    BufferedReader bre = null;
    String line = null;
    char[] array = null;
    int [] freq = null;
    String data = "";

    // Constructor
    public test5() {
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
    public void frequencyOfChar(){
        freq = new int[array.length];
        for(int i = 0; i<array.length; i++){
            freq[i]=1; //set '1' at the 0 index of freq array
            for(int j= i+1;j<array.length;j++){// inner loop
                if(array[i] == array[j]){ // check weather character at i is equal for all j or not
                    freq[i]++;
                    array[j]='0'; // to eliminate the checked character

                }
            }
        }

        System.out.println("Characters and their frequencies: ");
        for(int i=0;i<freq.length; i++){
           if(array[i]!=' ' && array[i]!='0'){ // condition to print frequencies
               System.out.println(array[i]+"-"+freq[i]);
           }
        }
    }

    public void frequencyOfWord(){

    // Similar steps are taken for it, as taken for frequencyOfChar method 

        String [] arr =new String[wordlist.size()];
        for(int i=0; i<arr.length;i++){
            arr[i] = wordlist.get(i);
        }
     int[] freqw = new int[wordlist.size()];
        for(int i=0;i<wordlist.size();i++){
            freqw[i]=1;
           for(int j=i+1;j<wordlist.size();j++){
               if(arr[i].equals(arr[j])){
                    freqw[i]++;
                    arr[j]= "0";
               }
           }
        }
    
        System.out.println("Words and their frequencies: ");
        for(int i=0;i<freqw.length; i++){
           if(arr[i]!= " " && arr[i]!="0"){
               System.out.println(arr[i]+"-"+freqw[i]);
           }
        }  
    }



    public static void main(String args[]) {

        test5 t = new test5();
        t.read();
        t.wordlist();
        t.characterlist();
        t.frequencyOfChar();
        t.frequencyOfWord();
    }
}
