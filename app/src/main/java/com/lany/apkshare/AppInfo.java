package com.lany.apkshare;

/**
 * Created by user on 2015/8/17.
 */

import android.graphics.drawable.Drawable;

public final class AppInfo {
    private String name;
    private Drawable icon;
    private String apkPath;
    private long apkSize;

    public AppInfo(String name, Drawable icon, String apkPath, long apkSize) {
        this.name = name;
        this.icon = icon;
        this.apkPath = apkPath;
        this.apkSize = apkSize;
    }

    public String getName() {
        return name;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getApkPath() {
        return apkPath;
    }

    public long getApkSize() {
        return apkSize;
    }
}
