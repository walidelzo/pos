package com.item.dao;

public class ItemDAOFactory {
    public ItemDAO createItemImp(){
        return new ItemDOAImp();
    }
}
