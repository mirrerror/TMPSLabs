package md.mirrerror.managers;

public class ConfigManager {
    private static ConfigManager instance;

    private ConfigManager() {
        // Private constructor to prevent instantiation
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return "The value for the key '" + key + "' is: value";
    }
}

