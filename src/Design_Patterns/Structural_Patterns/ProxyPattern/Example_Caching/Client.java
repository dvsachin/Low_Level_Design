package Design_Patterns.Structural_Patterns.ProxyPattern.Example_Caching;

public class Client {
    public static void main(final String[] args) {
     //    VideoDownloader videoDownloader = new RealVideoDownloader();
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("Mercury_info");// video Downloaded
        videoDownloader.getVideo("Venus_info"); // video Downloaded
        videoDownloader.getVideo("Earth_info"); // video Downloaded
        videoDownloader.getVideo("Earth_info"); // video loaded from cache
        // this way every video will be downloaded all over again even it is downloaded previously
        // we need to cache the info for downloaded videos

    }
}
