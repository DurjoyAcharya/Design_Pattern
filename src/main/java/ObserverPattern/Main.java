package ObserverPattern;

class CricketData{
    int runs,wickets;
    float overs;
    CurrentScoreDisplay CSD;
    AverageScoreDisplay ASD;

    public CricketData(CurrentScoreDisplay CSD, AverageScoreDisplay ASD) {
        this.CSD = CSD;
        this.ASD = ASD;
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
        return 6.7f;
    }
    public void getUpdated()
    {
        runs=getLatestRuns();
        wickets=getLatestWickets();
        overs=getLatestOvers();

        ASD.update(runs,wickets,overs);
        CSD.Update(runs,wickets,overs);
    }

}

class AverageScoreDisplay
{
    private float runrate;
    private int predicateScore;
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


class CurrentScoreDisplay
{
    private int runs,wicket;
    private float overs;

    public void Update(int runs, int wicket, float overs) {
        this.runs = runs;
        this.wicket = wicket;
        this.overs = overs;
        display();
    }

    private void display() {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + runs +"\nWickets:"
                + wicket + "\nOvers: " + overs );
    }
}
public class Main {
    public static void main(String[] args) {
        var ASD=new AverageScoreDisplay();
        var CSD=new CurrentScoreDisplay();
        var Cdata=new CricketData(CSD,ASD);
        Cdata.getUpdated();
    }
}
