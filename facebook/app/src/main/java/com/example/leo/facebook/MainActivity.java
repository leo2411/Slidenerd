package com.example.leo.facebook;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.emailedittext);
        Button confrim = (Button)findViewById(R.id.button);

        confrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                final String edittext1=editText.getText().toString();
                Toast.makeText(MainActivity.this,edittext1 + "\n login in ...",Toast.LENGTH_LONG).show();
            }
        });



    }

}
