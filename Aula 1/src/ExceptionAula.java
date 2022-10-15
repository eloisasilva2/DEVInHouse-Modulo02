public class ExceptionAula {
    public static void main(String[] args) {
        try {
            int a = 0;
//            int b = a/a;
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("(ArithmeticException)Mensagem Excessão:" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("(RuntimeException)Mensagem Excessão:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("(Exception)Mensagem Excessão:" + e.getMessage());
        }
    }
}
