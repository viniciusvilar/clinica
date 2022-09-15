public class Agenda {
    private String nomePaciente;
    private String diaConsulta;
    private String horaConsulta;


    public Agenda(String nomePaciente, String diaConsulta, String horaConsulta) {
        this.nomePaciente = nomePaciente;
        this.diaConsulta = diaConsulta;
        this.horaConsulta = horaConsulta;
    }


    public String getNomePaciente() {
        return nomePaciente;
    }


    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }


    public String getDiaConsulta() {
        return diaConsulta;
    }


    public void setDiaConsulta(String diaConsulta) {
        this.diaConsulta = diaConsulta;
    }


    public String getHoraConsulta() {
        return horaConsulta;
    }


    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    

    
}
