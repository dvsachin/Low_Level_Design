package Design_Patterns.Structural_Patterns.ProxyPattern.Example_Caching;

public class RealVideoDownloader  implements VideoDownloader{

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Video Name ::"+videoName);
        System.out.println("connecting to youtube.com");
        System.out.println("Downloading video");
        System.out.println("Receiving video metadata");
        System.out.println("---------------------------");
        return new Video(videoName);
    }
}
