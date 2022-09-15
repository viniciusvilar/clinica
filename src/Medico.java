import java.util.ArrayList;

public class Medico {
    // Atributos
    private String nome;
    private String cpf;
    private String crm;
    private String especialidade;
    private ArrayList<Agenda> agendaMedico = new ArrayList<>();


    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void mostrarAgendaMedico() {
        //return agendaMedico;
        for (Agenda consultas: agendaMedico) {
            System.out.println("=============================");
            System.out.println("Paciente: " + consultas.getNomePaciente());
            System.out.println("Dia da Consulta: " + consultas.getDiaConsulta());
            System.out.println("Hora da Consulta: " + consultas.getHoraConsulta());
            
        }
    }

    // ArrayList<Agenda> agendaMedico - Caso de errado voltar aqui

    public void cadastrarConsulta(String nomePaciente, String horaConsulta, String diaConsulta) {
       Agenda consulta = new Agenda(nomePaciente, diaConsulta, horaConsulta);
       agendaMedico.add(consulta);
    }
}
