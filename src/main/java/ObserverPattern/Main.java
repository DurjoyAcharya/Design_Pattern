package ObserverPattern;


import java.util.ArrayList;
import java.util.Iterator;

interface Subject
{
    void registerObserver(Observer or);
    void unregisterObserver(Observer or);
    void notifyObserver();
}

interface Observer
{
    void update(int runs,int wickets,float overs);
}

class CricketData implements Subject{
    int runs,wickets;
    float overs;
    ArrayList<Observer> ObserverList;
    public CricketData()
    {
        ObserverList=new ArrayList<>();
    }

    private int getLatestRuns() {

        //50 for simplicity
        return 50;
    }
    private int getLatestWickets()
    {
        return 2;
    }
    private float getLatestOvers()
    {
        return 7.3f;
    }
    public void getUpdated()
    {
        runs=getLatestRuns();
        wickets=getLatestWickets();
        overs=getLatestOvers();
        notifyObserver();
    }
    @Override
    public void registerObserver(Observer or) {
        ObserverList.add(or);
    }
    @Override
    public void unregisterObserver(Observer or) {
        ObserverList.remove(ObserverList.indexOf(or));
    }
    @Override
    public void notifyObserver() {
        for (Iterator<Observer> iterator=ObserverList.iterator();
        iterator.hasNext();)
        {
            Observer o=iterator.next();
            o.update(runs,wickets,overs);
        }
    }
}

class AverageScoreDisplay implements Observer
{
    private float runrate;
    private int predicateScore;
    @Override
    public void update(int runs, int wicket, float overs)
    {
        this.runrate=(float)runs/overs;
        this.predicateScore=(int)(this.runrate*50);
        display();
    }
    private void display() {
        System.out.println("\nAverage Score Display:\n" +
                "Run Rate: " + runrate +
                "\nPredictedScore: " + predicateScore);
    }
}


class CurrentScoreDisplay implements Observer
{
    private int runs,wicket;
    private float overs;
    private void display() {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + runs +"\nWickets:"
                + wicket + "\nOvers: " + overs );
    }
    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
       this.wicket = wickets;
        this.overs = overs;
        display();
    }
}
public class Main {
    public static void main(String[] args) {
        var ASD=new AverageScoreDisplay();
        var CSD=new CurrentScoreDisplay();
        var Cdata=new CricketData();
        Cdata.registerObserver(ASD);
        Cdata.registerObserver(CSD);
        Cdata.getUpdated();
        //Cdata.notifyObserver();
    }
}
