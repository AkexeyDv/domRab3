public class Main {


    public static void main(String[] args)
    {
        //Задание 1
        byte b=125;
        short sh=-32000;
        int i=1258425;
        long l=40025814583L;
        float fl=12587125.56845f;
        double dbl=154.85648724;
        char chr='В';
        boolean bln=true;
        System.out.println("Целочисленные переменные:");
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной sh с типом short равно "+sh);
        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной l с типом long равно "+l);

        System.out.println("Вещественные переменные:");
        System.out.println("Значение переменной fl с типом float равно "+fl);
        System.out.println("Значение переменной dbl с типом double равно "+dbl);

        System.out.println("Строковые переменные:");
        System.out.println("Значение переменной chr с типом char равно "+chr);

        System.out.println("Логические переменные:");
        System.out.println("Значение переменной bln с типом boolean равно "+bln);

        // Задание 2
        float a=27.12f;
        long b1=987678965549L;
        float c=2.786f;
        short d=569;
        short e=-159;
        short f=27897;
        byte g=67;

        //Задание 3
        byte lP=23;
        byte aS=27;
        byte eA=30;
        short paperAll=480;
        int partPaper=paperAll/(lP+aS+eA);
        System.out.println("На каждого ученика рассчитано "+partPaper+" листов бумаги");

        //Задание 4
        byte startProiz=16;
        byte deltaTime=2;
        int proizv=startProiz/deltaTime;
        int but=proizv*20;
        System.out.println("За 20 минут машина произвела "+but+" бутылок");
        but=proizv*24*60;
        System.out.println("За сутки машина произвела "+but+" бутылок");
        but=but*3;
        System.out.println("За 3 дня машина произвела "+but+" бутылок");
        but=but*10;
        System.out.println("За месяц машина произвела "+but+" бутылок");





    }
}