package Publisher;

public class Publisher {
    private String name,address, website;
    private long telephone;
    public Publisher(String name, String address, long telephone, String website){
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.website = website;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getName() {
        return name;
    }
    public long getTelephone() {
        return telephone;
    }
    public String getAddress() {
        return address;
    }
    public String getWebsite() {
        return website;
    }

    public static void main(String[] args) {
        Publisher p = new Publisher("Express Publishing", "Gardenia 25", 00310210212, "gmail.com");
        System.out.println("Publisher " + p.getName() + "with address " + p.getTelephone() + " telephone number" + p.getTelephone() + " webiste: " + p.getWebsite());
    }
}
