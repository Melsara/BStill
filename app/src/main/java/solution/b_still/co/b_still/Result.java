package solution.b_still.co.b_still;

import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static solution.b_still.co.b_still.MainActivity.CODE_KEY;

public class Result extends AppCompatActivity {

    String inputCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent result = getIntent();
        final Bundle bundle = result.getExtras();
        inputCode = bundle.getString(CODE_KEY);

        ImageView resultView = findViewById(R.id.resultColor);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        final Button goToGraph = (Button) findViewById(R.id.goToGraph);

        descriptionTextView.setText(getString(R.string.levelOfStressResult));


        if (inputCode.equals("159")) {
            resultView.setImageDrawable(getDrawable(R.drawable.low));
            resultTextView.setText(getString(R.string.levelOfStressResultLow));
        } else if (inputCode.equals("357")) {
            resultView.setImageDrawable(getDrawable(R.drawable.med));
            resultTextView.setText(getString(R.string.levelOfStressResultMedium));
        }

        else {
            resultView.setImageDrawable(getDrawable(R.drawable.high));
            resultTextView.setText(getString(R.string.levelOfStressResultHigh));
        }

        if (goToGraph != null ) {
            goToGraph.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goToGraph(goToGraph);
                }
            });
        }
    }

    public void goToGraph (View view) {
        Intent goToGraph = new Intent(this, Graph.class);
        startActivity(goToGraph);
    }
}
