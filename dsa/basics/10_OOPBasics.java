/**
 * 10 — OOP basics (classes, objects, constructors)
 *
 * Used in LLD (parking lot) and when LeetCode gives a class like ListNode:
 *
 *   class ListNode {
 *       int val;
 *       ListNode next;
 *       ListNode(int val) { this.val = val; }
 *   }
 */
class OOPBasics {

    public static void main(String[] args) {
        // "new" creates an object on the heap; variable holds reference
        Student s1 = new Student("Ada", 20);
        Student s2 = new Student("Bob", 22);

        s1.study("Java");
        System.out.println(s1.introduce());

        // static field/method — belongs to class, not one object
        System.out.println("Total students: " + Student.count);
    }
}

// Fields + methods grouped together
class Student {
    String name;
    int age;
    static int count = 0;  // shared by all Student objects

    // Constructor — runs when you write new Student(...)
    Student(String name, int age) {
        this.name = name;  // this.name = field, name = parameter
        this.age = age;
        count++;
    }

    void study(String subject) {
        System.out.println(name + " is studying " + subject);
    }

    String introduce() {
        return "I'm " + name + ", age " + age;
    }
}
