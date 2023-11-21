import javax.swing.JOptionPane;
public class Colesterol extends Exame {
    // precisa armazenar além dos dados do exame a quantidade de LDL e HDL
    // por mg/l e o risco do paciente (B - baixo, M - medio e A - alto)
    private int ldl;
    private int hdl;
    private String riscoPaciente;
    public String classificacaoHdl = "";
    public String classificacaoLdl= "";

    public void setLdl(int ldl){
        this.ldl = ldl;
    }
    public int getLdl(){
        return this.ldl;
    }

    public void setHdl(int hdl){
        this.hdl = hdl;
    }
    public int getHdl(){
        return this.hdl;
    }

    public void setRiscoPaciente(String riscoPaciente){
        this.riscoPaciente = riscoPaciente;
    }
    public String getRiscoPaciente(){
        return this.riscoPaciente;
    }
    @Override
    public void classificarResultado() {
        if (getAnoDeNascimento() <= 19) {
            if (hdl > 45) {
               classificacaoHdl = "BOM";
            } else {
                classificacaoHdl = "RUIM";
            }
        } else {
            if (hdl > 40) {
                classificacaoHdl = "BOM";
            } else {
                classificacaoHdl = "RUIM";
            }
        }
        if (riscoPaciente == "B") {
            if (ldl < 100) {
                classificacaoLdl = "Bom";
            } else {
                classificacaoLdl ="Ruim";
            }
        } else if (riscoPaciente == "M") {
            if (ldl < 70) {
                classificacaoLdl = "Bom";
            } else {
                classificacaoLdl = "Ruim";
            }
        } else {
            if (ldl < 50) {
                classificacaoLdl = "Bom";
            } else {
                classificacaoLdl = "Ruim";
            }
    }
}

    @Override
    public void mostrarResultado() {
        String mensagem = "Nome: " + getNomePaciente() + "\n" +
                          "LDL: " + ldl + "\n" +
                          "HDL: " + hdl + "\n" +
                          "Risco: " + riscoPaciente + "\n" +
                          "Classificação HDL: " + classificacaoHdl + "\n" +
                          "Classificação LDL: " + classificacaoLdl + "\n";  


        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void cadastrarExame() {
        setNomePaciente(JOptionPane.showInputDialog("Digite o nome do paciente: "));
        setTipoSanguineo(JOptionPane.showInputDialog("Digite o tipo sanguíneo: "));
        setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: ")));
        setLdl(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de LDL: ")));
        setHdl(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de HDL :")));
        setRiscoPaciente(JOptionPane.showInputDialog("Risco (A-ALTO M-MEDIO B-BAIXO): "));
        classificarResultado();
    }
}
