import javax.lang.model.util.ElementScanner6;

public class Imposter 
{
    private String playerName;
    private boolean canKill;
    private boolean canSabotage;
    private int numberOfPeople;
    private boolean killWitnessed = false;

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
    
    public Imposter(String n, boolean k, boolean s, int p)
    {
        playerName = n;
        canKill = k;
        canSabotage = s;
        numberOfPeople = p;
        
        System.out.println("Role: Imposter");
        System.out.println();
        System.out.println("Fake tasks: ");
        System.out.println("1. Electrical: Fix Wiring 0/3");
        System.out.println("2. O2: Clean O2 Filter 0/1");
        System.out.println("3. MedBay: Inspect Sample 0/1");
        System.out.println("4. Reactor: Start Reactor 0/1");
        System.out.println("5. Weapons: Download Data 0/2");
        System.out.println();
    }
    
    public String lights()
    {
        System.out.println();
        System.out.println("Lights going out…");
        int lights = (int)(Math.random() * 11) + 0;
        
        if(lights < 8)
        {
          System.out.println();
          System.out.println("Lights didn't go out.");
        }
        else if (lights > 7)
        {
          System.out.println();
          System.out.println("Lights went out.");
        }
        else
        {
          System.out.println("AN ERROR OCCURRED");
        }

        return "Lights going out…";
    }

    public String reactor()
    {
        int countdownReactor = 30;

        System.out.println();
        System.out.println("Reactor melting down…");
        System.out.println();
        System.out.println("30");
        pause(1000);
        
        while(countdownReactor > 0)
        {
          countdownReactor = countdownReactor - 1;
          System.out.println(countdownReactor);
          pause(1000);
        }

        System.out.println();
        System.out.println("Reactor melted down.");
        System.out.println();
        System.out.println("You won the game!");
        return "Reactor melting down…";
    }

    public String oxygen()
    {
        int countdownOxygen = 30;

        System.out.println();
        System.out.println("Oxygen depleting…");
        System.out.println();
        System.out.println("30");
        pause(1000);

        while(countdownOxygen > 0)
        {
          countdownOxygen = countdownOxygen - 1;
          System.out.println(countdownOxygen);
          pause(1000);
        }
        System.out.println();
        System.out.println("Oxygen depleted.");
        System.out.println();
        System.out.println("You won the game!");
        return "Oxygen depleting…";
    }
    
    public String alibi()
    {
        System.out.println();
        System.out.println("Alibi created.");
        return "Alibi created.";
    }
    
    public String kill()
    {
        System.out.println();
        System.out.println("You killed someone.");
        System.out.println();
        numberOfPeople = numberOfPeople - 1;
        System.out.println("There are now "+numberOfPeople+" people in the game, including you.");
        int killWitness = (int)(Math.random() * 11) + 0;

        if(killWitness > 6)
        {
          System.out.println();
          System.out.println("No one saw you kill.");
        }
        else if (killWitness < 5)
        {
          killWitnessed = true;
          System.out.println();
          System.out.println("Someone saw you kill.");
          System.out.println();
          
        }

        if(killWitnessed = true)
        {
          Meeting meeting = new Meeting(numberOfPeople);
        }

        return "You killed someone.";
    }
}