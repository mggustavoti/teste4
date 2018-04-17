
package heranca1;

public class Professor extends Pessoa{
    String departamento, curso;
    double salario;
    
    public Professor(){
        super("João", "65464", "Av. Qualquer", "49849848");
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
}
