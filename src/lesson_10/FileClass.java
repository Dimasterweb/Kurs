package lesson_10;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by Dimaster on 17.07.2017.
 */
public class FileClass {
    public static void main(String[] args) {
        File diskD = new File("D:\\");
        File[] vseFiles = diskD.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                String nameFiles = file.getName();
                if (nameFiles.endsWith(".psd")){
                    return true;
                }
                return false;
            }
        });
        for (int i = 0; i < vseFiles.length; i ++){
            if (!vseFiles[i].isDirectory()){
                System.out.println(vseFiles[i].getName());
            }

        }
    }
}
