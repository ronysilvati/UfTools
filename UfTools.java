package 'com.seu.pacote';

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ronyberque.silva
 */
public class UfTools {
    
    private static HashMap<String,String> unidadesFederativas;
    
    /**
     *
     * @return
     */
    public static HashMap<String,String> getUnidadesFederativas(){
        unidadesFederativas = new HashMap<String, String>();
        unidadesFederativas.put("AC", "Acre");
        unidadesFederativas.put("AL", "Alagoas");
        unidadesFederativas.put("AP", "Amapá");
        unidadesFederativas.put("AM", "Amazonas");
        unidadesFederativas.put("BA", "Bahia");
        unidadesFederativas.put("CE", "Ceará");
        unidadesFederativas.put("DF", "Distrito Federal");
        unidadesFederativas.put("ES", "Espírito Santo");
        unidadesFederativas.put("GO", "Goiás");
        unidadesFederativas.put("MA", "Maranhão");
        unidadesFederativas.put("MT", "Mato Grosso");
        unidadesFederativas.put("MS", "Mato Grosso do Sul");
        unidadesFederativas.put("MG", "Minas Gerais");
        unidadesFederativas.put("PA", "Pará");
        unidadesFederativas.put("PB", "Paraíba");
        unidadesFederativas.put("PR", "Paraná");
        unidadesFederativas.put("PE", "Pernambuco");
        unidadesFederativas.put("PI", "Piauí");
        unidadesFederativas.put("RJ", "Rio de Janeiro");
        unidadesFederativas.put("RN", "Rio Grande do Norte");
        unidadesFederativas.put("RS", "Rio Grande do Sul");
        unidadesFederativas.put("RO", "Rondônia");
        unidadesFederativas.put("RR", "Roraima");
        unidadesFederativas.put("SC", "Santa Catarina");
        unidadesFederativas.put("SP", "São Paulo");
        unidadesFederativas.put("SE", "Sergipe");
        unidadesFederativas.put("SE", "Tocantins");
        
        return unidadesFederativas;
    }
    
    public static void percorrerUnidadesFederativas(){
        for (Map.Entry<String, String> entry : unidadesFederativas.entrySet()) {
            String uf = entry.getKey();
            String descricao = entry.getValue();
            
            System.out.println(uf+" -- "+descricao);
        }
    }
}
