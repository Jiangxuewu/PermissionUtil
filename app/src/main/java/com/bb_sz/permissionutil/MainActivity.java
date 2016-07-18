package com.bb_sz.permissionutil;

import android.app.Activity;
import android.os.Bundle;

import com.bb_sz.permission.PermissionUtil;

public class MainActivity extends Activity {

    PermissionUtil mPermissionUtil = new PermissionUtil();
    private String[] permission = {
//            "android.permission.READ_CALENDAR",
//            "android.permission.WRITE_CALENDAR",
//            "android.permission.CAMERA",
//            "android.permission.READ_CONTACTS",
//            "android.permission.WRITE_CONTACTS",
//            "android.permission.GET_ACCOUNTS",
//            "android.permission.ACCESS_FINE_LOCATION",
//            "android.permission.ACCESS_COARSE_LOCATION",
//            "android.permission.RECORD_AUDIO",
//            "android.permission.READ_PHONE_STATE",
//            "android.permission.CALL_PHONE",
//            "android.permission.READ_CALL_LOG",
//            "android.permission.WRITE_CALL_LOG",
//            "com.android.voicemail.permission.ADD_VOICEMAIL",
//            "android.permission.USE_SIP",
//            "android.permission.PROCESS_OUTGOING_CALLS",
//            "android.permission.BODY_SENSORS",
//            "android.permission.SEND_SMS",
//            "android.permission.RECEIVE_SMS",
//            "android.permission.READ_SMS",
//            "android.permission.RECEIVE_WAP_PUSH",
//            "android.permission.RECEIVE_SMS",
//            "android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPermissionUtil.requestPermission(this, permission, new PermissionUtil.OnCheckPermissionCallback() {
            @Override
            public void requestPermissionSuccess() {

            }

            @Override
            public void requestPermissionFailed() {

            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mPermissionUtil.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
