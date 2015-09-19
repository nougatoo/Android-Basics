package com.example.brandon.learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class CreateWorkoutActivity extends AppCompatActivity {

    private String name = "nope";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_create_workout);
        Intent intent = getIntent();
        String message = intent.getStringExtra("asdf");
        name = message;
        setTitle(name);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_workout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //When this is called we are going to be adding exercies to monday
    public void createMonday(View view)
    {
        //Intent intent = new Intent(this, CreateWorkoutActivity.class).putExtra("day", 2);
        Intent intent = new Intent(this, CreateDayActivity.class).putExtra("day","Monday");
        startActivity(intent);
    }

    //When this is called we are going to be adding exercies to monday
    public void createTuesday(View view)
    {
        //Intent intent = new Intent(this, CreateWorkoutActivity.class).putExtra("day", 2);
        Intent intent = new Intent(this, CreateDayActivity.class).putExtra("day","Tuesday");
        startActivity(intent);
    }



}
