import model.*;

public class App {
    public static void main(String[] args) throws Exception {
       Burung a = new Burung();
       Pocong b = new Pocong();
       Zombie c = new Zombie();
       a.attack();
       b.attack();
       c.attack();
       a.fly();
       a.jump();
       b.jump();
       c.walk();
    }
}
