package week4;
interface Playable {
    void play();
    void pause();
}
class AudioPlayer implements Playable {
    @Override
    public void play() {
        System.out.println(" audio Playing.");
    }
    @Override
    public void pause() {
        System.out.println(" Audio  paused.");
    }
}
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("video Playing.");
    }
    @Override
    public void pause() {
        System.out.println("Video paused.");
    }
}
public class PlayableMedia {
    public static void main(String[] args) {
        Playable audio = new AudioPlayer();
        Playable video = new VideoPlayer();

        audio.play();
        audio.pause();

        video.play();
        video.pause();
    }
}
