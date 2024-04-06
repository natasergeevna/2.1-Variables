public class Main {
    public static void main(String[] args) {
        task123_1();
        task4_1();
        task5_1();
        task67_1();
        tak8();
    }

    public static void task123_1(){
        System.out.println("task1_1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("task2_1");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("task3_1");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4_1() {
        System.out.println("task4_1");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5_1() {
        System.out.println("task5_1");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task67_1() {
        System.out.println("task6_1");
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var allWeight = weightTwoBoxer + weightOneBoxer;
        var minusWeight = weightTwoBoxer - weightOneBoxer;
        System.out.println("Общая масса 2 бойцов = " + allWeight + " кг");
        System.out.println("Разница между массами бойцов с помощью минуса = " + minusWeight + " кг");
        System.out.println("task7_1");
        var divisionWeight = weightTwoBoxer % weightOneBoxer;
        System.out.println("Разница между массами бойцов с помощью деления = " + divisionWeight + " кг");
    }

    public static void tak8(){
        System.out.println("task8_1");
        var allTime = 640;
        var timeOneDay = 8;
        var employee = allTime / timeOneDay;
        System.out.println("Всего работников в компании - " + employee + " человек");
        employee += 94;
        allTime = employee * timeOneDay;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + allTime + " часов работы может быть поделено ммежду сотрудниками");
    }
}