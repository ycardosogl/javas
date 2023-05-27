public class App {
    public static void main(String[] args) throws Exception {
        //variavel de controle 
       int cont = 0;

       while(cont<=20){
        System.out.print(cont+" "); 
        //incrementar variavel de controle 
        cont++;      
       }
       System.out.println("\nvalor final do contador: "+cont);
        
       //cont de 50 ate 80
        int i = 50;
        while (i<=80) {
        System.out.print(i+" ");
        i++;
       }

       //repetir 200x 
       int frase =0; 
        while (frase<=200) {
        System.out.println("Yasmin é linda. ");
        frase++;
       }
       
       //decrescente de 100 ate 1
    int decprof = 100;
       while (decprof>=1) {
       System.out.println(decprof+" ");
       decprof=decprof -1;    
    }
    //cont iniciando 10 finalizando em 300 valores de 10 em 10 
        int y =10 ;
        while (y<=300) {
        System.out.print(y+" ");
        y= y+10 ;
       }

       // 500- 0
       int dec = 500;
       while (dec>=0) {
       System.out.println(dec+" ");
       dec=dec -50;    
    } 
    
    //mostra a soma total dos valores de 1 ate 10
    int z = 1;
    int  soma = 0;
       while (z<=10) {
         System.out.print(z+" ");
         soma = soma + z;
       z++;  
    }
    System.out.print("Valor total: "+soma);

    //contagem iniciando de 25 efinalizando em 150 incrementar o valor de 5 em 5 e colocar o valor
    int yas =25 ;
    int  somas = 0;
        while (yas<=150) {
            System.out.println(yas+" ");
                somas = somas + yas;
                yas= yas + 5 ;
   }
   System.out.print("Valor total: "+somas);
//mostra a contagem considerando os valores das variaveis abaixo
int a = 10;
int b = 30;
   while(a<=b){
    System.out.println(a+" ");
 a++;

   }

}
}