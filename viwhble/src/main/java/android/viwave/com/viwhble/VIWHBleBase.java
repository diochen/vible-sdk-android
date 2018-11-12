package android.viwave.com.viwhble;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;


/**
 * this interface is used for base BLE control<br/>
 * 1. scan device<br/>
 * 2. connect device<br/>
 * 3. monitor device state changed。<br/>
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */

public class VIWHBleBase {
    private static final String TAG = "VIWHBleBase";

    public VIWHBleBase(){
    }

    /**
     * get SDK version string
     * @return SDK version
     */
    public String sdkVersion(){
        return "1.0.0";
    }

    /**
     * this function is used for init {@link VIWHBleBase}
     * @return 傳回自己(TODO)(是否需要? 還是回傳並不一定是VIWHBleBase?)。
     */
    public Object init(){
        return this;
    }

    /**
     * this function is used for init {@link VIWHBleBase}
     * @param aBleDevice CPeripheral name, used for single device control
     * @return 傳回自己(TODO)(是否需要? 還是回傳並不一定是VIWHBleBase?)。
     */
    public Object initWithDevice(String aBleDevice){
        return this;
    }


    /**
     * this function is used for scan device
     * @param cb callback function, result of scanning
     */
    public void scanDevice(VIWHBleBaseCB cb){


        // for test asyn callback , remove blew when really implement
        //
        Timer timer = new Timer(true);
        final VIWHBleBaseCB callback = cb;
        timer.schedule(new TimerTask(){
            public void run(){
                callback.onDiscoverying("ble device", UUID.fromString("00002415-0000-1000-8000-00805F9B34FB"));
                Log.d(TAG, "start callback");
            }
        },3*1000);
        Log.d(TAG, "scanDevice");
        //

        return;
    }

    /**
     * this function is used for stop scan device
     */
    public void stopScan(){
        return;
    }

    /**
     * this function is used for qurey device state
     * @param cb callback function
     */
    public void updateBleState(VIWHBleBaseCB cb){
        return;
    }


    /**
     * this function is used for connect device
     * @param peripheralUuid Device UUID
     * @param cb callback function
     */
    public void connectBleDevice(UUID peripheralUuid, VIWHBleBaseCB cb){
        return;
    }


    /**
     * this function is used for disconnect device
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     */
    public void stopConnect(Object peripheral){
        return;
    }
}
