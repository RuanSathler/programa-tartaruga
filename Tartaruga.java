public class Tartaruga{

    private String nome;
    private float tamanho;
    private float crecimento;

    Tartaruga(String nomeinicial){
        this.setnome(nomeinicial);
        this.settamanho(2.0f);
        this.setcrecimento(5.0f);
    }


    public void setnome(String tempnome){
        this.nome = tempnome;
    }

    public String getnome(){
        return this.nome;
    }


    public void settamanho(float temptamanho){
        this.tamanho = temptamanho;
    }

    public float gettamanho(){
        return this.tamanho;
    }
    

    public void setcrecimento(float tempcrecimento){
        this.crecimento = tempcrecimento;
    }

    public float getcrecimento(){
        return this.crecimento;
    }

}