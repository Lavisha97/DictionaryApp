package com.example.lenovo.dic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WordDefinitionDetailActivity extends Activity {

    TextView wordTextView;
    TextView definitionTextView;
    Button bf , bb;
    int i=0 , j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_definition_detail);
        wordTextView=(TextView) findViewById(R.id.wordTextView);
        definitionTextView=(TextView) findViewById(R.id.definitionTextView);

        Log.d("DICTIONARY", "third activity started");



        wordTextView.setText(getIntent().getStringExtra("word"));
        definitionTextView.setText(getIntent().getStringExtra("definition"));

        bf = (Button) findViewById(R.id.button);
        bb = (Button) findViewById(R.id.button3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.word_definition_detail, menu);
        return true;
    }

    }
