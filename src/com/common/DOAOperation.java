package com.common;

import com.category.beans.Category;

public interface DOAOperation<T> {
    public void save(T t);
    public void delete(T t) throws DoaException;
    public void update(T t);
    public T[] findById (int id);
}
