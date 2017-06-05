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
    private static int a = 3; //number >= 4 會為魔術數字，可設為字串在去轉換

    /**
     * b is number.
     */
    private static int b = 3; //缺少 JavaDoc 說明

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
        for (int i = 0; i < a; i++) { //判斷符號兩側要為空白
            System.out.println(a);
        }
        for (int i = 0; i < a; i++) { //For後應有一個空格
            System.out.println(a);
        }
    }

    /**
     * ADD Function.
     * @return a + b
     */
    public static int getAdd() { //Function 命名第一個英文字要小寫
        // TODO Auto-generated method stub
        return (a + b);
    }
}
