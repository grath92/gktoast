package com.gkr.gktoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class GkToast {

    public static void error(Context context, String message){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        TextView txtSuccess = (TextView) layout.findViewById(R.id.success_message);
        txtSuccess.setVisibility(View.GONE);

        TextView txtError = (TextView) layout.findViewById(R.id.error_message);
        txtError.setVisibility(View.VISIBLE);
        txtError.setText(message);

        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }

    public static void success(Context context, String message){

        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null);

        TextView txtError = (TextView) layout.findViewById(R.id.error_message);
        txtError.setVisibility(View.GONE);

        TextView txtSuccess = (TextView) layout.findViewById(R.id.success_message);
        txtSuccess.setVisibility(View.VISIBLE);
        txtSuccess.setText(message);

        //Creating the Toast object
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

    }
}
