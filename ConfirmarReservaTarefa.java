package padroescomportamentais.command;

public class ConfirmarReservaTarefa implements Tarefa {

    private Reserva reserva;

    public ConfirmarReservaTarefa(Reserva reserva) {
        this.reserva = reserva;
    }

    public void executar() {
        this.reserva.confirmarReserva();
    }

    public void cancelar() {
        this.reserva.cancelarReserva();
    }
}
