package model;

public class TypeRoom {
    private int idTypeRoom;
    private String nameTypeRoom;

    public TypeRoom() {
    }

    public TypeRoom(int idTypeRoom, String nameTypeRoom) {
        this.idTypeRoom = idTypeRoom;
        this.nameTypeRoom = nameTypeRoom;
    }

    public int getIdTypeRoom() {
        return idTypeRoom;
    }

    public void setIdTypeRoom(int idTypeRoom) {
        this.idTypeRoom = idTypeRoom;
    }

    public String getNameTypeRoom() {
        return nameTypeRoom;
    }

    public void setNameTypeRoom(String nameTypeRoom) {
        this.nameTypeRoom = nameTypeRoom;
    }
}
