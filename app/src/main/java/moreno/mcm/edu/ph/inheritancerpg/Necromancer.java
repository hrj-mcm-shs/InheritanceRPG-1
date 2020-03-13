package moreno.mcm.edu.ph.inheritancerpg;

public class Necromancer extends Hero {
    private String necroName;
    private double necroSTR,necroAGI,necroINT;

    public Necromancer(int id, double baseHP, double baseMP,double pAtk,
                       double mAtk, double pDef, double mDef,double evasion, int heroID,
                       int heroLevel, String heroClass, double heroSTR,
                       double heroAGI, double heroINT, double heroEXP,
                       double strGrowth,double agiGrowth,double intGrowth){
        super(id,baseHP,baseMP,pAtk,mAtk,pDef,mDef,evasion,heroID,heroLevel,
                heroClass,heroSTR,heroAGI,heroINT,heroEXP,
                strGrowth,agiGrowth,intGrowth);
    }
    public Necromancer(){}
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
    public void setEvasion(double evasion) {
        super.setEvasion(evasion);
    }
    public void setHeroLevel(int heroLevel) {
        super.setHeroLevel(heroLevel);
    }
    public void setHeroClass(String heroClass) {
        super.setHeroClass(heroClass);
    }
    public void setHeroSTR(double heroSTR) {
        super.setHeroSTR(heroSTR);
    }
    public void setHeroAGI(double heroAGI) {
        super.setHeroAGI(heroAGI);
    }
    public void setHeroINT(double heroINT) {
        super.setHeroINT(heroINT);
    }
    public void setHeroEXP(double heroEXP) {
        super.setHeroEXP(heroEXP);
    }
    public void setStrGrowth(double strGrowth) {
        super.setStrGrowth(strGrowth);
    }
    public void setAgiGrowth(double agiGrowth) {
        super.setAgiGrowth(agiGrowth);
    }
    public void setIntGrowth(double intGrowth) {
        super.setIntGrowth(intGrowth);
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
    public double getEvasion() {
        return super.getEvasion();
    }
    public int getHeroLevel() {
        return super.getHeroLevel();
    }
    public String getHeroClass() {
        return super.getHeroClass();
    }
    public double getHeroSTR() {
        return super.getHeroSTR();
    }
    public double getHeroAGI() {
        return super.getHeroAGI();
    }
    public double getHeroINT() {
        return super.getHeroINT();
    }
    public double getHeroEXP() {
        return super.getHeroEXP();
    }
    public double getStrGrowth() {
        return super.getStrGrowth();
    }
    public double getAgiGrowth() {
        return super.getAgiGrowth();
    }
    public double getIntGrowth() {
        return super.getIntGrowth();
    }



    @Override
    public double baseHPwithSTR(){
        return super.getBaseHP()+(10*strwithGrowth());
    }
    @Override
    public double baseMPwithINT(){
        return super.getBaseMP()+(15*intwithGrowth());
    }


}
