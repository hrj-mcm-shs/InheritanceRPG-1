package moreno.mcm.edu.ph.inheritancerpg;

public class Characters {
    private int id;
    private double baseHP,baseMP,pAtk,mAtk,pDef,mDef,evasion;
    private boolean isAttackable=true;

    public Characters(int id, double baseHP, double baseMP,double pAtk,
                      double mAtk, double pDef, double mDef,double evasion,boolean isAttackable){
        this.id=id;
        this.baseHP=baseHP;
        this.baseMP=baseMP;
        this.pAtk=pAtk;
        this.pDef=pDef;
        this.mAtk=mAtk;
        this.mDef=mDef;
        this.evasion=evasion;
        this.isAttackable=isAttackable;
    }
    public Characters(int id, double baseHP, double baseMP,double pAtk,
                      double mAtk, double pDef, double mDef,double evasion){
        this.id=id;
        this.baseHP=baseHP;
        this.baseMP=baseMP;
        this.pAtk=pAtk;
        this.pDef=pDef;
        this.mAtk=mAtk;
        this.mDef=mDef;
        this.evasion=evasion;
    }

    public Characters() {

    }

    public double getBaseHP() {
        return baseHP;
    }
    public void setBaseHP(double baseHP) {
        this.baseHP = baseHP;
    }
    public double getBaseMP() {
        return baseMP;
    }
    public void setBaseMP(double baseMP) {
        this.baseMP = baseMP;
    }
    public double getmAtk() {
        return mAtk;
    }
    public void setmAtk(double mAtk) {
        this.mAtk = mAtk;
    }
    public double getpAtk() {
        return pAtk;
    }
    public void setpAtk(double pAtk) {
        this.pAtk = pAtk;
    }
    public double getmDef() {
        return mDef;
    }
    public void setmDef(double mDef) {
        this.mDef = mDef;
    }
    public double getpDef() {
        return pDef;
    }
    public void setpDef(double pDef) {
        this.pDef = pDef;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean getIsAttackable() {
        return isAttackable;
    }
    public void setAttackable(boolean attackable) {
        isAttackable = attackable;
    }
    public double getEvasion() {
        return evasion;
    }
    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }
}
