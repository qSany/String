public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        System.out.println("Ф. И. О. сотрудника - " + firstName + " " + middleName + " " + lastName);

        System.out.println("Задача 2");
        String fullName = "IVANOV IVAN IVANOVICH";
        System.out.printf("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replaceAll("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName1);

        System.out.println();
        System.out.println("Задача 4");
    }
    }



