package com.arjuna.ageapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etumur;
    TextView txthasil;
    Button btnhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etumur = (EditText) findViewById(R.id.etumur);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btnhasil = (Button) findViewById(R.id.btnhasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numur = etumur.getText().toString();

                int aumur = Integer.parseInt(numur);

                if (aumur >=0 && aumur <= 5) {
                    txthasil.setText("Balita");
                } else if (aumur >=6 && aumur <= 12 ){
                    txthasil.setText("Anak Anak");
                }else if (aumur >=13 && aumur <= 21 ){
                    txthasil.setText("Remaja");
                }else if (aumur >=21 && aumur <= 50){
                    txthasil.setText("Dewasa");
                }else if (aumur >50 ){
                    txthasil.setText("Tua");
                }


            }
        });

    }
}
