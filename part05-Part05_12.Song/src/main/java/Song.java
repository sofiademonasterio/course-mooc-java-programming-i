public class Song {
 
    private String artist;
    private String name;
    private int durationInSeconds;
 
    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
 
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
 
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }
        Song comparedSong = (Song) compared;
 
        if (comparedSong.artist == this.artist
                && comparedSong.name.equals(this.name)
                && comparedSong.durationInSeconds == this.durationInSeconds) {
            return true;
        }
        return false;
    }
 
}