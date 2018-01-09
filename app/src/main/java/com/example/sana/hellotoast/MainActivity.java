package com.example.sana.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private int  mcount=0;
        private TextView mshowcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowcount = (TextView) findViewById(R.id.txtV);
    }
    public void countUp(View view) {
        mcount++;
        if (mshowcount!= null)
            mshowcount.setText(Integer.toString(mcount));
        if(mcount>20)
            mcount=0;
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }
}
