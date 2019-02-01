#! /usr/bin/python

class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age
    def __repr__(self):
        return repr((self.name, self.grade, self.age))
    def weighted_grade(seld):
        return 'DCBA'.index(self.grade) / float(self.age)

students_objects = [
    Student('john', 'A', 15),
    Student('jane', 'B', 12),
    Student('dave', 'C', 10),
    Student('carl', 'D', 10)
]
print 'inicial:'
print students_objects
print 'ordenado:'
print sorted(students_objects, key=lambda student: [student.age, student.grade])
print sorted(students_objects, key=lambda student: [student.age, student.name])
print students_objects