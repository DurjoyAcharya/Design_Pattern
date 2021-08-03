package StrategyPattern;
//Strategy Pattern Example ...............

abstract class Fighter
{
    KickBehaviour kickBehaviour;
    JumpBehaviour jumpBehaviour;

    public Fighter(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        this.kickBehaviour = kickBehaviour;
        this.jumpBehaviour = jumpBehaviour;
    }
    public void Punch()
    {
        System.out.println("Default Punch.....");
    }
    public void kick()
    {
        kickBehaviour.kick();
    }
    public void jump()
    {
        jumpBehaviour.Jump();
    }
    public void roll()
    {
        System.out.println("default roll.........");
    }
    public void FighterId()
    {
        System.out.println("Fighter ID Is HeadShaker...");
    }

    public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public void setKickBehaviour(KickBehaviour kickBehaviour) {
        this.kickBehaviour = kickBehaviour;
    }
    abstract void face();
}
class Ryu extends Fighter
{
    public Ryu(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour)
    {
        super(kickBehaviour,jumpBehaviour);
    }
    @Override
    void face() {
        System.out.println("This the Ryu");
    }
}
class Alex extends Fighter
{

    public Alex(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour)
    {
        super(kickBehaviour, jumpBehaviour);
    }
    @Override
    void face() {
        System.out.println("This is the Alex");
    }
}
class Chun_Li extends Fighter
{
    public Chun_Li(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour)
    {
        super(kickBehaviour, jumpBehaviour);
    }

    @Override
    void face() {
        System.out.println("This is the Chun-Li");
    }
}
class Mustofa extends Fighter
{

    public Mustofa(KickBehaviour kickBehaviour,JumpBehaviour jumpBehaviour)
    {
        super(kickBehaviour, jumpBehaviour);
    }
    @Override
    void face() {
        System.out.println("Hero of dinos_World Mustofa");
    }
}
class TornadoKick implements KickBehaviour
{
    @Override
    public void kick() {
        System.out.println("Tornado Kick................");
    }
}
class LightingKick implements KickBehaviour
{
    @Override
    public void kick() {
        System.out.println("Lighting Kick..................");
    }
}
interface KickBehaviour
{
    void kick();
}
interface JumpBehaviour
{
    void Jump();
}
class ShortJump implements JumpBehaviour
{
    @Override
    public void Jump() {
        System.out.println("Short_Jump...............");
    }
}
class LongJump implements JumpBehaviour
{

    @Override
    public void Jump() {
        System.out.println("Long Jump................");
    }
}
public class StreetFighter {
    public static void main(String...args) {
        JumpBehaviour shortJump=new ShortJump();
        JumpBehaviour longJump=new LongJump();
        KickBehaviour tornadoKick=new TornadoKick();

        Ryu ryu=new Ryu(tornadoKick, shortJump);

        ryu.FighterId();
        ryu.face();
        ryu.kick();
        ryu.Punch();
        ryu.roll();
        ryu.jump();
        System.out.println("___________________________________");
        Mustofa mustofa=new Mustofa(tornadoKick,shortJump);
        mustofa.face();
        mustofa.jump();
        mustofa.setJumpBehaviour(longJump);
        mustofa.jump();





    }
}
