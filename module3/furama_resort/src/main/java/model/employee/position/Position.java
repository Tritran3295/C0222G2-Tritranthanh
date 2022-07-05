package model.employee.position;

public class Position {
    private int idPosition;
    private String namePosition;
    private int status;

    public Position() {
    }

    public Position(int idPosition, String namePosition, int status) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.status = status;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
