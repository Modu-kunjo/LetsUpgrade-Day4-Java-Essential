
package main;

public class Main {
    
    public static void main(String[] args) {
       avenger[] avengers = new avenger[4];
       
       for(int i =0; i <5; i++ ){
           avengers[i] = new avenger();
           avengers[i].getDetails();
       }
       
       for(int i=0; i<5; i++){
           avengers[i].displayDetails();
    }
}
    
}
