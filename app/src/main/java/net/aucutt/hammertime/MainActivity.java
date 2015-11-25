package net.aucutt.hammertime;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
     //   toolbar.setBackground(getResources().getDrawable(R.color.transparent));
        System.out.println("fuck " + getWindow().getStatusBarColor()) ;
      //getWindow().setStatusBarColor(  Color.TRANSPARENT);
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //window.setStatusBarColor(this.getResources().getColor(R.color.transparent));
        System.out.println(  "fuck "  +   getWindow().getStatusBarColor() ) ;
        FrameLayout frameLayout = (FrameLayout) findViewById( R.id.theframe);
        Drawable d = getResources().getDrawable(R.drawable.ripple_or_grey);
        Drawable f = getResources().getDrawable(R.drawable.hammer);
        ImageView iv = (ImageView)  findViewById(R.id.nestedimageview);
       // frameLayout.setBackground( d);

        iv.setImageDrawable( f);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onNextThing( View v){
        Intent theNext = new Intent( this, Main2Activity.class);
        startActivity( theNext);
    }
    public void onSimple( View v){
        Intent theSimple = new Intent( this, SimpleActivity.class);
        startActivity( theSimple );
    }
}
