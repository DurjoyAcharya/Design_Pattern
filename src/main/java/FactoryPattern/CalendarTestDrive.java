package FactoryPattern;

import java.util.Arrays;
import java.util.List;

class Zone{
    String displayName;
    int offset;
    public String getDisplayName() {
        return displayName;
    }
    public int getOffset() {
        return offset;
    }
}
class ZoneCentral extends Zone{
    public ZoneCentral() {
        displayName="US/Central";
        offset=-6;
    }
}
class ZoneEastern extends Zone
{
    public ZoneEastern() {
        displayName="US/Eastern";
        offset=-5;
    }
}
class ZoneMountain extends Zone
{
    public ZoneMountain() {
        displayName="US/Mountain";
        offset=-7;
    }
}
class ZonePacific extends Zone
{
    public ZonePacific() {
        displayName="US/Pacific";
        offset=-8;
    }
}
abstract class Calendar
{
    Zone zone;
    public void Print()
    {
        System.out.println(zone.getDisplayName()+" "+"Calendar");
        System.out.println("Offset from GMT: " + zone.getOffset());
    }
    public abstract void CreateCalendar(List<String> app);
}
class PacificCalendar extends Calendar
{

    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Pacific");
    }

    @Override
    public void CreateCalendar(List<String> app) {
        System.out.println("Making Calendar...............");

    }
}
class ZoneFactory {
    public Zone createZone(String zoneId) {
        Zone zone = null;
        if (zoneId == "US/Pacific") {
            zone = new ZonePacific();
        }
        else if (zoneId == "US/Mountain") {
            zone = new ZoneMountain();
        }
        else if (zoneId == "US/Central") {
            zone = new ZoneCentral();
        }
        else if (zoneId == "US/Eastern") {
            zone = new ZoneEastern();
        }
        return zone;
    }
}
public class CalendarTestDrive {
    public static void main(String[] args) {
        ZoneFactory zoneFactory=new ZoneFactory();
       Calendar calendar=new PacificCalendar(zoneFactory);
        List<String> appts = Arrays.asList("appt 1", "appt 2");
        calendar.CreateCalendar(appts);
        calendar.Print();
    }
}
