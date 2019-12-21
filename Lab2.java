public class Lab2
{
    //precondition: Robot is on the top right corner facing left
    //postcondition: Robot is on a cleaned square
    public static void cleanSquare()
    {
        Robot.load("square.txt");
        Robot.setDelay(0.1);
        cleanRowturn();
        cleanRowturn();
        cleanRowturn();
        cleanRowturn();

    }
    //precondition: Robot is on a clean square with a dirty square in front
    //postcondition: Robot is on a clean square.
    public static void cleanSpace()
    {
        Robot.move();
        Robot.makeLight();

    }
    //precondition:Robot is at a corner facing the row in a counter-clockwise direction
    //postcondition:Robot is at the end of a clean row on a clean space
    public static void cleanRowturn()
    {
        cleanSpace();
        cleanSpace(); 
        cleanSpace();
        cleanSpace();
        cleanSpace();
        Robot.move ();
        Robot.turnLeft();
    }
    //precondition: Robot is facing up with an undarkened row next to him and the comb undarkened
    //postcondition: Robot is facing up on a darkened space with the entire comb darkened
    public static void darkenComb()
    {
        Robot.load("comb.txt");
        Robot.setDelay(0.05);
        darkenRow();
        upRow();
        darkenRow();
        upRow();
        darkenRow();
        upRow();
        darkenRow();
        upRow();
        darkenRow();

    }
    //precondition: Robot is facing up with a light row to the right
    //postcondition: Robot is two spaces north facing up next to a light row to the right.
    public static void darkenRow()
    {Robot.makeDark();
        turnRight();

        darkensix()
        Robot.turnLeft();
        Robot.turnLeft();

        movesix()
        turnRight();

//precondition: Robot is facing any direction
    //postcondition: Robot is six squares forward in front of six darkened squares
    public static void darkensix()
    {
        makeDark();
        makeDark();
        makeDark();
        makeDark();
        makeDark();
        makeDark();
    }
    //precondition: Robot is facing any direction
    //postcondition: Robot is six squares forward
    public static void movesix()
    {
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
    }
    }
    //precondition: Robot is on any sqare with a light sqare in front
    //postcondition: Robot is on a now dark square that was previously light
    public static void makeDark()
    {
        Robot.move();
        Robot.makeDark();
    }
    //precondition: Robot is facing up with a row to the right
    //postcondition: Robot is two spaces north facing up with a row to the right
    public static void upRow()
    {
        makeDark();
        Robot.move();    
    }
    //precondition: Robot is facing any direction on any square
    //postcondition: Robot has rotated 90 degrees right from its prior direction

    public static void turnRight()
    {
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();

    }
//precondition: Robot is facing up on the bottom left corner of a undarkened 8 by 8 square.
//postcondition: Robot is facing up on the top left corner of an checkered 8 by 8 square.
    public static void makeCheckered()
    {
        Robot.load("blank.txt");
        Robot.setDelay(0.05);
        maketworowCheckered();
        Robot.move();
        maketworowCheckered();
        Robot.move();
        maketworowCheckered();
        Robot.move();
        maketworowCheckered();
    }
    //precondition:Robot is facing any direction.
   //postcondition:Robot is two spaces to the right with the space its on being dark.
    public static void checkertwo()
    {
        Robot.move(); 
        makeDark();

    }
    //precondition:Robot is facing any direction
//postcondition:Robot is facing the opposite direction
    public static void turnaround()
    {
        Robot.turnLeft();
        Robot.turnLeft();
    }
//precondition: Robot is facing any direction.
//postcondition:Robot is six spaces away from its original location.
    public static void backsixspace()
    {
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
    }
//precondition: Robot is facing any direction.
//postcondition: Robot is six spaces away from its orignal position.
    public static void threecheckertwo()
    {
        checkertwo();
        checkertwo();
        checkertwo();

    }
//precondition: The robot is facing up on an entirly light row.
//postcondition: The robot is facing up above a type 1 checkered row.
    public static void rowoneCheckered()
    {
        turnRight();
        Robot.makeDark();

        threecheckertwo();

        turnaround();
        backsixspace();

        turnRight();
        Robot.move();
        


    }
    //precondition: The robot is facing up on an entirly light row.
//postcondition: The robot is facing up above a type 2 checkered row.
public static void rowtwoCheckered()
{
turnRight();
        makeDark();
        threecheckertwo();

        turnaround();

        backsixspace();
        Robot.move();
        turnRight();
       }
       //precondition: The robot is facing up on an entirely light row.
      
      //postcondition: The robot is facing up above two checkered rows
       public static void maketworowCheckered()
       {
           rowoneCheckered();
           rowtwoCheckered();
        }
}

     
     
     
