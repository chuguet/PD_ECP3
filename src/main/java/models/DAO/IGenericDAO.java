package models.DAO;

import java.util.List;

public interface IGenericDAO<T, ID> {

    void create(T t);

    T read(ID id);

    void update(T t);

    void delete(T t);

    void deleteById(ID id);

    List<T> findAll();

    List<T> findAll(Integer index, Integer size);

}
