package ProtoType;

import java.util.Objects;

public class Rectangle extends Shape{

    public int height;
    public int width;
    public Rectangle() {}
    public Rectangle(Rectangle target)
    {
        super(target);
        if (target!=null)
        {
            this.height= target.height;
            this.width= target.width;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    @Override
    public boolean equals(Object o) {
       // if (this == o) return true;
        if (!(o instanceof Rectangle)||(!super.equals(o))) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && width == rectangle.width;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }
}
