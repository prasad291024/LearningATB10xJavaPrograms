package ex_19_OOPs_Part2.Inheritance.Single_Inheritance.Example;

    // Parent class
    class Parent {
        /*
         * This method prints a message to the console.
         */
        public void l1() {
            System.out.println("Parent");
        }
        public void m1() {  // Method Overriding
            System.out.println("Parent1");
        }
    }

    // Child class inheriting Parent
    class Child extends Parent {
        /*
         * This method overrides the m1() method inherited from the Parent class
         * and prints a different message to the console.
         */

        public void m1() {  // Method Overriding
            System.out.println("Child1");
        }
        /*
        * This method defines a new method in the Child class.
        */
        public void m2() {  // Child-specific method
            System.out.println("Child2");
        }
    }

    public class LabP2_Inheritane {
        public static void main(String[] args) {
            // Create an instance of the Child class
            Child c = new Child();

            // Call the m1() method inherited from the Parent class
            c.m1();

            // Call the m2() method defined in the Child class
            c.m2();

            c.l1();
            // Call the m1() method overridden in the Child class
            c.m1();
            // Call the m1() method inherited from the Parent class
            ((Parent) c).m1();


        }
    }