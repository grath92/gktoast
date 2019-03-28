package com.gkr.gktoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GkToast {

    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;

    public static void Error(Context context, String message, int duration){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        LinearLayout layoutError = (LinearLayout) layout.findViewById(R.id.toastType);
        TextView txtError = (TextView) layout.findViewById(R.id.toastTxt);
        ImageView iconError = (ImageView) layout.findViewById(R.id.toastIcon);

        layoutError.setBackgroundResource(R.drawable.error_shape);
        txtError.setText(message);
        iconError.setImageResource(R.drawable.ic_error);

        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }

    public static void Success(Context context, String message, int duration){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        LinearLayout layoutError = (LinearLayout) layout.findViewById(R.id.toastType);
        TextView txtError = (TextView) layout.findViewById(R.id.toastTxt);
        ImageView iconError = (ImageView) layout.findViewById(R.id.toastIcon);

        layoutError.setBackgroundResource(R.drawable.success_shape);
        txtError.setText(message);
        iconError.setImageResource(R.drawable.ic_success);

        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }

    public static void Warning(Context context, String message, int duration){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        LinearLayout layoutWarning = (LinearLayout) layout.findViewById(R.id.toastType);
        TextView txtWarning = (TextView) layout.findViewById(R.id.toastTxt);
        ImageView iconWarning = (ImageView) layout.findViewById(R.id.toastIcon);

        layoutWarning.setBackgroundResource(R.drawable.warning_shape);
        txtWarning.setText(message);
        iconWarning.setImageResource(R.drawable.ic_warning);


        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }

    public static void Info(Context context, String message, int duration){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        LinearLayout layoutInfo = (LinearLayout) layout.findViewById(R.id.toastType);
        TextView txtInfo = (TextView) layout.findViewById(R.id.toastTxt);
        ImageView iconInfo = (ImageView) layout.findViewById(R.id.toastIcon);

        layoutInfo.setBackgroundResource(R.drawable.info_shape);
        txtInfo.setText(message);
        iconInfo.setImageResource(R.drawable.ic_info);


        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }

    public static void Default(Context context, String message, int duration){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        LinearLayout layoutDefault = (LinearLayout) layout.findViewById(R.id.toastType);
        TextView txtDefault = (TextView) layout.findViewById(R.id.toastTxt);
        ImageView iconDefault = (ImageView) layout.findViewById(R.id.toastIcon);

        layoutDefault.setBackgroundResource(R.drawable.default_shape);
        txtDefault.setText(message);


        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }
}
