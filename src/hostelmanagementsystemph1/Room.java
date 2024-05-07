/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostelmanagementsystemph1;


public class Room {
  private  int room_id;  
  private  int room_number;
  private  int hostel_id;
  private  String ocupancy_status;
  private  String type;

    public Room(int room_id, int room_number, int hostel_id, String ocupancy_status, String type) {
        this.room_id = room_id;
        this.room_number = room_number;
        this.hostel_id = hostel_id;
        this.ocupancy_status = ocupancy_status;
        this.type = type;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public int getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(int hostel_id) {
        this.hostel_id = hostel_id;
    }

    public String getOcupancy_status() {
        return ocupancy_status;
    }

    public void setOcupancy_status(String ocupancy_status) {
        this.ocupancy_status = ocupancy_status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
  
  
}
