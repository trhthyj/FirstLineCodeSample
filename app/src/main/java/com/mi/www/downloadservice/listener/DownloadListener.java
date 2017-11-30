package com.mi.www.downloadservice.listener;

/**
 * Created by wm on 2017/11/29.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onCancel();
    void onPaused();
}
