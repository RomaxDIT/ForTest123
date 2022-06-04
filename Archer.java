package com.company;

public class Archer {
    int Health=8;
    int Attack=4;
    int Armour=0;

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

    public void piercingShot(Spearman enemy){
        enemy.setHealth(enemy.getHealth()- this.Attack);
    }
    public void piercingShot(Horseman enemy){
        enemy.setHealth(enemy.getHealth()- this.Attack);
    }
    public void piercingShot(Archer enemy){
        enemy.setHealth(enemy.getHealth()- this.Attack);
    }
}
