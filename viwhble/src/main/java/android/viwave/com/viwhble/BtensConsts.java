package android.viwave.com.viwhble;

public class BtensConsts {
    /**
     * An enum.
     * device treatment state
     */
    public enum TREATMENT_STATE {
        TREATMENT_STATE_STOP,
        TREATMENT_STATE_STARTED,
        TREATMENT_STATE_PAUSED
    }

    /**
     * An enum.
     * Device treatment mode
     */
    public enum TREATMENT_MODE {
        TREATMENT_MODE_USER_DEFINED,
        TREATMENT_MODE_1,
        TREATMENT_MODE_2,
        TREATMENT_MODE_3,
        TREATMENT_MODE_APP_DEFINED,
        TREATMENT_BIO_MODE
    }

    /**
     * An enum.
     * wave form
     */
    public enum WAVE_FORM {
        WAVE_FORM_SINE,
        WAVE_FORM_SQUARE,
        WAVE_FORM_UNIDIRECTION
    }

    /**
     * An enum.
     * device status
     */
    public enum DEVICE_STATUS {
        DEVICE_STATUS_NORMAL,
        DEVICE_STATUS_PARAMETER_SET,
        DEVICE_STATUS_PATCH_FALLOFF,
        DEVICE_STATUS_UNKNOWN_ERR
    }
}
