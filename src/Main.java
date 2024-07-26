//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( " Упражнение 1");
        int [] salary ={1000,2000,3000,4000,1500};
        int sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum=sum+salary[i];

        }
        System.out.println( " Сумма затрат за месяц составила " + sum+ " рублей.");
        System.out.println( );
        System.out.println( " Упражнение 2");
        int [] salary2 ={1001,2002,3003,4004,1501};
        int maxSalari=0;
        int minSalari=1000000;
        for (int i = 0; i <salary2.length; i++) {
            if (salary2[i] > maxSalari) {
                maxSalari=salary2[i];
            }
            if (salary2[i] < minSalari){
                minSalari=salary2[i];
            }
        }

        System.out.println( " Минимальная сумма трат составила " +  minSalari + " рублей. Максимальная сумма трат  составила " + maxSalari +" рублей.");

        System.out.println( );
        System.out.println( " Упражнение 3");

int[] expenses ={ 2020,3030,410,2150,10000};
int average =0;
        for (int i = 0; i <expenses.length; i++) {
            average= average + expenses[i]/expenses.length;
        }



        System.out.println( " Средняя сумма трат за месяц составила " +  average + " рублей.");

        System.out.println( );
        System.out.println( " Упражнение 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int j = reverseFullName.length-1; j >=0 ; j--) {
            System.out.print( reverseFullName[j]);

        }


        }

    }
