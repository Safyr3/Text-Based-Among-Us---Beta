public class Meeting
{
  private int numberOfPeople;
  private int numberOfPeopleDead;

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

  public Meeting(int p, int d)
  {
    numberOfPeople = p;
    numberOfPeopleDead = d;

    System.out.println("There are "+numberOfPeople+" people in this meeting.");
    System.out.println();
    System.out.println(d + " people died last round.");
    System.out.println();
  }
}