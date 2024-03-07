public class questao5 {
        
        public static void main(String[] args)
        {
            String pais01 = "Brasil";
            String pais02 = "Suíca";
            String pais03 = "Japão";
            String pais04 = "Inglaterra";
            String pais05 = "Portugal";
            String pais06 = "EUA";
            String caractereEspecial = "Edi#@*";
            
            System.out.println(reversaString(pais01.toCharArray()));
            System.out.println(reversaString(pais02.toCharArray()));
            System.out.println(reversaString(pais03.toCharArray()));
            System.out.println(reversaString(pais04.toCharArray()));
            System.out.println(reversaString(pais05.toCharArray()));
            System.out.println(reversaString(pais06.toCharArray()));
            System.out.println(reversaString(caractereEspecial.toCharArray()));
        }
        public static String reversaString(char[] charArray) {
    
            if(charArray == null) return "";
            if(charArray.length == 1) return new String(charArray); 
            int inicio = 0;
            int fim = charArray.length - 1;
            
            while(inicio < fim)
            {
                char ch = charArray[inicio];
                charArray[inicio] = charArray[fim];
                charArray[fim] = ch;
                
                inicio++;
                fim--;
            }
            
            return new String(charArray);
            
        }
       
    
    }
    
    

