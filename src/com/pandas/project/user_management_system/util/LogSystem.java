package com.pandas.project.user_management_system.util;

import java.io.IOException;

/**
 * @author wangjing
 * @create 2020-08-14 11:20
 *
 * 日志系统
 */
public class LogSystem {
    // 日志的条数
    private int maxLogNum = 32;
    // 日志文件存储路径
    private String _filename;
    private int _length;
    // 日志数组
    private String[] _logs;

    public String[] get_logs() {
        return _logs;
    }

    public LogSystem() throws IOException {
        this._filename = FileOperation.getLogFilename("Logs.txt");
        this._length = 0;
        this._logs = new String[maxLogNum];
        getLogs();
        System.out.println(_length);
    }

    // 读取日志信息
    public void getLogs() throws IOException {
        String str = FileOperation.readFile(this._filename);
        String[] strings = str.split("\n");
        while (maxLogNum < strings.length){
            maxLogNum = maxLogNum<<1;
        }
        this._logs = new String[maxLogNum];
        System.arraycopy(strings, 0, this._logs, 0, strings.length);
        this._length = strings.length;
    }

    // 添加日志信息
    public void addLogs(String logContext) {
        if(_length == maxLogNum){
            maxLogNum = maxLogNum << 1;
            String[] newStr = new String[maxLogNum];
            System.arraycopy(this._logs, 0, newStr, 0, _length);
            newStr[_length] = logContext;
            this._logs = newStr;
            _length++;
        }
        else {
            this._logs[_length] = logContext;
            _length++;
        }
    }

    // 最后的存入日志信息操作
    public void resetLogContext() throws IOException {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < _length; i++){
            str.append(_logs[i]).append("\n");
        }
        FileOperation.writeFile(this._filename, str.toString());
    }

    // 显示日志
    public void showLog(){
        for(int i = 0; i < _length; i++){
            System.out.println(this._logs[i]);
        }
    }
}
