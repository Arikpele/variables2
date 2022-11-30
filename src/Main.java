public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 ()    {
        System.out.println ("задача 1");
        int firstMan=35000;
        byte secondMan=120;
        short  thirdMan=30000;
        long fourthMan= 220000;
        float fifthMan= secondMan+1f;
        double sixthMan=secondMan+2d;
        System.out.println (firstMan);
        System.out.println (secondMan);
        System.out.println(thirdMan);
        System.out.println(fourthMan);
        System.out.println(fifthMan);
        System.out.println (sixthMan);
    }
    public static void task2 ()    {
        System.out.println ("задача 2");
        //
        int firstMan= 27897;
        byte secondMan=67;
        short  thirdMan=569;
        long fourthMan;
        fourthMan = 987678965549l;
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
}