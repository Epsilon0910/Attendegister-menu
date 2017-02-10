package com.firstproject.minorproject.attendegister_beta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class AddSubjectActivity extends AppCompatActivity {
    EditText subject_name;
    CheckBox check_mon;
    CheckBox check_tue;
    CheckBox check_wed;
    CheckBox check_thu;
    CheckBox check_fri;
    Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);

        subject_name = (EditText) findViewById(R.id.editText2);
        check_mon = (CheckBox) findViewById(R.id.checkBox);
        check_tue = (CheckBox) findViewById(R.id.checkBox2);
        check_wed = (CheckBox) findViewById(R.id.checkBox3);
        check_thu = (CheckBox) findViewById(R.id.checkBox4);
        check_fri = (CheckBox) findViewById(R.id.checkBox5);
        submit_button = (Button) findViewById(R.id.button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = subject_name.getText().toString();
                Intent intent = new Intent(AddSubjectActivity.this, HomeActivity.class);
                intent.putExtra("subject_name", subject);
                startActivity(intent);
                finish();
            }
        });
    }
}