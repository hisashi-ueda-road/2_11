 /**
* Task2-6 : 課題内容
* Java2章中間チェックテスト
*
* 本課題では、これまでの内容の振り返りを行い知識を深めていきましょう。<br>
* 問①から問③まであります。<br>
* 指定された値や条件を守って記述して下さい。 <br>
*
* 問③に関しては、記述してある内容を含めて結果通りに出力されるように記載を行って下さい。<br>
*
*/

public class Task2_6 {

    public static void main(String[] args){
    /*
    *問①
    *整数型の変数 a と b を宣言し、それぞれ10と3を代入して、次の演算を行い、結果を表示して下さい：
    ・a と b の和
    ・a と b の差
    ・a と b の積
    ・a と b の商
    ・a を b で割った余り
    */
     int a = 10;
        int b = 3;

    int sum = a + b;
    int min = a - b;
    int mul = a * b;
    int div = a / b;
    int sur = a % b;

    System.out.println("和: " + sum);
    System.out.println("差: " + min);
    System.out.println("積: " + mul);
    System.out.println("商: " + div);
    System.out.println("余り: " + sur); 

    /*
    * 問題②
    * 整数型の配列を宣言し、1から20までの偶数を格納して、ループを使用してそれらの整数を順番に表示して下さい。
    */
     int[] evenNumbers = new int[10];

    for (int i = 0, num = 2; i < 10; i++, num += 2) {
        evenNumbers[i] = num;
    }

    for (int number : evenNumbers) {
        System.out.println(number);
    } 

    /*
    * 整数型の配列「numbers」内の奇数の合計を、メソッド「sumOddNumbers」を使って表示して下さい。
    * ただし、0は偶数として扱います。
    */
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int add = sumOddNumbers(numbers);
        System.out.println("奇数の合計: " + add);
    }

    public static int sumOddNumbers(int[] numbers) {
        int add = 0;

    for (int i = 0; i < numbers.length; i++) {
    //問題③ 奇数かどうかの判定をするために、for文で取得したnumberを2で割り、余りが0にならないような条件文(if文)を記載して下さい。
     if (numbers[i] % 2 != 0) {
        add += numbers[i];
        }
    }
    return add;
    }
}