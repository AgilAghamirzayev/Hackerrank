package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s){

        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            return outputFormat.format(df.parse(s));
        } catch (ParseException e){
            return e.toString();
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("timeConvert.txt"));
        String s = scan.nextLine();
        String result = timeConversion(s);
        bw.write(result);
        bw.newLine();
        bw.close();
        scan.close();


    }
}
