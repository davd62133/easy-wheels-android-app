package com.ieti.easywheels.model;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;
import java.util.List;

public class Trip {

    private @ServerTimestamp Date arrivalDate;
    private Integer availableSeats;
    private String day;
    private @ServerTimestamp Date departureDate;
    private String driverEmail;
    private Boolean full;
    private List<String> geoHashes;

    private String hour;
    private List<String> passengers;
    private List<PassengerInfo> passengersWithInfo;
    private List<GeoPoint> route;
    private Boolean toUniversity;

    // Wrapper attribute
    private GeoPoint meetingPoint;

    public Trip() {
    }

    public Trip(Integer availableSeats, String day, Date departureDate, String driverEmail, String hour, List<GeoPoint> route, Boolean toUniversity, Date arrivalDate) {
        this.availableSeats = availableSeats;
        this.day = day;
        this.departureDate = departureDate;
        this.driverEmail = driverEmail;
        this.hour = hour;
        this.route = route;
        this.toUniversity = toUniversity;
        this.arrivalDate = arrivalDate;
        full = false;
        passengers = null;
        passengersWithInfo = null;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day=day;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public Boolean getFull() {
        return full;
    }

    public void setFull(Boolean full) {
        this.full = full;
    }

    public List<String> getGeoHashes() {
        return geoHashes;
    }

    public void setGeoHashes(List<String> geoHashes) {
        this.geoHashes = geoHashes;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }

    public List<PassengerInfo> getPassengersWithInfo() {
        return passengersWithInfo;
    }

    public void setPassengersWithInfo(List<PassengerInfo> passengersWithInfo) {
        this.passengersWithInfo = passengersWithInfo;
    }

    public List<GeoPoint> getRoute() {
        return route;
    }

    public void setRoute(List<GeoPoint> route) {
        this.route = route;
    }

    public Boolean getToUniversity() {
        return toUniversity;
    }

    public void setToUniversity(Boolean toUniversity) {
        this.toUniversity = toUniversity;
    }

    public GeoPoint getMeetingPoint() {
        return meetingPoint;
    }

    public void setMeetingPoint(GeoPoint meetingPoint) {
        this.meetingPoint = meetingPoint;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "arrivalDate=" + arrivalDate +
                ", availableSeats=" + availableSeats +
                ", day='" + day + '\'' +
                ", departureDate=" + departureDate +
                ", driverEmail='" + driverEmail + '\'' +
                ", full=" + full +
                ", geoHashes=" + geoHashes +
                ", hour='" + hour + '\'' +
                ", passengers=" + passengers +
                ", passengersWithInfo=" + passengersWithInfo +
                ", route=" + route +
                ", toUniversity=" + toUniversity +
                ", meetingPoint=" + meetingPoint +
                '}';
    }

    public String dayInSpanish(){
        switch(day){
            case "Monday":
                return "Lunes";
            case "Tuesday":
                return "Martes";
            case "Wednesday":
                return "Miércoles";
            case "Thursday":
                return "Jueves";
            case "Friday":
                return "Viernes";
            default:
                return "Sábado";
        }
    }
}
