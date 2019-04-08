public abstract class Figure
{
    private static int figureQuantity = 0;
    int ID;
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    Figure()
    {
        ID = figureQuantity;
        figureQuantity++;
    }

}
