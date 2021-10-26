package com.candelatech.todo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button addButton;
    EditText inputText;
    ListView todoList;
    ArrayList<String> list;

    public void onAdditems(View view){
        String text = inputText.getText().toString();
        list.add(text);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);

        todoList.setAdapter(adapter);
        inputText.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = findViewById(R.id.add);
        inputText = findViewById(R.id.inputText);
        todoList = findViewById(R.id.listView);
        list = new ArrayList<>();

    }
}