package com.owen.criminalintent.Utils;

import android.content.Context;
import android.net.ConnectivityManager;

import com.owen.criminalintent.R;

/**
 * Created by Owen on 2016/1/6.
 */
public class OwenUtils {
    /**
     * 判断当前设备是手机还是平板
     */
    public static boolean isTablet(Context context) {
        return context.getResources().getBoolean(R.bool.isTablet);
    }

    /**
     * 判断网络是否可用
     */
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager)
                                         context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getBackgroundDataSetting() && cm.getActiveNetworkInfo() != null;
    }







}
