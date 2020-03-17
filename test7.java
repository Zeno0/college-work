import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test7 {
    // instance variables
    StringTokenizer stringtoken = null;
    ArrayList<String> wordlist = null;
    static File FG1, FG2, FG3, FG4, FG5, FB1, FB2, FB3, FB4, FB5, FY1, FY2, FY3, FY4, FY5;
    BufferedReader bre = null;
    String line = null;
    char[] array = null;
    String data = "";
    int count = 0;
    Pattern p;

    // Constructor
    public test7() {
        FG1 = new File("G_artificial.txt");
        FG2 = new File("G_chair.txt");
        FG3 = new File("G_door.txt");
        FG4 = new File("G_fiction.txt");
        FG5 = new File("G_taste.txt");
        FB1 = new File("B_artificial.txt");
        FB2 = new File("B_chair.txt");
        FB3 = new File("B_door.txt");
        FB4 = new File("B_fiction.txt");
        FB5 = new File("B_taste.txt");
        FY1 = new File("Y_artificial.txt");
        FY2 = new File("Y_chair.txt");
        FY3 = new File("Y_door.txt");
        FY4 = new File("Y_fiction.txt");
        FY5 = new File("Y_taste.txt");
        wordlist = new ArrayList<String>();
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

    public String read(File f) {
        try {
            bre = new BufferedReader(new FileReader(f));
            line = bre.readLine();
            while (line != null) {
                data = data + " " + line;
                line = bre.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    // To create words list
    public ArrayList wordlist() {
        stringtoken = new StringTokenizer(data, " ");
        while (stringtoken.hasMoreTokens()) {
            wordlist.add(stringtoken.nextToken());
        }
        return wordlist;
    }

    // method to count the appearences of searched word
    int count(String x) {
        p = Pattern.compile(x, Pattern.CASE_INSENSITIVE);// pattern compiled 
        Matcher m = p.matcher(data); // variable 'm' contains the match with given set of data
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        test7 tg1 = new test7();
        test7 tg2 = new test7();
        test7 tg3 = new test7();
        test7 tg4 = new test7();
        test7 tg5 = new test7();
        test7 tb1 = new test7();
        test7 tb2 = new test7();
        test7 tb3 = new test7();
        test7 tb4 = new test7();
        test7 tb5 = new test7();
        test7 ty1 = new test7();
        test7 ty2 = new test7();
        test7 ty3 = new test7();
        test7 ty4 = new test7();
        test7 ty5 = new test7();
        tg1.read(FG1);
        tg2.read(FG2);
        tg3.read(FG3);
        tg4.read(FG4);
        tg5.read(FG5);
        tb1.read(FB1);
        tb2.read(FB2);
        tb3.read(FB3);
        tb4.read(FB4);
        tb5.read(FB5);
        ty1.read(FY1);
        ty2.read(FY2);
        ty3.read(FY3);
        ty4.read(FY4);
        ty5.read(FY5);
        tg1.wordlist();
        tg2.wordlist();
        tg3.wordlist();
        tg4.wordlist();
        tg5.wordlist();
        tb1.wordlist();
        tb2.wordlist();
        tb3.wordlist();
        tb4.wordlist();
        tb5.wordlist();
        ty1.wordlist();
        ty2.wordlist();
        ty3.wordlist();
        ty4.wordlist();
        ty5.wordlist();
        int freq_g_1 = tg1.count("artificial");
        int freq_g_2 = tg2.count("chair");
        int freq_g_3 = tg3.count("door");
        int freq_g_4 = tg3.count("door");
        int freq_g_5 = tg5.count("taste");
        int freq_b_1 = tb1.count("artificial");
        int freq_b_2 = tb2.count("chair");
        int freq_b_3 = tb3.count("door");
        int freq_b_4 = tb3.count("door");
        int freq_b_5 = tb5.count("taste");
        int freq_y_1 = ty1.count("artificial");
        int freq_y_2 = ty2.count("chair");
        int freq_y_3 = ty3.count("door");
        int freq_y_4 = ty3.count("door");
        int freq_y_5 = ty5.count("taste");
        int w_1 = freq_g_1 + freq_b_1 + freq_y_1;
        int w_2 = freq_g_2 + freq_b_2 + freq_y_2;
        int w_3 = freq_g_3 + freq_b_3 + freq_y_3;
        int w_4 = freq_g_4 + freq_b_4 + freq_y_4;
        int w_5 = freq_g_5 + freq_b_5 + freq_y_5;
        int freq_avg_g = (freq_g_1 + freq_g_2 + freq_g_3 + freq_g_4 + freq_g_5) / 5;
        int freq_avg_b = (freq_b_1 + freq_b_2 + freq_b_3 + freq_b_4 + freq_b_5) / 5;
        int freq_avg_y = (freq_y_1 + freq_y_2 + freq_y_3 + freq_y_4 + freq_y_5) / 5;
        System.out.println("Number of times artificial appeared in Google:" + tg1.count("artificial"));
        System.out.println("Number of times chair appeared in Google: " + tg2.count("chair"));
        System.out.println("Number of times door appeared in Google: " + tg3.count("door"));
        System.out.println("Number of times fiction appeared in Google: " + tg3.count("door"));
        System.out.println("Number of times taste appeared in Google: " + tg5.count("taste"));
        System.out.println("***************************************************************************************");
        System.out.println("Number of times artificial appeared in Bing: " + tb1.count("artificial"));
        System.out.println("Number of times chair appeared in Bing: " + tb2.count("chair"));
        System.out.println("Number of times door appeared in Bing: " + tb3.count("door"));
        System.out.println("Number of times fiction appeared in Bing: " + tb4.count("fiction"));
        System.out.println("Number of times taste appeared in Bing: " + tb5.count("taste"));
        System.out.println("***************************************************************************************");
        System.out.println("Number of times artificial appeared in Yahoo:" + ty1.count("artificial"));
        System.out.println("Number of times chair appeared in Yahoo: " + ty2.count("chair"));
        System.out.println("Number of times door appeared in Yahoo: " + ty3.count("door"));
        System.out.println("Number of times fiction appeared in Yahoo: " + ty4.count("fiction"));
        System.out.println("Number of times taste appeared in Yahoo: " + ty5.count("taste"));
        TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
        tm1.put("Google", freq_avg_g);
        tm1.put("Bing", freq_avg_b);
        tm1.put("Yahoo", freq_avg_y);
        System.out.println(tm1.toString());
        TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>();
        tm2.put("artificial", w_1);
        tm2.put("chair", w_2);
        tm2.put("door", w_3);
        tm2.put("fiction", w_4);
        tm2.put("taste", w_5);
        System.out.println(tm2.toString());
    }
}