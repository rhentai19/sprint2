package com.example.sprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private EditText usuario;
    private EditText password;
    private Button btnIngresar;
    private Button btnFacebook;
    private Button btnGmail;
    private Button txtRegistrarse;
    private Modelo Modelo;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario= (EditText) findViewById(R.id.editUsuario);
        EditText password= (EditText) findViewById(R.id.editPassword);
        findViewById(R.id.btnIngresar).setOnClickListener(this);
        Button btnFacebook= (Button)findViewById(R.id.btnFacebook);
        Button btnGmail= (Button)findViewById(R.id.btnGmail);
        Button txtRegistrarse=(Button) findViewById(R.id.txtRegistrarse);
        Modelo = new Modelo(this);

    }

    @Override
    public void onClick(View v) {
        switch ((v.getId())) {
            case R.id.btnIngresar:
                attempLogin();
                break;

        }


    }

    private void attempLogin() {
        String nombre=usuario.getText().toString();
        String contrasena=password.getText().toString();
        Modelo.login(usuario,password,listener);
    }

    private LoginIterface listener = new LoginIterface(){
        @Override
        public void onSucced(UUID uid, String username){
            Toast.makeText(MainActivity.this,"Login realizado"+username, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onError(String error){
            Toast.makeText(MainActivity.this,error,Toast.LENGTH_SHORT).show();


        }

    };
}




