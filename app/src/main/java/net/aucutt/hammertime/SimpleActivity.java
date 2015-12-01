package net.aucutt.hammertime;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SimpleActivity extends FragmentActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_simple);
        FirstFragment newFragment = new FirstFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.damn_fragment, newFragment);
        //  transaction.show( newFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();

    }

    public void onFragClick(View v){

       // FirstFragment newFragment = new FirstFragment();
        SecondFragment newFragment = new SecondFragment();
       // super.setTheme( R.style.TransTheme );
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
       transaction.replace(R.id.damn_fragment, newFragment);
      //  transaction.show( newFragment);
       transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
    }



    public void onSecondFragClick( View v){
        FirstFragment newFragment = new FirstFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.damn_fragment, newFragment);
        //  transaction.show( newFragment);
        transaction.addToBackStack(null);
    }


}
