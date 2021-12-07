import java.util.List;

public interface InicioInterface {

    interface View {
        void mostrarLista(List<PublicacionesDto> ListaPublicaciones);
        void respuestaSalirApp();
    }

    interface Controlador {
        void recuperarLista();
        void salirApp();
    }

    interface Modelo {
        void obtenerLista();
    }

}