package edu.cftic.loginmoderno;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText cajatextomail = (EditText)findViewById(R.id.cajamail);
        cajatextomail.setOnFocusChangeListener(new FocusListener(this));
    }
}
