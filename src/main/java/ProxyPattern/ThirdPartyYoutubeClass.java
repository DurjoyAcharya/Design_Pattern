package ProxyPattern;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public HashMap<String, Videos> popularVideos() {
        return null;
    }
    @Override
    public Videos getVideos(String videoId) {
        return null;
    }
}
