public  abstract class Exame {

    private String nomePaciente;

    private String tipoSanguineo;

    private int anoDeNascimento;
    

    public void setNomePaciente(String nomePaciente){
        this.nomePaciente = nomePaciente;
    }
    public String getNomePaciente(){
        return this.nomePaciente;
    }

    public void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }
    public String getTipoSanguineo(){
       return this.tipoSanguineo;
    }

    public void setAnoDeNascimento(int anoDeNascimento){
        this.anoDeNascimento = 2023 - anoDeNascimento;
    }
    public int getAnoDeNascimento(){
        return this.anoDeNascimento;
     }

    public abstract void classificarResultado();
    public abstract void mostrarResultado();
    public abstract void cadastrarExame();
}
