package ru.job4j.oop;

public class Cat {
   private String food;

   private String name;

   public  void giveNick(String nick) {
       this.name = nick;
   }

   public  void show() {
       System.out.println("There is " + this.name + "food " + this.food);
   }

   public void eat(String meat) {
       this.food = meat;
   }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("Kotleta");
        gav.giveNick("Gav ");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black ");
        black.eat("Fish");
        black.show();
    }
}
