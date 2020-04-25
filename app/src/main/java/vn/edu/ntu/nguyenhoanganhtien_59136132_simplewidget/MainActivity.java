package vn.edu.ntu.nguyenhoanganhtien_59136132_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    TextView TV1,TV2,TV3,TV4,TV5;
    EditText edtT, edtNS, edtSTK;
    RadioGroup rdGT;
    CheckBox cbXP, cbNN,  cbCF, cb1, cbNA;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews() {
        edtT = findViewById(R.id.edtT);
        edtNS = findViewById(R.id.edtNS);
        edtSTK = findViewById(R.id.edtSTK);
        rdGT = findViewById(R.id.rdGT);
        cbXP = findViewById(R.id.cbXP);
        cbNN = findViewById(R.id.cbNN);
        cbCF = findViewById(R.id.cbCF);
        cb1 = findViewById(R.id.cb1);
        cbNA = findViewById(R.id.cbNA);
        button = findViewById(R.id.button);
    }

    private void addEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }

    private void show() {
        String mesage = edtT.getText()+"\n"+"Ngày sinh: "+edtNS.getText()+"\n";
        switch (rdGT.getCheckedRadioButtonId()) {
            case R.id.rdNam:
                mesage = mesage + "Giới tính: Nam"+"\n"+"Sở thích: ";
                break;
            case R.id.rdNu:
                mesage = mesage + "Giới tính: Nữ"+"\n"+"Sở thích: ";
                break;
        }
        if(cbXP.isChecked()) {
            mesage = mesage + cbXP.getText() + "; ";
        }
        if(cbNN.isChecked()) {
            mesage = mesage + cbNN.getText() + "; ";
        }
        if(cbCF.isChecked()) {
            mesage = mesage + cbCF.getText() + "; ";
        }
        if(cb1.isChecked()) {
            mesage = mesage + cb1.getText() + "; ";
        }
        if(cbNA.isChecked()) {
            mesage = mesage + cbNA.getText() + "; ";
        }
        mesage = mesage + edtSTK.getText();
        Toast toast=Toast.makeText(getApplicationContext(),mesage,Toast.LENGTH_LONG);
        View view=toast.getView();
        TextView view1 =(TextView)view.findViewById(android.R.id.message);
        view1.setTextColor(Color.WHITE);
        view.setBackgroundResource(R.color.colorMessage);
        toast.show();

    }
}
