public class Meeting
{
  private int numberOfPeople;
  private int numberOfPeopleDead;
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

  public Meeting(int p, int d, boolean i, boolean c)
  {
    numberOfPeople = p;
    numberOfPeopleDead = d;
    imposter = i;
    crewmate = c;

    System.out.println("There are "+numberOfPeople+" people in this meeting.");
    System.out.println();
    System.out.println(d + " people died last round.");
    System.out.println();

    if(crewmate = true)
    {
      System.out.println("Crewmate!");
    }
    else if (imposter = true)
    {
      System.out.println("Imposter!");
    }
    else
    {
      System.out.println();
      System.out.println("AN ERROR HAS OCCURED");
    }
  }
}