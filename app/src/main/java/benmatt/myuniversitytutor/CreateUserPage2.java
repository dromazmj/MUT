package benmatt.myuniversitytutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.content.Intent;

public class CreateUserPage2 extends AppCompatActivity {

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_page2);
        Intent startingIntent = getIntent();

        //Connect to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        // Get a reference to the todoItems child items it the database
        final DatabaseReference myRef = database.getReference("Users");


        submitButton = (Button)findViewById(R.id.nextButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

            }
        });
    }


}
