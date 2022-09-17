import java.util.ArrayList;
import java.io.*;

public class Clinica {
    Console teclado = System.console();
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Medico> listaMedicos = new ArrayList<>();

    public void cadastrarCliente() {
        System.out.println("=============================");
        System.out.print("Nome do Cliente: ");
        String nome = teclado.readLine();
        System.out.print("CPF do Cliente: ");
        String cpf = teclado.readLine();
        System.out.print("Telefone do Cliente: ");
        String telefone = teclado.readLine();
        System.out.println("=============================");

        Cliente cliente = new Cliente(nome, cpf, telefone);
        listaClientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarMedico() {
        System.out.println("=============================");
        System.out.print("Nome do Médico: ");
        String nome = teclado.readLine();
        System.out.print("CPF do Médico: ");
        String cpf = teclado.readLine();
        System.out.print("CRM do Médico: ");
        String crm = teclado.readLine();
        System.out.print("Especialidade do Médico: ");
        String especialidade = teclado.readLine();
        System.out.println("=============================");

        Medico medico = new Medico();
        medico.setNome(nome);
        medico.setCpf(cpf);
        medico.setCrm(crm);
        medico.setEspecialidade(especialidade);
        listaMedicos.add(medico);

        System.out.println("Médico cadastrado com sucesso!");
    }

    public void mostrarListaMedico() {
        for (Medico medicos: listaMedicos) {
            System.out.println("Médico: " + medicos.getNome());
        }
    }

    public void cadastrarConsulta() {
        System.out.println("=============================");
        System.out.println("Médicos da clínica: ");
        mostrarListaMedico();
        System.out.println("=============================");
        System.out.print("Deseja cadastrar consulta com qual médico: ");
        String nome = teclado.readLine();
        for (Medico medicos: listaMedicos) {
            if (medicos.getNome().equals(nome)) {
                System.out.println("=============================");
                System.out.print("Nome do paciente: ");
                String nomePaciente = teclado.readLine();
                System.out.print("Dia da consulta: ");
                String diaConsulta = teclado.readLine();
                System.out.print("Hora da consulta: ");
                String horaConsulta = teclado.readLine();
                System.out.println("=============================");
                boolean val = medicos.validarAgenda(diaConsulta, horaConsulta);
                if (val == false) {
                    medicos.cadastrarConsulta(nomePaciente, horaConsulta, diaConsulta);
                    System.out.println("Consulta marcada!");
                } else {
                    System.out.println("Este horário está ocupado! Marque sua consulta em outro dia ou horário");
                }
                
            }
        }
    }

    public void verificarAgenda() {
        System.out.println("=============================");
        System.out.println("Médicos da clínica: ");
        mostrarListaMedico();
        System.out.println("=============================");
        System.out.print("Deseja verificar agenda de qual médico? ");
        String nome = teclado.readLine();
        for (Medico medicos: listaMedicos) {
            if (medicos.getNome().equals(nome)) {
                medicos.mostrarAgendaMedico();
            }
        }
    }

}
