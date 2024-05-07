/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostelmanagementsystemph1;


public class Student {
  private  int std_id;  
  private  String std_name;
  private  int contact;
  private  String gender;
  private  String nationality;
  private  int room_id;
  private  int hostel_id;
  private  String checkinDate;
  private String checkoutDate;

    public Student(int std_id, String std_name, int contact, String gender, String nationality, int room_id, int hostel_id, String checkinDate, String checkoutDate) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.contact = contact;
        this.gender = gender;
        this.nationality = nationality;
        this.room_id = room_id;
        this.hostel_id = hostel_id;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(int hostel_id) {
        this.hostel_id = hostel_id;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
  


}
