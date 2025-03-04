package Task4thMarch;


class Database {
    private String password = "Secure123"; // Private member

    // Public method to allow controlled access
    public String getPassword() {
        return password;
    }
}

class Application {
    private Database db; // Composition: Using Database inside Application

    public Application(Database db) {
        this.db = db;
    }

    void showDatabasePassword() {
        System.out.println("Accessing password via method: " + db.getPassword());
    }
}

public class Q4_Composition {
    public static void main(String[] args) {
        Database myDB = new Database();
        Application app = new Application(myDB);
        app.showDatabasePassword(); // Output: Accessing password via method: Secure123
    }
}
