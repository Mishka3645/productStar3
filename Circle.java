public class Circle extends Exception
{
    private double radius;

    public void setRadius(double radius) throws Exception
    {
        if(radius <= 0)
            throw new Exception();
        else this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.round(Math.PI * this.radius * this.radius);
    }
}
