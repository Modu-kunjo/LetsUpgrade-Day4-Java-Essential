
package main;

/**
 *
 * @author Modu Kunjo
 */
import java.util.Scanner;
public class avenger {
    String name, power, weapon, planet;
    int age;
    
    Scanner input = new Scanner(System.in);
    
    public void getDetails(){
        System.out.println("Enter the name: ");
        name = input.nextLine();
        System.out.println("Enter the age: ");
        age = input.nextInt();
        System.out.println("Enter the power: ");
        power = input.nextLine();
        System.out.println("Enter the weapon: ");
        weapon = input.nextLine();
        System.out.println("Enter the planet");
        planet = input.nextLine();
    }
    
    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Power: "+ power);
        System.out.println("Weapon: "+ weapon);
        System.out.println("Planet: "+ planet);
    }
}
