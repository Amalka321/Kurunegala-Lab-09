public class IT26101774lab9Q3 {
    public static int add(int no1 , int no2){
        return no1+no2;
    }
    public static int multiply(int no1 , int no2){
        return no1*no2;
    }
    public static int square(int no){
        return multiply(no,no);
    }
    public static void main(String[] args){
        int answer1 = square(
                add(
                        (multiply(3,4)),(multiply(5,7))
                )
        );
        System.out.println("Result of (3*4 + 5 * 7)^2: " + answer1);
        int answer2 = add(
                square(
                        add(4,7)
                ),
                square(
                        add(8,3)
                )
        );
        System.out.println("Result 0f (4+7)^2+(8+3)^2 : " + answer2);
    }

}