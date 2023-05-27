import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        int v1 =Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inicial:"));

        int v2 =Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inicial:"));
        System.out.println(v1+""+v2);

        int a = v1;
        int b = v2;
           while(v1<=v2){
            System.out.println(v1+" ");
         v1++;
    }
    
}
}