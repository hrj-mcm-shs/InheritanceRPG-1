package moreno.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Result extends AppCompatActivity {
    TextView nameout,jobout, hpout,mpout,lvlout,
            strout,agiout,intout,patkout,pdefout,
            evaout,matkout,mdefout;
    ImageView charimage;
    int levelhero;
    String hclass,hname,job;
    double hp,mp,patk,matk,pdef,mdef,str,agi,inte,eva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        charimage=findViewById(R.id.charImage2);
        nameout=findViewById(R.id.nameout);
        jobout=findViewById(R.id.classout);
        hpout=findViewById(R.id.hpout);
        mpout=findViewById(R.id.mpout);
        lvlout=findViewById(R.id.levelout);
        strout=findViewById(R.id.strout);
        agiout=findViewById(R.id.agiout);
        intout=findViewById(R.id.intout);
        patkout=findViewById(R.id.patkout);
        pdefout=findViewById(R.id.pdefout);
        evaout=findViewById(R.id.evaout);
        matkout=findViewById(R.id.matkout);
        mdefout=findViewById(R.id.mdefout);
        DecimalFormat df = new DecimalFormat("#.##");
        job=getIntent().getStringExtra("job");
        hclass=getIntent().getStringExtra("hclass");
        hname=getIntent().getStringExtra("name");
        hp=getIntent().getDoubleExtra("hp",0);
        mp=getIntent().getDoubleExtra("mp",0);
        patk=Double.parseDouble(df.format(getIntent().getDoubleExtra("patk",0)));
        matk=Double.parseDouble(df.format(getIntent().getDoubleExtra("matk",0)));
        pdef=Double.parseDouble(df.format(getIntent().getDoubleExtra("pdef",0)));
        mdef=Double.parseDouble(df.format(getIntent().getDoubleExtra("mdef",0)));
        str=getIntent().getDoubleExtra("str",0);
        agi=getIntent().getDoubleExtra("agi",0);
        inte=getIntent().getDoubleExtra("inte",0);
        eva=Double.parseDouble(df.format(getIntent().getDoubleExtra("eva",0)));
        levelhero=getIntent().getIntExtra("level",0);
        if(hclass.equals("Warrior")){
            charimage.setImageResource(R.drawable.warrior);
        }
        else if(hclass.equals("Rogue")){
            charimage.setImageResource(R.drawable.rogue);
        }
        else if(hclass.equals("Mage")){
            charimage.setImageResource(R.drawable.mage);
        }
        else if(hclass.equals("Cleric")){
            charimage.setImageResource(R.drawable.cleric);
        }
        else if(hclass.equals("Slayer")){
            charimage.setImageResource(R.drawable.slayer);
        }
        nameout.setText(hname);
        jobout.setText(job);
        hpout.setText("HP: "+String.valueOf(hp));
        mpout.setText("MP: "+String.valueOf(mp));
        lvlout.setText("Level: "+String.valueOf(levelhero));
        strout.setText("Str: "+String.valueOf(str));
        agiout.setText("agi: "+String.valueOf(agi));
        intout.setText("int: "+String.valueOf(inte));
        patkout.setText("patk: "+String.valueOf(patk));
        pdefout.setText("pdef: "+String.valueOf(pdef));
        evaout.setText("eva: "+String.valueOf(eva));
        matkout.setText("matk: "+String.valueOf(matk));
        mdefout.setText("mdef: "+String.valueOf(mdef));


    }
}
