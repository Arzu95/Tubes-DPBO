/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tubes.dpbo.common;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author riyan
 */
public interface CrudInterface<T> {
    HashMap<Integer, ArrayList<T>> get();
    T cariBerdasarkanId(int id);
    void create(T entity);
    void update(T entity);
    void delete(int id);
    
}
