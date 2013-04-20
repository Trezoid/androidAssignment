package au.edu.canberra.g76292757;

public class poi {
    public String name;
    public String type;
    public String details;
    public String address;
    public double lat;
    public double lon;
    public poi(String name, String type, String details, String address, String lat, String lon) {
        this.name = name;
        this.type = type;
        this.details = details;
        this.address = address;
        this.lat = Double.parseDouble(lat);
        this.lon = Double.parseDouble(lon);
    }
}
