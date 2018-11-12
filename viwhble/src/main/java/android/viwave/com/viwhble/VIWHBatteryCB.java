package android.viwave.com.viwhble;

public interface VIWHBatteryCB {
    /**
     * this function is called while query device battery level success
     * @param level Battery life level
     * @param  peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     */
    void onGetBatteryLevel(int level, Object peripheral);


    /**
     * this function is called while query device battery level failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param  error  If an error occurred, the cause of the failure.
     */
    void onGetBatteryLevelFailed(Object peripheral, Error error);
}
