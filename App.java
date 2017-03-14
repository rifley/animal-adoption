import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal squirrel = new Animal("Akbar", "squirrel", "female", 12, false);
    Animal dog = new Animal("Gerard", "dog", "male", 3, false);
    Animal rat = new Animal("Tempe", "fancy rat", "female", 1, true);
    Animal cat = new Animal("Georgia", "cat", "female", 8, false);
    Animal snake = new Animal("Shoosh", "snake", "unknown", 4, false);

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(squirrel);
    allAnimals.add(dog);
    allAnimals.add(rat);
    allAnimals.add(cat);
    allAnimals.add(snake);

    boolean programRunning = true;

    while(programRunning){
      System.out.println("Welcome to our wonderful animal shelter! You can search: 'All Animals', 'Unadopted Animals', or you can add your unwanted pet via 'Add Pet'");
      String userChoice = myConsole.readLine();

      if(userChoice.equals("All Animals")){
        for(Animal individualAnimal : allAnimals ){
          System.out.println("----------------");
          System.out.println(individualAnimal.mName);
          System.out.println("the " + individualAnimal.mSpecies);
          System.out.println(individualAnimal.mSex);
          System.out.println(individualAnimal.mAge + "years old");
        }
      } else if(userChoice.equals("Unadopted Animals")){
        for(Animal individualAnimal : allAnimals ){
          if(!(individualAnimal.mAdopted)){
            System.out.println("----------------");
            System.out.println(individualAnimal.mName);
            System.out.println("the " + individualAnimal.mSpecies);
            System.out.println(individualAnimal.mSex);
            System.out.println(individualAnimal.mAge + "years old");
          }
        }
      }else if(userChoice.equals("Add Pet")){
        System.out.println("What is your pets name?");
        String userPetName = myConsole.readLine();
        System.out.println("Awesome you ass! What is the species of the pet you wish to abandon?");
        String userPetSpecies = myConsole.readLine();
        System.out.println("Neato! Is your pet male or female? Please keep in mind you can go straight to hell");
        String userPetSex = myConsole.readLine();
        System.out.println("Digedy Dope! How old is your awesome pet?");
        int userPetAge = Integer.parseInt(myConsole.readLine());
        Animal userPet = new Animal(userPetName, userPetSpecies, userPetSex, userPetAge, false);
        allAnimals.add(userPet);
        System.out.println("Alri-diddly-ightly. Thanks again!");
      }
      else if(userChoice.equals("exit")){
        programRunning = false;
      }
      else{
      System.out.println("Sorry, I didn't understand your input! Try again please");
      }
    }
  }
}
