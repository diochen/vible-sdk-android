package android.viwave.com.viwhble;


import java.util.Map;
import java.util.UUID;

/**
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */
public interface VIWHBleBaseCB {
    /**
     * the function is called while find new BLE device
     * @param peripheralName BLE device name
     * @param  peripheralUuid UUID
     */
    void onDiscoverying(String peripheralName, UUID peripheralUuid);


    /**
     * the function is called while device state change to unknown
     */
    void onStateUnknown();


    /**
     * the function is called while device state change to resetting
     */
    void onStateResetting();


    /**
     * the function is called while device state change to unsupport
     */
    void onStateUnsupported();


    /**
     * the function is called while device state change to unauthorized
     */
    void onStateUnauthorized();


    /**
     * the function is called while device state change to power off
     */
    void onStatePoweredOff();


    /**
     * the function is called while device state change to power on
     */
    void onStatePoweredOn();


    /**
     * the function is called while device connect success
     * @param peripheral BLE device peripheral instance (TODO)(需換成 android 對應於 CBPeripheral 的 class)
     */
    void connectedBleReady(Object peripheral);


    /**
     * the function is called while device connect failure
     * @param peripheral BLE device peripheral instance (TODO)(需換成 android 對應於 CBPeripheral 的 class)
     * @param error If an error occurred, the cause of the failure.
     */
    void connectedBleFail(Object peripheral, String error);


    /**
     * the function is called while device disconnect
     * @param peripheral BLE device peripheral instance (TODO)(需換成 android 對應於 CBPeripheral 的 class)
     * @param error If an error occurred, the cause of the failure.
     */
    void didDisconnectPeripheral(Object peripheral, String error);


    /**
     * the function is called while BLE Central will be in restore state
     * @param dict BLE device peripheral instance (TODO)(不一定要用 MAP 結構，Android 有其他的 <key, value>結構，之後看實作上哪種最適合)
     */
    void centralWillRestoreState(Map dict);

}

