package com.royaleburgers.kanishakanand.royaleburgers;




    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.view.View;
    import android.widget.TextView;

    public class Main_menu extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
            Intent intent = getIntent();
            String message = "Welcome, ";
            message = message + intent.getStringExtra(veg.EXTRA_MESSAGE);
            TextView welcome = (TextView) findViewById(R.id.textViewWelcome);
            welcome.setText(message);
        }

        @Override
        public void onBackPressed(){
            super.onBackPressed();
            veg.Prefs = getSharedPreferences(veg.MyPREFERENCES, Context.MODE_PRIVATE);
            Non_VegActivity.Prefs = getSharedPreferences(Non_VegActivity.MyPREFERENCES, Context.MODE_PRIVATE);
            SharedPreferences.Editor ed2 = veg.Prefs.edit();
            SharedPreferences.Editor ed = Non_VegActivity.Prefs.edit();
            ed.clear();
            ed2.clear();
            ed.commit();
            ed2.commit();
            veg.bill = "";
        }

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
    }*/

        public void Veg(View view){
            Intent intent = new Intent(this, veg.class);
            startActivity(intent);
        }

        public void Non_Veg(View view) {
            Intent intent = new Intent(this, Non_VegActivity.class);
            startActivity(intent);
        }

    }


