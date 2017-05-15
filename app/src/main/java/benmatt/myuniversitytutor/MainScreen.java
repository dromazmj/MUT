package benmatt.myuniversitytutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainScreen extends AppCompatActivity {

    Button findTutorButton;
    EditText universityText, courseText, areaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        universityText = (EditText)findViewById(R.id.universityField);
        courseText     = (EditText)findViewById(R.id.courseField);
        areaText       = (EditText)findViewById(R.id.areaOfStudyField);

        findTutorButton = (Button)findViewById(R.id.findTutorButton);
        findTutorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (universityText.getText() != null && courseText.getText() != null)
                {
                    launchSearchResultActivity();
                }
            }
        });

    }

    private void launchSearchResultActivity()
    {
        Intent intent = new Intent(this, SearchResultActivity.class);
        startActivity(intent);
    }
}
