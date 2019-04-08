import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main (String[] args)
    {

        List <Circle> circles = new ArrayList<>();
        List <Triangle> triangles = new ArrayList<>();
        List <Square>  squares = new ArrayList<>();

        UserInterface.userInterface(circles, triangles, squares);

    }
}
