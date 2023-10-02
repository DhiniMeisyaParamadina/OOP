/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class DuckSimulator {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Membuat beberapa objek bebek
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redheadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        
        //memanggil metode-metode untuk menampilkan perilaku bebek
        System.out.println("Mallard Duck");
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
        
        System.out.println("\nRubber Duck:");
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
       
    }
}
// kelas-kelas bebek
class MallardDuck{
    public void display(){
        System.out.println("Mallard Duck Display");
    }
    public void quack(){
        System.out.println("Mallard Duck quack.");
    }
    public void swim(){
        System.out.println("Mallard Duck berenang");
    }
    public void fly(){
        System.out.println("Mallard Duck Terbang");
    }
    
}
    
    class RubberDuck{
    public void display(){
        System.out.println("Rubber Duck Display");
    }
    public void quack(){
        System.out.println("Rubber Duck quack.");
    }
    public void swim(){
        System.out.println("Rubber Duck berenang");
    }
    public void fly(){
        System.out.println("Rubber Duck Terbang");
    }
    }

 