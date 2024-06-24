public class PixPayment extends PaymentTemplate {
    @Override
    protected void getData() {
        System.out.println("Por favor, informe o seu nome:");
        name = input.next();
        
        System.out.println("Por favor, informe o seu CPF:");
        sender = input.next();
        
        System.out.println("Informe o valor:");
        amount = input.nextDouble();
    }
    
    @Override
    protected void sendNotify() {
        System.out.println("Obrigado por usar os serviços PIX.");
    }
}