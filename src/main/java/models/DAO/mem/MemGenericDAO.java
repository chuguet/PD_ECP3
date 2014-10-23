package models.DAO.mem;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.IGenericDAO;
import models.utils.DAOException;

public abstract class MemGenericDAO<T, ID> implements IGenericDAO<T, ID> {

    private Map<ID, T> memory = new HashMap<ID, T>();

    @Override
    public void create(T t) throws DAOException {
        memory.put(this.getId(t), t);
    }

    @Override
    public T read(ID id) {
        return memory.get(id);
    }

    @Override
    public void update(T t) throws DAOException {
        memory.put(this.getId(t), t);
    }

    @Override
    public void delete(T t) throws DAOException {
        memory.remove(this.getId(t));
    }

    @Override
    public void deleteById(ID id) throws DAOException {
        T t = this.read(id);
        if (t != null) {
            this.delete(t);
        }
    }

    @Override
    public List<T> findAll() throws DAOException {
        List<T> result = new ArrayList<T>();
        for (ID id : memory.keySet()) {
            result.add(memory.get(id));
        }
        return result;
    }

    @Override
    public List<T> findAll(Integer index, Integer size) throws DAOException {
        List<T> result = new ArrayList<T>();
        int i = 0;
        for (ID id : memory.keySet()) {
            if (i >= index && i < size) {
                result.add(memory.get(id));
            }
            i++;
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private ID getId(T t) throws DAOException {
        ID id = null;
        try {
            Field field;
            field = t.getClass().getDeclaredField("id");
            field.setAccessible(true);
            id = (ID) field.get(t);
        } catch (NoSuchFieldException e) {
            throw new DAOException("El atributo id no existe en la entidad", e);
        } catch (SecurityException e) {
            throw new DAOException("Acceso no permitido al atributo id en la entidad", e);
        } catch (IllegalArgumentException e) {
            throw new DAOException("El atributo id es incorrecto en la entidad", e);
        } catch (IllegalAccessException e) {
            throw new DAOException("Acceso ilegal a atributo id en la entidad", e);
        }
        return id;
    }
}
