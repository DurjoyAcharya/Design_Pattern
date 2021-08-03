package ObserverPattern;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

interface Topic{
    void UpdateWeatherData(float temp,int humidity,float pressure);
}

interface Situations
{
    void startChecker(Topic t);
    void resetChecker(Topic t);
    void notifyUser();
}
class WeatherData implements Situations{
    float temp;
    int humidity;
    float pressure;
    ArrayList<Topic> data;
    WeatherData()
    {
        data=new ArrayList<>();
    }
    private int getHumidity()
    {
        return 60;
    }
    private float getPressure()
    {
        return (float) Math.random()*(temp/pressure);
    }
    private float getTemp()
    {
        return 53.3f;
    }

    public void Updating()
    {
        this.pressure=getPressure();
        this.humidity=getHumidity();
        this.temp=getTemp();
        notifyUser();
    }
    @Override
    public void startChecker(Topic t) {
        data.add(t);
    }
    @Override
    public void resetChecker(Topic t) {
        data.remove(data.indexOf(t));
    }
    @Override
    public void notifyUser() {
        for (Iterator<Topic> it = data.iterator();
             it.hasNext();
        ){
            Topic t= it.next();
            t.UpdateWeatherData(temp,humidity,pressure);
        }
    }
}
class TodayCondition implements Topic
{
    float temp;
    int humidity;
    float pressure;

    void display()
    {
        System.out.println("Today's Weather Conditions:............");
        System.out.println("Today's Temperature: "+temp);
        System.out.println("Today's Humidity: "+humidity);
        if (pressure>50)
            System.out.println("Today's Pressure is High....");
        else
            System.out.println("Today's Pressure is Low....");
    }
    @Override
    public void UpdateWeatherData(float temp, int humidity, float pressure) {
        this.pressure=pressure;
        this.humidity=humidity;
        this.temp=temp;
        display();
    }
}
class AverageCondition implements Topic
{
    float temp;
    int humidity;
    float pressure;

    void display()
    {
        System.out.println("Average Weather Conditions:............");
        System.out.println("Average Temperature: "+temp);
        System.out.println("Average Humidity: "+humidity);
        if (pressure>50)
            System.out.println("Average Pressure is High....");
        else
            System.out.println("Average Pressure is Low....");
    }
    @Override
    public void UpdateWeatherData(float temp, int humidity, float pressure) {
        this.pressure=(float) Math.random()+5*temp;
        this.humidity= (int) (Math.random() * humidity);
        this.temp=temp*30/30;
        display();
    }

}
public class WeatherMonitoringApplication {
    public static void main(String...args) {
        var TC=new TodayCondition();
        var AC=new AverageCondition();
        var WD=new WeatherData();
        WD.startChecker(AC);
        WD.Updating();
        WD.startChecker(TC);
        WD.Updating();
    }
}
