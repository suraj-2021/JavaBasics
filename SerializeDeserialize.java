import java.io.*;

class BankAccount implements Serializable {
    String name;
    transient String password; // won't be serialized
    double balance;

    BankAccount(String n, String p, double b) {
        name = n;
        password = p;
        balance = b;
    }

    public String toString() {
        return "Name: " + name + ", Password: " + password + ", Balance: " + balance;
    }
}

public class SimpleSerialization {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", "secret", 1000.5);

        // Serialize object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("acc.ser"))) {
            out.writeObject(acc);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("acc.ser"))) {
            BankAccount receivedAcc = (BankAccount) in.readObject();
            System.out.println(receivedAcc);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
