package furama_resort.models;

public class Villa extends Services{
    private String roomStandard;        //tiêu chuẩn phòng
    private String otherFacilities;     //tiện nghi khác
    private double poolArea;            // diện tích hồ bơi
    private int numberOfFloors;         // số tầng nhà

    public Villa(String id, String nameService, double usableArea, int rentalCosts, int maxNumberOfPeople,
                 String typeOfRent, String roomStandard, String otherFacilities, double poolArea, int numberOfFloors) {
        super(id, nameService, usableArea, rentalCosts, maxNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
