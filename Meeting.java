public class Meeting
{
  private int numberOfPeople;

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

  public Meeting(int n)
  {
    numberOfPeople = n;

    System.out.println("There are "+numberOfPeople+" people in this meeting.");
    System.out.println();
  }
}