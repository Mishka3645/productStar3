public class TestCircle
{
    int[] testValue = new int[]{1, 2, 3, 0, -3, -2};

    public void result()
    {
        for(int i = 0; i < testValue.length; ++i)
        {
            test(testValue[i]);
        }
    }
    public void test(double value)
    {
        Circle circle = new Circle();
        try
        {
            circle.setRadius(value);
        }
        catch(Exception exception)
        {
            System.out.println("The radius cannot be negative!");
        }
        System.out.println("Radius = " + circle.getRadius() + ". " +
                "Area circle = " + circle.getArea());
    }
}
