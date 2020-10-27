public class Crewmate 
{
  private String name;
  private int numberOfPeople;
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

  public Crewmate(String n, int p, boolean i, boolean c)
  {
    name = n;
    numberOfPeople = p;
    imposter = i;
    crewmate = c;
        
    System.out.println("Role: Crewmate");
    System.out.println();
    System.out.println("Tasks:");
    System.out.println("1. Electrical: Fix Wiring 0/3");
    System.out.println("2. MedBay: Submit Scan 0/1");
    System.out.println("3. Admin: Swipe Card 0/1");
    System.out.println("4. Cafeteria: Empty Garbage 0/2");
    System.out.println("5. Weapons: Clear Asteroids 0/1");
    System.out.println();
  }
    
  public String electrical() 
  {
    System.out.println();
    System.out.println("Fixing wires…");
    pause(5000);
    System.out.println();
    System.out.println("Wires are fixed!");
    System.out.println();
    return "Fixing wires…";
  }

  public String medbay()
  {
    System.out.println();
    System.out.println("Scanning…");
    pause(10000);
    System.out.println();
    System.out.println("Scan complete!");
    System.out.println();
    return "Scanning…";
  }

  public String admin()
  {
    System.out.println();
    System.out.println("Swiping card…");
    pause(7500);
    System.out.println();
    System.out.println("Task complete!");
    System.out.println();
    return "Swiping card…";
  }

  public String cafeteria()
  {
    System.out.println();
    System.out.println("Emptying garbage…");
    pause(5000);
    System.out.println();
    System.out.println("Garbage emptied!");
    System.out.println();
    return "Emptying garbage…";
  }

  public String weapons()
  {
    System.out.println();
    System.out.println("Clearing asteroids…");
    pause(7500);
    System.out.println();
    System.out.println("Asteroids cleared!");
    System.out.println();
    return "Clearing asteroids…";
  }
}