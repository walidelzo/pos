package com.item.boa;

import com.common.DoaException;
import com.item.beans.Item;
import com.item.dao.ItemDAOFactory;
import com.item.dao.ItemDAO;

public class ItemBOA {
    public static void main(String[] args) {
        Item item = new Item();
        item.setName("Cap");
         ItemDAO fc = new ItemDAOFactory().createItemImp();
         fc.save(item);
         fc.update(item);
        try {
            fc.delete(item);
        } catch (DoaException e) {
            e.printStackTrace();
        }
        fc.findById(1);
    }
}
