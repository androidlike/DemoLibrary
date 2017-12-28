package com.scts.hand.first;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/**
 * Created by cf on 2017/12/28.
 */

public class CDialogMethod {

    public static void showDialog(Activity  activity){

        AlertDialog.Builder  builder=new AlertDialog.Builder(activity);
        builder.setTitle("first kotlin");
        builder.setMessage("success show dialog!");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
            }
        });
        builder.create().show();


    }




}
