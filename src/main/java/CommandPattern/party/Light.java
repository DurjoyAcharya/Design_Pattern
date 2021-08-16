package CommandPattern.party;

import java.sql.Struct;
import java.util.Arrays;
import java.util.List;

interface Command{
    void turnOn();
    void undo();
}
public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }
    public void On()
    {
        System.out.println("Light is On");
    }
    public void Off()
    {
        System.out.println("Light is Off");
    }
    public void dim(int level)
    {
        if (level == 0) {
         Off();
        }else
        {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }
    public int getLevel() {
        return level;
    }
}
class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void turnOn() {
     light.On();
    }
    @Override
    public void undo() {
        light.Off();
    }
}
class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void turnOn() {
     light.Off();
    }
    @Override
    public void undo() {
        light.On();
    }
}
class LivingroomLightOnCommand implements Command{
    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void turnOn() {
        light.On();
    }
    @Override
    public void undo() {
        light.Off();
    }
}
class LivingroomLightOffCommand implements Command{
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void turnOn() {
        light.Off();
    }
    @Override
    public void undo() {
        light.On();
    }
}
class CeilingFan{
     public static final int High=3;
     public static final int Medium=2;
     public static final int Low=1;
     public static final int Off=0;
     String location;
     int speed;
    public CeilingFan(String location) {
        this.location = location;
    }
    public void high()
    {
        speed=High;
        System.out.println(location+" Ceiling Fan is High");
    }
    public void medium()
    {
        speed=Medium;
        System.out.println(location+" Ceiling Fan is Medium");
    }
    public void low()
    {
        speed=Low;
        System.out.println(location+" Ceiling Fan is Low");
    }
    public void  off()
    {
        speed=Off;
        System.out.println(location+" Ceiling Fan is Off");
    }

    public int getSpeed() {
        return speed;
    }
}
class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int preSpeed;
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }
    @Override
    public void turnOn() {
        preSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }
    @Override
    public void undo() {
        switch (preSpeed)
        {
            case CeilingFan.High:
                ceilingFan.high();
                break;
            case CeilingFan.Medium:
                ceilingFan.medium();
                break;
                case CeilingFan.Low:
                    ceilingFan.low();
                    break;
            default:
                ceilingFan.off();
                break;
        }
    }
}
class CeilingFanMediumCommand implements Command{
    CeilingFan ceilingFan;
    int preSpeed;
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }
    @Override
    public void turnOn() {
        preSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }
    @Override
    public void undo() {
        switch (preSpeed)
        {
            case CeilingFan.High:
                ceilingFan.high();
                break;
            case CeilingFan.Medium:
                ceilingFan.medium();
                break;
                case CeilingFan.Low:
                    ceilingFan.low();
                    break;
            default:
                ceilingFan.off();
                break;
        }
    }
}class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    int preSpeed;
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }
    @Override
    public void turnOn() {
        preSpeed=ceilingFan.getSpeed();
        ceilingFan.high();
    }
    @Override
    public void undo() {
        switch (preSpeed)
        {
            case CeilingFan.High:
                ceilingFan.high();
                break;
            case CeilingFan.Medium:
                ceilingFan.medium();
                break;
                case CeilingFan.Low:
                    ceilingFan.low();
                    break;
            default:
                ceilingFan.off();
                break;
        }
    }
}
class Hotthub{
    boolean on;
    int temperature;
    public Hotthub() {

    }
    public void Calculate()
    {
        if (On())
            System.out.println("Hottub is bubbling!");
    }
    public boolean On() {
        this.on = true;
        return on;
    }
    public boolean Off() {
        this.on = false;
        return on;
    }
    public void getsOn()
    {
        if (On())
            System.out.println("Hottub jets are On");
    }
    public void getsOff()
    {
        if (Off())
            System.out.println("Hottub jets are Off");
    }
    public void setTemperature(int temperature) {
        if (temperature > this.temperature) {
            System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
        }
        else {
            System.out.println("Hottub is cooling to " + temperature + " degrees");
        }
        this.temperature = temperature;
    }
}
class HottubOnCommand implements Command{
    Hotthub hotthub;

    public HottubOnCommand(Hotthub hotthub) {
        this.hotthub = hotthub;
    }
    @Override
    public void turnOn() {
        hotthub.getsOn();
        hotthub.setTemperature(104);
        hotthub.Calculate();
    }
    @Override
    public void undo() {
        hotthub.getsOff();
    }
}
class HottubOffCommand implements Command{
    Hotthub hotthub;
    public HottubOffCommand(Hotthub hotthub) {
        this.hotthub = hotthub;
    }
    @Override
    public void turnOn() {
        hotthub.setTemperature(97);
        hotthub.Calculate();
    }
    @Override
    public void undo() {
        hotthub.getsOff();
    }
}

class MicroCommand implements Command{
    Command[] commands;
    public MicroCommand(Command[] commands) {
        this.commands = commands;
    }
        @Override
    public void turnOn() {
            for (int i = 0; i < commands.length; i++) {
                commands[i].turnOn();
            }
    }
    @Override
    public void undo() {
        for (int i = commands.length-1; i>=0; i--) {
            commands[i].undo();
        }
    }
}
class NoCommand implements Command
{
    @Override
    public void turnOn() { }
    @Override
    public void undo() { }
}
class RemoteControl
{
    Command[] Oncommand;
    Command[] Offcommand;
    Command undoCommand;

    public RemoteControl() {
        Oncommand=new Command[7];
        Offcommand=new Command[7];
        undoCommand=new NoCommand();
        for (int i = 0; i < 7; i++) {
            Oncommand[i]=new NoCommand();
            Offcommand[i]=new NoCommand();
        }
    }
    public void setCommand(int slot,Command On,Command Off)
    {
        Oncommand[slot]=On;
        Offcommand[slot]=Off;
    }
    public void OnButtonPressed(int slot)
    {
        Oncommand[slot].turnOn();
        undoCommand=Oncommand[slot];
    }
    public void OffButtonPressed(int slot)
    {
        Offcommand[slot].turnOn();
        undoCommand=Offcommand[slot];
    }
    public void UndoButtonPressed()
    {
        undoCommand.undo();
    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < Oncommand.length; i++) {
            stringBuff.append("[slot " + i + "] " + Oncommand[i].getClass().getName()
                    + "    " + Offcommand[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
class Stereo{
    String location;

    public Stereo(String location) {
        this.location = location;
    }
    public void On()
    {
        System.out.println("Stereo is On");
    }
    public void Off()
    {
        System.out.println("Stereo is Off");
    }
    public void setCD()
    {
        System.out.println(location+" Stereo is set for CD input");
    }
    public void setDVD()
    {
        System.out.println(location+" Stereo is set for DVD input");
    }
    public void setRadio()
    {
        System.out.println(location+" Stereo is set for Radio input");
    }
    public void setVolume(int volume)
    {
        System.out.println(location+" Stereo Volume Set to "+volume);
    }
}
class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void turnOn() {
     stereo.On();
    }
    @Override
    public void undo() {
        stereo.Off();
    }
}
class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void turnOn() {
     stereo.Off();
    }
    @Override
    public void undo() {
        stereo.On();
    }
}
class StereoWithCdcommand implements Command{
    Stereo stereo;

    public StereoWithCdcommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void turnOn() {
        stereo.On();
        stereo.setCD();
        stereo.setVolume(12);
    }
    @Override
    public void undo() {
        stereo.Off();
    }
}
class StereoWithDVDCommand implements Command{
    Stereo stereo;

    public StereoWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void turnOn() {
        stereo.On();
        stereo.setDVD();
        stereo.setVolume(12);
    }
    @Override
    public void undo() {
        stereo.Off();
    }
}
class TV{
    String location;
    int channel;
    public TV(String location) {
        this.location = location;
    }
    public void On()
    {
        System.out.println(location+" TV is On");
    }
    public void Off()
    {
        System.out.println(location+" TV is Off");
    }
    public void setTvChannel()
    {
        this.channel=9;
        System.out.println("Tv Channel is set for PC/DVD");
    }
}
class TvChannelOnCommand implements Command
{
    TV tv;
    public TvChannelOnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void turnOn() {
        tv.On();
        tv.setTvChannel();
    }

    @Override
    public void undo() {
        tv.Off();
    }
}
class TvChannelOffCommand implements Command{
    TV tv;

    public TvChannelOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void turnOn() {
     tv.Off();
    }
    @Override
    public void undo() {
        tv.On();
    }
}
class Chair{
    public static void main(String[] args) {
        TV tv=new TV("Samsung");
        var stero=new Stereo("National");
        var light=new Light("Toshiba");
        var hotthub=new Hotthub();
        var fan=new CeilingFan("Jumuna");
        //var tvOn=new TvChannelOnCommand(tv);
        //tvOn.turnOn();
//        var rc=new RemoteControl();
//        rc.setCommand(1,new LightOnCommand(light),new LightOffCommand(light));
//        rc.setCommand(2,new HottubOnCommand(hotthub),new HottubOffCommand(hotthub));
//        rc.setCommand(3,new CeilingFanMediumCommand(fan),new CeilingFanOffCommand(fan));
//        rc.setCommand(4,new TvChannelOnCommand(tv),new TvChannelOffCommand(tv));
//        rc.setCommand(5,new StereoOnCommand(stero),new StereoOffCommand(stero));
//        rc.setCommand(6,new LightOnCommand(new Light("National")),new NoCommand());
//        rc.OnButtonPressed(6);
//        for (int i = 1; i <=5; i++) {
//            rc.OnButtonPressed(i);
//        }
//        rc.UndoButtonPressed();

        var microCommand=new MicroCommand(new Command[]{new TvChannelOnCommand(tv),new StereoOnCommand(stero)}
                );
        microCommand.turnOn();
        microCommand=null;
    }
}



