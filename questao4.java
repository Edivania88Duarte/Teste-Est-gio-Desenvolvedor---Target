import java.util.Scanner;
public class questao4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //tres interruptores        1000x são as tentativas de descobrir de qual sala pertencem
        int contagemInterruptor01 = 10;
        int contagemInterruptor02 = 20;
        int contagemInterruptor03 = 30;

        System.out.println("Informe o Interruptor 10, 20, 30");
        int interruptor = entrada.nextInt();
        //==============================================================================================================     
        //Sala 02
        //2 Variaveis booleanas. 
        boolean ida01 = true, ida02 = true;//porquê com certeza irei verificar 
        //ou seja, irei tentar ver de qual interruptor pertence a lâmpada da sala

        //
        if(interruptor == 10)
        {
            //Só posso ir 2x na sala para tentar identificar o interruptor da lâmpada em questão
            if(ida01 == false)//significa que fui à sala, mas, não consegui identificar o Interruptor
            {//da lâmpada da Sala especifica a qual fui descobrir!
                //faça tal coisa
            }
            
            if(ida02 == true)//Significa que fui e perdi a minha tentativa
            {
                //faça tal coisa
            }
            
            //vc já fez suas 2 tentativas e, já perdeu a identificação de 1 interruptor
            
        }
        if (ida01 == false) 
            System.out.println("Perdi minha Tentativa");
        

        if (ida02 == true) 
            if (contagemInterruptor01 == 10) 
                System.out.println("Interruptor 01 da Sala 2");
        
        //===========================================================================================================
        //Sala 01
        if (ida01 == false) 
            System.out.println("Perdi minha Tentativa");
        

        if (ida02 == true) 
            if (contagemInterruptor02 == 20) 
                System.out.println("Interruptor 02 da Sala 1");
        
        //==============================================================================================================
        //Sala 03
        if (ida01 == false) 
            System.out.println("Perdi minha Tentativa");
        

        if (ida02 == true) 
            if (contagemInterruptor03 == 30) 
                System.out.println("Interruptor 03 da Sala 3");
    }
}
