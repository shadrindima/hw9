public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("ДЗ1 Задание 1");
        int salary = 65535;
        int total = 0;
        int i = 0;
        for(; total < 2_459_000; i++){
            total = total + total/100;
            total = total + salary;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total+ " рублей");
        }
        System.out.print(total);
        System.out.print(i);
        System.out.println("     " + "ДЗ1 Задание 2");
        int c=0;
        for (;c<11;c++){
            System.out.print(" "+c);
        }

        int a=10;
        for (;a>0;a--){
            System.out.print(" "+a);
        }
        System.out.println("    " + "ДЗ1 Задание 3");
        int y=1;
        for (;y<11;y++) {
            int populatioтСountry = 12_000_000;
            int birth = 17;
            int mortality = 8;
            int growth = birth - mortality;
            int totalGrowth = growth * (populatioтСountry / 1000);
            int populatioтСountryYear = populatioтСountry + totalGrowth * y;
            System.out.println("Год " + y + " Количество населения " + populatioтСountryYear);
        }
        System.out.println("    " + "ДЗ2 Задание 1,2,3");
        int contribution = 15000;
        int month = 6;
        int period = 12*9;
        for (;contribution<= 12_000_000;month=month +6){
            if (month > period) break;
            contribution = contribution+(contribution/100*7)*6;
            System.out.println("Общая сумма " + contribution + " Количество месяцев "+month);

        }
        System.out.println("    " + "ДЗ2 Задание 4");
        int number = 2;
        for (; number <= 31; number= number +7){
            System.out.println("Сегодня пятница, "+number+"-е число. Необходимо подготовить отчет." );
        }
        System.out.println("    " + "ДЗ3 Задание 1");
        int year= 1975;
        int futureYear = year+200;
        int pastYear = year-50;
        for (; year<=futureYear;year=year+79){
            System.out.println(year);
        }
        for (; pastYear<=year;year= year-79){
        }
        System.out.println(year);
        System.out.println("    " + "ДЗ3 Задание 2");
        int figure = 1;
        for (; figure<11; figure ++){
            int amount = figure*2;
            System.out.println( "2*"+figure+"="+amount);
        }
    }
}