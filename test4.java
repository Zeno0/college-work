import java.io.*;
import java.util.*;

public class test4 {

    // To Convert String to Array method
    public static char[] stringT0Char(String in){ 
        char[] arr = new char[in.length()];
        for(int i=0; i<in.length(); i++){
            arr[i]= in.charAt(i);
        }
       return arr;
    }
    public static void main(String args[]){
        int wordcount=0;
        int charactercount = 0;
        File f = new File("sample.txt");
        BufferedReader bre = null;
        String line = null;
        try{
        bre = new BufferedReader(new FileReader(f));
        line = bre.readLine();
        }
        catch(Exception e){e.printStackTrace();}
        char[] array = stringT0Char(line);
        System.out.println("sample.txt contains: "+line);
        StringTokenizer stringtoken = new StringTokenizer(line, " ");
        wordcount = stringtoken.countTokens();
        System.out.println("Number of words in test file is: "+wordcount);
        /*
        while(stringtoken.hasMoreTokens()){
           System.out.println(stringtoken.nextToken());
        }
        */
        charactercount = array.length - (wordcount -1);
        System.out.println("Number of characters in test file is: "+charactercount);

    }
}