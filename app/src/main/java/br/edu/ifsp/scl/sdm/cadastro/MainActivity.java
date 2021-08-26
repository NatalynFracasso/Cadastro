package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox checkBox;
    private RadioButton MasculinoRb;
    private RadioButton FemininoRb;
    private EditText cidadeEt;
    private Spinner lista_uf;
    private Button buttonsalvar;
    private Button buttonlimpar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener Salvar = new OnClickListener() {

            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();

                sb.append(nomeEt.getText().toString());
                sb.append('\n');

                sb.append(telefoneEt.getText().toString());
                sb.append('\n');

                sb.append(emailEt.getText().toString());
                sb.append('\n');

                sb.append(checkBox.isChecked() ? "Ingressado" : "Não ingressado");
                sb.append('\n');

                sb.append(MasculinoRb.isChecked() ? "Masculino" : "Feminino");
                sb.append('\n');

                sb.append(cidadeEt.getText().toString());
                sb.append('\n');

                sb.append(((TextView) lista_uf.getSelectedView()).getText());
                sb.append('\n');


                Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
            }





        };

        OnClickListener Limpar = new OnClickListener() {

            @Override
            public void onClick(View view) {

                nomeEt.setText("");
                telefoneEt.setText("");
                emailEt.setText("");
                checkBox.setChecked(false);
                MasculinoRb.setChecked(true);
                cidadeEt.setText("");
                lista_uf.setSelection(0);

                Toast.makeText(getApplicationContext(), "Formulário limpo com sucesso", Toast.LENGTH_SHORT).show();
            }

        };

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        checkBox = findViewById(R.id.checkBox);
        MasculinoRb = findViewById(R.id.MasculinoRb);
        cidadeEt = findViewById(R.id.cidadeEt);
        lista_uf = findViewById(R.id.lista_uf);
        buttonsalvar = findViewById(R.id.buttonsalvar);
        buttonsalvar.setOnClickListener(Salvar);
        buttonlimpar = findViewById(R.id.buttonlimpar);
        buttonlimpar.setOnClickListener(Limpar);

    }


    @Override
    public void onClick(View v) {

    }
}




