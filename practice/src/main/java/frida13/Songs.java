package frida13;

public class Songs {
  public String title;
  public String artist;

  public Songs(String title, String Artist) {
      this.artist = Artist;
      this.title = title;
  }

  public String favTrack(String[] tracks){
      return tracks[tracks.length - 2];
  }
  @Override
  public String toString() {
      return "Songs{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}