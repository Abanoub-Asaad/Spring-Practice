package audio;

public class SoundCloud extends AudioStreamer {

    private String streamerName;

    @Override
    public void setStreamerName(String streamerName) {
        this.streamerName = streamerName;
    }
}