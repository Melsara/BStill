package solution.b_still.co.b_still;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String CODE_KEY = "code_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(getString(R.string.description));

        final Button submitButton = (Button) findViewById(R.id.submitButton);

        if (submitButton != null) {
            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goToResult(submitButton);
                }
            });
        }

    }

    public void goToResult(View view) {
        EditText inputCode = (EditText) findViewById(R.id.codeEditText);
        String inputCodeString = inputCode.getText().toString();
        Intent result = new Intent(this, Result.class);
        Bundle bundle = new Bundle();
        bundle.putString(CODE_KEY, inputCodeString);
        result.putExtras(bundle);
        startActivity(result);
    }
}
