package com.vibh.myfirstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class TestActivity extends ActionBarActivity implements OnClickListener {


    Button btnclick;
    EditText user,pwd;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btnclick = (Button)findViewById(R.id.button);

        user = (EditText)findViewById(R.id.username);

        pwd = (EditText)findViewById(R.id.pwd);



       btnclick.setOnClickListener(this);


        //Some Minor Changes


    }


    @Override
    public void onClick(View v){


            if(user.getText().toString().equals("admin") && pwd.getText().toString().equals("123456")){

            intent = new Intent(this,HomeActivity.class);

            intent.putExtra("user",user.getText().toString()) ;

                startActivity(intent);



            }

else {

                Toast.makeText(this, "Inavlid Login Credentials", Toast.LENGTH_LONG).show();
            }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
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
}
