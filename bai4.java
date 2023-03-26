import java.util.Scanner;

public class bai4 {
    public class Students{
        private String name;
        private int age;
        private String classname;
        public Students(String name, int age, String classname){
            this.name = name;
            this.age = age;
            this.classname = classname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getClassname() {
            return classname;
        }

        public void setClassname(String classname) {
            this.classname = classname;
        }

        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên học sinh :");
            String name = scanner.nextLine();
            System.out.println("Nhập tên lớp :");
            String classname = scanner.nextLine();
            System.out.println("Nhâp tuổi :");
            int age = scanner.nextInt();
            Students students = new Students(name, age, classname);
            System.out.println(" Thông tin học sinh:");
            System.out.println("Tên học sinh :" + students.getName());;
            System.out.println("Tên lớp :" + students.getClassname());
            System.out.println("Tuổi :" + students.getAge());
        }
    }
}
