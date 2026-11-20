public class ParkingSpot {
    private int spotId;
    private String location;
    private boolean available;

    public ParkingSpot() {
    }

    public ParkingSpot(int spotId, String location, boolean available) {
        this.spotId = spotId;
        this.location = location;
        this.available = available;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayDetails() {
        System.out.println("Spot ID: " + spotId);
        System.out.println("Location: " + location);
        System.out.println("Available: " + available);
    }
}
