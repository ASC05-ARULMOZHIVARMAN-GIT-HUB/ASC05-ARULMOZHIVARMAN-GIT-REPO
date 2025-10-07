package lab2;

import java.util.*;

class MeetingRoom {
    String roomId;
    int capacity;
    int floor;

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }
}

class ZoomMeetingRoom extends MeetingRoom {
    String zoomDeviceId;
    String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }
}

class Booking {
    String employeeId;
    String meetingDate;
    String meetingTime;
    int duration; 
    MeetingRoom room;

    public Booking(String employeeId, String meetingDate, String meetingTime, int duration, MeetingRoom room) {
        this.employeeId = employeeId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
        this.room = room;
    }
}
