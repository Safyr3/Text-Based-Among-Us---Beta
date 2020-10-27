import java.util.Scanner;

public class Meeting
{
  Scanner scanner = new Scanner(System.in);

  private String name;
  private int numberOfPeople;
  private int numberOfPeopleDead;
  private boolean killSeen;
  private boolean imposter;
  private boolean crewmate;

  public static void pause(int ms) 
  {
    try 
    {
      Thread.sleep(ms);
    } 
    catch (InterruptedException e) 
    {
      System.err.format("IOException: %s%n", e);
    }
  }

  public Meeting(String n, int p, int d, boolean k, boolean i, boolean c)
  {
    name = n;
    numberOfPeople = p;
    numberOfPeopleDead = d;
    killSeen = k;
    imposter = i;
    crewmate = c;

    System.out.println("There are "+numberOfPeople+" people in this meeting.");
    System.out.println();
    System.out.println(d + " people died last round.");
    System.out.println();

    if(k == true)
    {
      System.out.println("Someone says they saw you kill.");
      System.out.println();
      System.out.println("Do you want to try and defend yourself?");
      System.out.println("yes or no:");
      String defend = scanner.nextLine();
      
      if(defend.equals("yes"))
      {
        System.out.println("Defend your case:");
        System.out.println();
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println();
        System.out.println("Select one:");
        int defending = scanner.nextInt();

        if(defending == 1)
        {
          System.out.println();
        }
        else if (defending == 2)
        {
          System.out.println();
        }
        else
        {
          System.out.println("AN ERROR HAS OCCURED");
          System.out.println();
        }
      }
      else if (defend.equals("no"))
      {
        System.out.println();
        System.out.println(name + " was The Imposter.");
        System.out.println();
        System.out.println("DEFEAT");
        System.exit(0);
      }
      else
      {
        System.out.println("AN ERROR HAS OCCURED");
        System.out.println();
      }
    }
    else if (i == true && c == false)
    {
      int meetingI = (int)(Math.random() * 11) + 0;

      if(meetingI <= 5)
      {
        System.out.println("Someone is accusing you of being Imposter!");
        System.out.println("Defend your case:");
        System.out.println();
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println();
        System.out.println("Select one:");
        int defendingI = scanner.nextInt();

        if(defendingI == 1)
        {
          System.out.println();
        }
        else if (defendingI == 2)
        {
          System.out.println();
        }
        else
        {
          System.out.println("AN ERROR HAS OCCURED");
          System.out.println();
        }
      }
      else if (meetingI > 5)
      {
        System.out.println("No one has accused you of being the imposter.");
        System.out.println("You are safe… for now.");
        System.out.println();
      }
      else
      {
        System.out.println("AN ERROR HAS OCCURED");
        System.out.println();
      }
    }
    else if (c == true && i == false)
    {
      int meetingC = (int)(Math.random() * 11) + 0;

      if(meetingC <= 5)
      {
        System.out.println("Someone is accusing you of being Imposter!");
        System.out.println("Defend your case:");
        System.out.println();
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println();
        System.out.println("Select one:");
        int defendingC = scanner.nextInt();
      }
      else if (meetingC > 5)
      {

      }
      else
      {
        System.out.println("AN ERROR HAS OCCURED");
        System.out.println();
      }
    }
    else
    {
      System.out.println("AN ERROR HAS OCCURED");
      System.out.println();
    }
  }
}