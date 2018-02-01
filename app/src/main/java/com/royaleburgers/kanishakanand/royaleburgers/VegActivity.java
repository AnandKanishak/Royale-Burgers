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

public class veg extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";
    private double numberOfalootikki = 0.0;
    private double numberOfroyalveggie = 0.0;
    private double numberOfvegsurprise = 0.0;
    private double numberOfroyaleschezwan = 0.0;
    private double numberOfspicypaneer = 0.0;
    private double numberOfangrywhopper = 0.0;
    private double numberOfmaharajaveg = 0.0;
    private double costOfalootikki = 28.0;
    private double costOfroyalveggie = 55.0;
    private double costOfvegsurprise = 70.0;
    private double costOfroyaleschezwan = 99.0;
    private double costOfspicypaneer = 109.0;
    private double costOfangrywhopper = 129.0;
    private double costOfmaharajaveg = 150.0;
    private double cost = 0.00;
    public static String bill = "";
    public static double totalcost = 0.0;
    public String bill2 = "";
    public static SharedPreferences Prefs;
    public static final String MyPREFERENCES = "MyPrefs2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("veg","onCreate method running");
        setContentView(R.layout.activity_veg);
        Prefs = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed2 = Prefs.edit();

        String alootikki1 = Prefs.getString("alootikki",String.valueOf(numberOfalootikki));
        String royalveggie1 = Prefs.getString("royalveggie",String.valueOf(numberOfroyalveggie));
        String vegsurprise1 = Prefs.getString("vegsurprise",String.valueOf(numberOfvegsurprise));
        String royaleschezwan1 = Prefs.getString("royaleschezwan",String.valueOf(numberOfroyaleschezwan));
        String spicypaneer1 = Prefs.getString("spicypaneer",String.valueOf(numberOfspicypaneer));
        String angrywhopper1 = Prefs.getString("angrywhopper",String.valueOf(numberOfangrywhopper));
        String maharajaveg1 = Prefs.getString("maharajaveg",String.valueOf(numberOfmaharajaveg));
        ((TextView) findViewById(R.id.alootikkiQuantity)).setText(alootikki1); //.setText(String.valueOf(numberOfalootikki));
        ((TextView) findViewById(R.id.royalveggieQuantity)).setText(royalveggie1);
        ((TextView) findViewById(R.id.vegsurpriseQuantity)).setText(vegsurprise1);
        ((TextView) findViewById(R.id.royaleschezwanQuantity)).setText(royaleschezwan1);
        ((TextView) findViewById(R.id.spicypaneerQuantity)).setText(spicypaneer1);
        ((TextView) findViewById(R.id.angrywhopperQuantity)).setText(angrywhopper1);
        ((TextView) findViewById(R.id.maharajavegQuantity)).setText(maharajaveg1);
        ((TextView) findViewById(R.id.totalPrice)).setText(String.valueOf(cost));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        if (savedInstanceState != null){
            Log.v("veg:", "RestoreInstanceState");
            numberOfalootikki = savedInstanceState.getDouble("alootikki");
            TextView talootikki = (TextView) findViewById(R.id.alootikkiQuantity);
            talootikki.setText(String.valueOf(numberOfalootikki));
            numberOfroyalveggie = savedInstanceState.getDouble("royalveggie");
            TextView troyalveggie = (TextView) findViewById(R.id.royalveggieQuantity);
            troyalveggie.setText(String.valueOf(numberOfroyalveggie));
            numberOfvegsurprise = savedInstanceState.getDouble("vegsurprise");
            TextView tvegsurprise =(TextView) findViewById(R.id.vegsurpriseQuantity);
            tvegsurprise.setText(String.valueOf(numberOfvegsurprise));
            numberOfroyaleschezwan = savedInstanceState.getDouble("royaleschezwan");
            TextView troyaleschezwan =(TextView) findViewById(R.id.royaleschezwanQuantity);
            troyaleschezwan.setText(String.valueOf(numberOfroyaleschezwan));
            numberOfspicypaneer = savedInstanceState.getDouble("spicypaneer");
            TextView tspicypaneer =(TextView) findViewById(R.id.spicypaneerQuantity);
            tspicypaneer.setText(String.valueOf(numberOfspicypaneer));
            numberOfangrywhopper = savedInstanceState.getDouble("angrywhopper");
            TextView tangrywhopper =(TextView) findViewById(R.id.angrywhopperQuantity);
            tangrywhopper.setText(String.valueOf(numberOfangrywhopper));
            numberOfmaharajaveg = savedInstanceState.getDouble("maharajaveg");
            TextView tmaharajaveg =(TextView) findViewById(R.id.maharajavegQuantity);
            tmaharajaveg.setText(String.valueOf(numberOfmaharajaveg));
            cost = savedInstanceState.getDouble("totalPrice");
            TextView tcost = (TextView) findViewById(R.id.totalPrice);
            tcost.setText(String.valueOf(cost));
        }
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        Log.v("veg:", "SaveInstanceState");
        savedInstanceState.putDouble("alootikki", numberOfalootikki);
        savedInstanceState.putDouble("royalveggie",numberOfroyalveggie);
        savedInstanceState.putDouble("vegsurprise",numberOfvegsurprise);
        savedInstanceState.putDouble("royaleschezwan",numberOfroyaleschezwan);
        savedInstanceState.putDouble("spicypaneer", numberOfspicypaneer);
        savedInstanceState.putDouble("angrywhopper",numberOfangrywhopper);
        savedInstanceState.putDouble("maharajaveg", numberOfmaharajaveg);
        savedInstanceState.putDouble("totalPrice", cost);
    }


    @Override
    public void onStart(){
        super.onStart();
        numberOfalootikki = Double.valueOf(((TextView) findViewById(R.id.alootikkiQuantity)).getText().toString());
        numberOfroyalveggie = Double.valueOf(((TextView) findViewById(R.id.royalveggieQuantity)).getText().toString());
        numberOfvegsurprise = Double.valueOf(((TextView) findViewById(R.id.vegsurpriseQuantity)).getText().toString());
        numberOfroyaleschezwan = Double.valueOf(((TextView) findViewById(R.id.royaleschezwanQuantity)).getText().toString());
        numberOfspicypaneer = Double.valueOf(((TextView) findViewById(R.id.spicypaneerQuantity)).getText().toString());
        numberOfangrywhopper = Double.valueOf(((TextView) findViewById(R.id.angrywhopperQuantity)).getText().toString());
        numberOfmaharajaveg = Double.valueOf(((TextView) findViewById(R.id.maharajavegQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.v("veg", "onStop Method running");
        SharedPreferences.Editor ed3 = Prefs.edit();
        numberOfalootikki = Double.valueOf(((TextView) findViewById(R.id.alootikkiQuantity)).getText().toString());
        numberOfroyalveggie = Double.valueOf(((TextView) findViewById(R.id.royalveggieQuantity)).getText().toString());
        numberOfvegsurprise = Double.valueOf(((TextView) findViewById(R.id.vegsurpriseQuantity)).getText().toString());
        numberOfroyaleschezwan = Double.valueOf(((TextView) findViewById(R.id.royaleschezwanQuantity)).getText().toString());
        numberOfspicypaneer = Double.valueOf(((TextView) findViewById(R.id.spicypaneerQuantity)).getText().toString());
        numberOfangrywhopper = Double.valueOf(((TextView) findViewById(R.id.angrywhopperQuantity)).getText().toString());
        numberOfmaharajaveg = Double.valueOf(((TextView) findViewById(R.id.maharajavegQuantity)).getText().toString());
        cost = Double.valueOf(((TextView) findViewById(R.id.totalPrice)).getText().toString());
        ed3.putString("alootikki",String.valueOf(numberOfalootikki));
        ed3.putString("royalveggie", String.valueOf(numberOfroyalveggie));
        ed3.putString("vegsurprise", String.valueOf(numberOfvegsurprise));
        ed3.putString("royaleschezwan", String.valueOf(numberOfroyaleschezwan));
        ed3.putString("spicypaneer", String.valueOf(numberOfspicypaneer));
        ed3.putString("angrywhopper", String.valueOf(numberOfangrywhopper));
        ed3.putString("maharajaveg", String.valueOf(numberOfmaharajaveg));
        ed3.putString("TotalPrice", String.valueOf(cost));
        ed3.commit();
    }

    public void checkOut(View view){
        if (numberOfalootikki > 0) {
            veg.bill = veg.bill + "\nalootikki: " + numberOfalootikki + " = " + costOfalootikki*numberOfalootikki;
        }
        if (numberOfroyalveggie > 0)
            veg.bill = veg.bill + "\nroyalvegie: " + numberOfroyalveggie + " = " + costOfroyalveggie*numberOfroyalveggie;
        if (numberOfvegsurprise > 0)
            veg.bill = veg.bill + "\nvegsurprise: " + numberOfvegsurprise + " = " + costOfvegsurprise*numberOfvegsurprise;
        if (numberOfroyaleschezwan > 0)
            veg.bill = veg.bill + "\nroyaleschezwan: " + numberOfroyaleschezwan + " = " + costOfroyaleschezwan*numberOfroyaleschezwan;
        if (numberOfspicypaneer > 0)
            veg.bill = veg.bill + "\nspicypaneer: " + numberOfspicypaneer + " = " + costOfspicypaneer*numberOfspicypaneer;
        if (numberOfangrywhopper > 0)
            veg.bill = veg.bill + "\nangrywhopper: " + numberOfangrywhopper + " = " + costOfangrywhopper*numberOfangrywhopper;
        if (numberOfmaharajaveg > 0)
            veg.bill = veg.bill + "\nmaharajaveg: " + numberOfmaharajaveg + " = " + costOfmaharajaveg*numberOfmaharajaveg;
        veg.totalcost = veg.totalcost + cost;
        Log.v("Total Cost is ", String.valueOf(totalcost));
        Intent intent = new Intent(this,finalmapActivity.class);
        String bills = veg.bill;
        intent.putExtra(EXTRA_MESSAGE, bills);
        intent.putExtra(EXTRA_MESSAGE2, String.valueOf(totalcost));
        startActivity(intent);
    }


    public void PriceList(View view){
        Intent intent = new Intent(this, pricelist_vegActivity.class);
        startActivity(intent);
    }

    public void alootikkiInc(View view){
        numberOfalootikki +=1.0;
        TextView quantalootikkiView = (TextView) findViewById(R.id.alootikkiQuantity);
        String noOfalootikki = Double.toString(numberOfalootikki);
        quantalootikkiView.setText(noOfalootikki);
        TotalPrice();
    }
    public void alootikkiDec(View view) {
        if (numberOfalootikki > 0)
        {
            numberOfalootikki -= 1.0;
            TextView quantalootikkiView = (TextView) findViewById(R.id.alootikkiQuantity);
            String noOfalootikki = Double.toString(numberOfalootikki);
            quantalootikkiView.setText(noOfalootikki);
            TotalPrice();
        }
    }
    public void royalveggieInc(View view){
        numberOfroyalveggie += 1.0;
        TextView quantroyalveggieView = (TextView) findViewById(R.id.royalveggieQuantity);
        String noOfroyalveggie = Double.toString(numberOfroyalveggie);
        quantroyalveggieView.setText(noOfroyalveggie);
        TotalPrice();
    }
    public void royalveggieDec(View view) {
        if (numberOfroyalveggie > 0)
        {
            numberOfroyalveggie -= 1.0;
            TextView quantroyalveggieView = (TextView) findViewById(R.id.royalveggieQuantity);
            String noOfroyalveggie = Double.toString(numberOfroyalveggie);
            quantroyalveggieView.setText(noOfroyalveggie);
            TotalPrice();
        }
    }
    public void vegsurpriseInc(View view){
        numberOfvegsurprise += 1.0;
        TextView quantvegsurpriseView = (TextView) findViewById(R.id.vegsurpriseQuantity);
        String noOfvegsurprise = Double.toString(numberOfvegsurprise);
        quantvegsurpriseView.setText(noOfvegsurprise);
        TotalPrice();

    }
    public void vegsurpriseDec(View view) {
        if (numberOfvegsurprise > 0)
        {
            numberOfvegsurprise -= 1.0;
            TextView quantvegsurpriseView = (TextView) findViewById(R.id.vegsurpriseQuantity);
            String noOfvegsurprise = Double.toString(numberOfvegsurprise);
            quantvegsurpriseView.setText(noOfvegsurprise);
            TotalPrice();
        }
    }
    public void royaleschezwanInc(View view){

            numberOfroyaleschezwan += 1.0;
            TextView quantroyaleschezwanView = (TextView) findViewById(R.id.royaleschezwanQuantity);
            String noOfroyaleschezwan = Double.toString(numberOfroyaleschezwan);
            quantroyaleschezwanView.setText(noOfroyaleschezwan);
            TotalPrice();
    }

    public void royaleschezwanDec(View view) {
        if (numberOfroyaleschezwan > 0)
        {
            numberOfroyaleschezwan -= 1.0;
            TextView quantroyaleschezwanView = (TextView) findViewById(R.id.royaleschezwanQuantity);
            String noOfroyaleschezwan = Double.toString(numberOfroyaleschezwan);
            quantroyaleschezwanView.setText(noOfroyaleschezwan);
            TotalPrice();
        }
    }

    public void spicypaneerInc(View view) {
        numberOfspicypaneer += 1.0;
            TextView quantspicypaneerView = (TextView) findViewById(R.id.spicypaneerQuantity);
            String noOfspicypaneer = Double.toString(numberOfspicypaneer);
            quantspicypaneerView.setText(noOfspicypaneer);
            TotalPrice();

        }

    public void spicypaneerDec(View view) {
        if (numberOfspicypaneer > 0)
        {
            numberOfspicypaneer -= 1.0;
            TextView quantspicypaneerView = (TextView) findViewById(R.id.spicypaneerQuantity);
            String noOfspicypaneer = Double.toString(numberOfspicypaneer);
            quantspicypaneerView.setText(noOfspicypaneer);
            TotalPrice();
        }
    }

    public void angrywhopperInc(View view){
        numberOfangrywhopper += 1.0;
        TextView quantangrywhopperView = (TextView) findViewById(R.id.angrywhopperQuantity);
        String noOfangrywhopper = Double.toString(numberOfangrywhopper);
        quantangrywhopperView.setText(noOfangrywhopper);
        TotalPrice();

    }
    public void angrywhopperDec(View view) {
        if (numberOfangrywhopper > 0)
        {
            numberOfangrywhopper -= 1.0;
            TextView quantangrywhopperView = (TextView) findViewById(R.id.angrywhopperQuantity);
            String noOfangrywhopper = Double.toString(numberOfangrywhopper);
            quantangrywhopperView.setText(noOfangrywhopper);
            TotalPrice();
        }
    }

    public void maharajavegInc(View view){
        numberOfmaharajaveg += 1.0;
        TextView quantmaharajavegView = (TextView) findViewById(R.id.maharajavegQuantity);
        String noOfmaharajaveg = Double.toString(numberOfmaharajaveg);
        quantmaharajavegView.setText(noOfmaharajaveg);
        TotalPrice();

    }
    public void maharajavegDec(View view) {
        if (numberOfmaharajaveg > 0)
        {
            numberOfmaharajaveg -= 1.0;
            TextView quantmaharajavegView = (TextView) findViewById(R.id.maharajavegQuantity);
            String noOfmaharajaveg = Double.toString(numberOfmaharajaveg);
            quantmaharajavegView.setText(noOfmaharajaveg);
            TotalPrice();
        }
    }


    public void TotalPrice(){
        cost = numberOfalootikki*costOfalootikki + numberOfroyalveggie*costOfroyalveggie + numberOfvegsurprise*costOfvegsurprise + numberOfroyaleschezwan*costOfroyaleschezwan + numberOfspicypaneer*costOfspicypaneer + numberOfangrywhopper*costOfangrywhopper + numberOfmaharajaveg*costOfmaharajaveg;
        String totalCost = Double.toString(cost);
        TextView totalcostView = (TextView) findViewById(R.id.totalPrice);
        totalcostView.setText(totalCost);
    }


    public void reset(View view){
        numberOfalootikki = 0;
        numberOfroyalveggie = 0;
        numberOfvegsurprise = 0;
        numberOfroyaleschezwan = 0;
        numberOfspicypaneer=0;
        numberOfangrywhopper=0;
        numberOfmaharajaveg=0;
        cost = 0;
        TotalPrice();
        TextView quantalootikkiView = (TextView) findViewById(R.id.alootikkiQuantity);
        String noOfalootikki = Double.toString(numberOfalootikki);
        quantalootikkiView.setText(noOfalootikki);

        TextView quantroyalveggieView = (TextView) findViewById(R.id.royalveggieQuantity);
        String noOfroyalveggie = Double.toString(numberOfroyalveggie);
        quantroyalveggieView.setText(noOfroyalveggie);

        TextView quantvegsurpriseView = (TextView) findViewById(R.id.vegsurpriseQuantity);
        String noOfvegsurprise = Double.toString(numberOfvegsurprise);
        quantvegsurpriseView.setText(noOfvegsurprise);

        TextView quantroyaleschezwanView = (TextView) findViewById(R.id.royaleschezwanQuantity);
        String noOfroyaleschezwan = Double.toString(numberOfroyaleschezwan);
        quantroyaleschezwanView.setText(noOfroyaleschezwan);

        TextView quantspicypaneerView = (TextView) findViewById(R.id.spicypaneerQuantity);
        String noOfspicypaneer = Double.toString(numberOfspicypaneer);
        quantspicypaneerView.setText(noOfspicypaneer);

        TextView quantangrywhopperView = (TextView) findViewById(R.id.angrywhopperQuantity);
        String noOfangrywhopper = Double.toString(numberOfangrywhopper);
        quantangrywhopperView.setText(noOfangrywhopper);

        TextView quantmaharajavegView = (TextView) findViewById(R.id.maharajavegQuantity);
        String noOfmaharajaveg = Double.toString(numberOfmaharajaveg);
        quantmaharajavegView.setText(noOfmaharajaveg);
    }

    public void picalootikki(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewalootikki);
        imageView.setImageResource(R.drawable.alootikki);
    }

    public void picroyalveggie(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewroyalveggie);
        imageView.setImageResource(R.drawable.royalveggie);
    }

    public void picvegsurprise(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewvegsurprise);
        imageView.setImageResource(R.drawable.vegsurprise);
    }

    public void picroyaleschezwan(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewroyaleschezwan);
        imageView.setImageResource(R.drawable.royaleschezwan);
    }

    public void picspicypaneer(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewspicypaneer);
        imageView.setImageResource(R.drawable.spicypaneer);
    }

    public void picangrywhopper(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewangrywhopper);
        imageView.setImageResource(R.drawable.angrywhopper);
    }

    public void picmaharajaveg(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageViewmaharajaveg);
        imageView.setImageResource(R.drawable.maharajaveg);
    }


}




