package Hong.ArrayLec;

public class SongTest {
    public static void main(String[] args) {
        Song s0 = new Song("별헤는 밤", "유재하");
        Song s1 = new Song("비상", "임재범");
        Song s2 = new Song("롹스피릿", "박완규");

        //songs의 배열 타입
        Song[] songs = {s0, s1, s2};

        for (int i = 0; i < songs.length; i++) {
            //객체정보 출력하기
            System.out.println(songs[i].toStr());
        }
    }
}

class Song {

    String name;
    String singer;

    public Song(String n, String s) {
        name = n;
        singer = s;
    }

    String toStr() {
        return String.format("Song {name : %s, singer: %s}", name, singer);
    }
}