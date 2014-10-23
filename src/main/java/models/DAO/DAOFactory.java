package models.DAO;

import models.DAO.mem.MemRoundDAO;
import models.DAO.mem.MemUserDAO;

public abstract class DAOFactory {

    public abstract MemUserDAO getUserDAO();

    public abstract MemRoundDAO getRoundDAO();
}
