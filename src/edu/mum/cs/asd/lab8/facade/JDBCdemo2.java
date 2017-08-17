package edu.mum.cs.asd.lab8.facade;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdemo2 {
    public static void main( String[] arg ) {
        JDBCFacade util = null;
        try {
            util = new JDBCFacade();
            String sql = "SELECT * FROM <table> WHERE <column name> = ?";
            util.setSQL( sql );
            util.setString( 1, "<column value>" );
            ResultSet rset = util.executeQuery();
            if( rset.next() ) {
                System.out.println( rset.getString( "<column name>" ) );
            }
            util.reset();
            util.setMode( JDBCFacade.CALLABLE );
            sql = "{call <stored procedure>( ?, ? )}";
            util.setSQL( sql );
            util.setInt( 1, 1972 );
            util.registerOutParameter( 2, java.sql.Types.INTEGER );
            util.execute();
            System.out.println( util.getInt( 2 ) );
        } catch( SQLException e ) {
            e.printStackTrace();
        } finally {
            if( util != null ) {
                util.close();
            }
        }
    }
}
