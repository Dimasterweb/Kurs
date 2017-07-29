package lesson_10.ioReader;

import java.io.*;

/**
 * Created by Dimaster on 17.07.2017.*
 */
public class IoReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = null;
        try {
             wr = new PrintWriter(new FileWriter("data.txt"));

            while (true){
                String inputLine = br.readLine();
                if (inputLine.equals("stop")){
                    break;
                }else {
                    wr.write(inputLine);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            CloseSable.closeReader(br,wr);
        }
    }
}
