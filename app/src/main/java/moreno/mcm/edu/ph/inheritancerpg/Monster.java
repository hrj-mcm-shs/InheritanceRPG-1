package moreno.mcm.edu.ph.inheritancerpg;

public class Monster extends Characters {

    public Monster(int id, double baseHP, double baseMP,double pAtk,
                   double mAtk, double pDef, double mDef,double evasion,boolean isAttackable){
        super(id,baseHP,baseMP,pAtk,mAtk,pDef,mDef,evasion,isAttackable);
        ;
    }
    public Monster(){}


    public void setBaseHP(double baseHP) {
        super.setBaseHP(baseHP);
    }
    public void setBaseMP(double baseMP) {
        super.setBaseMP(baseMP);
    }
    public void setpAtk(double pAtk) {
        super.setpAtk(pAtk);
    }
    public void setmAtk(double mAtk) {
        super.setmAtk(mAtk);
    }
    public void setpDef(double pDef) {
        super.setpDef(pDef);
    }
    public void setmDef(double mDef) {
        super.setmDef(mDef);
    }
    public void setAttackable(boolean attackable) {
        super.setAttackable(attackable);
    }
    public double getBaseHP() {
        return super.getBaseHP();
    }
    public double getBaseMP() {
        return super.getBaseMP();
    }
    public double getpAtk() {
        return super.getpAtk();
    }
    public double getmAtk() {
        return super.getmAtk();
    }
    public double getpDef() {
        return super.getpDef();
    }
    public double getmDef() {
        return super.getmDef();
    }
    public boolean getIsAttackable() {
        return super.getIsAttackable();
    }
    //Characters//



    //10agi=1pdef
    //5agi=1patk
    //5str=1patk
    //5int=1mdef
    //agi= 0.4%evasion
    //3int=1matk

    //Monster//
}
