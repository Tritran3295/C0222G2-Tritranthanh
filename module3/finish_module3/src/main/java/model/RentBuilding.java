package model;

public class RentBuilding {
    private String codeRentBuilding;
    private int status;
    private Double SRentBuilding;
    private int floor;
    private int typeRoom;
    private Double price;
    private String dayStart;
    private String dayEnd;

    public RentBuilding() {
    }

    public RentBuilding(String codeRentBuilding, int status, Double SRentBuilding, int floor, int typeRoom, Double price, String dayStart, String dayEnd) {
        this.codeRentBuilding = codeRentBuilding;
        this.status = status;
        this.SRentBuilding = SRentBuilding;
        this.floor = floor;
        this.typeRoom = typeRoom;
        this.price = price;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public String getCodeRentBuilding() {
        return codeRentBuilding;
    }

    public void setCodeRentBuilding(String codeRentBuilding) {
        this.codeRentBuilding = codeRentBuilding;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Double getSRentBuilding() {
        return SRentBuilding;
    }

    public void setSRentBuilding(Double SRentBuilding) {
        this.SRentBuilding = SRentBuilding;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(int typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }
}
