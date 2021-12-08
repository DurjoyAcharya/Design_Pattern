package ProtoType;

import java.util.Objects;

//ref refactoring guru
public class Circle extends Shape{
    public int radius;
    public Circle() {
    }
    public Circle(Circle target)
    {
        super(target);
        if (target!=null)
            this.radius= target.radius;
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        if (!(o instanceof Circle)||(!super.equals(o))) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
