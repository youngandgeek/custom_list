package com.example.customlistlivedata;

import androidx.annotation.NonNull;

public class ItemModel {
    private String itemName,itemDes;
    private int itemIcon;

    public ItemModel(String itemName, String itemDes, int itemIcon) {
        this.itemName = itemName;
        this.itemDes = itemDes;
        this.itemIcon = itemIcon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }

    public int getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }

    @NonNull
    @Override
    public String toString() {
        return getItemName();
    }
}
