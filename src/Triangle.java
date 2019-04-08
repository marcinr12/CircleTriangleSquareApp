public class Triangle extends Figure implements Print
{
    private double sideLenght;

    @Override
    public double calculatePerimeter()
    {
        return 3*sideLenght;
    }

    @Override
    public double calculateArea()
    {
        return sideLenght*sideLenght * Math.sqrt(sideLenght)/4;
    }


    @Override
    public void print()
    {
        System.out.println("Triangle ID: " + ID + " side: " + sideLenght + " perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }

    @Override
    public void set(double s) throws SubZero
    {
        if (s < 0)
            throw new SubZero("Wrong value.");
        sideLenght = s;
    }

    Triangle()
    {
        sideLenght = 0;
    }

}
