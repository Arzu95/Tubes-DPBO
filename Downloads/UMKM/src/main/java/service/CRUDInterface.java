/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.HashMap;

public interface CRUDInterface<T> {
    void create(int id, T entity);
    T read(int id);
    void update(int id, T entity);
    void delete(int id);
    HashMap<Integer, T> getAll();
}

