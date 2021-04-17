
import java.util.ArrayList;
import java.util.List;

public class ListFuncionario {

	ArrayList<Funcionario> listandoFU = new ArrayList<Funcionario>();

	public void inserir(Funcionario fun) {
		  listandoFU.add(fun);

		if (listandoFU.isEmpty()) {

//			fun.setCodigo(1);
		} else {
//			fun.setCodigo(listandoFU.get(listandoFU.size() - 1).getCodigo() + 1);
		}
//		this.listandoFU.add(fun);

	}


	public void remove(Funcionario fun) {
		listandoFU.remove(fun);
	}

        public ArrayList<Funcionario> getLista() {

		return listandoFU;
	}

        
}
