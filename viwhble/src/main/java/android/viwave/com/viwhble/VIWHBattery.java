package android.viwave.com.viwhble;

/**
 * this interface is used for battery information
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */
public class VIWHBattery {
    private static final String TAG = "VIWHBattery";

    public VIWHBattery(){
    }

    /**
     * this function is used for querying BLE device battery level
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result.
     */
    public void getBatteryLevel(Object peripheral, VIWHBatteryCB cb){
        return ;
    }
}
