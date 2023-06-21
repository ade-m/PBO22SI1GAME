package model;

public class Pocong  extends Enemy{
        public void jump(){
            System.out.println("Pocong melompat !!!");
        }
        @Override
        public void attack(){
            super.attack();
            System.out.println("Pocong menyerang !!!");
            System.out.println("Pocong terjatuh !!!");
            jump();
        }
    
}
