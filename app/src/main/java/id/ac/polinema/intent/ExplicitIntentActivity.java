package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText usernameInput;
    private TextView outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        //  Deklarasi attribut untuk findViewById
        usernameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);
    }

    //Onclick button dari main
    public void handleSubmit(View view) {
//        Input
        String name = usernameInput.getText().toString();
//        Output
        outputText.setText(name);

    }

}
