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

        //5 задание
        byte krasAll=120;
        byte rashBel=2;
        byte rashKor=4;
        int kolKlass=krasAll/(rashBel+rashKor);
        int bel=kolKlass*rashBel;
        int kor=kolKlass*rashKor;
        System.out.println("В школе, где "+kolKlass+" классов, нужно "+bel+
                " банок белой краски и "+kor+" банок коричневой краски");
        //6 задание
        byte kBan=5;
        byte plBan=80;
        short kMol=200;
        byte plMol=105;
        byte kMor=2;
        byte plMor=100;
        byte kYay=4;
        byte plYay=70;
        int vesGr=kBan*plBan+kMol*plMol/100+kMor*plMor+kYay*plYay;
        float vesKg=vesGr/1000;
        System.out.println("Спортсмен съедает "+ vesGr + " грамм ("+vesKg+" килограмм) в день");
        //7 задание
        short lGr=250;
        short rGr=500;
        byte deltaM=7;
        int lTime=7*1000/250;
        int rTime=7*1000/500;
        int midTime=(lTime+rTime)/2;
        System.out.println("Спортсмену потребуется "+lTime+" дней при сбросе 250 гр/день");
        System.out.println("Спортсмену потребуется "+rTime+" дней при сбросе 500 гр/день");
        System.out.println("Спортсмену потребуется в среднем "+midTime+" дней");
        //8 задание
        int Mery=67760;
        int Deny=83690;
        int Krys=76230;
        int fMery=Mery+Mery/100*10;
        int fDeny=Deny+Deny/100*10;
        int fKrys=Krys+Krys/100*10;
        int rMery=(fMery-Mery)*12;
        int rDeny=(fDeny-Deny)*12;
        int rKrys=(fKrys-Krys)*12;
        System.out.println("Маша теперь получает "+fMery+" рублей. Это в год на "+rMery+
                " рублей больше.");
        System.out.println("Денис теперь получает "+fDeny+" рублей. Это в год на "+rDeny+
                " рублей больше.");
        System.out.println("Кристина теперь получает "+fKrys+" рублей. Это в год на "+rKrys+
                " рублей больше.");







    }
}