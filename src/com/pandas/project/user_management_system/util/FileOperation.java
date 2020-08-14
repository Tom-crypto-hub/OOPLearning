package com.pandas.project.user_management_system.util;

import com.pandas.project.user_management_system.model.User;

import javax.sound.midi.SoundbankResource;
import java.io.*;
import java.util.Arrays;

/**
 * @author wangjing
 * @create 2020-08-13 17:56
 *
 * 读写文件
 */

public class FileOperation {

    public static String getFilename(){
        // 生成文件路径
        String classPath = FileOperation.class.getResource("/").getPath();
        classPath = classPath.substring(1, classPath.length());
        System.out.println(classPath + "UserList.txt");
        return classPath + "UserList.txt";

    }

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

    // 将用户保存到文件中
    public static void writeTxt(User[] user, int total) throws IOException {
        StringBuilder context = new StringBuilder();
        for(int i = 0; i < total; i++){
            context.append(user[i].show()).append("\n");
        }
        writeFile(getFilename(), context.toString());
    }

    public static User[] readTxt() throws IOException {
        // 生成文件路径
        String str = readFile(getFilename());
        if(str.equals("")) return null;

        String[] strs = str.split("\n");
        System.out.println(str);
        User[] users = new User[strs.length];
        for(int i = 0; i< strs.length; i++){
            String[] s = strs[i].split("\t");
            System.out.println(Arrays.toString(s));
            users[i] = new User();
            users[i].setId(Integer.parseInt(s[0]));
            users[i].setName(s[1]);
            users[i].setGender(s[2].charAt(0));
            users[i].setAge(Integer.parseInt(s[3]));
            users[i].setPhone(s[4]);
            users[i].setEmail(s[5]);
        }
        return users;
    }
}

