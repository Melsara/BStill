package solution.b_still.co.b_still;

import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        de.hdodenhof.circleimageview.CircleImageView resultView = findViewById(R.id.resultColor);
        if (inputCode.equals("159")) {
            resultView.setBackgroundColor(getColor(R.color.colorLow));
        } else if (inputCode.equals("357")) {
            resultView.setBackgroundColor(getColor(R.color.colorMedium));
        }

        else {
            resultView.setBackgroundColor(getColor(R.color.colorHigh));
        }
    }
}
