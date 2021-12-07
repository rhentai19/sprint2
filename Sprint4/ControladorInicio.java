import java.util.ArrayList;
import java.util.List;

public class ControladorInicio implements InicioInterface.Controlador {

    private final InicioInterface.View view;

    public ControladorInicio(InicioInterface.View view) {
        this.view = view;
    }

    @Override
    public void recuperarLista() {

        List<PublicacionesDto> ListaPublicaciones = new ArrayList<>();

        PublicacionesDto  obj1 =  new PublicacionesDto();

        obj1.setId("1");
        obj1.setComentario("Comentario");
        obj1.setFecha("07-12-21");
        obj1.setNombre_alimento("Carne");
        obj1.setTipo_alimento("Tipo");

        ListaPublicaciones.add(obj1);

        PublicacionesDto  obj2 =  new PublicacionesDto();

        obj2.setId("2");
        obj2.setComentario("Comentario");
        obj2.setFecha("07-12-21");
        obj2.setNombre_alimento("Pollo");
        obj2.setTipo_alimento("Tipo");

        ListaPublicaciones.add(obj2);

        PublicacionesDto  obj3 =  new PublicacionesDto();

        obj3.setId("3");
        obj3.setComentario("Comentario");
        obj3.setFecha("07-12-21");
        obj3.setNombre_alimento("Pescado");
        obj3.setTipo_alimento("Tipo");

        ListaPublicaciones.add(obj3);

        PublicacionesDto  obj4 =  new PublicacionesDto();
        
        obj4.setId("4");
        obj4.setComentario("Comentario");
        obj4.setFecha("07-12-21");
        obj4.setNombre_alimento("Cerdo");
        obj4.setTipo_alimento("Tipo");

        ListaPublicaciones.add(obj4);

        view.mostrarLista(ListaPublicaciones);

    }

    @Override
    public void salirApp() {
        view.respuestaSalirApp();
    }

}