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
public class Ability {
// This is an ability
    private final String Type;
    private final String Dmg;
    private final String Acc;
    private final String Desc;

    public Ability(String Type, String Dmg, String Acc, String Desc) {
        this.Type = Type;
        this.Dmg = Dmg;
        this.Acc = Acc;
        this.Desc = Desc;
    }

    public Ability() {
        this.Type = "Blank";
        this.Dmg = "0";
        this.Acc = "0";
        this.Desc = "0";
    }
    public String getType(){
        return Type;
    }
    public String getDmg(){
        return Dmg;
    }
    public String getAcc(){
        return Acc;
    }
    public String getDesc(){
        return Desc;
    }
    
}

