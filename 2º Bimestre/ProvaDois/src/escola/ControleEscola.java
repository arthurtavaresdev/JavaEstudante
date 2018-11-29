package escola;

import java.util.*;

public class ControleEscola {
	List<Funcionario> lista = new ArrayList<Funcionario>();
	
	public void addFuncionario(Funcionario pessoa){
		lista.add(pessoa);
		System.out.println(pessoa.getNome() + " Foi adicionado com sucesso.");
	}
	
	public int quantidadeDeFuncionarios(){
		return lista.size();
	}
	
	public String ImprimirFuncionariosQueComecemComA(){
		
		String todos = "";
		
		for (Funcionario funcionario : lista) {
			if(funcionario.getNome().toUpperCase().charAt(0) == 'A'){
				todos += funcionario.getNome() + " ";
			}
		}
		
		return todos;
	}
	

	
	
}
