package com.category.boa;

import com.category.beans.Category;
import com.category.doa.CategoryDAO;
import com.category.doa.CategoryFactory;
import com.common.DoaException;

public class CategoryBOA {
    public static void main(String[] args) {
        Category clothes = new Category();
        clothes.setName("Tshirt");
        clothes.setId(1);
        clothes.setDescription("more sweetie tshirt...");
        CategoryDAO cf = new CategoryFactory().createCategory();
        cf.save(clothes);
        cf.update(clothes);
        try {
            cf.delete(clothes);
        } catch (DoaException e) {
            e.printStackTrace();
        }
        cf.findById(12);

    }
}
