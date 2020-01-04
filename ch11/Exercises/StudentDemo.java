public class StudentDemo {
    public static void main(String[] args){
    Student[] students = new Student[6];
        for(int i = 0; i < students.length; i++){
            if(i < 2){
                students[i] = new StudentAtLarge(i+1, ((i+1) + ", A Student At large"));
            }
            else if (i < 4){
                students[i] = new UndergraduateStudent(i+1, ((i+1) + ", An Undergraduate Student"));
            }

            else{
                students[i] = new GraduateStudent(i+1, ((i+1) + ", A Graduate Student"));
            }
        }
        for(int i=0; i<students.length; i++){
            System.out.println("ID " + students[i].getId() + " Last name: " + students[i].getLast() + " Tuition: $" + students[i].getTuition());
        }
    }

}

