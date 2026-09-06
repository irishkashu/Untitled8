import java.util.Objects;

public class Customer {
    private String id;
    private String fullName;
    private String email;

    public Customer(String id, String fullName, String email){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
    public boolean equals(Object object){
        return hashCode() == object.hashCode();
    }
    public int hashCode(){
        return Objects.hash(email);
    }
}
