interface MediaPlayer {
    void play(String fileName);
}
class Mp4Player {
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
class MediaAdapter implements MediaPlayer {
    private Mp4Player mp4Player;
    public MediaAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }
    public void play(String fileName) {
        mp4Player.playMp4(fileName);
    }
}
public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter(new Mp4Player());
        player.play("video.mp4");
    }
}
