package com.example.sprint2;

import java.util.UUID;

public interface LoginIterface {
    void onSucced(UUID uid, String username);

    void onError(String error);

    interface View{
        void onSucced(UUID uid, String username);
        void onError(String error);


        void validarResultado(String editText, String mensaje);
        void usuarioAutorizado(Boolean validar);

    }

    interface Controlador{
        Boolean validarLogin(String editText, String indice);
        Boolean usuarioPermitido(String usuario, String password);

    }

    interface Modelo{

    }
}
