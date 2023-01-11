public class App {
    public static void main(String[] args) {
        int num = 1;
        int interaction = 5;
        for (int x = 0; x < interaction; x++) {
            for(int j = 1; j <= num; j++) {
                System.out.print(num+ " ");
            }
            System.out.println();
            num = num + 1;
        }
    }
}
