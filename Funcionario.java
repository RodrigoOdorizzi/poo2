
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rodri
 */
public class Funcionario extends Usuario {

//	private int codigo;
    private String nome;
    private String email;
    private String datanascimento;
    private boolean sexo;
    private int meses;
    private int vethorastrabalhadas[];
    private double vetvalorhora[];
    private double salario[];

    public Funcionario() {
    }

    public Funcionario(String user, String senha, String nome, String email, String datanascimento, boolean sexo,
            int meses, int[] vethorastrabalhadas, double[] vetvalorhora, double[] salario) {
        super(user, senha);
//		this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.meses = meses;
        this.vethorastrabalhadas = vethorastrabalhadas;
        this.vetvalorhora = vetvalorhora;
        this.salario = salario;
    }

    /*
	 * public int getCodigo() { return codigo; }
	 * 
	 * public void setCodigo(int codigo) { this.codigo = codigo; }
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int[] getVethorastrabalhadas() {
        return vethorastrabalhadas;
    }

    public void setVethorastrabalhadas(int[] vethorastrabalhadas) {
        this.vethorastrabalhadas = vethorastrabalhadas;
    }

    public double[] getVetvalorhora() {
        return vetvalorhora;
    }

    public void setVetvalorhora(double[] vetvalorhora) {
        this.vetvalorhora = vetvalorhora;
    }

    public double getSalario(int indice) {
        return salario[indice];
    }

    public void setSalario(double salario, int indice) {
        this.salario[indice] = salario;
    }

    public String printVetHorasTrabalhadas() {
        String print = "";
        for (int vet : vethorastrabalhadas) {
            print = print + "| " + vet;
        }
        return print;
    }

    public String printVetValorHora() {
        String print = "";
        for (double vet : vetvalorhora) {
            print = print + "| " + vet;
        }
        return print;
    }

   
    
    public void printSalariosMes() {
        int indice = 0;
        for (double mes : salario) {
            indice++;
            System.out.println("Salário " + indice + " " + mes);
        }
    }

    public double totalSalario() {
        double soma = 0;
        for (double salario : salario) {
            soma += salario;
        }
        return soma;
    }

    public String OrdenaSalarioDecrescente() {
        double[] ordenado = salario.clone();
        Arrays.sort(ordenado);
        List<Double> list = new ArrayList<>();
        for (double orden : ordenado) {
            list.add(orden);
        }
        Collections.reverse(list);
        String print = "";
        for (double vet : list) {
            print = print + "| " + vet;
        }
        return print;
    }

    public String OrdenaSalarioCrescente() {
        double[] ordenado = salario.clone();
        Arrays.sort(ordenado);
        String print = "";
        for (double vet : ordenado) {
            print = print + "| " + vet;
        }
        return print;
    }

    
    
    
    @Override
    public String toString() {
        return "|User:" + super.getuser()
            //    + "|Pass:" + super.getsenha()
                + "\n|Nome: " + nome
                + "| E-mail=" + email
                + "\n|Horas Trabalhadas:" + printVetHorasTrabalhadas()
                + "\n|Valor Hora:" + printVetValorHora()
                + "\n|Data de Nascimento: " + datanascimento;
    }

}
