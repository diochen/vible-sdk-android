package android.viwave.com.viwhble;


/**
 * protocol is used for Weheal device <br/>
 * 1. query device status <br/>
 * 2. query/update BLE device parameter setting <br/>
 * 3. query/update BLE device strength <br/>
 * 4. query/update BLE device treatment state and treatment mode <br/>
 * 5. query treatement reminding time <br/>
 * 6. query device bioelectrical impedance <br/>
 *
 * merge all delegates about Weheal device to ONE delegate
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */
public interface VIWHDeviceCommandCB {
    /**
     *
     * this function is called while query device status
     * @param status ref {@link BtensConsts.DEVICE_STATUS} definition
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetDeviceStatus(BtensConsts.DEVICE_STATUS status, Object peripheral);


    /**
     * this function is called while query device status
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetDeviceStatusFailed(Object peripheral, Error error);



    /**
     *
     * this function is called while query device parameter setting success
     * @param mode ref {@link BtensConsts.TREATMENT_MODE} definition
     * @param waveform ref {@link BtensConsts.WAVE_FORM} definition
     * @param frequency 0~1000(Hz)
     * @param pulse_witdh 1~50 (%)
     * @param treatment_duration 1~120 mins
     * @param cur_strength 1~8
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetParameterSetting(BtensConsts.TREATMENT_MODE mode, BtensConsts.WAVE_FORM waveform,
                                      Integer frequency, Integer pulse_witdh,
                                      Integer treatment_duration, Integer cur_strength,
                                      Object peripheral);


    /**
     * this function is called while query device parameter setting failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetParameterSettingFailed(Object peripheral, Error error);



    /**
     *
     * this function is called while update device parameter setting success
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onSetParameterSetting(BtensConsts.DEVICE_STATUS status, Object peripheral);


    /**
     * this function is called while update device parameter setting failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onSetParameterSettingFailed(Object peripheral, Error error);


    /**
     *
     * this function is called while query device strength success
     * @param strength 1~8
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetStrength(int strength, Object peripheral);


    /**
     * this function is called while query device strength failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetStrengthFailed(Object peripheral, Error error);


    /**
     *
     * this function is called while update device strength success
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onSetStrength(Object peripheral);


    /**
     * this function is called while update device strength failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onSetStrengthFailed(Object peripheral, Error error);


    /**
     *
     * this function is called while query device treatment state and treatment mode success
     * @param status ref {@link BtensConsts.DEVICE_STATUS} definition
     * @param mode ref {@link BtensConsts.TREATMENT_MODE} definition
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetStateAndMode(BtensConsts.DEVICE_STATUS status, BtensConsts.TREATMENT_MODE mode, Object peripheral);


    /**
     * this function is called while query device treatment state and treatment mode failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetStateAndModeFailed(Object peripheral, Error error);



    /**
     *
     * this function is called while update device treatment state and treatment mode success
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onSetStateAndMode(Object peripheral);


    /**
     * this function is called while update device treatment state and treatment mode failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onSetStateAndModeFailed(Object peripheral, Error error);




    /**
     *
     * this function is called while query treatement reminding time
     * @param timeSec  Reminding time in second. (0~7200) (TODO)(uint32_t 可能對應 java 的 long)
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetRemindingTime(long timeSec, Object peripheral);


    /**
     * this function is called while query treatement reminding time
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onRemindingTimeFailed(Object peripheral, Error error);



    /**
     *
     * this function is called while update device bioelectrical success
     * @param value  0~4000000000 (TODO)(uint32_t 可能對應 java 的 long)
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     *
     */
    public void onGetBtensBioelectricalImpedance(long value, Object peripheral);


    /**
     * this function is called while update device bioelectrical failure
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param error  If an error occurred, the cause of the failure
     *
     */
    public void onGetBtensBioelectricalImpedanceFailed(Object peripheral, Error error);





}
