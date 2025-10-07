def add(*args):
    if not args:
        return None
    has_str = any(isinstance(a, str) for a in args)
    if has_str:
        return " ".join(str(a) for a in args)
    else:
        return sum(args)

print(add(10, 20))
print(add(10, 20, 30))
print(add(10.5, 20.1))
print(add("Hello", 20))
print("************************************************************************************************************************************")
class Student:
    def __init__(self):
        self._student_id = None
        self._student_name = ""
        self._city = ""
        self._marks1 = 0
        self._marks2 = 0
        self._marks3 = 0
        self._fee_per_month = 0.0
        self._is_eligible_for_scholarship = False

    def set_student_id(self, sid):
        self._student_id = sid

    def get_student_id(self):
        return self._student_id

    def set_student_name(self, name):
        self._student_name = name

    def get_student_name(self):
        return self._student_name

    def set_city(self, city):
        self._city = city

    def get_city(self):
        return self._city

    def set_marks1(self, m):
        self._marks1 = m

    def get_marks1(self):
        return self._marks1

    def set_marks2(self, m):
        self._marks2 = m

    def get_marks2(self):
        return self._marks2

    def set_marks3(self, m):
        self._marks3 = m

    def get_marks3(self):
        return self._marks3

    def set_fee_per_month(self, fee):
        self._fee_per_month = fee

    def get_fee_per_month(self):
        return self._fee_per_month

    def set_is_eligible_for_scholarship(self, val):
        self._is_eligible_for_scholarship = bool(val)

    def get_is_eligible_for_scholarship(self):
        return self._is_eligible_for_scholarship

    def get_annual_fee(self):
        return self._fee_per_month * 12

    def get_total_marks(self):
        return self._marks1 + self._marks2 + self._marks3

    def get_average(self):
        return self.get_total_marks() / 3.0

    def get_result(self):
        if (self._marks1 > 60) and (self._marks2 > 60) and (self._marks3 > 60):
            return "pass"
        else:
            return "fail"

student1 = Student()
student1.set_student_name("John")
student1.set_marks1(70)
student1.set_marks2(80)
student1.set_marks3(90)
student1.set_fee_per_month(5000)

student2 = Student()
student2.set_student_name("Alice")
student2.set_marks1(60)
student2.set_marks2(65)
student2.set_marks3(70)
student2.set_fee_per_month(4500)

student3 = Student()
student3.set_student_name("Bob")
student3.set_marks1(85)
student3.set_marks2(90)
student3.set_marks3(95)
student3.set_fee_per_month(5500)

students = [student1, student2, student3]

highest_marks_student = max(students, key=lambda s: s.get_total_marks())
lowest_fee_student = min(students, key=lambda s: s.get_fee_per_month())

print("Highest marks student:", highest_marks_student.get_student_name())
print("Lowest fee student:", lowest_fee_student.get_student_name(), lowest_fee_student.get_fee_per_month())
for student in students:
    print(student.get_student_name(), student.get_total_marks(), student.get_average(), student.get_result(), student.get_is_eligible_for_scholarship())
print("**************************************************************************************************************************************************")
def table_for(n):
    for i in range(1, 11):
        print(f"{n} x {i} = {n * i}")

def table_while(n):
    i = 1
    while i <= 10:
        print(f"{n} x {i} = {n * i}")
        i += 1

def table_do_while(n):
    i = 1
    while True:
        print(f"{n} x {i} = {n * i}")
        i += 1
        if i > 10:
            break

table_for(2)
table_while(2)
table_do_while(2)
print("***************************************************************************************************************************************************")
def count_words(s: str) -> int:
    return len(s.split())

print(count_words("Sum of 12 and 20 is 32"))
print("***************************************************************************************************************************************************")
text = "  Hello, World!  "
print("text[0]:", text[0])
print("text[2]:", text[2])
print("'World' in text:", "World" in text)
print("'world' in text:", "world" in text)
print("len(text):", len(text))
print("text.find('World'):", text.find("World"))
print("text.find('XYZ'):", text.find("XYZ"))
a = "Apple"
b = "Apple"
c = "apple"
print("a == b:", a == b)
print("a == c:", a == c)
print("a.lower() == c.lower():", a.lower() == c.lower())
parts = ["This", "is", "joined"]
print("' '.join(parts):", " ".join(parts))
s2 = "ababa"
print("s2.rfind('ba'):", s2.rfind("ba"))
print("text[2:7]:", text[2:7])
print("text.lower():", text.lower())
print("text.upper():", text.upper())
print("text.strip():", text.strip())
print("text.lstrip():", text.lstrip())
print("text.rstrip():", text.rstrip())
print("***************************************************************************************************************************************************")
class ArrayStore:
    def __init__(self):
        self._data = []

    def accept_ten(self, *args):
        if len(args) != 10:
            raise ValueError("Need exactly 10 integers")
        self._data = list(args)

    def display_for(self):
        for x in self._data:
            print(x, end=" ")
        print()

    def display_while(self):
        i = 0
        while i < len(self._data):
            print(self._data[i], end=" ")
            i += 1
        print()

    def sort_ascending(self):
        self._data.sort()

    def count_occurrences(self, num):
        count = 0
        for x in self._data:
            if x == num:
                count += 1
        return count

    def insert_at_position(self, num, pos):
        self._data.insert(pos, num)

    def unique_elements(self):
        return list(set(self._data))

store = ArrayStore()
store.accept_ten(9, 2, 2, 9, 10, 9, 5, 7, 3, 8)
store.display_for()
store.display_while()
store.sort_ascending()
store.display_for()
print("Occurrences of 9:", store.count_occurrences(9))
store.insert_at_position(6, 3)
store.display_for()
print("Unique elements:", store.unique_elements())


