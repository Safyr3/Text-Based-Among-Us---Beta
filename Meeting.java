public class Meeting
{
  private int numberOfPeople;
  private int meetingNumber = 0;

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

    meetingNumber = meetingNumber + 1;
    System.out.println("This is meeting number "+meetingNumber+", and there are "+numberOfPeople+" in this meeting.");
    System.out.println();
  }
}