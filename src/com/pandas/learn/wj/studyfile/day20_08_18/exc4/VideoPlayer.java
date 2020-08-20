package com.pandas.learn.wj.studyfile.day20_08_18.exc4;

/**
 * @author wangjing
 * @create 2020-08-18 15:46
 */
public class VideoPlayer extends MediaPlayer {
    public void play(Media video) {
        if(video instanceof Video)
            super.play(video);
        else {
            System.out.println("只能播放电影");
        }
    }
}
