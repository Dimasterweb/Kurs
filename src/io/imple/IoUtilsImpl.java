package io.imple;

import io.IOUtils;

import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dimaster on 17.07.2017.
 */
public class IoUtilsImpl implements IOUtils{

    @Override
    public void replaceChars(Reader in, Writer out, String inChars, String outChars) throws NullPointerException, IllegalArgumentException {

    }

    @Override
    public List<String> findFiles(String dir) throws NullPointerException, IllegalArgumentException {
        if (dir == null){
            throw new NullPointerException(" dir == null");
        }
        List<String> result = new LinkedList<>();

        File basedDir = new File(dir);
        if (!basedDir.exists()){
            throw new IllegalArgumentException("File no exists");
        }
        File[] listFiles = basedDir.listFiles();
        for (int i = 0; i < listFiles.length; i ++){
            if (!listFiles[i].isDirectory()){
                result.add(listFiles[i].getAbsolutePath());
            }else {
                getPassFromDirectory(listFiles[i], result);
            }
        }
        return result;
    }

    private static  void getPassFromDirectory (File dir, List<String> res){
        File[] listFiles = dir.listFiles();
        if(listFiles != null){
            for (int i = 0; i < listFiles.length; i ++){
                if (!listFiles[i].isDirectory()){
                    res.add(listFiles[i].getAbsolutePath());
                }else {
                    getPassFromDirectory(listFiles[i],res );
                }
            }
        }
    }
}
