package com.mexcelle.toaster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Toaster {

    public static final int LENGTH_LONG = 1;
    public static int SUCCESS = 1;
    public static int ERROR = 2;
    public static int DEFAULT = 3;

    public static Toast makeText(Context context, CharSequence message, int duration, int type, boolean androidIcon) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false);
        TextView l1 = layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView img = layout.findViewById(R.id.toast_icon);
        ImageView img1 = layout.findViewById(R.id.imageView4);
        l1.setText(message);
        if (androidIcon)
            img1.setVisibility(View.VISIBLE);
        else img1.setVisibility(View.GONE);
        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                img.setImageResource(R.drawable.ic_check_black_24dp);
                break;

            case 2:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                img.setImageResource(R.drawable.ic_clear_black_24dp);
                break;

            case 3:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;

        }
        toast.setView(layout);
        return toast;
    }




    public static Toast makeText(Context context, CharSequence message, int duration, int type, int ImageResource, boolean androidIcon) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false);
        TextView l1 = layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView img = layout.findViewById(R.id.toast_icon);
        ImageView img1 = layout.findViewById(R.id.imageView4);
        l1.setText(message);
        img.setImageResource(ImageResource);
        if (androidIcon)
            img1.setVisibility(View.VISIBLE);
        else img1.setVisibility(View.GONE);
        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                break;

            case 3:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;

            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;
        }
        toast.setView(layout);
        return toast;
    }
}
