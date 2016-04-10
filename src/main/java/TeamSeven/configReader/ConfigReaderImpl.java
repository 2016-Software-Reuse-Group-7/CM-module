package TeamSeven.configReader;

/**
 * Created by john on 2016/4/9.
 */
import TeamSeven.configReader.ConfigReader;
import com.typesafe.config.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import net.sf.json.JSONObject;

public class ConfigReaderImpl implements ConfigReader{
    private Config config;

    public ConfigReaderImpl(){
        this.config = config;
    }
    public String getHost(){
        String path=this.getClass().getResource("/resources/demoConfig.json").toString();
        String sets=ReadFile(path);
        JSONObject jo=JSONObject.fromObject(sets);
        return jo.getString("host");

    }
    public void setHost(String host){
        try {
            String path=this.getClass().getResource("/resources/demoConfig.json").toString();
            writeFile(path,host);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public String getPort(){
        String path=this.getClass().getResource("/resources/demoConfig.json").toString();
        String sets=ReadFile(path);
        JSONObject jo=JSONObject.fromObject(sets);
        return jo.getString("port");

    }
    public void setPort(String port){
        try {
            String path=this.getClass().getResource("/resources/demoConfig.json").toString();
            writeFile(path,port);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public String getMaxSecond(){
        String path=this.getClass().getResource("/resources/demoConfig.json").toString();
        String sets=ReadFile(path);
        JSONObject jo=JSONObject.fromObject(sets);
        return jo.getString("maxSecond");

    }
    public String getMaxLogin(){
        String path=this.getClass().getResource("/resources/demoConfig.json").toString();
        String sets=ReadFile(path);
        JSONObject jo=JSONObject.fromObject(sets);
        return jo.getString("maxLogin");
    }
    public void setMaxSecond(String maxSecond){
        try {
            String path=this.getClass().getResource("/resources/demoConfig.json").toString();
            writeFile(path,maxSecond);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void setMaxLogin(String maxLogin){
        try {
            String path=this.getClass().getResource("/resources/demoConfig.json").toString();
            writeFile(path,maxLogin);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static String ReadFile(String path){
         File file = new File(path);
         BufferedReader reader = null;
         String laststr = "";
         try {
           reader = new BufferedReader(new FileReader(file));
           String tempString = null;
            while ((tempString = reader.readLine()) != null) {
             laststr = laststr + tempString;
             }
             reader.close();
            } catch (IOException e) {
            e.printStackTrace();
            } finally {
            if (reader != null) {
            try {
                    	       reader.close();
                          } catch (IOException e1) {
                    	      }
              	     }
            	    }
         return laststr;
        	}

        public void writeFile(String filePath, String sets) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(fw);
        out.write(sets);
        out.println();
        fw.close();
        out.close();
    }

}
