package lk.cw.dao.custom;

import lk.cw.dao.CrudDAO;
import lk.cw.entity.TherapyProgram;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface TherapyProgramDAO extends CrudDAO<TherapyProgram> {


    public TherapyProgram findById(String programId) throws SQLException, ClassNotFoundException ;
    public ArrayList<String> getAllProgramIDs() throws SQLException, ClassNotFoundException, IOException ;

    ArrayList<String> getProgramList();

    public int getTotalPrograms() throws SQLException, ClassNotFoundException, IOException ;
}
