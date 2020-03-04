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
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("sample.txt contains: " + line);
        return line;

    }

    // To create words list
    public ArrayList wordlist() {
        stringtoken = new StringTokenizer(line, " ");
        while (stringtoken.hasMoreTokens()) {
            wordlist.add(stringtoken.nextToken());
        }
        System.out.println(wordlist.toString());
        return wordlist;
    }

    // To create character list
    public ArrayList characterlist() {
        line.replace(" ", "");
        array = stringT0Char(line);
        for (int i = 0; i < array.length; i++) {
            char temp = array[i];

            if (temp == ' ') {

            } else {
                characterlist.add(array[i]);
            }
        }
        System.out.println(characterlist.toString());
        return characterlist;
    }

    public void frequencyOfChar(){
        freq = new int[array.length];
        for(int i = 0; i<array.length; i++){
            freq[i]=1;
            for(int j= i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    freq[i]++;
                    array[j]='0';

                }
            }
        }

        System.out.println("Characters and their frequencies: ");
        for(int i=0;i<freq.length; i++){
           if(array[i]!=' ' && array[i]!='0'){
               System.out.println(array[i]+"-"+freq[i]);
           }
        }
    }

    public void frequencyOfWord(){
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
