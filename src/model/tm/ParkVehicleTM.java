package model.tm;

public class ParkVehicleTM {
    String vehicleNo;
    String vehicleType;
    Integer parkingSlot;
    String parkedTime;

    public ParkVehicleTM() {
    }

    public ParkVehicleTM(String vehicleNo, String vehicleType, Integer parkingSlot, String parkedTime) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.parkedTime = parkedTime;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Integer parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getParkedTime() {
        return parkedTime;
    }

    public void setParkedTime(String parkedTime) {
        this.parkedTime = parkedTime;
    }
}
