public class ArrayClass {
    public static void main(String[] args){
        Student[] myStudents = new Student[]{
            new Student("Dharma"), new Student("Ram"), new Student("Somu"), new Student("Lax")
        };
        for(Student m:myStudents){
            System.out.println(m);
        }
    }
}
