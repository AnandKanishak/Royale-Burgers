package com.royaleburgers.kanishakanand.royaleburgers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Non_VegActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";
    private double numberOfmasalagrillchicken = 0.0;
    private double numberOffiletofish = 0.0;
    private double numberOfchickenroyale = 0.0;
    private double numberOfchickenschezwan = 0.0;
    private double numberOfspicychicken = 0.0;
    private double numberOfangrychickenwhopper = 0.0;
    private double numberOfchickenmaharaja = 0.0;
    private double costOfmasalagrillchicken = 35.0;
    private double costOffiletofish = 57.0;
    private double costOfchickenroyale = 70.0;
    private double costOfchickenschezwan = 109.0;
    private double costOfspicychicken = 119.0;
    private double costOfangrychickenwhopper = 142.0;
    private double costOfchickenmaharaja = 170.0;
    private double cost = 0.00;
    public static String bill = "";
    public static double totalcost = 0.0;
    public String bill2 = "";
    public static SharedPreferences Prefs;
    public static final String MyPREFERENCES = "MyPrefs2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("non_veg","onCreate method running");
        setContentView(R.layout.activity_non_veg);
        Prefs = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed2 = Prefs.edit();

        String masalagrillchicken1 = Prefs.getString("masalagrillchicken",String.valueOf(numberOfmasalagrillchicken));
        String filetofish1 = Prefs.getString("filetofish",String.valueOf(numberOffiletofish));
        String chickenroyale1 = Prefs.getString("chickenroyale",String.valueOf(numberOfchickenroyale));
        String chickenschezwan1 = Prefs.getString("chickenschezwan",String.valueOf(numberOfchickenschezwan));
        String spicychicken1 = Prefs.getString("spicychicken",String.valueOf(numberOfspicychicken));
        String angrychickenwhopper1 = Prefs.getString("angrychickenwhopper",String.valueOf(numberOfangrychickenwhopper));
        String chickenmaharaja1 = Prefs.getString("chickenmaharaja",String.valueOf(numberOfchickenmaharaja));
        ((TextView) findViewById(R.id.masalagrillchickenQuantity)).setText(masalagrillchicken1); //.setText(String.valueOf(numberOfalootikki));
        ((TextView) findViewById(R.id.filetofishQuantity)).setText(filetofish1);
        ((TextView) findViewById(R.id.chickenroyaleQuantity)).setText(chickenroyale1);
        ((TextView) findViewById(R.id.chickenschezwanQuantity)).setText(chickenschezwan1);
        ((TextView) findViewById(R.id.spicychickenQuantity)).setText(spicychicken1);
        ((TextView) findViewById(R.id.angrychickenwhopperQuantity)).setText(angrychickenwhopper1);
        ((TextView) findViewById(R.id.chickenmaharajaQuantity)).setText(chickenmaharaja1);
        ((TextView) findViewById(R.id.totalPrice)).setText(String.valueOf(cost));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        if (savedInstanceState != null){
            Log.v("non_veg:", "RestoreInstanceState");
            numberOfmasalagrillchicken = savedInstanceState.getDouble("masalagrillchicken");
            TextView tmasalagrillchicken = (TextView) findViewById(R.id.masalagrillchickenQuantity);
            tmasalagrillchicken.setText(String.valueOf(numberOfmasalagrillchicken));
            numberOffiletofish = savedInstanceState.getDouble("filetofish");
            TextView tfiletofish = (TextView) findViewById(R.id.filetofishQuantity);
            tfiletofish.setText(String.valueOf(numberOffiletofish));
            numberOfchickenroyale = savedInstanceState.getDouble("chickenroyale");
            TextView tchickenroyale =(TextView) findViewById(R.id.chickenroyaleQuantity);
            tchickenroyale.setText(String.valueOf(numberOfchickenroyale));
            numberOfchickenschezwan = savedInstanceState.getDouble("chickenschezwan");
            TextView tchickenschezwan =(TextView) findViewById(R.id.chickenschezwanQuantity);
            tchickenschezwan.setText(String.valueOf(numberOfchickenschezwan));
            numberOfspicychicken = savedInstanceState.getDouble("spicychicken");
            TextView tspicychicken =(TextView) findViewById(R.id.spicychickenQuantity);
            tspicychicken.setText(String.valueOf(numberOfspicychicken));
            numberOfangrychickenwhopper = savedInstanceState.getDouble("angrychickenwhopper");
            TextView tangrychickenwhopper =(TextView) findViewById(R.id.angrychickenwhopperQuantity);
            tangrychickenwhopper.setText(String.valueOf(numberOfangrychickenwhopper));
            numberOfchickenmaharaja = savedInstanceState.getDouble("chickenmaharaja");
            TextView tchickenmaharaja =(TextView) findViewById(R.id.chickenmaharajaQuantity);
            tchickenmaharaja.setText(String.valueOf(numberOfchickenmaharaja));
            cost = savedInstanceState.getDouble("totalPrice");
            TextView tcost = (TextView) findViewById(R.id.totalPrice);
            tcost.setText(String.valueOf(cost));
        }
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        Log.v("non_veg:", "SaveInstanceState");
        savedInstanceState.putDouble("masalagrillchicken", numberOfmasalagrillchicken);
        savedInstanceState.putDouble("filetofish",numberOffiletofish);
        savedInstanceState.putDouble("chickenroyale",numberOfchickenroyale);
        savedInstanceState.putDouble("chickenschezwan",numberOfchickenschezwan);
        savedInstanceState.putDouble("spicychicken", numberOfspicychicken);
        savedInstanceState.putDouble("angrychickenwhopper",numberOfangrychickenwhopper);
        savedInstanceState.putDouble("chickenmaharaja", numberOfchickenmaharaja);
        savedInstanceState.putDouble("totalPrice", cost);
    }


    @Override
    public void onStart(){
        super.onStart();
        numberOfmasalagrillchicken = Double.valueOf(((TextView) findViewById(R.id.masalagrillchickenQuantity)).getText().toString());
        numberOffiletofish = Double.valueOf(((TextView) findViewById(R.id.filetofishQuantity)).getText().toString());
        numberOfchickenroyale = Double.valueOf(((TextView) findViewById(R.id.chickenroyaleQuantity)).getText().toString());
        numberOfchickenschezwan = Double.valueOf(((TextView) findViewById(R.id.chickenschezwanQuantity)).getText().toString());
        numberOfspicychicken = Double.valueOf(((TextView) findViewById(R.id.spicychickenQuantity)).getText().toString());
        numberOfangrychickenwhopper = Double.valueOf(((TextView) findViewById(R.id.angrychickenwhopperQuantity)).getText().toString());
        numberOfchickenmaharaja = Double.valueOf(((TextView) findViewById(R.id.chickenmaharajaQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.v("non_veg", "onStop Method running");
        SharedPreferences.Editor ed3 = Prefs.edit();
        numberOfmasalagrillchicken = Double.valueOf(((TextView) findViewById(R.id.masalagrillchickenQuantity)).getText().toString());
        numberOffiletofish = Double.valueOf(((TextView) findViewById(R.id.filetofishQuantity)).getText().toString());
        numberOfchickenroyale = Double.valueOf(((TextView) findViewById(R.id.chickenroyaleQuantity)).getText().toString());
        numberOfchickenschezwan = Double.valueOf(((TextView) findViewById(R.id.chickenschezwanQuantity)).getText().toString());
        numberOfspicychicken = Double.valueOf(((TextView) findViewById(R.id.spicychickenQuantity)).getText().toString());
        numberOfangrychickenwhopper = Double.valueOf(((TextView) findViewById(R.id.angrychickenwhopperQuantity)).getText().toString());
        numberOfchickenmaharaja = Double.valueOf(((TextView) findViewById(R.id.chickenmaharajaQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
        ed3.putString("masalagrillchicken",String.valueOf(numberOfmasalagrillchicken));
        ed3.putString("filetofish", String.valueOf(numberOffiletofish));
        ed3.putString("chickenroyale", String.valueOf(numberOfchickenroyale));
        ed3.putString("chickenschezwan", String.valueOf(numberOfchickenschezwan));
        ed3.putString("spicychicken", String.valueOf(numberOfspicychicken));
        ed3.putString("angrychickenwhopper", String.valueOf(numberOfangrychickenwhopper));
        ed3.putString("chickenmaharaja", String.valueOf(numberOfchickenmaharaja));
        ed3.putString("TotalPrice", String.valueOf(cost));
        ed3.commit();
    }

    public void checkOut(View view){
        if (numberOfmasalagrillchicken > 0) {
            Non_VegActivity.bill = Non_VegActivity.bill + "\nmasalagrillchicken: " + numberOfmasalagrillchicken + " = " + costOfmasalagrillchicken*numberOfmasalagrillchicken;
        }
        if (numberOffiletofish > 0)
            Non_VegActivity.bill = Non_VegActivity.bill + "\nfiletofish: " + numberOffiletofish + " = " + costOffiletofish*numberOffiletofish;
        if (numberOfchickenroyale > 0)
            Non_VegActivity.bill = Non_VegActivity.bill + "\nchickenroyale: " + numberOfchickenroyale + " = " + costOfchickenroyale*numberOfchickenroyale;
        if (numberOfchickenschezwan > 0)
            Non_VegActivity.bill = Non_VegActivity.bill + "\nchickenschezwan: " + numberOfchickenschezwan + " = " + costOfchickenschezwan*numberOfchickenschezwan;
        if (numberOfspicychicken > 0)
            Non_VegActivity.bill = Non_VegActivity.bill + "\nspicychicken: " + numberOfspicychicken + " = " + costOfspicychicken*numberOfspicychicken;
        if (numberOfangrychickenwhopper > 0)
            Non_VegActivity.bill = Non_VegActivity.bill + "\nangrychickenwhopper: " + numberOfangrychickenwhopper + " = " + costOfangrychickenwhopper*numberOfangrychickenwhopper;
        if (numberOfchickenmaharaja > 0)
            Non_VegActivity.bill = Non_VegActivity.bill + "\nchickenmaharaja: " + numberOfchickenmaharaja + " = " + costOfchickenmaharaja*numberOfchickenmaharaja;
        Non_VegActivity.totalcost = Non_VegActivity.totalcost + cost;
        Log.v("Total Cost is ", String.valueOf(totalcost));
        Intent intent = new Intent(this,finalmapActivity.class);
        String bills = Non_VegActivity.bill;
        intent.putExtra(EXTRA_MESSAGE, bills);
        intent.putExtra(EXTRA_MESSAGE2, String.valueOf(totalcost));
        startActivity(intent);
    }


    public void PriceList(View view){
        Intent intent = new Intent(this, pricelist_non_vegActivity.class);
        startActivity(intent);
    }

    public void masalagrillchickenInc(View view){
        numberOfmasalagrillchicken +=1.0;
        TextView quantmasalagrillchickenView = (TextView) findViewById(R.id.masalagrillchickenQuantity);
        String noOfmasalagrillchicken = Double.toString(numberOfmasalagrillchicken);
        quantmasalagrillchickenView.setText(noOfmasalagrillchicken);
        TotalPrice();
    }
    public void masalagrillchickenDec(View view) {
        if (numberOfmasalagrillchicken > 0)
        {
            numberOfmasalagrillchicken -= 1.0;
            TextView quantmasalagrillchickenView = (TextView) findViewById(R.id.masalagrillchickenQuantity);
            String noOfmasalagrillchicken = Double.toString(numberOfmasalagrillchicken);
            quantmasalagrillchickenView.setText(noOfmasalagrillchicken);
            TotalPrice();
        }
    }
    public void filetofishInc(View view){
        numberOffiletofish += 1.0;
        TextView quantfiletofishView = (TextView) findViewById(R.id.filetofishQuantity);
        String noOffiletofish = Double.toString(numberOffiletofish);
        quantfiletofishView.setText(noOffiletofish);
        TotalPrice();
    }
    public void filetofishDec(View view) {
        if (numberOffiletofish > 0)
        {
            numberOffiletofish -= 1.0;
            TextView quantfiletofishView = (TextView) findViewById(R.id.filetofishQuantity);
            String noOffiletofish = Double.toString(numberOffiletofish);
            quantfiletofishView.setText(noOffiletofish);
            TotalPrice();
        }
    }
    public void chickenroyaleInc(View view){
        numberOfchickenroyale += 1.0;
        TextView quantchickenroyaleView = (TextView) findViewById(R.id.chickenroyaleQuantity);
        String noOfchickenroyale = Double.toString(numberOfchickenroyale);
        quantchickenroyaleView.setText(noOfchickenroyale);
        TotalPrice();

    }
    public void chickenroyaleDec(View view) {
        if (numberOfchickenroyale > 0)
        {
            numberOfchickenroyale -= 1.0;
            TextView quantchickenroyaleView = (TextView) findViewById(R.id.chickenroyaleQuantity);
            String noOfchickenroyale = Double.toString(numberOfchickenroyale);
            quantchickenroyaleView.setText(noOfchickenroyale);
            TotalPrice();
        }
    }
    public void chickenschezwanInc(View view){

        numberOfchickenschezwan += 1.0;
        TextView quantchickenschezwanView = (TextView) findViewById(R.id.chickenschezwanQuantity);
        String noOfchickenschezwan = Double.toString(numberOfchickenschezwan);
        quantchickenschezwanView.setText(noOfchickenschezwan);
        TotalPrice();
    }

    public void chickenschezwanDec(View view) {
        if (numberOfchickenschezwan > 0)
        {
            numberOfchickenschezwan -= 1.0;
            TextView quantchickenschezwanView = (TextView) findViewById(R.id.chickenschezwanQuantity);
            String noOfchickenschezwan = Double.toString(numberOfchickenschezwan);
            quantchickenschezwanView.setText(noOfchickenschezwan);
            TotalPrice();
        }
    }

    public void spicychickenInc(View view) {
        numberOfspicychicken += 1.0;
        TextView quantspicychickenView = (TextView) findViewById(R.id.spicychickenQuantity);
        String noOfspicychicken = Double.toString(numberOfspicychicken);
        quantspicychickenView.setText(noOfspicychicken);
        TotalPrice();

    }

    public void spicychickenDec(View view) {
        if (numberOfspicychicken > 0)
        {
            numberOfspicychicken -= 1.0;
            TextView quantspicychickenView = (TextView) findViewById(R.id.spicychickenQuantity);
            String noOfspicychicken = Double.toString(numberOfspicychicken);
            quantspicychickenView.setText(noOfspicychicken);
            TotalPrice();
        }
    }

    public void angrychickenwhopperInc(View view){
        numberOfangrychickenwhopper += 1.0;
        TextView quantangrychickenwhopperView = (TextView) findViewById(R.id.angrychickenwhopperQuantity);
        String noOfangrychickenwhopper = Double.toString(numberOfangrychickenwhopper);
        quantangrychickenwhopperView.setText(noOfangrychickenwhopper);
        TotalPrice();

    }
    public void angrychickenwhopperDec(View view) {
        if (numberOfangrychickenwhopper > 0)
        {
            numberOfangrychickenwhopper -= 1.0;
            TextView quantangrychickenwhopperView = (TextView) findViewById(R.id.angrychickenwhopperQuantity);
            String noOfangrychickenwhopper = Double.toString(numberOfangrychickenwhopper);
            quantangrychickenwhopperView.setText(noOfangrychickenwhopper);
            TotalPrice();
        }
    }

    public void chickenmaharajaInc(View view){
        numberOfchickenmaharaja += 1.0;
        TextView quantchickenmaharajaView = (TextView) findViewById(R.id.chickenmaharajaQuantity);
        String noOfchickenmaharaja = Double.toString(numberOfchickenmaharaja);
        quantchickenmaharajaView.setText(noOfchickenmaharaja);
        TotalPrice();

    }
    public void chickenmaharajaDec(View view) {
        if (numberOfchickenmaharaja > 0)
        {
            numberOfchickenmaharaja -= 1.0;
            TextView quantchickenmaharajaView = (TextView) findViewById(R.id.chickenmaharajaQuantity);
            String noOfchickenmaharaja = Double.toString(numberOfchickenmaharaja);
            quantchickenmaharajaView.setText(noOfchickenmaharaja);
            TotalPrice();
        }
    }


    public void TotalPrice(){
        cost = numberOfmasalagrillchicken*costOfmasalagrillchicken + numberOffiletofish*costOffiletofish + numberOfchickenroyale*costOfchickenroyale + numberOfchickenschezwan*costOfchickenschezwan + numberOfspicychicken*costOfspicychicken + numberOfangrychickenwhopper*costOfangrychickenwhopper + numberOfchickenmaharaja*costOfchickenmaharaja;
        String totalCost = Double.toString(cost);
        TextView totalcostView = (TextView) findViewById(R.id.totalPrice);
        totalcostView.setText(totalCost);
    }


    public void reset(View view){
        numberOfmasalagrillchicken = 0;
        numberOffiletofish = 0;
        numberOfchickenroyale = 0;
        numberOfchickenschezwan = 0;
        numberOfspicychicken=0;
        numberOfangrychickenwhopper=0;
        numberOfchickenmaharaja=0;
        cost = 0;
        TotalPrice();
        TextView quantmasalagrillchickenView = (TextView) findViewById(R.id.masalagrillchickenQuantity);
        String noOfmasalagrillchicken = Double.toString(numberOfmasalagrillchicken);
        quantmasalagrillchickenView.setText(noOfmasalagrillchicken);

        TextView quantfiletofishView = (TextView) findViewById(R.id.filetofishQuantity);
        String noOffiletofish = Double.toString(numberOffiletofish);
        quantfiletofishView.setText(noOffiletofish);

        TextView quantchickenroyaleView = (TextView) findViewById(R.id.chickenroyaleQuantity);
        String noOfchickenroyale = Double.toString(numberOfchickenroyale);
        quantchickenroyaleView.setText(noOfchickenroyale);

        TextView quantchickenschezwanView = (TextView) findViewById(R.id.chickenschezwanQuantity);
        String noOfchickenschezwan = Double.toString(numberOfchickenschezwan);
        quantchickenschezwanView.setText(noOfchickenschezwan);

        TextView quantspicychickenView = (TextView) findViewById(R.id.spicychickenQuantity);
        String noOfspicychicken = Double.toString(numberOfspicychicken);
        quantspicychickenView.setText(noOfspicychicken);

        TextView quantangrychickenwhopperView = (TextView) findViewById(R.id.angrychickenwhopperQuantity);
        String noOfangrychickenwhopper = Double.toString(numberOfangrychickenwhopper);
        quantangrychickenwhopperView.setText(noOfangrychickenwhopper);

        TextView quantchickenmaharajaView = (TextView) findViewById(R.id.chickenmaharajaQuantity);
        String noOfchickenmaharaja = Double.toString(numberOfchickenmaharaja);
        quantchickenmaharajaView.setText(noOfchickenmaharaja);
    }

    public void picmasalagrillchicken(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewmasalagrillchicken);
        imageView.setImageResource(R.drawable.masalagrillchicken);
    }

    public void picfiletofish(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewfiletofish);
        imageView.setImageResource(R.drawable.filetofish);
    }

    public void picchickenroyale(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewchickenroyale);
        imageView.setImageResource(R.drawable.chickenroyale);
    }

    public void picchickenschezwan(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewchickenschezwan);
        imageView.setImageResource(R.drawable.chickenschezwan);
    }

    public void picspicychicken(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewspicychicken);
        imageView.setImageResource(R.drawable.spicychicken);
    }

    public void picangrychickenwhopper(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewangrychickenwhopper);
        imageView.setImageResource(R.drawable.angrychickenwhopper);
    }

    public void picchickenmaharaja(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewchickenmaharaja);
        imageView.setImageResource(R.drawable.chickenmaharaja);
    }


}

