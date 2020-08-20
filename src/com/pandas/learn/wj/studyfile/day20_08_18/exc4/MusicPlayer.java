package com.pandas.learn.wj.studyfile.day20_08_18.exc4;

/**
 * @author wangjing
 * @create 2020-08-18 15:44
 */
public class MusicPlayer extends MediaPlayer {

    public void play(Media music) {
        if(music instanceof Music)
            super.play(music);
        else System.out.println("只能播放音乐");
    }
}
