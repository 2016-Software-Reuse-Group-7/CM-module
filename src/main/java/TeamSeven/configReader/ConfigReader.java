package TeamSeven.configReader;

/**
 * Created by joshoy on 16/4/7.
 */
public interface ConfigReader {

    public String getPort();
    public String getMaxSecond();
    public String getMaxLogin();
    public String getHost();
    public void setHost(String host);
    public void setPort(String port);
    public void setMaxSecond(String maxSecond);
    public void setMaxLogin(String maxLogin);
}
