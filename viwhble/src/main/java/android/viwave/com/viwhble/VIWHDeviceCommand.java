package android.viwave.com.viwhble;


/**
 * this interface is used for Weheal device control<br/>
 * 1. get/notify device status <br/>
 * 2. parameter <br/>
 * 3. strength<br/>
 *
 * @author
 * @version 1.0.0
 * @since 1.0.0
 */

public class VIWHDeviceCommand {
    private static final String TAG = "VIWHDeviceCommand";

    public VIWHDeviceCommand(){
    }

    /**
     * this function is used for querying device status
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getDeviceStatus(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     *
     * this function is used for start monitor device status change
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void startNotifyDeviceStatus(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     *
     * this function is used for stop monitor device status change
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     */
    public void stopNotifyDeviceStatus(Object peripheral){
        return ;
    }


    /**
     *
     * this function is used for querying device parameter setting
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getParameterSetting(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }



    /**
     *
     * this function is used for setting device parameter setting
     * @param mode ref {@link BtensConsts.TREATMENT_MODE} definition
     * @param waveform ref {@link BtensConsts.TREATMENT_MODE} definition
     * @param frequency 0~1000(Hz)
     * @param pulse_witdh 1~50 (%)
     * @param treatment_duration 1~120 mins
     * @param cur_strength 1~8
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void setParameterSetting(BtensConsts.TREATMENT_MODE mode, BtensConsts.WAVE_FORM waveform,
                                    Integer frequency, Integer pulse_witdh,
                                    Integer treatment_duration, Integer cur_strength,
                                    Object peripheral, VIWHDeviceCommandCB db){
        return ;
    }


    /**
     *
     * this function is used for start monitor device parameter setting changed
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void startNotifyParameterSetting(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     *
     * this function is used for stop monitor device parameter setting changed
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     */
    public void stopNotifyParameterSetting(Object peripheral){
        return ;
    }


    /**
     *
     * this function is used for querying device strength
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getStrength(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }



    /**
     *
     * this function is used for querying device strength
     * @param strength 1~8
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void setStrength(int strength, Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     *
     * this function is used for start monitor device strength changed
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void startNotifyStrength(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     *
     * this function is used for querying device treatment state and treatment mode
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getStateAndMode(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }



    /**
     *
     * this function is used for update device treatment state and treatment mode
     * @param state ref {@link BtensConsts.TREATMENT_STATE} definition
     * @param mode ref {@link BtensConsts.TREATMENT_MODE} definition
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void setStateAndMode(BtensConsts.TREATMENT_STATE state, BtensConsts.TREATMENT_MODE mode, Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }



    /**
     * this function is used for start monitor treatment state and treatment mode changed
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void startNotifyTreatement(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     * this function is used for querying treatement reminding time
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getRemindingTime(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     * this function is used for start monitor treatement reminding time
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void startNotifyRemindingTime(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }



    /**
     * this function is used for stop monitor treatement reminding time
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     */
    public void stopNotifyRemindingTime(Object peripheral){
        return ;
    }


    /**
     * this function is used for querying device bioelectrical impedance
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void getBioelectricalImpedance(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }


    /**
     * this function is used for start monitor device parameter bioelectrical impedance
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     * @param cb The callback method for handling result
     */
    public void startNotifyBioelectricalImpedance(Object peripheral, VIWHDeviceCommandCB cb){
        return ;
    }



    /**
     * this function is used for start monitor device parameter bioelectrical impedance
     * @param peripheral device peripheral (TODO)( 之後改成 Android 對應 iOS CBPeripheral的 class)
     */
    public void stopNotifyBioelectricalImpedance(Object peripheral){
        return ;
    }


}

