package com.category.doa;

import com.category.beans.Category;

public class CategoryDAOImp implements CategoryDAO{
    @Override
    public void save(Category category) {
        System.out.println("the category saved .." + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("the category deleted ... " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("the category is updated .. "+category.getName());
    }

    @Override
    public Category[] findById(int id) {
        return null;
    }
}
