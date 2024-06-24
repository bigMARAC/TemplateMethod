import java.util.Scanner;

public abstract class PaymentTemplate {
    protected String name, sender;
    protected Double amount;
    protected PaymentForms form;
    protected Scanner input = new Scanner(System.in);
    
    public void handle() {
        getData();
        checkData();
        pay();
        confirm();
        sendNotify();
    }
    
    protected abstract void getData();
    
    private void checkData() {
        if (name.equals(null) || name == "") {
            System.out.println("Por favor, informe um nome válido");
            getData();
        }
    }
    
    private void pay() {
        System.out.println("Efetuando a transferencia...");
        
    }
    
    private void confirm() {
        System.out.println(name + ", pagamento de: R$" + amount + " realizado com sucesso.");
    }
    
    protected void sendNotify() {
    }
    
}