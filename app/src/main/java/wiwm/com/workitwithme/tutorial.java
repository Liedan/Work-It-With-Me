package wiwm.com.workitwithme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToTest(View v) {
        setContentView(R.layout.test_selection);
    }

    public void goToAlg2Test(View v) {
        setContentView(R.layout.alg2_question_1);

        TextView question1TextView = (TextView) findViewById(R.id.question1_text_view);
        //question1TextView.setText(Html.fromHtml("r<sup>3m</sup>/r<sup>-m</sup>t<sup>4n"));
        question1TextView.setText("1/2 2/5");

    }

    public void goToAlg2Breif(View v) {
        setContentView(R.layout.alg2_breif);
    }

    public void goToTestSelection(View v) {
        setContentView(R.layout.test_selection);
    }
}
