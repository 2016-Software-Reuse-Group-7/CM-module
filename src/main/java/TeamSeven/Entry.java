package TeamSeven;

import TeamSeven.configReader.ConfigInfo;
import com.typesafe.config.Config;

/**
 * Created by joshoy on 16/4/6.
 * Edited By DDMing on 16/4/10
 */
public class Entry {
    public static void main(String[] args){
        ConfigInfo configInfo = new ConfigInfo();
        configInfo.loadConfiguration("demoConfig");
        System.out.println(configInfo.getConfigurationPort());
    }
}
