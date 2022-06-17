package com.example.customlistlivedata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Vector;
import java.util.zip.Inflater;

public class ItemArrayAdapter extends ArrayAdapter {

//reference of context and vector(data)
    private Vector<ItemModel> myItems;
    private Context _context;


    public ItemArrayAdapter( Context context, int resource, int textViewResourceId, List items) {
        super(context, resource, textViewResourceId, items);

        //parse
        myItems=(Vector<ItemModel>) items;
        _context =context;

    }

    @Override
    public View getView(int position, View convertView,  ViewGroup listView) {
    View row=convertView;
    ViewHolder vh;
    if (row==null){

    LayoutInflater inflater=(LayoutInflater)_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    row=inflater.inflate(R.layout.list_item,listView,false);
    vh=new ViewHolder(row);
    row.setTag(vh);

    }
    else {
        vh=(ViewHolder) row.getTag();

    }

        /** before creating view holder class


        ImageView imgIcon=row.findViewById(R.id.imageView);
        TextView itemName=row.findViewById(R.id.item_name);
        TextView itemDesc=row.findViewById(R.id.item_desc);
**/
        //recycling for rows
        //assign each piece of data to each view
    vh.getImgIcon().setImageResource(myItems.get(position).getItemIcon());
    vh.getTxtItemName().setText(myItems.get(position).getItemName());
    vh.getTxtItemDesc().setText(myItems.get(position).getItemDes());
        return row;
    }
}
