public class Main {
    public static void main(String[] args) {
       double dog = 8;
        System.out.println(dog);
       var cat = 3.6;
        System.out.println(cat);
       var paper = 763789;
       System.out.println(paper);

       dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 3;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задание 6
        var boxers1Weight = 78.2;
        var boxers2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxers1Weight + boxers2Weight));
        System.out.println("Разница весов двух бойцов: " + (boxers2Weight - boxers1Weight));

        // Задание 7
     System.out.println("Разница весов двух бойцов(1 способ): " + (boxers2Weight - boxers1Weight));
     System.out.println("Разница весов двух бойцов(2 способ): " + (boxers2Weight % boxers1Weight));

     // Задание 8
     var totalWorkingWoors = 640;
     var hoursPerDay = 8;
     var totalEmployaes = totalWorkingWoors / hoursPerDay;
     System.out.println("Всего работников в компании - " + totalEmployaes + " человек");
     totalEmployaes = totalEmployaes + 94;
     totalWorkingWoors = totalEmployaes*hoursPerDay;
     System.out.println("Если в компании работает " + totalEmployaes + " человека, то всего " + totalWorkingWoors +  " часа работы может быть поделено между сотрудниками");

    }
}

