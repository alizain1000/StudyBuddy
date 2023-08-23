package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class videocalling extends AppCompatActivity {
EditText code;
TextView join;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videocalling);

  code = findViewById(R.id.code);
  join = findViewById(R.id.join);


        URL server;

        try {
            server = new URL("https://meet.jit.si");

            JitsiMeetConferenceOptions defopt =
                    new JitsiMeetConferenceOptions.Builder()
                            .setServerURL(server)
                            .build();
            JitsiMeet.setDefaultConferenceOptions(defopt);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);

        }
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JitsiMeetConferenceOptions opt = new JitsiMeetConferenceOptions.Builder()
                        .setServerURL(server)
                        .setRoom(code.getText().toString())
                        .build();

                JitsiMeetActivity.launch(getApplicationContext(),opt);


            }
        });


    }
}













