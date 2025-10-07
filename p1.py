a=433
print(f"Number is:{a}")


name = "Alice"               # str
age = 25                    # int
height = 5.6                # float
is_student = True           # bool
hobbies = ["reading", "coding"]  # list
scores = (90, 85, 88)       # tuple
profile = {"username": "alice123", "verified": True}  # dict
favorite_subjects = {"Math", "Science"}  # set
grade = None                # NoneType
print(f"Name: {name}, Age: {age}, Height: {height}, Student: {is_student}")
print(f"Hobbies: {hobbies}, Scores: {scores}")
print(f"Profile: {profile}")
print(f"Favorite Subjects: {favorite_subjects}")
print(f"Grade: {grade}")
print("-----------------------------------------------------------------------------------------------")

a = "123"
b = int(a)        # string to int

c = 45.67
d = str(c)        # float to string

e = [1, 2, 2, 3]
f = set(e)        # list to set

g = True
h = int(g)        # bool to int (True → 1)

i = [("x", 1), ("y", 2)]
j = dict(i)       # list of tuples to dict

print(b, type(b))
print(d, type(d))
print(f, type(f))
print(h, type(h))
print(j, type(j))
print("------------------------------------------------------------------------------------------------")

import sys

print("Script name:", sys.argv[0])
print("Arguments:", sys.argv[1:])
print("-------------------------------------------------------------------------------------------------")
import sys

# Skip the script name and convert the rest to integers
numbers = [int(arg) for arg in sys.argv[1:]]

print("Sum:", sum(numbers))
print("--------------------------------------------------------------------------------------------------")
# Get input from the user
num = float(input("Enter a number: "))

# Check if the number is positive, negative, or zero
if num > 0:
    print("The number is positive.")
elif num < 0:
    print("The number is negative.")
else:
    print("The number is zero.")
print("--------------------------------------------------------------------------------------------------")
def simple_calculator(a, b, operation):
    if operation == "add":
        print(f"{a} + {b} = {a + b}")
    elif operation == "sub":
        print(f"{a} - {b} = {a - b}")
    elif operation == "mul":
        print(f"{a} * {b} = {a * b}")
    elif operation == "div":
        if b != 0:
            print(f"{a} / {b} = {a / b}")

        else:
            print("Error: Division by zero is not allowed.")
    else:
        print("Invalid operation. Please choose from add, sub, mul, or div.")

# Example usage:
simple_calculator(10, 5, "add")
simple_calculator(10, 5, "sub")
simple_calculator(10, 5, "mul")
simple_calculator(10, 5, "div")
simple_calculator(10, 0, "div")  # Tests division by zero
simple_calculator(10, 5, "mod")  # Tests invalid operation
print("-----------------------------------------------------------------------------------------------------")
s = "Hello World! Welcome to Python."

print("Lowercase:",s.lower())            # Convert to lowercase
print("Uppercse:",s.upper())            # Convert to uppercase
print("Replace python by JavaScript:",s.replace("Python", "JavaScript"))  # Replace substring
print("Split:",s.split())            # Split into list of words
print("-----------------------------------------------------------------------------------------------------")
list=[1,2,3,4,5]
print("\nOriginal list:",list)
list.append(6)
print("After append:",list)
list.remove(3)
print("After removing 3",list)
print("List sliced:",list[1:4])
print("Sum of list:",sum(list))
print("------------------------------------------------------------------------------------------------------")
unsorted=[3,2,1,4,2]
print("unsorted list:",unsorted)
unsorted.sort();
print("Sorted list:",unsorted)
unsorted.reverse()
print("Reverse list:",unsorted)
print("*********************************************************************************************************")

student = {"name": "Alice", "age": 20, "course": "Computer Science"}

print(student["name"])         
print(student.get("age"))      
print(student.get("grade"))
print("*********************************************************************************************************")
student = {
    101: {"name": "Alice", "age": 20, "course": "Computer Science"},
    102: {"name": "Bob", "age": 21, "course": "Mathematics"},
    103: {"name": "Charlie", "age": 22, "course": "Physics"},
    104: {"name": "Diana", "age": 23, "course": "Biology"}
}


print(student[101]["name"])              
print(student[102].get("age"))           
print(student[103].get("grade", "N/A"))  
print(student[104]["course"])
print("*********************************************************************************************************")




    
