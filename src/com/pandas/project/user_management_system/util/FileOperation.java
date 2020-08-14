package com.pandas.project.user_management_system.util;

import java.io.*;

/**
 * @author wangjing
 * @create 2020-08-13 17:56
 *
 * 读写文件
 */

public class FileOperation {
    // 读取文件
    public static String readFile(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader bf = new BufferedReader(fr);
        StringBuilder sbuffer = new StringBuilder();
        String temp = null;
        while((temp = bf.readLine()) !=null){
            sbuffer.append(temp).append("\n");
        }
        // System.out.println(sbuffer.toString());
        return sbuffer.toString();
    }

    // 写入文件
    public static void writeFile(String filename, String content) throws IOException{
        File outfile = new File(filename);
        if(!outfile.exists()){
            try {
                boolean newFile = outfile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte[] b = (content).getBytes();
        FileOutputStream fs = null;
        fs = new FileOutputStream(outfile);
        fs.write(b);
        fs.close();
    }
}

