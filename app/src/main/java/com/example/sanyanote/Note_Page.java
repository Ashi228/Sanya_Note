package com.example.sanyanote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.util.Arrays;

public class Note_Page extends AppCompatActivity {
    private static final String TAG = "Note_Page";
    String getEditText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_page);
        Log.d(TAG, "onCreate: started.");

        EditText editText = findViewById(R.id.editTextNotePage);
        editText.requestFocus();
        editText.setText(getEditText);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        getEditText = editText.getText().toString();
    }
}