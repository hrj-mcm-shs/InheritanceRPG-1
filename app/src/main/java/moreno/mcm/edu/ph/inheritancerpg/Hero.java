package moreno.mcm.edu.ph.inheritancerpg;

public class Hero extends Characters {
    private int heroID,heroLevel;
    private String heroClass;
    private double heroSTR,heroAGI,heroINT,heroEXP;
    private double strGrowth, agiGrowth, intGrowth;

    public Hero(int id, double baseHP, double baseMP,double pAtk,
                double mAtk, double pDef, double mDef,double evasion, int heroID,
                int heroLevel, String heroClass, double heroSTR,
                double heroAGI, double heroINT, double heroEXP,
                double strGrowth,double agiGrowth,double intGrowth){
        super(id,baseHP,baseMP,pAtk,mAtk,pDef,mDef,evasion);
        this.heroID=heroID;
        this.heroLevel=heroLevel;
        this.heroClass=heroClass;
        this.heroSTR=heroSTR;
        this.heroAGI=heroAGI;
        this.heroINT=heroINT;
        this.heroEXP=heroEXP;
        this.strGrowth=strGrowth;
        this.agiGrowth=agiGrowth;
        this.intGrowth=intGrowth;
    }
    public Hero(){}
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
    //Characters//

    public void setHeroLevel(int heroLevel) {
        this.heroLevel = heroLevel;
    }
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
    public void setHeroSTR(double heroSTR) {
        this.heroSTR = heroSTR;
    }
    public void setHeroAGI(double heroAGI) {
        this.heroAGI = heroAGI;
    }
    public void setHeroINT(double heroINT) {
        this.heroINT = heroINT;
    }
    public void setHeroEXP(double heroEXP) {
        this.heroEXP = heroEXP;
    }
    public void setStrGrowth(double strGrowth) {
        this.strGrowth = strGrowth;
    }
    public void setAgiGrowth(double agiGrowth) {
        this.agiGrowth = agiGrowth;
    }
    public void setIntGrowth(double intGrowth) {
        this.intGrowth = intGrowth;
    }


    public int getHeroLevel() {
        return heroLevel;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public double getHeroSTR() {
        return heroSTR;
    }
    public double getHeroAGI() {
        return heroAGI;
    }
    public double getHeroINT() {
        return heroINT;
    }
    public double getHeroEXP() {
        return heroEXP;
    }
    public double getStrGrowth() {
        return strGrowth;
    }
    public double getAgiGrowth() {
        return agiGrowth;
    }
    public double getIntGrowth() {
        return intGrowth;
    }

    //Hero//
    public double strwithGrowth(){
        return strGrowth= heroSTR+(strGrowth+Double.valueOf(heroLevel));
    }
    public double agiwithGrowth(){
        return agiGrowth=heroAGI+(agiGrowth+Double.valueOf(heroLevel));
    }
    public double intwithGrowth(){
        return intGrowth=heroINT+(intGrowth+Double.valueOf(heroLevel));
    }
    public double baseHPwithSTR(){
        return super.getBaseHP()+(5*strwithGrowth());
    }
    public double baseMPwithINT(){
        return super.getBaseMP()+(5*intwithGrowth());
    }


    //10agi=1pdef
    //5agi=1patk
    //5str=1patk
    //5int=1mdef
    //agi= 0.4%evasion
    //3int=1matk

    public double pDefGrowth(){
        return super.getpDef()+(agiwithGrowth()*.10);
    }
    public double pAtkGrowth(){
        return super.getpAtk()+(strwithGrowth()*.5)+(agiwithGrowth()*.5);
    }
    public double mDefGrowth(){
        return super.getmDef()+(intwithGrowth()*.5);
    }
    public double evaGrowth(){
        return super.getEvasion()+(agiwithGrowth()*0.0004);
    }
    public double mAtkGrowth(){
        return super.getmAtk()+(intwithGrowth()*0.03);
    }

}
