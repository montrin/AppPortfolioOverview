package com.project0.monicatrink.project0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    final String STD_MESSAGE = "This button will launch my ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void createToast(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void showToastbtnSpotify(View view) {
        final Button button = (Button) findViewById(R.id.btnSpotify);
        createToast(STD_MESSAGE + button.getText() + " app");
    }

    public void showToastbtnScores(View view) {
        final Button button = (Button) findViewById(R.id.btnScores);
        createToast(STD_MESSAGE + button.getText() + " app");
    }
    public void showToastbtnLib(View view) {
        final Button button = (Button) findViewById(R.id.btnLib);
        createToast(STD_MESSAGE + button.getText() + " app");
    }
    public void showToastbtnBigger(View view) {
        final Button button = (Button) findViewById(R.id.btnBigger);
        createToast(STD_MESSAGE + button.getText() + " app");
    }
    public void showToastbtnXYZ(View view) {
        final Button button = (Button) findViewById(R.id.btnXYZ);
        createToast(STD_MESSAGE + button.getText() + " app");
    }
    public void showToastbtnCap(View view) {
        final Button button = (Button) findViewById(R.id.btnCap);
        createToast(STD_MESSAGE + button.getText() + " app");
    }
}
