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
        AlertDialog dialog=builder.create();
        dialog.setTitle("first library!");
        dialog.setMessage("success show dialog!");
        dialog.setButton(1, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                
            }
        });




    }




}
