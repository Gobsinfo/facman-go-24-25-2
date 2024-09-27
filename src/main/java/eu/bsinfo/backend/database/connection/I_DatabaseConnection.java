package eu.bsinfo.backend.database.connection;

import java.util.Properties;

public interface I_DatabaseConnection {

    void openConnection(Properties properties);
    void createAllTables();
    void truncateAllTables();
    void removeAllTables();
    void closeConnection();

}
