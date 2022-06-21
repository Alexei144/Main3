import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //       ввод с консоли
        Scanner sc = new Scanner(System.in);
        String vhod = sc.nextLine();
        sc.close();


        Calculator calculator = new Calculator();

        // если нужно исключение на ввод числа больше 10, сделать здесь
             String q = calculator.calc(vhod);
             System.out.println(q);


    }
}
class Calculator {

    public String calc(String inputString) throws IOException {
        //        достаём числа и знак
        String[] masVhod = inputString.split(" ");
        if (masVhod.length!=3){
            throw new IOException();
        }

        String str1 = masVhod[0];
        String str2 = masVhod[2];
        String str3 = masVhod[1];
        if(!(str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") || str1.equals("10") || str2.equals("I")||str2.equals("II")||str2.equals("III")||str2.equals("IV")||str2.equals("V")||str2.equals("VI")||str2.equals("VII")||str2.equals("VIII")||str2.equals("IX")||str2.equals("X")||str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10") || str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X"))){

           throw new IOException();
        }


         if(((str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") || str1.equals("10")) & (str2.equals("I")||str2.equals("II")||str2.equals("III")||str2.equals("IV")||str2.equals("V")||str2.equals("VI")||str2.equals("VII")||str2.equals("VIII")||str2.equals("IX")||str2.equals("X")))){
            //  |(str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10")& (str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X"))))
            throw new IOException();
        }
         if(((str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10")) & (str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X")))){
            throw new IOException();
        }
         // Integer.parseInt(str1)<=0;)






        //  |(str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10")& (str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X"))))

        //if(a!=1 | a!=2 | a!=3|a!=4|a!=5|a!=6|a!=7|a!=8|a!=9|a!=10 & b!=1 | b!=2|b!=3|b!=4|b!=5|b!=6|b!=7|b!=8|b!=9|b!=10){
        //    throw new IOException();
       // }



        //через иф -> если стр1 и стр2 == числам, то выполняется код простого калька, элс стр1 и стр2 равняется римским то конвертируем в арабские и создаём переменные вычисляем через обычный кал потом результат переводим обратно в римские
        if (str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") || str1.equals("10") & str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10")) {
            Integer a = Integer.valueOf(str1);
            Integer b = Integer.valueOf(str2);
            char c;
            c = str3.charAt(0);
            int result;
            if(a<=0 || b<=0){
                throw new IOException();
            }
            if (a>10 || b>10){
                throw new IOException();
            }

// если не равно числам от 1 до 10 или от I до X эксепшен

            //              Вычисление
            //if ((a >= 1 && a <= 10) && (b >= 1 && b <= 10)) {
            switch (c) {
                case '+':
                    result = (a + b);
                    break;
                case '-':
                    result = (a - b);
                    break;
                case '*':
                    result = (a * b);
                    break;
                case '/':
                    result = (a / b);
                    break;
                default:
                    result = 0;
            }
            String q1 = Integer.toString(result);
            return q1;
            //}

            //return str1;

        }
        else if (str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X") & str2.equals("I")||str2.equals("II")||str2.equals("III")||str2.equals("IV")||str2.equals("V")||str2.equals("VI")||str2.equals("VII")||str2.equals("VIII")||str2.equals("IX")||str2.equals("X")){
            Roman roman1 = Roman.valueOf(str1);
            int a = roman1.getTranslation();
            Roman roman2 = Roman.valueOf(str2);
            int b  = roman2.getTranslation();
            if(a<=0 || b<=0){
                throw new IOException();
            }
            if(a>10 || b>10){
                throw new IOException();
            }


            char c;
            c = str3.charAt(0);
            int result;
            switch (c) {
                case '+':
                    result = (a + b);
                    break;
                case '-':
                    result = (a - b);
                    break;
                case '*':
                    result = (a * b);
                    break;
                case '/':
                    result = (a / b);
                    break;
                default:
                    result = 0;
            }
            int q5 = result;
            //String q1 = Integer.toString(result);
            //return q1;
            String [] rom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV","XVI","XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV","XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

          //  Roman q2 = Roman.toString(q1);
          //  Roman q2 = Roman.values()[q5-1];

            if (q5<=0){
                throw new IOException();
            }


          //  Roman q2 = Roman.valueOf(q1);
           // String q3 = q2.toString();
            String q2 = rom[q5-1];
            return q2;

        }


       // else if(!(str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") || str1.equals("10") || str2.equals("I")||str2.equals("II")||str2.equals("III")||str2.equals("IV")||str2.equals("V")||str2.equals("VI")||str2.equals("VII")||str2.equals("VIII")||str2.equals("IX")||str2.equals("X")||str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10") || str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X")))  {
        //    throw new IOException();
      //  }
  // 1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") || str1.equals("10") || str2.equals("I")||str2.equals("II")||str2.equals("III")||str2.equals("IV")||str2.equals("V")||str2.equals("VI")||str2.equals("VII")||str2.equals("VIII")||str2.equals("IX")||str2.equals("X")||str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") || str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10") || str1.equals("I")||str1.equals("II")||str1.equals("III")||str1.equals("IV")||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")||str1.equals("X"
                               // else if
        return null;


    }
}



















