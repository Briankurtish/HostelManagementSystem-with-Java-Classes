/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hostelmanagementsystemph1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class HostelManagementSystemPH1 {
    public static List hostels, rooms, students, staffs, inventory, visitors, maintenance;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void retrieve_hostel() throws IOException, ClassNotFoundException
    {
     File infile  = new File("hostel.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     hostels = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void backup_hostel() throws IOException
    {
     File outfile  = new File("hostel.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(hostels);
     outObjectStream.close();
     
    }
    
    public static void add_hostel(int hostel_id, String hostel_name, String hostel_location, int numberOfRooms, String availability_status) {
            Hostel hst = new Hostel(hostel_id, hostel_name, hostel_location, numberOfRooms,
                                    availability_status);
            hostels.add(hst);
    }
    
      public static void edit_hostel(int hostel_id, String hostel_name, String hostel_location, int numberOfRooms, String availability_status) {
      Hostel hst=null;
      Boolean found=false;
      Iterator <Hostel> itr = hostels.iterator();
      while (itr.hasNext()) {
          hst = itr.next(); 
          if(hostel_id==hst.getHostel_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          hst.setHostel_id(hostel_id);
          hst.setHostel_name(hostel_name);
          hst.setHostel_location(hostel_location);
          hst.setNumberOfRooms(numberOfRooms);
          hst.setAvailability_status(availability_status);
      }
      }

public static void delete_hostel(int hostel_id) {
      Hostel hst=null;
      Boolean found=false;
      Iterator <Hostel> itr = hostels.iterator();
      while (itr.hasNext()) {
          hst = itr.next(); 
          if(hostel_id==(hst.getHostel_id())) {
              found=true;
              break;
          }
      }
      if (found) hostels.remove(hst);
      }
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_hostels() {
      Hostel hst;
      Iterator <Hostel> itr = hostels.iterator();
      System.out.printf("\n%2s %10s %15s %15s %10s",
              "Id", "Hostel Name","Location", "No of Rooms", 
              "Availability Status");
        draw_line(79);
        
      while (itr.hasNext()) {
          hst = itr.next(); 
          System.out.printf("\n%2d %10s %15s %15s %10s %12s %12s", 
              hst.getHostel_id(), hst.getHostel_name(), 
              hst.getHostel_location(), hst.getNumberOfRooms(),
              hst.getAvailability_status());
      }
      draw_line(79);
        
    }
    
    public static void restore_rooms() throws IOException, ClassNotFoundException{
        File inFile = new File("rooms.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        rooms = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_rooms() throws IOException {
        File outFile = new File("rooms.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(rooms);
        outObjectStream.close();
    }
    
    public static void add_room(int room_id, int room_number, int hostel_id, String ocupancy_status, String type){
        Room rm = new Room(room_id, room_number, hostel_id, ocupancy_status, type);
        
        rooms.add(rm);
    }
    
    public static void edit_room(int room_id, int room_number, int hostel_id, String ocupancy_status, String type){
        
        Room rm = null;
        Boolean found = false;
        Iterator <Room> itr = rooms.iterator();
        
        while(itr.hasNext()) {
            rm = itr.next();
            if(room_id == rm.getRoom_id()) {
                found = true;
                break;
            }
        }
        
        if(found) {
            rm.setRoom_id(room_id);
            rm.setRoom_number(room_number);
            rm.setHostel_id(hostel_id);
            rm.setOcupancy_status(ocupancy_status);
            rm.setType(type);
        }
    }
    
    public static void delete_room(int room_id){
        Room rm = null;
        Boolean found = false;
        Iterator <Room> itr = rooms.iterator();
        
        while(itr.hasNext()){
            rm = itr.next();
            if(room_id == rm.getRoom_id()){
                found = true;
                break;
            }
        }
        
        if(found) rooms.remove(rm);
    }
    
    public static void list_rooms() {
        Room rm;
        Iterator <Room> itr = rooms.iterator();
        System.out.printf("\n%2s %10s %15s %20s %10s", "Room ID", "Room Number", "Hostel ID", "Ocupancy Status", "Type");
        draw_line(79);
        
        while(itr.hasNext()){
            rm = itr.next();
            System.out.printf("\n%2s %10s %14s %35s %10s", rm.getRoom_id(), rm.getRoom_number(), rm.getHostel_id(), rm.getOcupancy_status(), rm.getType());
        }
        draw_line(79);
    }
    
    
    
    public static void restore_students() throws IOException, ClassNotFoundException{
        File inFile = new File("students.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        students = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_students() throws IOException {
        File outFile = new File("students.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(students);
        outObjectStream.close();
    }
    
    public static void add_student(int std_id, String std_name, int contact, String gender, String nationality, int room_id, int hostel_id, String checkinDate, String checkoutDate){
        Student st = new Student(std_id, std_name, contact, gender, nationality, room_id, hostel_id, checkinDate, checkoutDate);
        
        rooms.add(st);
    }
    
    public static void edit_student(int std_id, String std_name, int contact, String gender, String nationality, int room_id, int hostel_id, String checkinDate, String checkoutDate){
        
        Student st = null;
        Boolean found = false;
        Iterator <Student> itr = students.iterator();
        
        while(itr.hasNext()) {
            st = itr.next();
            if(std_id == st.getStd_id()) {
                found = true;
                break;
            }
        }
        
        if(found) {
            st.setStd_id(std_id);
            st.setStd_name(std_name);
            st.setContact(contact);
            st.setGender(gender);
            st.setNationality(nationality);
            st.setRoom_id(room_id);
            st.setHostel_id(hostel_id);
            st.setCheckinDate(checkinDate);
            st.setCheckoutDate(checkoutDate);
        }
    }
    
    public static void delete_student(int std_id){
        Student st = null;
        Boolean found = false;
        Iterator <Student> itr = students.iterator();
        
        while(itr.hasNext()){
            st = itr.next();
            if(std_id == st.getStd_id()){
                found = true;
                break;
            }
        }
        
        if(found) students.remove(st);
    }
    
    public static void list_students() {
        Student st;
        Iterator <Student> itr = students.iterator();
        System.out.printf("\n%2s %10s %15s %20s %10s %10s %10s %20s %20s", "Std ID", "Std Name", "Contact", "Gender", "Nationality", "Room ID", "Hostel ID", "Check-In-Date", "Check-Out-Date");
        draw_line(79);
        
        while(itr.hasNext()){
            st = itr.next();
            System.out.printf("\n%2s %10s %14s %35s %10s %10s %10s %20s %20s", st.getStd_id(), st.getStd_name(), st.getContact(), st.getGender(), st.getNationality(), st.getRoom_id(), st.getHostel_id(), st.getCheckinDate(), st.getCheckoutDate());
        }
        draw_line(79);
    }
    
    
    public static void restore_staffs() throws IOException, ClassNotFoundException{
        File inFile = new File("staffs.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        staffs = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_staffs() throws IOException {
        File outFile = new File("staffs.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(staffs);
        outObjectStream.close();
    }
    
    public static void add_staff(int staff_id, String staff_name, int contact, String role){
        Staff stf = new Staff(staff_id, staff_name, contact, role);
        
        staffs.add(stf);
    }
    
    public static void edit_staff(int staff_id, String staff_name, int contact, String role){
        
        Staff stf = null;
        Boolean found = false;
        Iterator <Staff> itr = staffs.iterator();
        
        while(itr.hasNext()) {
            stf = itr.next();
            if(staff_id == stf.getStaff_id()) {
                found = true;
                break;
            }
        }
        
        if(found) {
            stf.setStaff_id(staff_id);
            stf.setStaff_name(staff_name);
            stf.setContact(contact);
            stf.setRole(role);
        }
    }
    
    public static void delete_staff(int staff_id){
        Staff stf = null;
        Boolean found = false;
        Iterator <Staff> itr = staffs.iterator();
        
        while(itr.hasNext()){
            stf = itr.next();
            if(staff_id == stf.getStaff_id()){
                found = true;
                break;
            }
        }
        
        if(found) staffs.remove(stf);
    }
    
    public static void list_staffs() {
        Staff stf;
        Iterator <Staff> itr = staffs.iterator();
        System.out.printf("\n%2s %10s %15s %20s", "Staff ID", "Staff Name", "Contact", "Role");
        draw_line(79);
        
        while(itr.hasNext()){
            stf = itr.next();
            System.out.printf("\n%2s %10s %14s %35s", stf.getStaff_id(), stf.getStaff_name(), stf.getContact(), stf.getRole());
        }
        draw_line(79);
    }
    
    
    
    public static void restore_inventory() throws IOException, ClassNotFoundException{
        File inFile = new File("inventory.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        inventory = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_inventory() throws IOException {
        File outFile = new File("inventory.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(inventory);
        outObjectStream.close();
    }
    
    public static void add_inventory(int item_id, String item_name, int quantity, String status){
        Inventory inv = new Inventory(item_id, item_name, quantity, status);
        
        inventory.add(inv);
    }
    
    public static void edit_inventory(int item_id, String item_name, int quantity, String status){
        
        Inventory inv = null;
        Boolean found = false;
        Iterator <Inventory> itr = inventory.iterator();
        
        while(itr.hasNext()) {
            inv = itr.next();
            if(item_id == inv.getItem_id()) {
                found = true;
                break;
            }
        }
        
        if(found) {
            inv.setItem_id(item_id);
            inv.setItem_name(item_name);
            inv.setQuantity(quantity);
            inv.setStatus(status);
        }
    }
    
    public static void delete_inventory(int item_id){
        Inventory inv = null;
        Boolean found = false;
        Iterator <Inventory> itr = inventory.iterator();
        
        while(itr.hasNext()){
            inv = itr.next();
            if(item_id == inv.getItem_id()){
                found = true;
                break;
            }
        }
        
        if(found) inventory.remove(inv);
    }
    
    public static void list_inventory() {
        Inventory inv;
        Iterator <Inventory> itr = inventory.iterator();
        System.out.printf("\n%2s %10s %15s %20s", "Item ID", "Item Name", "Quantity", "Status");
        draw_line(79);
        
        while(itr.hasNext()){
            inv = itr.next();
            System.out.printf("\n%2s %10s %14s %35s", inv.getItem_id(), inv.getItem_name(), inv.getQuantity(), inv.getStatus());
        }
        draw_line(79);
    }
    
    
    public static void restore_visitors() throws IOException, ClassNotFoundException{
        File inFile = new File("visitors.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        inventory = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_visitors() throws IOException {
        File outFile = new File("visitors.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(visitors);
        outObjectStream.close();
    }
    
    public static void add_visitor(int visitor_id, String visitor_name, String visit_reason, int hostel_id, int room_id, String start_time, String end_time){
        Visitor vst = new Visitor(visitor_id, visitor_name, visit_reason, hostel_id, room_id, start_time, end_time);
        
        visitors.add(vst);
    }
    
    public static void edit_visitor(int visitor_id, String visitor_name, String visit_reason, int hostel_id, int room_id, String start_time, String end_time){
        
        Visitor vst = null;
        Boolean found = false;
        Iterator <Visitor> itr = visitors.iterator();
        
        while(itr.hasNext()) {
            vst = itr.next();
            if(visitor_id == vst.getVisitor_id()) {
                found = true;
                break;
            }
        }
        
        if(found) {
            vst.setVisitor_id(visitor_id);
            vst.setVisitor_name(visitor_name);
            vst.setVisit_reason(visit_reason);
            vst.setHostel_id(hostel_id);
            vst.setRoom_id(room_id);
            vst.setStart_time(start_time);
            vst.setEnd_time(end_time);
        }
    }
    
    public static void delete_visitor(int visitor_id){
        Visitor vst = null;
        Boolean found = false;
        Iterator <Visitor> itr = visitors.iterator();
        
        while(itr.hasNext()){
            vst = itr.next();
            if(visitor_id == vst.getVisitor_id()){
                found = true;
                break;
            }
        }
        
        if(found) visitors.remove(vst);
    }
    
    public static void list_visitors() {
        Visitor vst;
        Iterator <Visitor> itr = visitors.iterator();
        System.out.printf("\n%2s %10s 20s %10s %10s %15s %15s", "Visitor ID", "Visitor Name", "Visit Reason", "Hostel ID", "Room ID", "Start Time", "End Time");
        draw_line(79);
        
        while(itr.hasNext()){
            vst = itr.next();
            System.out.printf("\n%2s %10s 20s %10s %10s %15s %15s", vst.getVisitor_id(), vst.getVisitor_name(), vst.getVisit_reason(), vst.getHostel_id(), vst.getRoom_id(), vst.getStart_time(), vst.getEnd_time());
        }
        draw_line(100);
    }
    
    
    public static void restore_maintenance() throws IOException, ClassNotFoundException{
        File inFile = new File("maintenance.dat");
        FileInputStream infileStream = new FileInputStream(inFile);
        ObjectInputStream inObjectstream = new ObjectInputStream(infileStream);
        maintenance = (ArrayList)inObjectstream.readObject();
        
        inObjectstream.close();
    }
    
    public static void backup_maintenance() throws IOException {
        File outFile = new File("maintenance.dat");
        FileOutputStream outfileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outfileStream);
        
        outObjectStream.writeObject(maintenance);
        outObjectStream.close();
    }
    
    public static void add_maintenance(int task_id, String description, String staff_id, String priority, String completion_status){
        Maintenance mnt = new Maintenance(task_id, description, staff_id, priority, completion_status);
        
        maintenance.add(mnt);
    }
    
    public static void edit_maintenance(int task_id, String description, String staff_id, String priority, String completion_status){
        
        Maintenance mnt = null;
        Boolean found = false;
        Iterator <Maintenance> itr = maintenance.iterator();
        
        while(itr.hasNext()) {
            mnt = itr.next();
            if(task_id == mnt.getTask_id()) {
                found = true;
                break;
            }
        }
        
        if(found) {
            mnt.setTask_id(task_id);
            mnt.setDescription(description);
            mnt.setStaff_id(staff_id);
            mnt.setPriority(priority);
            mnt.setCompletion_status(completion_status);
           
        }
    }
    
    public static void delete_maintenance(int task_id){
        Maintenance mnt = null;
        Boolean found = false;
        Iterator <Maintenance> itr = maintenance.iterator();
        
        while(itr.hasNext()){
            mnt = itr.next();
            if(task_id == mnt.getTask_id()){
                found = true;
                break;
            }
        }
        
        if(found) maintenance.remove(mnt);
    }
    
    public static void list_maintenance() {
        Maintenance mnt;
        Iterator <Maintenance> itr = maintenance.iterator();
        System.out.printf("\n%2s %10s 20s %10s %10s", "Task ID", "Description", "Staff ID", "Priority", "Completion Status");
        draw_line(79);
        
        while(itr.hasNext()){
            mnt = itr.next();
            System.out.printf("\n%2s %10s 20s %10s %10s", mnt.getTask_id(), mnt.getDescription(), mnt.getStaff_id(), mnt.getPriority(), mnt.getCompletion_status());
        }
        draw_line(100);
    }
}
