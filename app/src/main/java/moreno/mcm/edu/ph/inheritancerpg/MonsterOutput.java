package moreno.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MonsterOutput extends AppCompatActivity {
    TextView nameout,typeout,hpout,mpout,patkout,matkout,
            pdefout,mdefout,evaout;
    ImageView monsterimage;
    String name,type;
    double hp,mp,patk,matk,pdef,mdef,eva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_output);
        nameout=findViewById(R.id.nameout2);
        typeout=findViewById(R.id.classout2);
        hpout=findViewById(R.id.hpout2);
        mpout=findViewById(R.id.mpout2);
        patkout=findViewById(R.id.patkout2);
        matkout=findViewById(R.id.matkout2);
        pdefout=findViewById(R.id.pdefout2);
        mdefout=findViewById(R.id.mdefout2);
        evaout=findViewById(R.id.evaout2);
        monsterimage=findViewById(R.id.charImage4);
        DecimalFormat df = new DecimalFormat("#.##");
        name=getIntent().getStringExtra("hname");
        type=getIntent().getStringExtra("type");
        hp=getIntent().getDoubleExtra("hp",0);
        mp=getIntent().getDoubleExtra("mp",0);
        patk=Double.parseDouble(df.format(getIntent().getDoubleExtra("patk",0)));
        matk=Double.parseDouble(df.format(getIntent().getDoubleExtra("matk",0)));
        pdef=Double.parseDouble(df.format(getIntent().getDoubleExtra("pdef",0)));
        mdef=Double.parseDouble(df.format(getIntent().getDoubleExtra("mdef",0)));
        eva=Double.parseDouble(df.format(getIntent().getDoubleExtra("eva",0)));
        if(type.equals("Wyvern")){
            monsterimage.setImageResource(R.drawable.wyvern);
        }
        else if(type.equals("Chiropteran")){monsterimage.setImageResource(R.drawable.chiropteran);}
        else if(type.equals("Skeleton")){monsterimage.setImageResource(R.drawable.skeleton);}
        else if(type.equals("Dragon")){monsterimage.setImageResource(R.drawable.dragon);}
        else if(type.equals("Voidspawn")){monsterimage.setImageResource(R.drawable.voidspawn);}
        nameout.setText(name);
        typeout.setText(type);
        hpout.setText("HP: "+String.valueOf(hp));
        mpout.setText("MP: "+String.valueOf(mp));
        patkout.setText("patk: "+String.valueOf(patk));
        pdefout.setText("pdef: "+String.valueOf(pdef));
        evaout.setText("eva: "+String.valueOf(eva));
        matkout.setText("matk: "+String.valueOf(matk));
        mdefout.setText("mdef: "+String.valueOf(mdef));
    }
}
