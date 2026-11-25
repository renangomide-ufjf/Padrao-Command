package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecepcaoTest {

    Recepcao recepcao;
    Reserva reserva;

    @BeforeEach
    void setUp() {
        recepcao = new Recepcao();
        reserva = new Reserva(101, "Maria");
    }

    @Test
    void deveConfirmarReserva() {
        Tarefa confirmarReserva = new ConfirmarReservaTarefa(reserva);
        recepcao.executarTarefa(confirmarReserva);

        assertEquals("Reserva confirmada", reserva.getSituacao());
    }

    @Test
    void deveCancelarReserva() {
        Tarefa cancelarReserva = new CancelarReservaTarefa(reserva);
        recepcao.executarTarefa(cancelarReserva);

        assertEquals("Reserva cancelada", reserva.getSituacao());
    }

    @Test
    void deveDesfazerCancelamentoReserva() {
        Tarefa confirmarReserva = new ConfirmarReservaTarefa(reserva);
        Tarefa cancelarReserva = new CancelarReservaTarefa(reserva);

        recepcao.executarTarefa(confirmarReserva);
        recepcao.executarTarefa(cancelarReserva);

        recepcao.cancelarUltimaTarefa();

        assertEquals("Reserva confirmada", reserva.getSituacao());
    }

}
