package s.esc.somar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView resultadoSoma;
        TextView resultadoMULTIPLICAR;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_soma);
         resultadoSoma= (TextView) findViewById(R.id.resultadoSoma);
         resultadoMULTIPLICAR= (TextView) findViewById(R.id.resultadoMULTIPLICAR);


        Intent intent = getIntent();
        String sum = (String) intent.getSerializableExtra("SOMAR");
        String mul = (String) intent.getSerializableExtra("MULTIPLICAR");
        resultadoSoma.setText(sum);
        resultadoMULTIPLICAR.setText(mul);

    }
}
