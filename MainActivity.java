package com.example.alensh.implicitintentproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Process(View v){
        Intent i = null;
            Intent  chooser=null;

        if(v.getId()==R.id.launchMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:27.70169,85.3206"));

            startActivity(Intent.createChooser(i,"Launch Map"));
        }
        if(v.getId()==R.id.launchMarket){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("market://details?id=com.rovio.abmatch3"));
            startActivity(i);
        }
        if(v.getId()==R.id.sendMail){
            String reciepnt[] ={"alensh.am12@gmail.com","abc@gmail.com"};
            i = new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL,reciepnt);
            i.putExtra(Intent.EXTRA_SUBJECT, "hi this is a test");
            i.putExtra(Intent.EXTRA_TEXT,"Text message");
            i.setType("message/rfc2");
            startActivity(i);
        }

    }
}
