package com.company;

public class Spearman {
    int Health=14;
    int Attack=2;
    int Armour=2;

    public void setHealth(int health) {
        this.Health=health;
    }
    public void setArmour(int armour) {
        this.Armour=armour;
    }


    public void setAttack(int attack) {
        this.Attack=attack;
    }


    public int getHealth() {
        return this.Health;
    }
    public int getArmour(){
        return  this.Armour;
    }


    public int getAttack() {
        return this.Attack;
    }

    public void attack(Spearman enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));
    }
    public void attack(Horseman enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));
    }
    public void attack(Archer enemy){
        enemy.setHealth(enemy.getHealth()- (this.Attack-enemy.getArmour() ));
    }

    public void fortify (){
        this.Armour+=2;
    }
}
