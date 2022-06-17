package com.example.customlistlivedata;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    View convertView;
    TextView txtItemName,txtItemDesc;
    ImageView imgIcon;

    public ViewHolder(View v){
        convertView=v;
    }
    public TextView getTxtItemDesc() {
        if (txtItemDesc==null)
        txtItemDesc=convertView.findViewById(R.id.item_desc);
        return txtItemDesc;
    }

    public TextView getTxtItemName() {
        if (txtItemName==null)
            txtItemName=convertView.findViewById(R.id.item_name);
        return txtItemName;
    }

    public ImageView getImgIcon() {
        if (imgIcon==null)
            imgIcon=convertView.findViewById(R.id.imageView);
        return imgIcon;
    }
}
