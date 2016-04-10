package TeamSeven.configReader;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigFactory;

/**
 * Created by zhao on 2016/4/10.
 */
public class ConfigInfo  extends ConfigReader {
    private Config config = null;

    @Override
    public void loadConfiguration(String path) {
        try {
            config = ConfigFactory.load(path);
        } catch (ConfigException.BadPath e) {
            System.out.println("Bad Path!");
        }
    }

    @Override
    public int getConfigurationPort() {
        int retPort = -1;
        try {
            retPort = config.getInt("server.port");
        }catch (ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retPort;
    }

    @Override
    public int getMaxConnection() {
        int retMaxConnection = -1;
        try{
            retMaxConnection = config.getInt("server.maxConnection");
        }catch(ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retMaxConnection;
    }

    @Override
    public int getMaxMessagePerSecond() {
        int retMaxMessagePerSecond = -1;
        try{
            retMaxMessagePerSecond = config.getInt("server.maxMessagePerSecond");
        }catch(ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retMaxMessagePerSecond;
    }

    @Override
    public String getDBConfigureHost() {
        String retDBHost = null;
        try {
            retDBHost = config.getString("db.host");
        }catch (ConfigException e){
            System.out.println("No such Value");
        }
        return retDBHost;
    }

    @Override
    public int getDBConfigurePort() {
        int retDBPort = -1;
        try {
            retDBPort = config.getInt("db.port");
        }catch (ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retDBPort;
    }

    @Override
    public String getDBConfigureName() {
        String retDBName = null;
        try {
            retDBName = config.getString("db.name");
        }catch (ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retDBName;
    }

    @Override
    public String getDBConfigurePassword() {
        String retDBPsword = null;
        try{
            retDBPsword = config.getString("db.password");
        }catch (ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retDBPsword;
    }

    @Override
    public String getDBConfigureUsername() {
        String retDBUsername = null;
        try {
            retDBUsername = config.getString("db.username");
        }catch (ConfigException.BadValue e){
            System.out.println("No such Value");
        }
        return retDBUsername;
    }
}
