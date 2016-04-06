package my.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nikol on 4/5/2016.
 */
public class CommandsList {
    public static final String HELP = "help";
    public static final String HELP_DESCR = "help";
    public static final String EXIT = "exit";
    public static final String EXIT_DESCR = "'exit' - input if you want to finish work with sql commander";
    public static final String CONNECT = "connect";
    public static final String CONNECT_DESCR = "'connect' - connect to db. connect dbName, login, password ";
    Map<String, String> commandsList;
    {
        commandsList = new HashMap<>();
        commandsList.put(HELP, HELP_DESCR);
        commandsList.put(EXIT, EXIT_DESCR );
        commandsList.put(CONNECT, CONNECT_DESCR);
    }

    public boolean isCorrectCommand(String command){
        command = command.split(" ")[0];
        for(Map.Entry<String, String> pair : commandsList.entrySet()){
             if(command.equalsIgnoreCase(pair.getKey())){
                 return true;
             }
        }
        return false;
    }

    public List<String> getCommandsDescription (){
        return new ArrayList<>(commandsList.values());
    }
}
