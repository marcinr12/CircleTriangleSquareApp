public class Square extends Figure implements Print
{
    private double sideLength;

    @Override
    public double calculateArea()
    {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter()
    {
        return 4* sideLength;
    }

    @Override
    public void print()
    {
        System.out.println("Square ID:" + ID + " side length: " + sideLength + " perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }

    @Override
    public void set(double s) throws SubZero
    {
        if (s < 0)
            throw new SubZero("Wrong value.");
        sideLength = s;
    }

    Square()
    {
        sideLength = 0;
    }

}
