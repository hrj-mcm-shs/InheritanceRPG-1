package moreno.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class HeroInput extends AppCompatActivity {
    ImageView heropic;
    TextView output;
    Spinner classhero,warrior,rogue,mage,cleric,slayer;
    EditText levelinput,nameinput;
    Button save;
    String chooseclass,choosewarrior,chooserogue,choosemage,choosecleric,chooseslayer,choosename;
    Hero hero;
    Juggernaught jugg;
    Berserker berserk;
    Deadeye deadeye;
    Trickster trickster;
    Elementalist elemental;
    Necromancer necro;
    HighPriest highpriest;
    Inquisitor inquisitor;
    Gladiator gladiator;
    Champion champ;
    String herolevel;
    int levelhero;
    double hp,mp,patk,matk,pdef,mdef,str,agi,inte,eva;
    String hclass,hjob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_input);
        classhero=findViewById(R.id.spinnerclass);
        warrior=findViewById(R.id.warriorspinner);
        rogue=findViewById(R.id.roguespinner);
        mage=findViewById(R.id.magespinner);
        cleric=findViewById(R.id.clericspinner);
        slayer=findViewById(R.id.slayerspinner);
        nameinput=findViewById(R.id.nameinput);
        heropic=findViewById(R.id.charImage);
        levelinput=findViewById(R.id.editLevel);
        save=findViewById(R.id.save);
        hero=new Hero();
        jugg=new Juggernaught();
        berserk=new Berserker();
        deadeye=new Deadeye();
        trickster=new Trickster();
        elemental=new Elementalist();
        necro=new Necromancer();
        highpriest=new HighPriest();
        inquisitor=new Inquisitor();
        gladiator=new Gladiator();
        champ=new Champion();


        warrior.setVisibility(View.VISIBLE);
        rogue.setVisibility(View.GONE);
        mage.setVisibility(View.GONE);
        cleric.setVisibility(View.GONE);
        slayer.setVisibility(View.GONE);

        classhero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chooseclass=classhero.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                if(chooseclass.equals("Warrior")){
                    heropic.setImageResource(R.drawable.warrior);
                    warrior.setVisibility(View.VISIBLE);
                    rogue.setVisibility(View.GONE);
                    mage.setVisibility(View.GONE);
                    cleric.setVisibility(View.GONE);
                    slayer.setVisibility(View.GONE);



                }
                else if(chooseclass.equals("Rogue")){
                    heropic.setImageResource(R.drawable.rogue);
                    warrior.setVisibility(View.GONE);
                    rogue.setVisibility(View.VISIBLE);
                    mage.setVisibility(View.GONE);
                    cleric.setVisibility(View.GONE);
                    slayer.setVisibility(View.GONE);
                }
                else if(chooseclass.equals("Mage")){
                    heropic.setImageResource(R.drawable.mage);
                    warrior.setVisibility(View.GONE);
                    rogue.setVisibility(View.GONE);
                    mage.setVisibility(View.VISIBLE);
                    cleric.setVisibility(View.GONE);
                    slayer.setVisibility(View.GONE);
                }
                else if(chooseclass.equals("Cleric")){
                    heropic.setImageResource(R.drawable.cleric);
                    warrior.setVisibility(View.GONE);
                    rogue.setVisibility(View.GONE);
                    mage.setVisibility(View.GONE);
                    cleric.setVisibility(View.VISIBLE);
                    slayer.setVisibility(View.GONE);
                }
                else if(chooseclass.equals("Slayer")){
                    heropic.setImageResource(R.drawable.slayer);
                    warrior.setVisibility(View.GONE);
                    rogue.setVisibility(View.GONE);
                    mage.setVisibility(View.GONE);
                    cleric.setVisibility(View.GONE);
                    slayer.setVisibility(View.VISIBLE);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        warrior.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                choosewarrior=warrior.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        rogue.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chooserogue=rogue.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                choosemage=mage.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        cleric.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                choosecleric=cleric.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        slayer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chooseslayer=slayer.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choosename=nameinput.getText().toString();
                hclass="";
                hjob="";
                levelhero=Integer.parseInt(levelinput.getText().toString());
                if(levelhero<=100) {
                    if (chooseclass.equals("Warrior") && choosewarrior.equals("Juggernaut")) {
                        hclass = "Warrior";
                        hjob = "Juggernaut";
                        jugg.setHeroLevel(levelhero);
                        jugg.setBaseHP(100);
                        jugg.setBaseMP(100);
                        jugg.setpAtk(5);
                        jugg.setmAtk(3);
                        jugg.setpDef(5);
                        jugg.setmDef(3);
                        jugg.setEvasion(5);
                        jugg.setHeroSTR(10);
                        jugg.setHeroAGI(6);
                        jugg.setHeroINT(7);
                        jugg.setStrGrowth(2);
                        jugg.setAgiGrowth(1);
                        jugg.setIntGrowth(1);
                        hp = jugg.baseHPwithSTR();
                        mp = jugg.baseMPwithINT();
                        patk = jugg.pAtkGrowth();
                        matk = jugg.mAtkGrowth();
                        pdef = jugg.pDefGrowth();
                        mdef = jugg.mDefGrowth();
                        eva = jugg.evaGrowth();
                        str = jugg.strwithGrowth();
                        agi = jugg.agiwithGrowth();
                        inte = jugg.intwithGrowth();
                    } else if (chooseclass.equals("Warrior") && choosewarrior.equals("Berserker")) {
                        hclass = "Warrior";
                        hjob = "Berserker";
                        berserk.setHeroLevel(levelhero);
                        berserk.setBaseHP(100);
                        berserk.setBaseMP(100);
                        berserk.setpAtk(7);
                        berserk.setmAtk(4);
                        berserk.setpDef(5);
                        berserk.setmDef(4);
                        berserk.setEvasion(5);
                        berserk.setHeroSTR(15);
                        berserk.setHeroAGI(5);
                        berserk.setHeroINT(3);
                        berserk.setStrGrowth(3);
                        berserk.setAgiGrowth(1);
                        berserk.setIntGrowth(1);
                        hp = berserk.baseHPwithSTR();
                        mp = berserk.baseMPwithINT();
                        patk = berserk.pAtkGrowth();
                        matk = berserk.mAtkGrowth();
                        pdef = berserk.pDefGrowth();
                        mdef = berserk.mDefGrowth();
                        eva = berserk.evaGrowth();
                        str = berserk.strwithGrowth();
                        agi = berserk.agiwithGrowth();
                        inte = berserk.intwithGrowth();
                    } else if (chooseclass.equals("Rogue") && chooserogue.equals("Deadeye")) {
                        hclass = "Rogue";
                        hjob = "Deadeye";
                        deadeye.setHeroLevel(levelhero);
                        deadeye.setBaseHP(100);
                        deadeye.setBaseMP(100);
                        deadeye.setpAtk(8);
                        deadeye.setmAtk(3);
                        deadeye.setpDef(5);
                        deadeye.setmDef(4);
                        deadeye.setEvasion(3);
                        deadeye.setHeroSTR(10);
                        deadeye.setHeroAGI(15);
                        deadeye.setHeroINT(7);
                        deadeye.setStrGrowth(2);
                        deadeye.setAgiGrowth(3);
                        deadeye.setIntGrowth(1);
                        hp = deadeye.baseHPwithSTR();
                        mp = deadeye.baseMPwithINT();
                        patk = deadeye.pAtkGrowth();
                        matk = deadeye.mAtkGrowth();
                        pdef = deadeye.pDefGrowth();
                        mdef = deadeye.mDefGrowth();
                        eva = deadeye.evaGrowth();
                        str = deadeye.strwithGrowth();
                        agi = deadeye.agiwithGrowth();
                        inte = deadeye.intwithGrowth();
                    } else if (chooseclass.equals("Rogue") && chooserogue.equals("Trickster")) {
                        hclass = "Rogue";
                        hjob = "Trickster";
                        trickster.setHeroLevel(levelhero);
                        trickster.setBaseHP(100);
                        trickster.setBaseMP(100);
                        trickster.setpAtk(8);
                        trickster.setmAtk(3);
                        trickster.setpDef(5);
                        trickster.setmDef(4);
                        trickster.setEvasion(3);
                        trickster.setHeroSTR(7);
                        trickster.setHeroAGI(10);
                        trickster.setHeroINT(10);
                        trickster.setStrGrowth(2);
                        trickster.setAgiGrowth(3);
                        trickster.setIntGrowth(1);
                        hp = trickster.baseHPwithSTR();
                        mp = trickster.baseMPwithINT();
                        patk = trickster.pAtkGrowth();
                        matk = trickster.mAtkGrowth();
                        pdef = trickster.pDefGrowth();
                        mdef = trickster.mDefGrowth();
                        eva = trickster.evaGrowth();
                        str = trickster.strwithGrowth();
                        agi = trickster.agiwithGrowth();
                        inte = trickster.intwithGrowth();
                    } else if (chooseclass.equals("Mage") && choosemage.equals("Elementalist")) {
                        hclass = "Mage";
                        hjob = "Elementalist";
                        elemental.setHeroLevel(levelhero);
                        elemental.setBaseHP(100);
                        elemental.setBaseMP(100);
                        elemental.setpAtk(3);
                        elemental.setmAtk(10);
                        elemental.setpDef(3);
                        elemental.setmDef(8);
                        elemental.setEvasion(3);
                        elemental.setHeroSTR(3);
                        elemental.setHeroAGI(6);
                        elemental.setHeroINT(15);
                        elemental.setStrGrowth(1);
                        elemental.setAgiGrowth(1);
                        elemental.setIntGrowth(3);
                        hp = elemental.baseHPwithSTR();
                        mp = elemental.baseMPwithINT();
                        patk = elemental.pAtkGrowth();
                        matk = elemental.mAtkGrowth();
                        pdef = elemental.pDefGrowth();
                        mdef = elemental.mDefGrowth();
                        eva = elemental.evaGrowth();
                        str = elemental.strwithGrowth();
                        agi = elemental.agiwithGrowth();
                        inte = elemental.intwithGrowth();
                    } else if (chooseclass.equals("Mage") && choosemage.equals("Necromancer")) {
                        hclass = "Rogue";
                        hjob = "Necromancer";
                        elemental.setHeroLevel(levelhero);
                        elemental.setBaseHP(100);
                        elemental.setBaseMP(100);
                        elemental.setpAtk(3);
                        elemental.setmAtk(10);
                        elemental.setpDef(3);
                        elemental.setmDef(8);
                        elemental.setEvasion(3);
                        elemental.setHeroSTR(10);
                        elemental.setHeroAGI(6);
                        elemental.setHeroINT(10);
                        elemental.setStrGrowth(2);
                        elemental.setAgiGrowth(1);
                        elemental.setIntGrowth(3);
                        hp = elemental.baseHPwithSTR();
                        mp = elemental.baseMPwithINT();
                        patk = elemental.pAtkGrowth();
                        matk = elemental.mAtkGrowth();
                        pdef = elemental.pDefGrowth();
                        mdef = elemental.mDefGrowth();
                        eva = elemental.evaGrowth();
                        str = elemental.strwithGrowth();
                        agi = elemental.agiwithGrowth();
                        inte = elemental.intwithGrowth();

                    } else if (chooseclass.equals("Cleric") && choosecleric.equals("High Priest")) {
                        hclass = "Cleric";
                        hjob = "High Priest";
                        highpriest.setHeroLevel(levelhero);
                        highpriest.setBaseHP(100);
                        highpriest.setBaseMP(100);
                        highpriest.setpAtk(3);
                        highpriest.setmAtk(8);
                        highpriest.setpDef(3);
                        highpriest.setmDef(8);
                        highpriest.setEvasion(3);
                        highpriest.setHeroSTR(5);
                        highpriest.setHeroAGI(5);
                        highpriest.setHeroINT(15);
                        highpriest.setStrGrowth(1);
                        highpriest.setAgiGrowth(1);
                        highpriest.setIntGrowth(3);
                        hp = highpriest.baseHPwithSTR();
                        mp = highpriest.baseMPwithINT();
                        patk = highpriest.pAtkGrowth();
                        matk = highpriest.mAtkGrowth();
                        pdef = highpriest.pDefGrowth();
                        mdef = highpriest.mDefGrowth();
                        eva = highpriest.evaGrowth();
                        str = highpriest.strwithGrowth();
                        agi = highpriest.agiwithGrowth();
                        inte = highpriest.intwithGrowth();
                    } else if (chooseclass.equals("Cleric") && choosecleric.equals("Inquisitor")) {
                        hclass = "Cleric";
                        hjob = "Inquisitor";
                        highpriest.setHeroLevel(levelhero);
                        highpriest.setBaseHP(100);
                        highpriest.setBaseMP(100);
                        highpriest.setpAtk(3);
                        highpriest.setmAtk(8);
                        highpriest.setpDef(3);
                        highpriest.setmDef(8);
                        highpriest.setEvasion(3);
                        highpriest.setHeroSTR(10);
                        highpriest.setHeroAGI(5);
                        highpriest.setHeroINT(10);
                        highpriest.setStrGrowth(1);
                        highpriest.setAgiGrowth(1);
                        highpriest.setIntGrowth(3);
                        hp = highpriest.baseHPwithSTR();
                        mp = highpriest.baseMPwithINT();
                        patk = highpriest.pAtkGrowth();
                        matk = highpriest.mAtkGrowth();
                        pdef = highpriest.pDefGrowth();
                        mdef = highpriest.mDefGrowth();
                        eva = highpriest.evaGrowth();
                        str = highpriest.strwithGrowth();
                        agi = highpriest.agiwithGrowth();
                        inte = highpriest.intwithGrowth();
                    } else if (chooseclass.equals("Slayer") && chooseslayer.equals("Gladiator")) {
                        hclass = "Slayer";
                        hjob = "Gladiator";
                        gladiator.setHeroLevel(levelhero);
                        gladiator.setBaseHP(100);
                        gladiator.setBaseMP(100);
                        gladiator.setpAtk(5);
                        gladiator.setmAtk(3);
                        gladiator.setpDef(5);
                        gladiator.setmDef(3);
                        gladiator.setEvasion(5);
                        gladiator.setHeroSTR(10);
                        gladiator.setHeroAGI(6);
                        gladiator.setHeroINT(7);
                        gladiator.setStrGrowth(2);
                        gladiator.setAgiGrowth(2);
                        gladiator.setIntGrowth(1);
                        hp = gladiator.baseHPwithSTR();
                        mp = gladiator.baseMPwithINT();
                        patk = gladiator.pAtkGrowth();
                        matk = gladiator.mAtkGrowth();
                        pdef = gladiator.pDefGrowth();
                        mdef = gladiator.mDefGrowth();
                        eva = gladiator.evaGrowth();
                        str = gladiator.strwithGrowth();
                        agi = gladiator.agiwithGrowth();
                        inte = gladiator.intwithGrowth();
                    } else if (chooseclass.equals("Slayer") && chooseslayer.equals("Champion")) {
                        hclass = "Slayer";
                        hjob = "Champion";
                        champ.setHeroLevel(levelhero);
                        champ.setBaseHP(100);
                        champ.setBaseMP(100);
                        champ.setpAtk(7);
                        champ.setmAtk(4);
                        champ.setpDef(5);
                        champ.setmDef(4);
                        champ.setEvasion(5);
                        champ.setHeroSTR(15);
                        champ.setHeroAGI(10);
                        champ.setHeroINT(5);
                        champ.setStrGrowth(3);
                        champ.setAgiGrowth(1);
                        champ.setIntGrowth(1);
                        hp = champ.baseHPwithSTR();
                        mp = champ.baseMPwithINT();
                        patk = champ.pAtkGrowth();
                        matk = champ.mAtkGrowth();
                        pdef = champ.pDefGrowth();
                        mdef = champ.mDefGrowth();
                        eva = champ.evaGrowth();
                        str = champ.strwithGrowth();
                        agi = champ.agiwithGrowth();
                        inte = champ.intwithGrowth();
                    }
                    Intent hero = new Intent(HeroInput.this, Result.class);
                    hero.putExtra("job", hjob);
                    hero.putExtra("name", choosename);
                    hero.putExtra("hclass", hclass);
                    hero.putExtra("hp", hp);
                    hero.putExtra("mp", mp);
                    hero.putExtra("patk", patk);
                    hero.putExtra("matk", matk);
                    hero.putExtra("pdef", pdef);
                    hero.putExtra("mdef", mdef);
                    hero.putExtra("eva", eva);
                    hero.putExtra("str", str);
                    hero.putExtra("agi", agi);
                    hero.putExtra("inte", inte);
                    hero.putExtra("level", levelhero);
                    startActivity(hero);
                }
                else if(levelhero>=101){
                    Toast.makeText(HeroInput.this,"Max Level is 100",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
