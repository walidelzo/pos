package com.item.dao;

import com.item.beans.Item;

public class ItemDOAImp implements ItemDAO{
    @Override
    public void save(Item item) {
        System.out.println("saved ..." + item.getName());
    }

    @Override
    public void delete(Item item) {
        System.out.println("deleted ... " + item.getName());
    }

    @Override
    public void update(Item item) {
        System.out.println(" update ... " + item.getName());
    }

    @Override
    public Item[] findById(int id) {
        return new Item[0];
    }
}
