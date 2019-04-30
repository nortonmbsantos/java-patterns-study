package com.norton.gerenciador_viagens.dao;

import java.util.Optional;

import antlr.collections.List;

public interface Dao<T> {
    
    List getAll();
     
    void save(T t);
     
    void update(T t, String[] params);
     
    void delete(T t);
}
