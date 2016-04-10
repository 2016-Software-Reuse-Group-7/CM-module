package TeamSeven.configReader;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhao on 2016/4/10.
 */
public class ConfigInfoTest {

    private ConfigInfo configInfo = null;
    @Before
    public void setUp() throws Exception {
        configInfo = new ConfigInfo();
        configInfo.loadConfiguration("demoConfig");
    }

    @Test
    public void getConfigurationPort() throws Exception {
        int serverPort = configInfo.getConfigurationPort();
        assertEquals(serverPort,8077);
    }

    @Test
    public void getMaxConnection() throws Exception {
        int maxConnection = configInfo.getMaxConnection();
        assertEquals(maxConnection,100);
    }

    @Test
    public void getMaxMessagePerSecond() throws Exception {
        int maxMessagePerSecond = configInfo.getMaxMessagePerSecond();
        assertEquals(maxMessagePerSecond,5);
    }

    @Test
    public void getDBConfigureHost() throws Exception {
        String DBhost = configInfo.getDBConfigureHost();
        assertEquals(DBhost,"localhost");
    }

    @Test
    public void getDBConfigurePort() throws Exception {
        int DBPort = configInfo.getDBConfigurePort();
        assertEquals(DBPort,3307);
    }

    @Test
    public void getDBConfigureName() throws Exception {
        String DBName = configInfo.getDBConfigureName();
        assertEquals(DBName,"demoDB");
    }

    @Test
    public void getDBConfigurePassword() throws Exception {
        String DBPassword = configInfo.getDBConfigurePassword();
        assertEquals(DBPassword,"123456");
    }

    @Test
    public void getDBConfigureUsername() throws Exception {
        String DBUsername = configInfo.getDBConfigureUsername();
        assertEquals(DBUsername,"root");
    }

    @Test
    public void getMaxMessagePerLogin() throws Exception{
        int maxMessagePerLogin = configInfo.getMaxMessagePerLogin();
        assertEquals(maxMessagePerLogin,100);
    }
}