package com.example.ayo.toasteelibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.View;

public class Toast {

    public static void ordinaryToast(Context context, int length, String message) {
        android.widget.Toast.makeText(context, message, length).show();
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
