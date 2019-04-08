import java.util.List;
import java.util.Scanner;

class UserInterface
{
    static void userInterface(List<Circle> circles, List<Triangle> triangles, List<Square> squares)
    {

        Scanner scanner = new Scanner(System.in);
        boolean layerFirstSwitch = true;
        while (layerFirstSwitch)
        {
            layerFirst();
            int a = scanner.nextInt();
            switch (a)
            {
                case 1:
                {

                    boolean layerSecondSwich = true;
                    while(layerSecondSwich)
                    {
                        layerSecond();
                        int b = scanner.nextInt();
                        switch (b)
                        {
                            case 1: //circle
                            {
                                boolean layerThirdSwitch = true;
                                while (layerThirdSwitch)
                                {
                                    layerThird();
                                    int c = scanner.nextInt();
                                    switch (c)
                                    {
                                        case 1: //create
                                        {
                                            Circle circle = new Circle();
                                            circles.add(circle);
                                            break;
                                        }
                                        case 2: //change data
                                        {
                                            if (circles.size() == 0)
                                            {
                                                System.out.println("No triangles to modify.");
                                                break;
                                            }
                                            System.out.println("Choose a circle from the table you want to modify. The number of elements in the array is: " + circles.size());
                                            int indeks = 0;
                                            boolean error = false;
                                            {
                                                while(indeks <=0 || indeks > circles.size())
                                                {

                                                    if (error)
                                                        System.out.println("Wrong item index. Try again.");

                                                    indeks = scanner.nextInt();
                                                    error = true;
                                                }
                                                try
                                                {
                                                    System.out.println("Enter a new radius value.");
                                                    int radiusLength = scanner.nextInt();
                                                    circles.get(indeks -1).set(radiusLength);
                                                }
                                                catch (SubZero sub)
                                                {
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                        case 3: //display
                                        {
                                            if (circles.size() == 0)
                                            {
                                                System.out.println("No circles to display.");
                                                break;
                                            }
                                            System.out.println("Choose a circle from the table you want to display. The number of elements in the array is: " + circles.size());
                                            int indeks = 0;
                                            boolean error = false;
                                            {
                                                while(indeks <=0 || indeks > circles.size())
                                                {

                                                    if (error)
                                                        System.out.println("Wrong item index. Try again.");

                                                    indeks = scanner.nextInt();
                                                    error = true;
                                                }
                                                circles.get(indeks - 1).print();
                                            }
                                            break;
                                        }
                                        case 4: //back
                                        {
                                            layerThirdSwitch = false;
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("No such option. Try again.");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 2: //square
                            {
                                boolean layerThirdSwitch = true;
                                while (layerThirdSwitch)
                                {
                                    layerThird();
                                    int c = scanner.nextInt();
                                    switch (c)
                                    {
                                        case 1: //create
                                        {
                                            Square square = new Square();
                                            squares.add(square);
                                            break;
                                        }
                                        case 2: //change data
                                        {
                                            if (squares.size() == 0)
                                            {
                                                System.out.println("No squares to modify..");
                                                break;
                                            }
                                            System.out.println("Choose a square from the table you want to modify. The number of elements in the array is: " + squares.size());
                                            int indeks = 0;
                                            boolean error = false;
                                            {
                                                while(indeks <=0 || indeks > squares.size())
                                                {

                                                    if (error)
                                                        System.out.println("Wrong item index. Try again.");

                                                    indeks = scanner.nextInt();
                                                    error = true;
                                                }
                                                try
                                                {
                                                    System.out.println("Enter a new side value.");
                                                    int sideLength = scanner.nextInt();
                                                    squares.get(indeks - 1).set(sideLength);
                                                }
                                                catch (SubZero sub)
                                                {
                                                    continue;
                                                }

                                            }

                                            break;
                                        }
                                        case 3: //display
                                        {
                                            if (squares.size() == 0)
                                            {
                                                System.out.println("No squares to display.");
                                                break;
                                            }
                                            System.out.println("Choose a square from the table you want to display. The number of elements in the array is: " + squares.size());
                                            int indeks = 0;
                                            boolean error = false;
                                            {
                                                while(indeks <=0 || indeks > squares.size())
                                                {

                                                    if (error)
                                                        System.out.println("Wrong item index. Try again.");

                                                    indeks = scanner.nextInt();
                                                    error = true;
                                                }
                                                squares.get(indeks - 1).print();
                                            }
                                            break;
                                        }
                                        case 4: //back
                                        {
                                            layerThirdSwitch = false;
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("No such option. Try again.");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 3: //triangle
                            {
                                boolean layerThirdSwitch = true;
                                while (layerThirdSwitch)
                                {
                                    layerThird();
                                    int c = scanner.nextInt();
                                    switch (c)
                                    {
                                        case 1: //create
                                        {
                                            Triangle triangle = new Triangle();
                                            triangles.add(triangle);
                                            break;
                                        }
                                        case 2: //change data
                                        {
                                            if (triangles.size() == 0)
                                            {
                                                System.out.println("No triangles to modify.");
                                                break;
                                            }
                                            System.out.println("Choose a triangle from the table you want to modify. The number of elements in the array is: " + triangles.size());
                                            int indeks = 0;
                                            boolean error = false;
                                            {
                                                while(indeks <=0 || indeks > triangles.size())
                                                {

                                                    if (error)
                                                        System.out.println("Wrong item index. Try again.");

                                                    indeks = scanner.nextInt();
                                                    error = true;
                                                }
                                                try
                                                {
                                                    System.out.println("Enter a new side value.");
                                                    int sideLength = scanner.nextInt();
                                                    triangles.get(indeks - 1).set(sideLength);
                                                }
                                                catch (SubZero sub)
                                                {
                                                    continue;
                                                }

                                            }

                                            break;
                                        }
                                        case 3: //display
                                        {
                                            if (triangles.size() == 0)
                                            {
                                                System.out.println("No triangles to display.");
                                                break;
                                            }
                                            System.out.println("Choose a triangle from the table you want to display. The number of elements in the array is: " + triangles.size());
                                            int indeks = 0;
                                            boolean error = false;
                                            {
                                                while(indeks <=0 || indeks > triangles.size())
                                                {

                                                    if (error)
                                                        System.out.println("Wrong item index. Try again.");

                                                    indeks = scanner.nextInt();
                                                    error = true;
                                                }
                                                triangles.get(indeks - 1).print();
                                            }
                                            break;
                                        }
                                        case 4: //back
                                        {
                                            layerThirdSwitch = false;
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("No such option. Try again.");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 4: //back
                            {
                                layerSecondSwich = false;
                                break;
                            }
                            default:
                            {
                                System.out.println("No such option. Try again.");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 2:
                {
                    layerFirstSwitch = false;
                    break;
                }
                default:
                {
                    System.out.println("No such option. Try again.");
                    break;
                }
            }
        }
    }

    private static void layerFirst()
    {
        System.out.println("1. Select figure");
        System.out.println("2. Exit");
    }

    private static void layerSecond()
    {
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Return");
    }

    private static void layerThird()
    {
        System.out.println("1. Create");
        System.out.println("2. Modify");
        System.out.println("3. Display");
        System.out.println("4. Return");
    }
}