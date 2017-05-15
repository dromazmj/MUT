package benmatt.myuniversitytutor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.MenuItem;
import android.view.LayoutInflater;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

import com.facebook.CallbackManager;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.LoginResult;
import com.facebook.FacebookException;
import com.facebook.FacebookCallback;

public class logon extends AppCompatActivity {

    Button logonButton, facebookLoginButton, createUserButton, createTutorButton;
    EditText userName, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userName = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        logonButton = (Button)findViewById(R.id.logonButton);
        logonButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (userName.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    launchMainScreenActivity();
                }
            }
        });


        createUserButton  = (Button)findViewById(R.id.createUserButton);
        createTutorButton = (Button)findViewById(R.id.createTutorButton);

        createUserButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                launchCreateUserActivity();
            }
        });

        createTutorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

            }
        });

        CallbackManager callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });
    }

    private void launchCreateTutorActivity()
    {
        //Intent intent = new Intent(this, MainScreen.class);
        //startActivity(intent);
    }

    private void launchCreateUserActivity()
    {
        Intent intent = new Intent(this, CreateUser.class);
        startActivity(intent);
    }

    private void launchMainScreenActivity()
    {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }


}
