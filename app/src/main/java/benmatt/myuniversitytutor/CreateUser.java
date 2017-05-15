package benmatt.myuniversitytutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity {

    Button nextButton;
    EditText firstName;
    EditText lastName;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        nextButton = (Button)findViewById(R.id.nextButton);
        firstName  = (EditText)findViewById(R.id.firstNameBox);
        lastName   = (EditText)findViewById(R.id.lastNameField);
        username   = (EditText)findViewById(R.id.usernameField);
        password   = (EditText)findViewById(R.id.passwordField);

        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                if (firstName.getText() != null && lastName.getText() != null
                        && username.getText() != null && password.getText() != null) {
                    launchCreateUser2Activity();
                }
            }
        });

    }

    private void launchCreateUser2Activity()
    {
        Intent intent = new Intent(this, CreateUserPage2.class);
        Bundle bundle = new Bundle();
        bundle.putString("first name", firstName.toString());
        bundle.putString("last name", lastName.toString());
        bundle.putString("username", username.toString());
        bundle.putString("password", password.toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
