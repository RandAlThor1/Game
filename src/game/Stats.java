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
public class Stats {
// The stats held by a creature, effect mostly combat ability
    private int Int;
    private int str;
    private int dex;
    private int con;
    private int spd;
    private int level;
    private int maxHP; // max HP
    private int CHP; //CURRENT HP
    private String type;
    final private String Tank = "Tank";
    final private String MeleeDmg = "MeleeDmg";
    final private String Magic = "Magic";
    final private String Ranged = "Ranged";
    
/**
 * 
 * @param Int
 * @param str
 * @param dex
 * @param con
 * @param type 
 * @see Can be made default by setting all the over variables to 0 and using one of the types of classes.
 */
    public Stats(int Int, int str, int dex, int con, String type) {
        this.Int = Int;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.type = type;
        if (Int==0 && str ==0 && dex==0 && con==0) {
            if (type.equals(this.Tank)) {
                this.Int = 5;
                this.str =  15;
                this.dex =  5;
                this.con = 20;
            } else if (type.equals(this.MeleeDmg)) {
                this.Int = 5;
                this.str = 20;
                this.dex = 15;
                this.con = 10;
            } else if (type.equals(this.Magic)) {
                this.Int = 20;
                this.str = 5;
                this.dex = 15;
                this.con = 5;
            } else if (type.equals(this.Ranged)) {
                this.Int = 10;
                this.str = 5;
                this.dex = 25;
                this.con = 10;
            }
        }
        
    }

    public Stats(String type) {
            if (type.equals(this.Tank)) {
                this.Int = 5;
                this.str = 20;
                this.dex = 5;
                this.con = 20;
            } else if (type.equals(this.MeleeDmg)) {
                this.Int = 5;
                this.str = 20;
                this.dex = 15;
                this.con = 10;
            } else if (type.equals(this.Magic)) {
                this.Int = 20;
                this.str = 5;
                this.dex = 15;
                this.con = 5;
            } else if (type.equals(this.Ranged)) {
                this.Int = 10;
                this.str = 5;
                this.dex = 25;
                this.con = 10;
            }
    }
    

    public int getSpd() {
        return getLevel() + getCon();
    }
    public int getStr(){
        return this.str;
    }
    public int getInt(){
        return this.Int;
    }
    public int getDex(){
        return this.dex;
    }
    public int getCon(){
        return this.con;
    }
    public int getLevel(){
        return this.level;
    }
    public int GetMaxHP(){
        return getCon() + getLevel();
    }
    public int getHP(){
        return this.CHP;
    }
    public String getType(){
        return this.type;
    }
    public void setStr(int str){
        this.str = str;
    }
    public void setInt(int Int){
        this.Int = Int;     
    }
    public void setDex(int dex){
        this.dex = dex;
    }
    public void setCon(int con){
        this.con = con;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setCHP(int CHP){
        if (CHP >= GetMaxHP()) {
            CHP = GetMaxHP();
        }
        else if(CHP <= 0){
            CHP = 0;
        } 
        this.CHP = CHP;
    }
    public void setType(String type){
        this.type = type;
    }
    /**
     * @see levels up the stats of the Creature based on the class.
     */
    public void levelUp(){
        setLevel(getLevel() + 1);
        if (type.equals(this.Tank)){
            setInt(getInt()+1);
            setStr(getStr()+3);
            setDex(getDex()+2);
            setCon(getCon()+4);
        }
        else if(type.equals(this.MeleeDmg)){
            setInt(getInt()+1);
            setStr(getStr()+4);
            setDex(getDex()+3);
            setCon(getCon()+2);
        }
        else if (type.equals(this.Magic)){
            setInt(getInt()+1);
            setStr(getStr()+2);
            setDex(getDex()+1);
            setCon(getCon()+3);
        }
        else if (type.equals(this.Ranged)){
            setInt(getInt()+1);
            setStr(getStr()+2);
            setDex(getDex()+1);
            setCon(getCon()+3);
        }
    }
    /**
     * 
     * @param times 
     * @see used to level up multiple times
     */
    public void levelUp(int times){
        for (int i = 0; i < times; i++) {
            levelUp();
        }
    }
}
