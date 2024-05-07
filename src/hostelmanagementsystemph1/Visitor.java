/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostelmanagementsystemph1;


public class Visitor {
    private int visitor_id;
    private String visitor_name;
    private String visit_reason;
    private int hostel_id;
    private int room_id;
    private String start_time;
    private String end_time;

    public Visitor(int visitor_id, String visitor_name, String visit_reason, int hostel_id, int room_id, String start_time, String end_time) {
        this.visitor_id = visitor_id;
        this.visitor_name = visitor_name;
        this.visit_reason = visit_reason;
        this.hostel_id = hostel_id;
        this.room_id = room_id;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public int getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(int visitor_id) {
        this.visitor_id = visitor_id;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public String getVisit_reason() {
        return visit_reason;
    }

    public void setVisit_reason(String visit_reason) {
        this.visit_reason = visit_reason;
    }

    public int getHostel_id() {
        return hostel_id;
    }

    public void setHostel_id(int hostel_id) {
        this.hostel_id = hostel_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
    
    
}
