public interface Factory {
    void draw();
}

class circle implements Factory
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Factory{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class ShapeFactory {
    public static Factory getShape(String shapeType)
    {
        if(shapeType.equals("circle"))
        {
            return new circle();

        } else if(shapeType.equals("rectangle")){

            return new Rectangle();
        } 
        else {
            throw new IllegalArgumentException("invalid shape type");
        }
    }
    
}