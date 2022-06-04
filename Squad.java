package com.company;

import java.util.ArrayList;

public class Squad
{
    ArrayList<Archer> archers;
    ArrayList<Spearman> spearmen;
    ArrayList<Horseman> horsemen;

    public void addArcher(Archer newArcher){
        archers.add(newArcher);
    }
    public void addSpearman(Spearman newSpearman){
        spearmen.add(newSpearman);
    }
    public void addHorseman(Horseman newHorseman){
        horsemen.add(newHorseman);
    }

    public int totalStrength(){
        int total =0;
        for(int i=0;i<archers.size();i++){
            total+=archers.get(i).getAttack();
        }
        for(int i=0;i<spearmen.size();i++){
            total+=spearmen.get(i).getAttack();
        }
        for(int i=0;i<horsemen.size();i++){
            total+=horsemen.get(i).getAttack();
        }
        return total;
    }
}
