package moreno.mcm.edu.ph.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button hButton,mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hButton=findViewById(R.id.herobutton);
        mButton=findViewById(R.id.monsterbutton);

        hButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hero = new Intent(MainActivity.this,HeroInput.class);
                startActivity(hero);
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monster = new Intent(MainActivity.this,MonsterInput.class);
                startActivity(monster);
            }
        });


    }
}
