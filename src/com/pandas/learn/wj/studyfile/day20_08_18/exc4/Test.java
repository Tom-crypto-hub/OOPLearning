package com.pandas.learn.wj.studyfile.day20_08_18.exc4;

/**
 * @author wangjing
 * @create 2020-08-18 15:42
 */
public class Test {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.play(new Music("三生三世", "Music", "张杰"));
        player.play(new Video("攀登者", "Video", "XXX"));
        System.out.println();

        player = new MusicPlayer();
        player.play(new Music("三生三世", "Music", "张杰"));
        player.play(new Video("攀登者", "Video", "XXX"));
        System.out.println();

        player = new VideoPlayer();
        player.play(new Music("三生三世", "Music", "张杰"));
        player.play(new Video("攀登者", "Video", "XXX"));
    }
}
