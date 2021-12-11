//package com.example.sprint5;

//import com.example.sprint5.NotificacionInterfaz;
//import com.example.sprint5.FormularioPublicacionDTO;

public class ControladorNotificacion implements NotificacionInterfaz.Controlador{

    private final NotificacionInterfaz.View view;

    public ControladorNotificacion(NotificacionInterfaz.View view){
        this.view = view;
    }

    @Override
    public Boolean validarCampos(FormularioPublicacionDTO formularioPublicacionDTO){
        if (formularioPublicacionDTO != null){
            if(formularioPublicacionDTO.getNombreAlimento().isEmpty()){
                view.respuestaValidacion("nombreAlimento", "Los campos no pueden estar vacios");
                return false;
            }else if (formularioPublicacionDTO.getFechaVencimiento().isEmpty()){
                view.respuestaValidacion("fecha", "los campos no puede estar vacios");
                return false;
            }else if (formularioPublicacionDTO.getTipoAlimento().isEmpty()) {
                view.respuestaValidacion("tipo", "los campos no puede estar vacios");
                return false;
            }else if (formularioPublicacionDTO.getComentario().isEmpty()) {
                view.respuestaValidacion("comentario", "los campos no puede estar vacios");
                return false;
            }
            return true;


        }else {
            view.respuestaValidacion("", "Error de implementacion");
            return false;
        }
    }

    @Override
    public Boolean guardarPublicacion(FormularioPublicacionDTO formularioPublicacionDTO){
        if (formularioPublicacionDTO != null){
            FormularioPublicacionDTO publicacionDTO = FormularioPublicacionDTO.getInstance();
            publicacionDTO.setNombreAlimento(formularioPublicacionDTO.getNombreAlimento());
            publicacionDTO.setFechaVencimiento(formularioPublicacionDTO.getFechaVencimiento());
            publicacionDTO.setTipoAlimento(formularioPublicacionDTO.getTipoAlimento());
            publicacionDTO.setComentario(formularioPublicacionDTO.getComentario());
            view.respuestaGuardado(true);
            return true;
        }
        view.respuestaGuardado(false);
        return false;
    }
}
