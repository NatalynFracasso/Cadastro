package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity, implements View.OnClickListener {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox checkBox;
    private RadioButton MasculinoRb;
    private RadioButton FemininoRb;
    private EditText cidadeEt;
    private Spinner lista_uf;
    private Button buttonlimpar;
    private Button buttonsalvar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        checkBox = findViewById(R.id.checkBox);
        MasculinoRb = findViewById(R.id.MasculinoRb);
        FemininoRb = findViewById(R.id.FemininoRb);
        cidadeEt = findViewById(R.id.cidadeEt);
        lista_uf = findViewById(R.id.lista_uf);
        buttonlimpar = findViewById(R.id.buttonlimpar);
        buttonsalvar = findViewById(R.id.buttonsalvar);

    }


    @Override
    public void onClick(View view){
        StringBuilder sb = new StringBuilder();
        sb.append(nomeEt.getText().toString());
        sb.append('\n');

    }



}




