package Homework_07.Model;

public class ComplexNumService {

    /** Проверка комплексного числа на корректность
     *
     * @param number комплексное число в формате String
     * @return результат проверки (да/нет)
     */
    public static boolean checkComplexNum(String number){
        return number.matches("^[-+0-9i.,]+$");
        //return number.matches("\\d(\\+-*)(\\di)");
    }

    /** Преобразование комплексного числа из строки
     *  в объект класса ComplexNumber
     * @param number комплексное число в формате String
     * @return комплексное число в формате ComplexNumber
     */
    public static ComplexNumber parseComplexNum(String number){
        int i = 1;
        if (number.indexOf("-") == 0){
            i = -1;
            number = number.substring(1);
        }
        String[] num = number.replaceAll("i","").replaceAll("I","").split("[+-]");
        if (num.length==2){
            return new ComplexNumber(Double.parseDouble(num[0])*i,number.contains("-") ? Double.parseDouble(num[1])*-1 : Double.parseDouble(num[1]));
        } else return new ComplexNumber(Double.parseDouble(num[0])*i,0);
    }

    /** Подготовка строки для корректных преобразований комплексного числа
     *
     * @param number исходная строка, содержащая комплексное число
     * @return обработанная строка, содержащая комплексное число
     */
    public static String preparaStrToComplexNum(String number){
        return number.trim().replaceAll(",",".").replaceAll(" ","");
    }
}