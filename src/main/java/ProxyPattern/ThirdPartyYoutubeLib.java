package ProxyPattern;

import java.util.HashMap;
public interface ThirdPartyYoutubeLib {
    HashMap<String,Videos> popularVideos();
    Videos getVideos(String videoId);
}
