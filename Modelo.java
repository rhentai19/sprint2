package com.example.sprint2;

import android.content.Context;
import android.widget.EditText;

import java.util.UUID;

public class Modelo {
    public Modelo(Context mainActivity) {
    }

    public void login(EditText usuario, EditText password, LoginIterface listener) {

        if (usuario.equals("rudol") && password.equals("1234")){

            listener.onSucced(UUID.randomUUID(), "xyz");

        }else{
            listener.onError("error de login");

        }
    }
}
