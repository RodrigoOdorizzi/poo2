
import java.awt.BorderLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import static javax.management.Query.value;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Calendar;

public class main {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner entrada = new Scanner(System.in);

        Calendar c = Calendar.getInstance();
        
        int op = 0;

        String user;
        String senha;
        String nome;
        String email;
        String datanasc = "";    
        boolean sexo = false;
        
        String seexo; 
        int meses;
        String sha1="";
        int aposenta;
        
        int horastrabalhadas = 0;
        double valorhora;

        ListFuncionario listfun = new ListFuncionario();
     
        
        
        do {

            System.out.println(" Menu ");
            System.out.println(" Tecle 1 para Cadastrar");
            System.out.println(" Tecle 2 para Entrar");
            System.out.println(" Tecle 0 para Sair");

            op = entrada.nextInt();

            if (op == 1) {

                System.out.println(" Informe seu usuário");
                user = entrada.next();

                System.out.println(" Informe sua senha");
                senha = entrada.next();

                if (user.equals(senha)) {
                    System.out.println("usuário não pode ser igual a senha");

                    do {
                        System.out.println("informe uma outra senha");
                        senha = entrada.next();
                          
                    } while (user.equals(senha));
                } else {
     System.out.println("Usuário cadastrado com sucesso!");
   
                    
                
                }
                
                
                    System.out.println(" ");
                    System.out.println(" Informe seu nome");

                    nome = entrada.next();

                    System.out.println(" ");

                    System.out.println(" Informe M, para sexo Masculino, e F, para sexo Feminino ");
                    seexo = entrada.next();
                    
                  
                    if (seexo.equalsIgnoreCase("M")) {
                        
                        sexo = true;
                    } else {
                        if(seexo.equalsIgnoreCase("F")){
                        sexo = false;
                    }
                    else{
                              do{
                                  System.out.println(" Informe M ou F para o sexo.");
                                       seexo = entrada.next();
                               
                            } while(!((seexo.equalsIgnoreCase("M"))||(seexo.equalsIgnoreCase("F"))));
                               
                    }  
                            }
                
                    System.out.println(" ");
                    System.out.println(" Informe seu e-mail ");
                    email = entrada.next();

                    System.out.println(" ");

                    System.out.println(" Informe sua data de nascimento no formato DD/MM/AAAA");
                    datanasc = entrada.next();

                    
        String dataN[]=datanasc.split("/");
                    
                    System.out.println(" ");

                    System.out.println(" informe período trabalhado em meses");
                 //   meses = entrada.nextInt();

                 meses =28;
                 //   int vethorastrabalhadas[] = new int[meses];
                 //   double vetvalorhora[] = new double[meses];
                    
                 //28
                     int vethorastrabalhadas[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
                    double vetvalorhora[] =  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
                   
                    
                   
                    double salario[] = new double[meses];

                    
                     for (int x = 0; x < meses; x++) {

                         /*
                    System.out.println("Informe a quantidade de horas trabalhadas do Mes: " + (x + 1));
                    vethorastrabalhadas[x] = entrada.nextInt();

                    System.out.println("Informe valor da hora trabalhada do Mes: " + (x + 1));
                    vetvalorhora[x] = entrada.nextDouble();
*/
                         
                    salario[x] = vetvalorhora[x] * vethorastrabalhadas[x]; 

                }
                     
                     
                     
                  
                     
   /* 
                    Funcionario fun = new Funcionario();

                 
                    fun.setuser(usuario);
                    fun.setsenha(senha);
                    fun.setNome(nome);
                    fun.setEmail(email);
                    fun.setDatanascimento(datanasc);
                    fun.isSexo();
                    fun.getMeses();
                    fun.getVethorastrabalhadas();
                    fun.getVetvalorhora();
                    fun.getSalario(meses);
*/
   
   
                    
   
   /*
          Funcionario fun = new Funcionario(user, senha, nome, email, datanasc, sexo, meses, vethorastrabalhadas,
                        vetvalorhora, salario);
*/
        
             Funcionario fun = new Funcionario(user, senha, nome, email, datanasc, sexo, meses, vethorastrabalhadas,
                        vetvalorhora, salario);

          
                    listfun.inserir(fun);
 
                     System.out.println(listfun.getLista());
                   System.out.println("senha criptografada: " + fun.senhasha1());
                   
                System.out.println();
                fun.printSalariosMes();
                System.out.println("Total de todos os salarios: " + fun.totalSalario());
                System.out.println("Média de todos os salários: " + fun.totalSalario() / fun.getMeses());
                System.out.println();
             
                System.out.println("|N salarios Maiores: " + fun.OrdenaSalarioDecrescente());
                System.out.println("|N salarios Menores: " + fun.OrdenaSalarioCrescente());
                System.out.println("Meses Trabalhados: " + fun.getMeses());
                System.out.println("Anos Trabalhados: " + (int) fun.getMeses() / 12);
                
                int ano=(int) fun.getMeses() / 12;
                
                
                // fazer div e mod//                                                19 - 12
                System.out.println("Fração (sobra) de Meses Trabalhados: " + (fun.getMeses() % 12));
                System.out.println("Anos e Meses Trabalhados: " + (int) fun.getMeses() / 12 + " Ano e " + + (fun.getMeses() % 12) + " meses");
           
                System.out.println(" Ano dos 35 anos de contribuição: " +((c.get(Calendar.YEAR) + 35)- (int) fun.getMeses()/12));
            
                //numeroConvertido=data de nascimento
                 int anonascimento = Integer.parseInt( dataN[2]);
                
                System.out.println("Ano da idade mínima (65 anos): " + (65 + anonascimento));
                
                System.out.println(" Ano nascimento: " + anonascimento);
              
                      if ((c.get(Calendar.YEAR) - (anonascimento) + 35) >=65 ){
          
                          System.out.println(  );    
                          
            }
                      
                      
                System.out.println(" Ano de Aposentadoria: " );
                System.out.println(" Idade Aposentadoria: ");
                System.out.println("Idade Atual: " + (c.get(Calendar.YEAR) - anonascimento));
                System.out.println("Anos faltantes para se aposentar: ");
                
                
/*               
                Ano dos 35 anos de Contribuição: 2053
                Ano Idade Mínima (65 anos): 2043
                Ano Nascimento: 1978
                Ano Aposentadoria: 2053
                Idade Aposentadoria: 75
                Idade Atual: 41
                Anos faltantes para se aposentar: 34
                
       */          
                
                
                
            } else if (op == 2) {
                System.out.println(" voce escolheu 2");
            } else if (op == 3) {
                System.out.println(" você escolheu 3");
            } else if (op >= 4) {
                System.out.println(" opção incorreta, informar opção entre 1 e 3 ");

            }
        } while (op != 0);

        entrada.close();
    }

}
