public class ClasseEleitoral
{
    public static void main(String[] args){
        int idade = 21;
        
        if (idade < 16){
            System.out.println("Voto indisponível para maiores de 16 anos."); } 
        else if (idade > 65){
            System.out.println("Seu voto é facultativo.");}
        else if (idade >= 18 && idade < 65){
            System.out.println("Seu voto é obrigatório!");}
        else if (idade == 16 || idade == 17 || idade >= 65){
            System.out.println("Você possuí idade para votar, mas não é obrigatório.");}
    }
}
