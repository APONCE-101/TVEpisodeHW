import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TVEpisode {

    String episodeTitle;
    int episodeLength;
    String director;
    List<String> castList;

    public TVEpisode(String episodeList, int episodeLength, String director) {
        this.episodeTitle = episodeList;
        this.episodeLength = episodeLength;
        this.director = director;
        castList = new ArrayList<>();
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getEpisodeLength() {
        return episodeLength;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getCastList() {
        return castList;
    }

    public void addCastMember(String CastMember) {
        this.castList.add(CastMember);
    }
    public String toString() {
        return "Title: " + this.episodeTitle +
                "\nEpisodes: " + this.episodeLength +
                "\nDirector: " + this.director +
                "\nCast: " + this.castList.toString();
    }
}

