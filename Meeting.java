public class Meeting
{
  private int numberOfPeople;
  private int numberOfPeopleDead;
  private boolean crewmate;
  private boolean imposter;

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

  public Meeting(int p, int d, boolean c, boolean i)
  {
    numberOfPeople = p;
    numberOfPeopleDead = d;
    crewmate = c;
    imposter = i;

    System.out.println("There are "+numberOfPeople+" people in this meeting.");
    System.out.println();
    System.out.println(d + " people died last round.");
    System.out.println();

    if(crewmate = true && imposter = false)
    {

    }
    else if (crewmate = false && imposter = true)
    {

    }
    else
    {
      System.out.println();
      System.out.println("AN ERROR HAS OCCURED");
    }
  }
}