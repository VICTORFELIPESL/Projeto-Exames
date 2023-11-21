import javax.swing.JOptionPane;
public class Glicemia extends Exame {
    // precisa armazenar além dos dados do exame a quantidade de glicose por mg/l
    private int glicose;
    public String resultado = "";

    public void setGlicose(int glicose){
        this.glicose = glicose;
    }
    public int getGlicose(){
        return this.glicose;
    }
    @Override
    public void classificarResultado() {
        if (glicose < 100) {
            resultado = "Normoglicemia";
        } else if (glicose < 126) {
            resultado = "Pré-diabetes";
        } else {
            resultado = "Diabetes estabelecido";
        }
    }

    @Override
    public void mostrarResultado() {
        String mensagem = "Exame de Glicemia cadastrado \n" +
                          "Nome do paciente: " + getNomePaciente() + "\n" +
                          "Resultado: " + glicose + "\n" +
                          "Classificação: " + resultado  + "\n";

        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void cadastrarExame() {
        setNomePaciente(JOptionPane.showInputDialog("Digite o nome do paciente:"));
        setTipoSanguineo(JOptionPane.showInputDialog("Digite o tipo sanguíneo:"));
        setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:")));
        setGlicose(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de glicose:")));
        classificarResultado();
    }
}

