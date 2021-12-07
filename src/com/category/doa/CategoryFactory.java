
/*
 * Copyright (c)   walid elzohery  11/29/21, 10:11 AM
 * All Rights reserved
 */

package com.category.doa;

public class CategoryFactory {
    public CategoryDAO createCategory(){
        return  new CategoryDAOImp();
    }
}
