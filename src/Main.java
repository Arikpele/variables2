public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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



}
