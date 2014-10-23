package models.DAO.mem;

import models.DAO.DAOFactory;

public class MemDAOFactory extends DAOFactory {

    private static MemDAOFactory memDAOFactory;

    private MemDAOFactory() {

    }

    public static MemDAOFactory getInstance() {
        if (memDAOFactory == null) {
            memDAOFactory = new MemDAOFactory();
        }
        return memDAOFactory;
    }

    @Override
    public MemUserDAO getUserDAO() {
        return new MemUserDAO();
    }

    @Override
    public MemRoundDAO getRoundDAO() {
        return new MemRoundDAO();
    }

}
