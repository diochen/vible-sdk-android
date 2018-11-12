package android.viwave.com.viwhble;


/**
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */
public interface VIWHDeviceInfoCB {

    /**
     * this function is called while query device firmware revision success
     * @param firmwareRev fireware version
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetFirmwareRev(String firmwareRev, Object peripheral);


    /**
     * this function is called while query device firmware revision failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetFirmwareRevFailed(Object peripheral, Error error);


    /**
     * this function is called while query device hardware revision success
     * @param hardwareRev Hardware module version
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetHardwareRev(String hardwareRev, Object peripheral);


    /**
     * this function is called while query device hardware revision failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetHardwareRevFailed(Object peripheral, Error error);



    /**
     * this function is called while query device manufacture name success
     * @param name manufacture name
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetManufacturerName(String name, Object peripheral);


    /**
     * this function is called while query device manufacture name failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetManufacturerNameFailed(Object peripheral, Error error);



    /**
     *
     * this function is called while query module number success
     * @param modelNumber module number
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetModelNumber(String modelNumber, Object peripheral);


    /**
     * this function is called while query module number failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetModelNumberFailed(Object peripheral, Error error);



    /**
     *
     * this function is called while query device mac address success
     * @param macAddress LE id
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetMacAddress(String macAddress, Object peripheral);


    /**
     * this function is called while query device mac address failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetMacAddressFailed(Object peripheral, Error error);
}
