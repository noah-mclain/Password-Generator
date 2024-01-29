public class Main {
    public static void main(String[] args) {
        Pass_Gen pass = new Pass_Gen();
        for (int i = 0; i < 5; i++) {
            System.out.println(pass.getPass(18));
        }
    } 
}
