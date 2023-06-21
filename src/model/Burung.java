package model;

public class Burung  extends Enemy{
    public void walk(){
        System.out.println("Burung berjalan !!!");
    }
    public void jump(){
        System.out.println("Burung melompat !!!");
    }
    public void fly(){
        System.out.println("Burung terbang !!!");
    }   
    @Override
    public void attack(){
        super.attack();
        System.out.println("Burung Serang !!!");
        walk();
    }
}
