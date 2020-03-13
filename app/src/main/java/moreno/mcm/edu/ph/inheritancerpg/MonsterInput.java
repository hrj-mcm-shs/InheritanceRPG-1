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

public class MonsterInput extends AppCompatActivity {
    EditText monstername;
    ImageView monsterimage;
    Spinner spinnermonster;
    String choosemonster,name,type;
    Button save;
    Monster monster;
    double hp,mp,patk,matk,pdef,mdef,eva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_input);
        save=findViewById(R.id.save2);
        monstername=findViewById(R.id.nameinput2);
        monsterimage=findViewById(R.id.charImage3);
        spinnermonster=findViewById(R.id.spinnermonster);
        monster= new Monster();

        spinnermonster.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                choosemonster=spinnermonster.getSelectedItem().toString();
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                if(choosemonster.equals("Wyvern")){
                    monsterimage.setImageResource(R.drawable.wyvern);
                }
                else if(choosemonster.equals("Chiropteran")){
                    monsterimage.setImageResource(R.drawable.chiropteran);
                }
                else if(choosemonster.equals("Skeleton")){
                    monsterimage.setImageResource(R.drawable.skeleton);
                }
                else if(choosemonster.equals("Dragon")){
                    monsterimage.setImageResource(R.drawable.dragon);
                }
                else if(choosemonster.equals("Voidspawn")){
                    monsterimage.setImageResource(R.drawable.voidspawn);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=monstername.getText().toString();
                if(choosemonster.equals("Wyvern")){
                    type="Wyvern";
                    monster.setBaseHP(3500);
                    monster.setBaseMP(1500);
                    monster.setpAtk(300);
                    monster.setmAtk(300);
                    monster.setpDef(250);
                    monster.setmDef(300);
                    monster.setEvasion(200);
                    hp=monster.getBaseHP();
                    mp=monster.getBaseMP();
                    patk=monster.getpAtk();
                    matk=monster.getmAtk();
                    pdef=monster.getpDef();
                    mdef=monster.getmDef();
                    eva=monster.getEvasion();
                }
                else if(choosemonster.equals("Chiropteran")){
                    type="Chiropteran";
                    monster.setBaseHP(2500);
                    monster.setBaseMP(1000);
                    monster.setpAtk(250);
                    monster.setmAtk(370);
                    monster.setpDef(200);
                    monster.setmDef(400);
                    monster.setEvasion(400);
                    hp=monster.getBaseHP();
                    mp=monster.getBaseMP();
                    patk=monster.getpAtk();
                    matk=monster.getmAtk();
                    pdef=monster.getpDef();
                    mdef=monster.getmDef();
                    eva=monster.getEvasion();
                }
                else if(choosemonster.equals("Skeleton")){
                    type="Skeleton";
                    monster.setBaseHP(2000);
                    monster.setBaseMP(900);
                    monster.setpAtk(200);
                    monster.setmAtk(150);
                    monster.setpDef(200);
                    monster.setmDef(600);
                    monster.setEvasion(200);
                    hp=monster.getBaseHP();
                    mp=monster.getBaseMP();
                    patk=monster.getpAtk();
                    matk=monster.getmAtk();
                    pdef=monster.getpDef();
                    mdef=monster.getmDef();
                    eva=monster.getEvasion();
                }
                else if(choosemonster.equals("Dragon")){
                    type="Dragon";
                    monster.setBaseHP(5000);
                    monster.setBaseMP(3000);
                    monster.setpAtk(450);
                    monster.setmAtk(400);
                    monster.setpDef(400);
                    monster.setmDef(500);
                    monster.setEvasion(200);
                    hp=monster.getBaseHP();
                    mp=monster.getBaseMP();
                    patk=monster.getpAtk();
                    matk=monster.getmAtk();
                    pdef=monster.getpDef();
                    mdef=monster.getmDef();
                    eva=monster.getEvasion();
                }
                else if(choosemonster.equals("Voidspawn")){
                    type="Voidspawn";
                    monster.setBaseHP(3000);
                    monster.setBaseMP(1400);
                    monster.setpAtk(500);
                    monster.setmAtk(500);
                    monster.setpDef(300);
                    monster.setmDef(100);
                    monster.setEvasion(500);
                    hp=monster.getBaseHP();
                    mp=monster.getBaseMP();
                    patk=monster.getpAtk();
                    matk=monster.getmAtk();
                    pdef=monster.getpDef();
                    mdef=monster.getmDef();
                    eva=monster.getEvasion();
                }
                Intent monster = new Intent(MonsterInput.this,MonsterOutput.class);
                monster.putExtra("hname",name);
                monster.putExtra("type",type);
                monster.putExtra("hp",hp);
                monster.putExtra("mp",mp);
                monster.putExtra("patk",patk);
                monster.putExtra("matk",matk);
                monster.putExtra("pdef",pdef);
                monster.putExtra("mdef",mdef);
                monster.putExtra("eva",eva);
                startActivity(monster);
            }
        });
    }
}
