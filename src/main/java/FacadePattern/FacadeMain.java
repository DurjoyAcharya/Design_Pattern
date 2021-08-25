package FacadePattern;


class Tuner{
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }
    public void On()
    {
        System.out.println(description+" On");
    }
    public void Off()
    {
        System.out.println(description+" Off");
    }
    public void setFrequency(double frequency) {
        System.out.println(description+" frequency setting up to "+frequency);
        this.frequency = frequency;
    }
    public void setAm()
    {
        System.out.println(description+" setting Am mode");
    }
    public void setFm()
    {
        System.out.println(description+" setting Fm mode");
    }
    @Override
    public String toString() {
        return "Tuner{" +
                "description='" + description + '\'' +
                '}';
    }
}
class CdPlayer {
    String description;
    Amplifier amplifier;
    int CurrentTrack;
    String tittle;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void On() {
        System.out.println(description + " On");
    }

    public void Off() {
        System.out.println(description + " Off");
    }

    public void eject() {
        tittle = null;
        System.out.println(description + " eject");
    }

    public void Play(String name) {
        tittle = name;
        CurrentTrack = 0;
        System.out.println(description + " playing \"" + tittle + "\"");
    }
    public void Play(int track)
    {
        if (tittle==null)
            System.out.println(description+" can't play track "+CurrentTrack+", No Check Internal/External Storage");
        else{
            CurrentTrack = track;
            System.out.println(description + " playing track " + CurrentTrack);
        }
    }
    public void Stop() {
        CurrentTrack = 0;
        System.out.println(description + " stopped");
    }
    public void Pause() {
        System.out.println(description + " paused \"" + tittle + "\"");
    }
    @Override
    public String toString() {
        return "CdPlayer{" +
                "description='" + description + '\'' +
                '}';
    }
}
class Screen{
    String description;

    public Screen(String description) {
        this.description = description;
    }
    public void Up()
    {
        System.out.println(description+" going up");
    }
    public void Down()
    {
        System.out.println(description+" going down");
    }

    @Override
    public String toString() {
        return "Screen{" +
                "description='" + description + '\'' +
                '}';
    }
}

class StreamingPlayer{
    String description;
    int CurrentChapter;
    Amplifier amplifier;
    String movie;

    public StreamingPlayer(String description,Amplifier amplifier) {
        this.description = description;
        this.amplifier=amplifier;
    }
    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
    public void play(String movie) {
        this.movie = movie;
        CurrentChapter = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    public void play(int chapter) {
        if (movie == null) {
            System.out.println(description + " can't play chapter " + chapter + " no movie selected");
        } else {
            CurrentChapter = chapter;
            System.out.println(description + " playing chapter " + CurrentChapter + " of \"" + movie + "\"");
        }
    }
    public void stop() {
        CurrentChapter = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }
    public void setTwoChannelAudio()
    {
        System.out.println(description+" Set Two Channel Audio");
    }
    public void setSurroundAudio()
    {
        System.out.println(description+" set surround audio");
    }

    @Override
    public String toString() {
        return "StreamingPlayer{" +
                "description='" + description + '\'' +
                '}';
    }
}
class Projector{
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void On()
    {
        System.out.println(description+" On");
    }
    public void Off()
    {
        System.out.println(description+" Off");
    }
    public void WideScreenMode()
    {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }
    public void tvMode()
    {
        System.out.println(description + " in tv mode (4x3 aspect ratio)");
    }
    @Override
    public String toString() {
        return "Projector{" +
                "description='" + description + '\'' +
                '}';
    }
}
class Amplifier{
    String description;
    StreamingPlayer streamingPlayer;
    Tuner tuner;

    public Amplifier(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }
    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }
    public void setTuner(Tuner tuner)
    {
    System.out.println(description + " setting tuner to " + streamingPlayer);
    this.tuner=tuner;
    }
    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " setting Streaming player to " + player);
        this.streamingPlayer = player;
    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "description='" + description + '\'' +
                '}';
    }
}
class PopCornPopper
{
    String description;
    public PopCornPopper(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void pop() {
        System.out.println(description + " popping popcorn!");
    }
    @Override
    public String toString() {
        return "PopCornPopper{" +
                "description='" + description + '\'' +
                '}';
    }
}
class TheaterLights{
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void dim(int level)
    {
        System.out.println(description+ " dimming to "+level+"%");
    }
    @Override
    public String toString() {
        return "TheaterLights{" +
                "description='" + description + '\'' +
                '}';
    }
}
class HomeTheaterFacade
{
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer streamingPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    PopCornPopper popCornPopper;
    Screen screen;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, StreamingPlayer
                            streamingPlayer, Projector projector,
                             TheaterLights theaterLights, PopCornPopper popCornPopper,
                             Screen screen) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.streamingPlayer = streamingPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.popCornPopper = popCornPopper;
        this.screen = screen;
    }
    public void watchMovie(String movie){
        System.out.println("Get Ready To Watch Movies..............");
        popCornPopper.on();
        popCornPopper.pop();
        theaterLights.dim(5);
        screen.Down();
        projector.On();
        projector.WideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(streamingPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(9);
        streamingPlayer.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popCornPopper.off();
        theaterLights.on();
        screen.Up();
        projector.Off();
        amplifier.off();
        streamingPlayer.stop();
        streamingPlayer.off();
    }
    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.On();
        tuner.setFrequency(frequency);
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.Off();
        amplifier.on();
    }

}
public class FacadeMain {
    public static void main(String[] args) {
        var amp=new Amplifier("Sony");
        var pop=new PopCornPopper("Vivo");
        var sp=new StreamingPlayer("Samsung",amp);
        var pjt=new Projector("Lenevo",sp);
        var Sn=new Screen("Rangs");
        var TL=new TheaterLights("Corona");
        var tuner=new Tuner("Dell",amp);

        var Test=new HomeTheaterFacade(amp,tuner,sp,pjt,TL,pop,Sn);
        Test.watchMovie("The Fight Club");
        Test.endMovie();
        Test.listenToRadio(89.2);
        Test.endRadio();
    }
}
