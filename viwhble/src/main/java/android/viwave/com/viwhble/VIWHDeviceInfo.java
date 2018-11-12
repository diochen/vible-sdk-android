package android.viwave.com.viwhble;

/**
 * this interface is used for device information
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */
public class VIWHDeviceInfo {
    private static final String TAG = "VIWHDeviceInfo";

    public VIWHDeviceInfo(){
    }

    /**
     * this function is used for query firmware revision
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getFirmwareRev(Object peripheral, VIWHDeviceInfoCB cb){
        return ;
    }



    /**
     * this function is used for query hardware revision
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getHardwareRev(Object peripheral, VIWHDeviceInfoCB cb){
        return ;
    }


    /**
     * this function is used for query manufacture name
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getManufacturerName(Object peripheral, VIWHDeviceInfoCB cb){
        return ;
    }


    /**
     * this function is used for query module number
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getModelNumber(Object peripheral, VIWHDeviceInfoCB cb){
        return ;
    }


    /**
     * this function is used for querying BLE device mac address
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getMacAddress(Object peripheral, VIWHDeviceInfoCB cb){
        return ;
    }

}

