public class Instance {
    public static void main(String[] args) {
        try {
            // Creating an obj of the outer class NewInstanceObj
            Instance outerClass = new Instance();
            Class<?> c = Class.forName("NewInstanceObj$Student");


            Student s = (Student) c.getDeclaredConstructor(Instance.class).newInstance(outerClass);

            
            s.name = "Himanshu";
            s.roll_no = 21;

           
            System.out.println("Student Details: ");
            s.display();

        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
    class Student
     {
        String name;
        int roll_no;

        //methodd
        void display() {
            System.out.println("Name: " + name);
            System.out.println("RollNo: " + roll_no);
        }
    }
}
