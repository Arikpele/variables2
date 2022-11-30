public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 ()    {
        System.out.println ("задача 1");
        int firstMan=35000;
        byte secondMan=10;
        short  thirdMan=30000;
        long fourthMan= 220000;
        float fifthMan= 5.58754f;
        double sixthMan=5.9844464944674944012d;
        System.out.println ("Значение переменной firstMan с типом int равно" +firstMan);
        System.out.println ("Значение переменной secondMan с типом byte равно" +secondMan);
        System.out.println("Значение переменной thirdMan с типом short равно" +thirdMan);
        System.out.println("Значение переменной fourthMan с типом long равно" +fourthMan);
        System.out.println("Значение переменной float с типом long равно" +fifthMan);
        System.out.println ("Значение переменной sixthMan с типом double равно" +sixthMan);
    }
    public static void task2 ()    {
        System.out.println ("задача 2");
        //
        int firstMan= 27897;
        byte secondMan=67;
        short  thirdMan=569;
        long fourthMan;
        fourthMan = 987678965549L;
        float fifthMan= 27.12f;
        double sixthMan=2.786;
        short seventhMAn=-159;
        System.out.println (firstMan);
        System.out.println (secondMan);
        System.out.println(thirdMan);
        System.out.println(fourthMan);
        System.out.println(fifthMan);
        System.out.println (sixthMan);
        System.out.println (seventhMAn);
    }


    public static void task3 ()    {
        System.out.println ("задача 3");
        byte ludPAv=23;
        byte annaSer=27;
        byte ekatAnd=30;
        short sheetsPaper=480;
        byte totalSheets= (byte) (annaSer+ekatAnd+ludPAv);
        byte sheets= (byte) (sheetsPaper/totalSheets);
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");
    }


    public static void task4 ()    {
        System.out.println ("задача 4");
        byte bottles=16;
        byte ourMinutes=2;
        byte oneMinutes= (byte) (bottles/ourMinutes);
        byte oneTask=20;
        byte Total= (byte) (oneMinutes*oneTask);
        System.out.println("За"+oneTask+"минут машина произвела" +Total+ "штук бутылок");
        byte day=1;
        byte hours=24;
        byte minutes=60;
        short totalSecond= (short) (day*hours*minutes*oneMinutes);
        System.out.println("За"+day+"сутки машина произвела" +totalSecond+ "штук бутылок");
        byte ourDays=3;
        int total=ourDays*hours*minutes*oneMinutes;
        System.out.println("За"+ourDays+"сутки машина произвела" +total+ "штук бутылок");
        byte month=1;
        byte ourMonth=1*30;
        int totalThird=ourMonth*hours*minutes*oneMinutes;
        System.out.println("За"+month+"месяц машина произвела" +totalThird+ "штук бутылок");
    }

    public static void task5 ()    {
        System.out.println ("задача 5");
        byte totalCans=120;
        byte whiteJar=2;
        byte brownJar=4;
        byte ourCans= (byte) (whiteJar+brownJar);
        byte ourClass= (byte) (totalCans/ourCans);
        byte ourWhite= (byte) (ourClass*whiteJar);
        byte ourBrown= (byte) (ourClass*brownJar);
        System.out.println("В школе, где"+ourClass+"классов, нужно"+ourWhite+"банок белой краски и"+ourBrown+"банок коричневой краски");


    }

    public static void task6 ()    {
        System.out.println ("задача 6");
        byte banana=5;
        byte milk= 2;
        byte iceсream=2;
        byte egg=4;
        byte oneBanana=80;
        byte oneiceсream=100;
        byte oneEgg=70;
        byte onemilk=105;
        short total= (short) ((banana*oneBanana)+(milk*onemilk)+(iceсream*oneiceсream)+(egg*oneEgg));
        System.out.println("Общий вес завтрака "+total+"граммов");
        short kg= (short) (total*0.1);
        System.out.println("Общий вес завтрака "+kg+"килограммов");
    }
    public static void task7 ()    {
        System.out.println ("задача 7");
        byte totalWeight=7;
        short totalWeightgr= (short) (totalWeight*1000);
        short oneDayfirsttask=  250;
        short oneDaysecondttask=  500;
        short firstTask= (short) (totalWeightgr/oneDayfirsttask);
        short secondTask= (short) (totalWeightgr/oneDaysecondttask);
        float averageDays= (firstTask/secondTask);
        System.out.println(+firstTask+"дней нужно спортсмену,чтобы оставаться в своей весовой категоии,с учетом если он будет терять"+oneDayfirsttask+"граммов,если же он будет терять по"+oneDaysecondttask+"граммов, то ему понадобиться"+secondTask+"дней.В среднем уйдет "+averageDays+"дней на похудение");

    }
    public static void task8 ()    {
        System.out.println ("задача 8");
        int salaryMasha=67760;
        int salaryDenis=83690;
        int salaryKristina=76230;
        double increaseMasha=salaryMasha*0.1+salaryMasha;
        double increaseDenis=salaryDenis*0.1+salaryDenis;
        double increaseKristina=salaryKristina*0.1+salaryKristina;
        int salaryDifferencemasha= (int) (increaseMasha-salaryMasha);
        int salaryDifferencedenis= (int) (increaseDenis-salaryDenis);
        int salaryDifferencekristina= (int) (increaseKristina-salaryKristina);
        System.out.println ("Маша теперь получает"+increaseMasha+"рублей. Годовой доход вырос на"+salaryDifferencemasha+"рублей");
        System.out.println ("Денис теперь получает"+increaseDenis+"рублей. Годовой доход вырос на"+salaryDifferencedenis+"рублей");
        System.out.println ("Кристина теперь получает"+increaseKristina+"рублей. Годовой доход вырос на"+salaryDifferencekristina+"рублей");
    }
}
