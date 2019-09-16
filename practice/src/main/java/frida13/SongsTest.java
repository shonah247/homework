package frida13;

public class SongsTest {
    public static void main(String[] args) {
        Songs genre1 = new Songs("Triggered", "Jhene Aiko");

        System.out.println(genre1);

        String[] tracks = {"track1", "track2", "track3", "track4"};
        System.out.println(genre1.favTrack(tracks));

    }
}
