package android.viwave.com.viwhblesample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.viwave.com.viwhble.*;

import java.util.Map;
import java.util.UUID;

public class MainActivity extends AppCompatActivity implements VIWHBleBaseCB {

    private VIWHBleBase bleBase;
    private VIWHBleBaseCB callback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        callback = this;
        this.bleBase = (VIWHBleBase)(new VIWHBleBase()).initWithDevice("testDevice");
        this.bleBase.updateBleState(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bleBase.scanDevice(callback);
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
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


    public void call(){

    }

    @Override
    public void onDiscoverying(String peripheralName, UUID peripheralUuid) {

    }

    @Override
    public void onStateUnknown() {

    }

    @Override
    public void onStateResetting() {

    }

    @Override
    public void onStateUnsupported() {

    }

    @Override
    public void onStateUnauthorized() {

    }

    @Override
    public void onStatePoweredOff() {

    }

    @Override
    public void onStatePoweredOn() {

    }

    @Override
    public void connectedBleReady(Object peripheral) {

    }

    @Override
    public void connectedBleFail(Object peripheral, String error) {

    }

    @Override
    public void didDisconnectPeripheral(Object peripheral, String error) {

    }

    @Override
    public void centralWillRestoreState(Map dict) {

    }
}
