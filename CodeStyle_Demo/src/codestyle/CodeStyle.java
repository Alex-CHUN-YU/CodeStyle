package codestyle;

/**
 *
 * CodeStyle Demo.
 *
 * @version 1.0 2017年6月5日
 * @author ALEX-CHUN-YU
 *
 */
public class CodeStyle { //class命名要第一個字要為大寫

    /**
     * a is number.
     */
    private static final int NUMBER1 = 5; //number >= 4 會為魔術數字，type可設為(字串在去轉換)，或者把它變為常數(final)

    /**
     * b is number.
     */
    private static int number2 = 3; //缺少 JavaDoc 說明

    /**
     * demo is number.
     */
    private static String demo = "Demo"; //變數 命名第一個英文字要小寫

    //JavaDoc 首句應以句號结尾。
    /**
     * Main Function.
     * @param args default
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        System.out.println(demo);
        System.out.println(getAdd());
        for (int i = 0; i < NUMBER1; i++) { //判斷符號兩側要為空白
            System.out.print("");
        }
        for (int i = 0; i < NUMBER1; i++) { //For後應有一個空格
            System.out.print("");
        }
        for (int i = 0; i < NUMBER1; i++) { //'{' 应位于前一行。
            System.out.print("");
        }
    }

    /**
     * ADD Function.
     * @return a + b
     */
    public static int getAdd() { //Function 命名第一個英文字要小寫
        // TODO Auto-generated method stub
        return (NUMBER1 + number2);
    }
}
