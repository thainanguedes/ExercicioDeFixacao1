
public class TestaPessoa {
    public static void main (String []args)
    {
        Pessoa p1 = new Pessoa();
        
        p1.nome = "Maike Soares";
        p1.idade = 20;
        
        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        
        
        String dados = p1.nome + "\n" + p1.idade;
        System.out.println(dados);
        
        
            
        
        
    }
    
}
