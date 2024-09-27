package pets;

import java.util.Scanner;

public class Main extends Petlab {

    public static void main(String[] args) {
        Scanner pets = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        String numPets = pets.nextLine();
        System.out.println("What are each of their names");

        String petName = pets.nextLine();
        System.out.println("What kind of pet are each of them?");

        String petType = pets.nextLine();
        if (petType == "dog"){
            Dog dog = new Dog();
            dog.Speak();
        }  else if(petType == "cat") {
            Cat cat = new Cat();
            cat.Speak();
        } else if (petType == "bird"){
            Bird bird = new Bird();
            bird.Speak();
        }
        System.out.println("You have " + numPets + " "+ "pets");
        System.out.println("Their names are" + " " + petName);
        System.out.println(petName + " are these kind of pets: " + petType);




    }


}
