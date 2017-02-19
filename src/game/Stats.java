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
    

    public Stats(int Int, int str, int dex, int con, String type) {
        this.Int = Int;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.type = type;
    }

    public int getSpd() {
        this.spd = this.level + this.dex;
        return this.spd;
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
        return this.maxHP;
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
        this.CHP = CHP;
    }
    public void setType(String type){
        this.type = type;
    }
}
