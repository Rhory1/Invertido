package com.example.a11abril;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //atributos-variables
    private TextView txtResultado;
    private EditText etPalabra;
    private Button btnProcesar;
    private Button btnMensaje;
    private String palabra;

    //metodos - funciones
//JBKB
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        /*
        al configurar un boton para decirle que este pendiente al evento clicj de ese boton en pantalla
        con el uso del metodo .setOnClickListener()
        Lo que ese mètodo esta esperando como parametro o argunmento es una funcion que serà
        la funciòn click que activara las funciones a realizar cuando se presione el boton.
        CuANDO SE PASA UNA FUNCION COMO PARAMENTRO ESTAS GENERALMENTE SON CONOCIDAD COMO FUNCINES ANONIMAS
        la idea es que esa funcion ejecute su proceimiento a partir del metodo que la recibe como parametro.
         */

        //this: ambito o contexto de la misma clase.  busca la respuesta en la clase

        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Este metodo onclick solo existe en el ambito del boton btnProcesar, lo que se haga a ca solo sirve para ese boton
                recibirInformacion();
                invertirPalabra();
            }
        });
        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMensaje();
            }
        });
    }

    private void mostrarMensaje() {
        //Para mostrar mensajes en pantalla ustdes pueden usar una ventana emegente temporal llamada Toast que básicamente sirve para mostrar informarció
        //al usuario de ciertos procesos que hayan pasado, confirmaciones, mostrar algu mensaje y otros
        //Concepto estatico
        //El toast tiene u metodo llamado maketest que es donde configuraran lo que quieren mostrar al usuario, para ello deben pasar estos para
        //-CONTEXTO(AMBITO) DE LA PANTALLA DONDE SE VA A DIBUJAR ESE MENSJAE
        //CADENA DE CARATERE: EL MENSAJE A MOSTRAR
        //-UNA CONSTANTE DE DURACIÓN DEL MENSAJE EN PANTALLA PARA QUE DURE MÁS
        //finalmente deben decirle al tost que se muestre con esa configuraciuón y para ello usan el método o evento.show()
        Toast.makeText(this,"Hola mundo",Toast.LENGTH_LONG).show();
    }

    private void invertirPalabra() {
        //Una anera directa de inveritr una cadena
        //Netamente codigo java
        //palabra = new StringBuilder(palabra).reverse().toString();
        String invertido="";
        //La idea es que traten la caena String como sifuera un array donde cada letra es una posicion del array
        //Para tal efecto los string tienen un metodo que les permite devolver un carcater de una posicion como si fuera un array
        //EL METODO SE LLAMA CHARART(INDICE)
        for (int i = this.palabra.length()-1; i >=0 ; i--) {
            invertido += this.palabra.charAt(i);

if (palabra.equals(invertido)){
    txtResultado.setText("palindromo");
}
else {
    txtResultado.setText("No palindromo");
}

        }
//JHHBHJB

       // txtResultado.setText(invertido);
    }

    private void recibirInformacion() {
        palabra = etPalabra.getText().toString();
    }

    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
        etPalabra = findViewById(R.id.etPalabra);
        etPalabra = findViewById(R.id.etPalabra);
        btnProcesar = findViewById(R.id.btnProcesar);
        btnMensaje = findViewById(R.id.btnMensaje);
    }


}