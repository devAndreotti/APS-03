package modelo;


public class Validacao extends AbsPropriedades
{
    // Construtor que recebe o nome e chama o método Executar
    public Validacao(String nome)
    {
        this.nome = nome;
        this.Executar();
    }
    
    // Método para executar a validação do nome
    public void Executar()
    {
        Estaticos.MENSAGEM = "";
        if(this.nome.equals(""))
        {
             Estaticos.MENSAGEM = "Nome não pode ser vazio";
        }
        else
        {
            this.nome = nome;
        }
    }
    
}