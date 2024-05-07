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
    
}
