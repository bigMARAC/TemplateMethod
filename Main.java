/**
 * Template Method
 * 
 * @author Marcos E. da Silva
 */
 
 import java.util.Scanner;
 
 public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha a sua forma de pagamento");
        System.out.println("CC (Cartão de Crédito) ou PIX");
        String choosed = input.nextLine();
        
        PaymentForms form = PaymentForms.valueOf(choosed);
        PaymentTemplate payment;
        
        switch(form) {
            case CC:
                payment = new CreditCardPayment();
                break;
            case PIX:
                payment = new PixPayment();
                break;
            default: 
                payment = new CreditCardPayment();
        }
        
        payment.handle();
    }
 }