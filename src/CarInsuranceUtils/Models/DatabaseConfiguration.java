package CarInsuranceUtils.Models;

public class DatabaseConfiguration {

    private String username;
    private String password;
    private String databaseUrl;

    public DatabaseConfiguration(String username, String password, String databaseUrl) {
        this.username = username;
        this.password = password;
        this.databaseUrl = databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }
}
