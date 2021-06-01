package com.example.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslate;
    TextView tvTranslate2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslate = findViewById(R.id.tvTranslate);
        tvTranslate2 = findViewById(R.id.tvTranslate2);
        registerForContextMenu(tvTranslate);
        registerForContextMenu(tvTranslate2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.english){
            tvTranslate.setText("Hello");
            tvTranslate2.setText("Bye");
            return true;
        }else if(item.getItemId()==R.id.italian){
            tvTranslate.setText("Ciao");
            tvTranslate2.setText("Addio");
            return true;
        }

        return super.onContextItemSelected(item);
    }
}