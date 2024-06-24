public class CreditCardPayment extends PaymentTemplate {
    @Override
    protected void getData() {
        System.out.println("Por favor, informe o seu nome:");
        name = input.next();
        
        System.out.println("Por favor, informe o número do seu Cartão de Crédito:");
        sender = input.next();
        
        System.out.println("Informe o valor:");
        amount = input.nextDouble();
    }
}