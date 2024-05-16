import java.util.Scanner;

public class main{

    public static void main(String[] args){

        System.out.println("ola, vamos comecar");

        Tartaruga tartaruga1 = new Tartaruga("luna");
        Tartaruga tartaruga2 = new Tartaruga("amelia");
        Scanner ler = new Scanner(System.in);

        String resposta;
        float quantidade;
        

        System.out.println("hola, meu nome he "+tartaruga1.getnome());
        System.out.println("deseja mudar meu nome?");          

        while (true) {
        
            resposta = ler.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("qual nome deseja?");               
                resposta = ler.nextLine();
                tartaruga1.setnome(resposta);
                System.out.println("meu novo nome he "+tartaruga1.getnome());

            break;}

            else if (resposta.equalsIgnoreCase("nao")){
                System.out.println("tudo bem, vamos prosseguir");
            break;}

            else{
                System.out.println("por favor, insira apenas sim ou nao");
            }            
        }      
        
        System.out.println("por favor insira meu tamanho atual");
        quantidade = ler.nextFloat();
        tartaruga1.settamanho(quantidade);

        System.out.println("ok, agora insira o quanto eu cresco por ano");
        quantidade = ler.nextFloat();
        tartaruga1.setcrecimento(quantidade); 

        
        System.out.println("tudo certo, vamos para a proxima");
        System.out.println("hola, meu nome he "+tartaruga2.getnome());
        System.out.println("deseja mudar meu nome?");      


        while (true) {
        
            resposta = ler.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("qual nome deseja?");               
                resposta = ler.nextLine();
                tartaruga2.setnome(resposta);
                System.out.println("meu novo nome he "+tartaruga2.getnome());

            break;}

            else if (resposta.equalsIgnoreCase("nao")){
                System.out.println("tudo bem, vamos prosseguir");
            break;}

            else{
                System.out.println("por favor, insira apenas sim ou nao");
            }            
        }      
        
        System.out.println("por favor insira meu tamanho atual");
        quantidade = ler.nextFloat();
        tartaruga2.settamanho(quantidade);

        System.out.println("ok, agora insira o quanto eu cresco por ano");
        quantidade = ler.nextFloat();
        tartaruga2.setcrecimento(quantidade); 

        System.out.println("as tartarugas "+tartaruga1.getnome()+" e "+tartaruga2.getnome()+"... ");
        float tamanhot = (tartaruga1.gettamanho()-tartaruga2.gettamanho());
        float crescimentot = (tartaruga2.getcrecimento()-tartaruga1.getcrecimento());

        if ((tamanhot == 0))  {
            System.out.println("elas já tem o mesmo tamanho");
        } 

        if((tamanhot < 0)&&(crescimentot < 0)){
            System.out.println("elas teram o mesmo tamanho em "+tamanhot/crescimentot+" ano");

        }

        if(((tamanhot < 0)&&(crescimentot > 0)) || ((tamanhot > 0)&&(crescimentot < 0)) || ((tamanhot !=0)&&(crescimentot ==0))){
            System.out.println("elas nunca teram o mesmo tamanho");

        }

        if((tamanhot >0)&&(crescimentot >= 0)){
            System.out.println("elas teram o mesmo tamanho em "+tamanhot/crescimentot+" ano" );
        }

        System.out.println("obrigado");

    }



}        



    