import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main
{
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

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int max = 10;
        int min = 4;
        int range = max - min + 1;
        boolean killHappened;
        
        System.out.println();
        System.out.println("This is a modified version of Among Us.");
        System.out.println("Enjoy!");
        System.out.println();
        
        System.out.println("Your name:");
        String name = scanner.nextLine().toLowerCase();
        
       
        int numberOfPeople = (int)(Math.random() * range) + min;
        
        System.out.println();
        System.out.println("There are "+numberOfPeople+" people in this game, including you.");
        System.out.println();
        
        double randNumber = Math.random();
        double multiplyByRange = randNumber * (numberOfPeople);
        int role = (int)(multiplyByRange);
        
        if(role % 2 != 0 || name.equals("luci"))
        {
            boolean isImposter = true;
            boolean isCrewmate = false;
            
            Imposter imposter = new Imposter(numberOfPeople, isImposter, isCrewmate);

            while(numberOfPeople > 1)
            {
              System.out.println("What do you want to do?");
              System.out.println("sabotage, alibi, or kill:");
              String action = scanner.nextLine().toLowerCase();
            
              if(action.equals("sabotage"))
              {
                System.out.println();
                System.out.println("What would you like to sabotage?");
                System.out.println("lights, reactor, or oxygen:");
                String sabotage = scanner.nextLine().toLowerCase();

                if(sabotage.equals("lights"))
                {
                  imposter.lights();
                }
                else if (sabotage.equals("reactor"))
                {
                  imposter.reactor();
                }
                else if (sabotage.equals("oxygen"))
                {
                  imposter.oxygen();
                }
                else
                {
                  System.out.println();
                  System.out.println("AN ERROR HAS OCCURRED");
                }
              }
              else if (action.equals("alibi"))
              {
                imposter.alibi();
              }
              else if (action.equals("kill"))
              {
                imposter.kill();
                numberOfPeople = numberOfPeople - 1;
              }
              else
              {
                System.out.println();
                System.out.println("AN ERROR HAS OCCURRED");
              }
            }
            System.out.println("You won the game!");
        }
        else if (role % 2 == 0)
        {
            boolean isImposter = false;
            boolean isCrewmate = true;
            
            Crewmate crewmate = new Crewmate(numberOfPeople, isImposter, isCrewmate);

            while(numberOfPeople >= 1)
            {
              System.out.println("Do you want to complete a task?");
              System.out.println("yes or no:");
              String task = scanner.nextLine().toLowerCase();
            
              if(task.equals("yes"))
              {
                System.out.println();
                System.out.println("What task would you like to complete?");
                System.out.println("electrical,: medbay, admin, cafeteria, or weapons:");
                String taskToDo = scanner.nextLine().toLowerCase();

                if(taskToDo.equals("electrical"))
                {
                  crewmate.electrical();
                }
                else if (taskToDo.equals("medbay"))
                {
                  crewmate.medbay();
                }
                else if (taskToDo.equals("admin"))
                {
                  crewmate.admin();
                }
                else if (taskToDo.equals("cafeteria"))
                {
                  crewmate.cafeteria();
                }
                else if (taskToDo.equals("weapons"))
                {
                  crewmate.weapons();
                }
                else
                {
                  System.out.println();
                  System.out.println("AN ERROR HAS OCCURRED");
                }
              }
              else if(task.equals("no"))
              {
                  System.out.println();
                  System.out.println("Please wait for the round to end.");
                  pause(5000);
                  Meeting meeting = new Meeting(numberOfPeople, 0, isImposter, isCrewmate);
              }
              else
              {
                  System.out.println();
                  System.out.println("AN ERROR HAS OCCURRED");
              }
            }
          }
        else
        {
            System.out.println();
            System.out.println("AN ERROR HAS OCCURED");
        }
    }
}
