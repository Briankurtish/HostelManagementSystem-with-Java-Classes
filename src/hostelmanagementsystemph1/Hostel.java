/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostelmanagementsystemph1;


public class Hostel {
  private  int hostel_id;  
  private  String hostel_name;
  private  String hostel_location;
  private  int numberOfRooms;
  private  String availability_status;

    public Hostel(int hostel_id, String hostel_name, String hostel_location, int numberOfRooms, String availability_status) {
        this.hostel_id = hostel_id;
        this.hostel_name = hostel_name;
        this.hostel_location = hostel_location;
        this.numberOfRooms = numberOfRooms;
        this.availability_status = availability_status;
    }

    public int getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(int hostel_id) {
        this.hostel_id = hostel_id;
    }

    public String getHostel_name() {
        return hostel_name;
    }

    public void setHostel_name(String hostel_name) {
        this.hostel_name = hostel_name;
    }

    public String getHostel_location() {
        return hostel_location;
    }

    public void setHostel_location(String hostel_location) {
        this.hostel_location = hostel_location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getAvailability_status() {
        return availability_status;
    }

    public void setAvailability_status(String availability_status) {
        this.availability_status = availability_status;
    }
  
  
}
