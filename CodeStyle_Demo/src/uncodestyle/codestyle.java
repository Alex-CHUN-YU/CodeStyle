package uncodestyle;

/**
 *
 * CodeStyle Demo.
 *
 * @version 1.0 2017年6月5日
 * @author ALEX-CHUN-YU
 *
 */
public class codestyle { //class命名要第一個字要為大寫

    /**
     * a is number.
     */
    private static int number1 = 5; //number >= 4 會為魔術數字，type可設為(字串在去轉換)，或者把它變為常數(final)


    private static int number2 = 3; //缺少 JavaDoc 說明

    /**
     * demo is number.
     */
    private static String Demo = "Demo"; //變數 命名第一個英文字要小寫

    //JavaDoc 首句應以句號结尾。
    /**
     * Main Function
     * @param args default
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        System.out.println(Demo);
        System.out.println(GetAdd());
        for (int i=0; i < number1; i++) { //判斷符號兩側要為空白
            System.out.print("");
        }
        for(int i = 0; i < number1; i++) { //For後應有一個空格
            System.out.print("");
        }
        for (int i = 0; i < number1; i++)
        { //'{' 應位於前一行。
            System.out.print("");
        }
    }

    /**
     * ADD Function.
     * @return a + b
     */
    public static int GetAdd() { //Function 命名第一個英文字要小寫
        // TODO Auto-generated method stub
        return (number1 + number2);
    }
}
