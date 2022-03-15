public class reverse {
    public static void main(String[] args) {

        Integer n = 1234,reverse = 0;

        while (n != 0)
        {
            Integer r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        System.out.println("Reversed Number is "+reverse);
    }
}
