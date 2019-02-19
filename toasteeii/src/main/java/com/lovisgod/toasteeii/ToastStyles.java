package com.lovisgod.toasteeii;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

public class ToastStyles {

    public static void ordinaryToast(Context context, int length, String message) {
        Toast.makeText(context, message, length).show();
    }

    @SuppressLint("NewApi")
    public static void coloredToast(Context context, String message,
                                    int lenght,  @Nullable Integer resources,
                                    @Nullable Integer leftPad, @Nullable Integer topPad,
                                    @Nullable Integer rightPad, @Nullable Integer bottomPad) {
        android.widget.Toast toast = android.widget.Toast.makeText(context, message, lenght);
        View view = toast.getView();
        view.setPadding(leftPad, topPad, rightPad, bottomPad);
        view.setBackgroundResource(resources);
        toast.show();

    }
}
