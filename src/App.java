import model.*;

public class App {
    public static void main(String[] args) throws Exception {
       Enemy[] enemy = { new Burung(), new Pocong(), 
        new Zombie(), new Burung()}; 
        for (Enemy enemy2 : enemy) {
            enemy2.attack();
           
        }
        Musuh a = new Tuyul();
        a.serang();
        
    //    Burung a = new Burung();
    //    Pocong b = new Pocong();
    //    Zombie c = new Zombie();
    //    a.attack();
    //    b.attack();
    //    c.attack();
    //    a.fly();
    //    a.jump();
    //    b.jump();
    //    c.walk();
    }
}
