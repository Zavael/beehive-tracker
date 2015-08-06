/*
 * Copyright 2014 Andrej Badinka
 */
package sk.badand.beehive.services;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.badand.beehive.model.Breed;
import sk.badand.beehive.model.Queen;
import sk.badand.beehive.modelfx.persistence.PersistenceHelper;

/**
 *
 * @author abadinka
 */
public class QueenService {
    private static final Logger LOG = Logger.getLogger(QueenService.class.getName());
    
    private Dao dao = null;

    public QueenService() {
        try {
            this.dao = DaoManager.createDao(PersistenceHelper.connectionSource, Queen.class);
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    public List readAllQueens() {
        return new ArrayList();
    }

    public boolean createQueen(Queen newQueen) {
        return true;
    }

    public Queen readQueen(Breed breed) {
        return new Queen(breed);
    }

    public Queen updateQueen(Queen queen) {
        return queen;
    }

    public boolean deleteQueen(int queenId) {
        return true;
    }
    
}