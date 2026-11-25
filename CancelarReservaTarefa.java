package padroescomportamentais.command;

public class CancelarReservaTarefa implements Tarefa {

    private Reserva reserva;

    public CancelarReservaTarefa(Reserva reserva) {
        this.reserva = reserva;
    }

    public void executar() {
        this.reserva.cancelarReserva();
    }

    public void cancelar() {
        this.reserva.confirmarReserva();
    }
}
