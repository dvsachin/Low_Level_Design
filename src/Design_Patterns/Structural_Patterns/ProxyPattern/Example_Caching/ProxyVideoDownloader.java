package Design_Patterns.Structural_Patterns.ProxyPattern.Example_Caching;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader  implements VideoDownloader{
    private final Map<String,Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if(videoCache.containsKey(videoName))   System.out.println("Loaded from Cache ::"+videoName);

        if(!videoCache.containsKey(videoName)) {
            videoCache.put(videoName, downloader.getVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}
