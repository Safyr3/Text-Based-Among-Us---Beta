import javax.lang.model.util.ElementScanner6;

public class Imposter 
{
    private int numberOfPeople;
    private boolean imposter;
    private boolean crewmate;
    private boolean lightsOut = false;
    private boolean reactorDown;
    private boolean oxygenDepleted;
    private int peopleKilled;

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
    
    public Imposter(int p, boolean i, boolean c)
    {
        numberOfPeople = p;
        imposter = i;
        crewmate = c;
        
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
        
        if(lights < 6)
        {
          System.out.println();
          System.out.println("Lights were fixed.");
          System.out.println();
        }
        else if (lights > 5)
        {
          lightsOut = true;
          System.out.println();
          System.out.println("Lights went out.");
          System.out.println();
          System.out.println("You can now kill once and no one will see you.");
          System.out.println();
        }
        else
        {
          System.out.println("AN ERROR OCCURRED");
          System.out.println();
        }

        return "Lights going out…";
    }

    public String reactor()
    {
        int countdownReactor = 21;

        System.out.println();
        System.out.println("Reactor melting down…");
        System.out.println();
        pause(1000);
        
        while(countdownReactor > 0)
        {
          countdownReactor = countdownReactor - 1;
          System.out.println(countdownReactor);
          int reactorStabilized = (int)(Math.random() * 10) + 0;
          
          if(reactorStabilized > 7)
          {
            System.out.println();
            System.out.println("Reactor stabilized.");
            System.out.println();
            reactorDown = false;
            break; 
          }
          
          pause(1000);
        }
        
        if(countdownReactor == 0)
        {
          reactorDown = true;
          
          if(reactorDown = true)
          {
            System.out.println();
            System.out.println("Reactor melted down.");
            System.out.println();
            System.out.println("You won the game!");
            System.exit(0);
          }
        }

        return "Reactor melting down…";
    }

    public String oxygen()
    {
        int countdownOxygen = 21;

        System.out.println();
        System.out.println("Oxygen depleting…");
        System.out.println();
        pause(1000);

        while(countdownOxygen > 0)
        {
          countdownOxygen = countdownOxygen - 1;
          System.out.println(countdownOxygen);
          int oxygenRestored = (int)(Math.random() * 10) + 0;
          
          if(oxygenRestored > 7)
          {
            System.out.println();
            System.out.println("Oxygen restored.");
            System.out.println();
            oxygenDepleted = false;
            break; 
          }
          pause(1000);
        }
        
        if(countdownOxygen == 0)
        {
          oxygenDepleted = true;
        
          if(oxygenDepleted = true)
          {
            System.out.println();
            System.out.println("Oxygen depleted.");
            System.out.println();
            System.out.println("You won the game!");
            System.exit(0);
          }
        }
  
        return "Oxygen depleting…";
    }
    
    public String alibi()
    {
        System.out.println();
        System.out.println("Alibi created.");
        System.out.println();
        return "Alibi created.";
    }
    
    public String kill()
    {
        System.out.println();
        System.out.println("You killed someone.");
        System.out.println();
        numberOfPeople = numberOfPeople - 1;
        peopleKilled = peopleKilled + 1;
        System.out.println("There are now "+numberOfPeople+" people in the game, including you.");
        int killWitness = (int)(Math.random() * 11) + 0;

        if(lightsOut = true)
        {
          System.out.println();
          System.out.println("No one saw you kill.");
          System.out.println();
          lightsOut = false;
        }
        else if(killWitness > 5)
        {
          System.out.println();
          System.out.println("No one saw you kill.");
          System.out.println();
        }
        else if (killWitness < 6)
        {
          System.out.println();
          System.out.println("Someone saw you kill.");
          System.out.println();
          Meeting meeting = new Meeting(numberOfPeople, peopleKilled, imposter, crewmate);
        }
        return "You killed someone.";
    }
}