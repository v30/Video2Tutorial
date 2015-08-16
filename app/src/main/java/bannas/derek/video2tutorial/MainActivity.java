package bannas.derek.video2tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button answerYesButton, answerNoButton;
    private EditText usernameEdittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerYesButton = (Button) findViewById(R.id.buttonYes);
        answerNoButton = (Button) findViewById(R.id.buttonNo);
        usernameEdittext = (EditText) findViewById(R.id.usernameEditText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onYesButtonClick(View view) {
        String username = String.valueOf(usernameEdittext.getText());
        String yourYesResponse = "Great! Well done " + username;
        Toast.makeText(this, yourYesResponse, Toast.LENGTH_LONG).show();
    }

    public void onNoButtonClick(View view) {
        String username = String.valueOf(usernameEdittext.getText());
        String yourNoResponse = "Too bad " + username;
        Toast.makeText(this, yourNoResponse, Toast.LENGTH_LONG).show();
    }
}
