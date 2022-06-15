package model;

public class Service {
    private Integer idService;
    private String nameService;
    private Double areaService;
    private Double costService;
    private Integer maxPeopleService;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double areaPool;
    private Integer numberOfFloor;
    private Integer idTypeRent;
    private Integer idTypeService;

    public Service() {
    }

    public Service(Integer idService, String nameService, Double areaService, Double costService, Integer maxPeopleService, String standardRoom, String descriptionOtherConvenience, Double areaPool, Integer numberOfFloor, Integer idTypeRent, Integer idTypeService) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.maxPeopleService = maxPeopleService;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
        this.idTypeRent = idTypeRent;
        this.idTypeService = idTypeService;
    }

    public Service(String nameService, Double areaService, Double costService, Integer maxPeopleService, String standardRoom, String descriptionOtherConvenience, Double areaPool, Integer numberOfFloor, Integer idTypeRent, Integer idTypeService) {
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.maxPeopleService = maxPeopleService;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
        this.idTypeRent = idTypeRent;
        this.idTypeService = idTypeService;
    }

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Double getAreaService() {
        return areaService;
    }

    public void setAreaService(Double areaService) {
        this.areaService = areaService;
    }

    public Double getCostService() {
        return costService;
    }

    public void setCostService(Double costService) {
        this.costService = costService;
    }

    public Integer getMaxPeopleService() {
        return maxPeopleService;
    }

    public void setMaxPeopleService(Integer maxPeopleService) {
        this.maxPeopleService = maxPeopleService;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Integer getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(Integer idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public Integer getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(Integer idTypeService) {
        this.idTypeService = idTypeService;
    }
}
