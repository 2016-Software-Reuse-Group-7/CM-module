package TeamSeven.configReader;
import com.typesafe.config.*;

/**
 * Created by joshoy on 16/4/7.
 */
public abstract class ConfigReader{
    public abstract void loadConfiguration(String path);
    public abstract int getConfigurationPort();
    public  abstract int getMaxConnection();
    public  abstract int getMaxMessagePerSecond();
    public  abstract String getDBConfigureHost();
    public  abstract int getDBConfigurePort();
    public  abstract String getDBConfigureName();
    public  abstract String getDBConfigurePassword();
    public  abstract String getDBConfigureUsername();
}
