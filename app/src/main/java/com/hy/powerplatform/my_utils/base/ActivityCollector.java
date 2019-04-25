package com.hy.powerplatform.my_utils.base;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/30.
 */

public class ActivityCollector {
    public static List<Activity> activitys = new ArrayList<>();

    public static void addActivity(Activity activity){
        activitys.add(activity);
    }
    public static void removeActivity(Activity activity){
        activitys.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity : activitys){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
