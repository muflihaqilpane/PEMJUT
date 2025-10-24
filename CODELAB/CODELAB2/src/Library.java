public class Library {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void showLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Library Location: " + location);
    }
}
