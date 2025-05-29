
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Visitantes extends AbsPropriedades
{

   
    private static List<Visitantes> listaVisitantes = new ArrayList<>();

    public Visitantes(String nome, String resp1, String resp2, String resp3, String resp4, String resp5, String acertos, String satisfacao)
    {
       this.nome = nome;
       this.resp1 = resp1;
       this.resp2 = resp2;
       this.resp3 = resp3;
       this.resp4 = resp4;
       this.resp5= resp5;
       this.acertos = acertos;
       this.satisfacao = satisfacao;
       
    }

    
    // Método estático para adicionar um visitante à lista
    public static void adicionarVisitante(Visitantes visitante) 
    {
        listaVisitantes.add(visitante);
    }

    // Método estático para obter a lista de visitantes
    public static List<Visitantes> getListaVisitantes() 
    {
        return listaVisitantes;
    }

    // Método sobrescrito para retornar uma representação em string do visitante
    @Override
    public String toString() 
    {
        return "Nome: " + nome  + 
                ", Total de acerto: "  + acertos;
    }
    
    
    public static String pesquisaSatisfacao(){
        int bom = 0;
        int neutro = 0;
        int ruim = 0;
        
        for (Visitantes visitante : Visitantes.getListaVisitantes()) {
            if (visitante.satisfacao.equalsIgnoreCase("bom")) {
                bom++;
            }
            if (visitante.satisfacao.equalsIgnoreCase("neutro")) {
                neutro++;
            }
            if (visitante.satisfacao.equalsIgnoreCase("ruim")) {
                ruim++;
            }
        }
        // Calcular as porcentagens
        double porcentagemBom = (bom / (double) Estaticos.TOTALVISITANTES) * 100;
        double porcentagemNeutro = (neutro / (double) Estaticos.TOTALVISITANTES) * 100;
        double porcentagemeRuim = (ruim / (double) Estaticos.TOTALVISITANTES) * 100;
        
        // Retornar formatado
        StringBuilder sb = new StringBuilder();
//        sb.append("Avaliação do sistema:\n");
        sb.append("Bom: ").append(String.format("%.2f", porcentagemBom)).append("%\n");
        sb.append("Neutro: ").append(String.format("%.2f", porcentagemNeutro)).append("%\n");
        sb.append("Ruim: ").append(String.format("%.2f", porcentagemeRuim)).append("%\n");
        
        return sb.toString();
        
    }

    
    
      
    public static String porcentagensDeAcertos() {
        int totalResp1 = 0;
        int totalResp2 = 0;
        int totalResp3 = 0;
        int totalResp4 = 0;
        int totalResp5 = 0;

        int totalVisitantes = Visitantes.getListaVisitantes().size();

       
        for (Visitantes visitante : Visitantes.getListaVisitantes()) {
            if (visitante.resp1.equalsIgnoreCase("acerto")) {
                totalResp1++;
            }
            if (visitante.resp2.equalsIgnoreCase("acerto")) {
                totalResp2++;
            }
            if (visitante.resp3.equalsIgnoreCase("acerto")) {
                totalResp3++;
            }
            if (visitante.resp4.equalsIgnoreCase("acerto")) {
                totalResp4++;
            }
            if (visitante.resp5.equalsIgnoreCase("acerto")) {
                totalResp5++;
            }
        }

        // Calcular as porcentagens
        double porcentagemResp1 = (totalResp1 / (double) totalVisitantes) * 100;
        double porcentagemResp2 = (totalResp2 / (double) totalVisitantes) * 100;
        double porcentagemResp3 = (totalResp3 / (double) totalVisitantes) * 100;
        double porcentagemResp4 = (totalResp4 / (double) totalVisitantes) * 100;
        double porcentagemResp5 = (totalResp5 / (double) totalVisitantes) * 100;

        // Retornar formatado
        StringBuilder sb = new StringBuilder();
//        sb.append("Porcentagem de acertos:\n");
        sb.append("Pergunta 1: ").append(String.format("%.2f", porcentagemResp1)).append("%\n");
        sb.append("Pergunta 2: ").append(String.format("%.2f", porcentagemResp2)).append("%\n");
        sb.append("Pergunta 3: ").append(String.format("%.2f", porcentagemResp3)).append("%\n");
        sb.append("Pergunta 4: ").append(String.format("%.2f", porcentagemResp4)).append("%\n");
        sb.append("Pergunta 5: ").append(String.format("%.2f", porcentagemResp5)).append("%\n");

        return sb.toString();
    }

 
}