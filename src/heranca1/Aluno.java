
package heranca1;

public class Aluno extends Pessoa{
    String cursos, notas;

    public Aluno(String cursos, String notas, String nome, String endereco, 
            String telefone, String cpf){
        //super("João", "65464", "Av. Qualquer", "49849848");
        super(nome, endereco, telefone, cpf);
        this.cursos = cursos;
        this.notas = notas;
    }
    
    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public double verificarAprovado(){
        return 0;
    }
}
