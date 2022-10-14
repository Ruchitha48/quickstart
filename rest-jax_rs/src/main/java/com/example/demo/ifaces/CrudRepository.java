
package com.example.demo.ifaces;
import java.util.*;
public interface CrudRepository <T> {
    public int add(T t);
    public List<T> findAll();
    public T findById(int id);
    public int update(double amount,int id);
    public int remove(int id);
    



}