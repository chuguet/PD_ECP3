package models.DAO.mem;

import java.util.List;

import models.DAO.IGenericDAO;

public abstract class MemGenericDAO<T, ID> implements IGenericDAO<T, ID> {

    @Override
    public void create(T t) {
        // TODO Auto-generated method stub
    }

    @Override
    public T read(ID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(T t) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(T t) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(ID id) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<T> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<T> findAll(Integer index, Integer size) {
        // TODO Auto-generated method stub
        return null;
    }

}
