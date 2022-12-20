import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        double totalTime = 0d;
        for (int i = 0; i < mediaItems.size(); i++) {
            MediaItem mediaItem = mediaItems.get(i);


            if (mediaItem instanceof Series) {
                Series series = (Series) mediaItem;
            totalTime += series.getRuntime()*series.getSeriesCount();
            }
            if (mediaItem instanceof Movie) {
                Movie movie = (Movie) mediaItem;
                totalTime += movie.getRuntime();
            }

        }
        return (totalTime / (60 * 24));
    }

}

