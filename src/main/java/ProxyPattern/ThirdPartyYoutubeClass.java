package ProxyPattern;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public HashMap<String, Videos> popularVideos() {
        ConnectingToServer("");
        return getRandomVideos();
    }

    private HashMap<String, Videos> getRandomVideos() {

        return null;
    }
    private void ConnectingToServer(String s) {
        System.out.println("Connecting to Server....");
        ExperienceNetworkLatency();
        System.out.println("Connected!");
    }

    private void ExperienceNetworkLatency() {

    }

    private int Random(int min,int max)
    {
        return min+(int)((Math.random())*((max-min)+1));
    }
    @Override
    public Videos getVideos(String videoId) {
        return null;
    }
}
