package lesson_10.ioReader;

import java.io.*;

/**
 * Created by Dimaster on 17.07.2017.
 */
public abstract class CloseSable {


    public static void closeStream (BufferedInputStream bis, BufferedOutputStream bos){
        if (bis != null){
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bos != null){
            try {
                bos.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeReader (BufferedReader br, PrintWriter wr){
        if (br != null){
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (wr != null){
            wr.flush();
            wr.close();
        }
    }
}
