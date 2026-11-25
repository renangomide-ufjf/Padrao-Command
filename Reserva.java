package padroescomportamentais.command;

public class Reserva {

    private int codigo;
    private String hospede;
    private String situacao;

    public Reserva(int codigo, String hospede) {
        this.codigo = codigo;
        this.hospede = hospede;
    }

    public String getSituacao() {
        return situacao;
    }

    public void confirmarReserva() {
        this.situacao = "Reserva confirmada";
    }

    public void cancelarReserva() {
        this.situacao = "Reserva cancelada";
    }
}
