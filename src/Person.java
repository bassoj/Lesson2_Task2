import java.util.*;

public class Person {

    private String name;
    private String surname;
    private List<String> phones;
    private List<String> sites;
    private Addresses address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Addresses getAddresses() {
        return address;
    }

    public void setAddresses(Addresses address) {
        this.address = address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + phones +
                ", sites=" + sites +
                ", addresses=" + address +
                '}';
    }
}
