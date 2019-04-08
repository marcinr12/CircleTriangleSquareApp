public class Circle extends Figure implements Print
{
    private double radiusLength;

    @Override
    public double calculatePerimeter()
    {
        return 2*Math.PI* radiusLength;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI* radiusLength * radiusLength;
    }

    @Override
    public void print()
    {
        System.out.println("Circle ID: " + ID + " radius " + radiusLength + " perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }

    @Override
    public void set(double s) throws SubZero
    {
        if (s < 0)
            throw new SubZero("Wrong value.");

        radiusLength = s;
    }

    public String toString()
    {
        return "Circle ID: " + ID + " radius: " + radiusLength + " perimeter: " + calculatePerimeter() + " area: " + calculateArea() + "\n";
    }


    Circle()
    {
        radiusLength = 0;
    }

}
