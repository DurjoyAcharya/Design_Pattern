package FactoryPattern;

public interface Door {
    public float getHeight();
    public float getWidth();
}
class WoodenDoor implements Door
{
    protected float height;
    protected float width;

    public WoodenDoor(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public float getWidth() {
        return this.width;
    }
}
class Doorfactory{
    public static Door makeDoor(float height,float width)
    {
        return new WoodenDoor(height,width);
    }
}
class Main{
    public static void main(String...args) {
        var obj=Doorfactory.makeDoor(15.5F, 19.87F);
        System.out.println("Height: "+obj.getHeight());
        System.out.println("Width: "+obj.getWidth());
    }
}
