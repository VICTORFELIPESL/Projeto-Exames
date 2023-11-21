import javax.swing.JOptionPane;
public class Triglicerideos extends Exame {
    //precisa armazenar além dos dados do exame a quantidade de triglicerídeo por mg/l
    private int triglicerideo;
    public String classTriglicerideo = "";

    public void setTriglicerideo(int triglicerideo){
        this.triglicerideo = triglicerideo;
    }
    public int getTriglicerideo(){
        return this.triglicerideo;
    }
    @Override
    public void classificarResultado() {
        if (getAnoDeNascimento() >= 0 && getAnoDeNascimento() <= 9) {
            if (triglicerideo < 75) {
                classTriglicerideo = "BOM";
            } else {
                classTriglicerideo = "ELEVADO";
            }
        } else if (getAnoDeNascimento() >= 10 && getAnoDeNascimento() <= 19) {
            if (triglicerideo < 90) {
                classTriglicerideo = "BOM";
            } else {
                classTriglicerideo ="ELEVADO";
            }
        } else {
            if (triglicerideo < 150) {
                classTriglicerideo ="BOM";
            } else {
                classTriglicerideo ="ELEVADO";
            }
        }
    }

    @Override
    public void mostrarResultado() {
        String mensagem = "Exame de Triglicerídeos cadastrado:\n" +
        "Nome do paciente: " + getNomePaciente() + "\n" +
        "Triglicerídeo: " + triglicerideo + "\n" +
        "Classificação: " + classTriglicerideo;

        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void cadastrarExame() {
        setNomePaciente(JOptionPane.showInputDialog("Digite o nome do paciente:"));
        setTipoSanguineo(JOptionPane.showInputDialog("Digite o tipo sanguíneo:"));
        setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:")));
        setTriglicerideo(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Triglicerídeos:")));
        classificarResultado();
    }
}