/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Ben Allen
 */
public class Creature {
    //a Creature or any living thing
    private String name;
    private AbilityList AList;
    private Stats Stats;

    public Creature() {
    }

    public Creature(String name) {
        this.name = name;
    }

    public Creature(String name, AbilityList AList, Stats Stats) {
        this.name = name;
        this.AList = AList;
        this.Stats = Stats;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
   public void addAbility(Ability ability){
       
    } 
}

