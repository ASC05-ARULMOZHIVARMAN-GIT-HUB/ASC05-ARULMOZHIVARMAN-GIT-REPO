class MeetingRoom:
    def __init__(self, room_id, capacity, floor_location):
        self.room_id = room_id
        self.capacity = capacity
        self.floor_location = floor_location

class ZoomMeetingRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor_location, zoom_device_id, zoom_account_id):
        super().__init__(room_id, capacity, floor_location)
        self.zoom_device_id = zoom_device_id
        self.zoom_account_id = zoom_account_id

class Booking:
    def __init__(self, employee_id, meeting_date, meeting_time, duration, room: MeetingRoom):
        self.employee_id = employee_id
        self.meeting_date = meeting_date
        self.meeting_time = meeting_time
        self.duration = duration
        self.room = room

    def __repr__(self):
        return (f"Booking(employee_id={self.employee_id}, date={self.meeting_date}, "
                f"time={self.meeting_time}, duration={self.duration}, room_id={self.room.room_id})")

class BookingManager:
    def __init__(self):
        self.bookings_by_date = {}

    def add_booking(self, booking: Booking):
        date = booking.meeting_date
        if date not in self.bookings_by_date:
            self.bookings_by_date[date] = []
        self.bookings_by_date[date].append(booking)

    def get_bookings_for_date(self, date):
        return self.bookings_by_date.get(date, [])


def welcome_message(name):
    return f"Welcome, {name}!"

def largest_number(a, b, c):
    return max(a, b, c)

def print_digits_in_words(number):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for digit in str(number):
        print(words[int(digit)])




# 1. Test booking system and classes
room1 = MeetingRoom("R001", 10, "2nd Floor")
room2 = ZoomMeetingRoom("Z001", 8, "3rd Floor", "ZD100", "ZA200")

mgr = BookingManager()
b1 = Booking("E123", "2025-10-10", "10:00", 2, room2)
b2 = Booking("E456", "2025-10-10", "14:00", 1.5, room1)
mgr.add_booking(b1)
mgr.add_booking(b2)

print("Bookings on 2025-10-10:")
print(mgr.get_bookings_for_date("2025-10-10"))

print("***************************************************************************************************************************************************")
print(welcome_message("Alice"))

# 3. Largest of three numbers
print("Largest of (5, 12, 9):", largest_number(5, 12, 9))
print("***************************************************************************************************************************************************")

# 4. Print digits in words
print("Digits of 307 in words:")
print_digits_in_words(307)

