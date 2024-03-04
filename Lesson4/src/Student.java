
public class Student {
    int StudentId;
    int year;
    String name;
    String surname;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;
}
class StudentTest{
    public static void main(String[] args) {

        Student St1 = new Student();
        St1.StudentId = 1;
        St1.year = 2;
        St1.name = "Stanislav";
        St1.surname = "Kushvidov";
        St1.mathGrade = 6.6;
        St1.economicsGrade = 7.5;
        St1.foreignLanguageGrade = 4.9;

        Student St2 = new Student();
        St2.StudentId = 2;
        St2.year = 4;
        St2.name = "Maryna";
        St2.surname = "Kushvidova";
        St2.mathGrade = 8.6;
        St2.economicsGrade = 5.4;
        St2.foreignLanguageGrade = 6.7;

        Student St3 = new Student();
        St3.StudentId = 3;
        St3.year = 4;
        St3.name = "Yehor";
        St3.surname = "Zubenko";
        St3.mathGrade = 5.5;
        St3.economicsGrade = 4.6;
        St3.foreignLanguageGrade = 7.5;


        System.out.println("Средняя арефметическая оценка " + St1.name +" "
                + St1.surname+" "+(St1.mathGrade + St1.economicsGrade + St1.foreignLanguageGrade) /3);
        System.out.println("Средняя арефметическая оценка " + St2.name +" "
                + St2.surname+" "+(St2.mathGrade + St2.economicsGrade + St2.foreignLanguageGrade) /3);
        System.out.println("Средняя арефметическая оценка " + St3.name +" "
                + St3.surname+" "+(St3.mathGrade + St3.economicsGrade + St3.foreignLanguageGrade) /3);


    }
}