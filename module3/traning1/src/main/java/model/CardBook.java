package model;

public class CardBook {
    private String codeBookCard;
    private String dayLoan;
    private String dayBack;
    private String codeBook;
    private String codeStudent;
    private Integer idStatus;

    public CardBook() {
    }

    public CardBook(String codeBookCard, String dayLoan, String dayBack, String codeBook, String codeStudent, Integer idStatus) {
        this.codeBookCard = codeBookCard;
        this.dayLoan = dayLoan;
        this.dayBack = dayBack;
        this.codeBook = codeBook;
        this.codeStudent = codeStudent;
        this.idStatus = idStatus;
    }

    public String getCodeBookCard() {
        return codeBookCard;
    }

    public void setCodeBookCard(String codeBookCard) {
        this.codeBookCard = codeBookCard;
    }

    public String getDayLoan() {
        return dayLoan;
    }

    public void setDayLoan(String dayLoan) {
        this.dayLoan = dayLoan;
    }

    public String getDayBack() {
        return dayBack;
    }

    public void setDayBack(String dayBack) {
        this.dayBack = dayBack;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }
}
