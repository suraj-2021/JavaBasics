abstract class Person{
    abstract void eat();
}

class SuperPerson{
    
      Person p = new Person(){
          @Override
          void eat(){
              System.out.println("Person is eating!");
          }
      };
      void display(){
          System.out.println("Actions of Person: ");
          p.eat();
      }
    }

public class Main{
    public static void main(String[]args){
        SuperPerson sp = new SuperPerson();
        sp.display();
    }
}
