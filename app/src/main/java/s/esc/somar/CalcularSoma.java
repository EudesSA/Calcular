package s.esc.somar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcularSoma extends AppCompatActivity {
    EditText valorA;
    EditText valorB;
    Button Calcular;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorA = (EditText) findViewById(R.id.valorA);
        valorB = (EditText) findViewById(R.id.valorB);
        Calcular = (Button) findViewById(R.id.bt_calcular);

    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(valorA.getText().toString());
        int valor2 = Integer.parseInt(valorB.getText().toString());
        Intent expliciIntent = new Intent(CalcularSoma.this, Resultado.class);
        expliciIntent.putExtra("SOMAR", valor1 + " + " + valor2 + " = " + (valor1 + valor2));
        expliciIntent.putExtra("MULTIPLICAR", valor1 + " x " + valor2 + " = " + (valor1 * valor2));

        startActivity(expliciIntent);

    }
}
