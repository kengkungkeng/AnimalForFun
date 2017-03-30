package comsci.kengkung.animalforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton = (Button) findViewById(R.id.btnStart);
        final EditText editText = (EditText) findViewById(R.id.txtname);


        clickButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (editText.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Enter Your Name Please", Toast.LENGTH_SHORT).show();

                } else { nameString = editText.getText().toString().trim();
                    //Toast.makeText(getApplicationContext(), "Let's Go!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Hello "+nameString, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Game.class);
                    startActivity(intent);
                }
            }
        });
    }


}
