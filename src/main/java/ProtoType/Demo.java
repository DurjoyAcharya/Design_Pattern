package ProtoType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shape=new ArrayList<>();
        List<Shape> shapeCopy=new ArrayList<>();
        var circle=new Circle();
        circle.x=10;
        circle.y=20;
        circle.radius=15;
        circle.color="Red";
        shape.add(circle);
        var anotherCircle=(Circle)circle.clone();
        shape.add(anotherCircle);

        var rectangle=new Rectangle();
        rectangle.height=10;
        rectangle.width=20;
        rectangle.color="Blue";
        shape.add(rectangle);
        CloneAndCompare(shape,shapeCopy);

    }
    private static void CloneAndCompare(List<Shape> shape, List<Shape> shapeCopy) {
        for (Shape shapes:shape)
            shapeCopy.add(shapes);

        for (int i = 0; i < shape.size(); i++) {
            if (shape.get(i)!=shapeCopy.get(i))
            {
                System.out.println(i+" : Shapes are different objects: (Yes)");
                if (shape.get(i).equals(shapeCopy.get(i)))
                    System.out.println(i+" : And they are identical(😎)");
                else
                    System.out.println(i+" : But they are not identical(😔)");
            }else
            {
                System.out.println(i+" : Shape Object are the same");
            }
        }
    }
}
