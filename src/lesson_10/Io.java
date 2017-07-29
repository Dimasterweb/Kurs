package lesson_10;

import lesson_10.ioReader.CloseSable;

import java.io.*;

/**
 * Created by Dimaster on 17.07.2017.
 */
public class Io extends CloseSable{
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
             bis = new BufferedInputStream(new FileInputStream("D:\\DSC_0911-1 копия.jpg"));
             bos = new BufferedOutputStream(new FileOutputStream("foto.jpg"));
            int b = 0;
            while (true){
                b = bis.read();
                if (b == -1){
                    break;
                }else {
                    bos.write(b);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           CloseSable.closeStream(bis,bos);
        }
    }
}
