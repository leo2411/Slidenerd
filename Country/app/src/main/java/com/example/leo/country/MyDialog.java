package com.example.leo.country;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyDialog extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);



        Intent intent = getIntent();
        if(intent!=null)
        {
            int imageId = intent.getIntExtra("countryImage", R.drawable.croatia);
            String countryName = intent.getStringExtra("countryName");
            ImageView myImage = (ImageView)findViewById(R.id.MyDialogimage);
            myImage.setImageResource(imageId);
            TextView myText = (TextView) findViewById(R.id.MyDialogtextView);
            myText.setText("This flag belongs to "+countryName);
        }
    }

    public void closeDialog(View v)
    {
        finish();
    }

}
