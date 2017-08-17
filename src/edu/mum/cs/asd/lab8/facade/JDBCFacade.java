package edu.mum.cs.asd.lab8.facade;

import java.sql.*;

public class JDBCFacade extends  SQLUtilAbstract{

    static {
        try {
            Class.forName( "<your JDBC driver>" ).newInstance();
        } catch( InstantiationException e ) {
            e.printStackTrace();
        } catch( ClassNotFoundException e ) {
            e.printStackTrace();
        } catch( IllegalAccessException e ) {
            e.printStackTrace();
        }
    }

    public JDBCFacade() throws SQLException {
        super();
    }


    @Override
    public Connection getConnection() throws SQLException {
        return( DriverManager.getConnection( "<url>", "<username>", "<password>" ) );
    }

    @Override
    public void freeConnection(Connection conn) throws SQLException {
        conn.close();
    }
}
