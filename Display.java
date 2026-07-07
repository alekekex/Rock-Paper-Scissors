public class Display {
    public static void displayObject(int n) {
        switch(n) {
            case 1:
                System.out.println("""
                    _______
                ---'   ____)
                      (_____)
                      (_____)
                      (____)
                ---.__(___)
                """);
                break;
            case 2:
                System.out.println("""
                     _______
                ---'    ____)____
                           ______)
                          _______)
                         _______)
                ---.__________)
                """);
                break;
            case 3:
                System.out.println("""
                    _______
                ---'   ____)____
                          ______)
                       __________)
                      (____)
                ---.__(___)
                """);
                break;
        }
    }
}
