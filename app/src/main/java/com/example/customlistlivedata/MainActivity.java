package com.example.customlistlivedata;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //vector of item(model class),vector is a dynamic array that can grow or shrink in size.
    Vector<ItemModel> items;
    ItemArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add item to the vector
        items=new Vector<ItemModel>();
        items.add(new ItemModel("Sandwiches","Burger,Chicken and Fries",R.mipmap.burger));
        items.add(new ItemModel("Pizza","Chicken Pizza,Pepperoni Pizza",R.mipmap.pizza));
        items.add(new ItemModel("Seafood","Fish,Shrimp",R.mipmap.fish));
        items.add(new ItemModel("Meat","Steak,Beef",R.mipmap.meat));
        items.add(new ItemModel("Dessert","Cupcake,Muffin and Donuts",R.mipmap.pancake));
        items.add(new ItemModel("Ice cream","Gelato,Cone and Bar",R.mipmap.icecream));
        items.add(new ItemModel("Dessert","Cakes,Pound cake and Foam cake",R.mipmap.sweets));
        items.add(new ItemModel("Bread","Loaf,Toast and Baguette",R.mipmap.bread));
        items.add(new ItemModel("Grocery","Oil,Frozen food and Home supplies",R.mipmap.grocery));

        listView=(ListView) findViewById(R.id.list);
        adapter=new ItemArrayAdapter(this,R.layout.list_item,R.id.item_name,items);
        listView.setAdapter(adapter);

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this, adapterView.getAdapter().getItem(i).toString(), Toast.LENGTH_SHORT).show();
        }
    });
    }
}