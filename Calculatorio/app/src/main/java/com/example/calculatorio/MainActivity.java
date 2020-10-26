package com.example.calculatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textresultado;
    TextView textresultadoup;
    double operador1 = 0;
    double operador2 = 0;
    double resultado = 0;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textresultado = findViewById(R.id.textresult1);
        textresultadoup = findViewById(R.id.textosuperior);
        Button boton1 = findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "1");
            }
        });
        Button boton2 = findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "2");
            }
        });
        Button boton3 = findViewById(R.id.boton3);
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "3");
            }
        });
        Button boton4 = findViewById(R.id.boton4);
        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "4");
            }
        });
        Button boton5 = findViewById(R.id.boton5);
        boton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "5");
            }
        });
        Button boton6 = findViewById(R.id.boton6);
        boton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "6");
            }
        });
        Button boton7 = findViewById(R.id.boton7);
        boton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "7");
            }
        });
        Button boton8 = findViewById(R.id.boton8);
        boton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "8");
            }
        });
        Button boton9 = findViewById(R.id.boton9);
        boton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "9");
            }
        });
        Button boton0 = findViewById(R.id.boton0);
        boton0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "0");
            }
        });
        Button boton00 = findViewById(R.id.botondoblecero);
        boton00.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textresultado.setText(textresultado.getText().toString() + "00");
            }
        });
        Button botonpunto = findViewById(R.id.botonpunto);
        botonpunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == ""){
                    textresultado.setText(textresultado.getText().toString() + "0.");
                }
                else {
                    textresultado.setText(textresultado.getText().toString() + ".");
                }
            }
        });
        Button botoncambio = findViewById(R.id.botoncambiosig);
        botoncambio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if(textresultado.getText() == ""){
                    operador1 = Double.valueOf((String) textresultadoup.getText());
                    operador2 = -1;
                    resultado = operador1 * operador2;
                    textresultadoup.setText(String.valueOf(resultado));
                    textresultado.setText("");
                    operador1 = resultado;
                    resultado = 0;
                }
                else {
                    operador1 = Double.valueOf((String) textresultado.getText());
                    operador2 = -1;
                    resultado = operador1 * operador2;
                    textresultadoup.setText(String.valueOf(resultado));
                    textresultado.setText("");
                    operador1 = resultado;
                    resultado = 0;
                }
            }
        });
        Button botonclear = findViewById(R.id.botonclear);
        botonclear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    textresultado.setText("");
                    textresultadoup.setText("");
                    operador1 = 0;
                    operador2 = 0;
                    resultado = 0;
                    suma = false;
                    resta = false;
                    multi = false;
                    div = false;
            }
        });
        Button botonporc = findViewById(R.id.botonporcentaje);
        botonporc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if(textresultadoup.getText() == ""){
                    operador1 = Double.valueOf((String) textresultado.getText());
                    operador2 = 100;
                    resultado = operador1 / operador2;
                    textresultadoup.setText(String.valueOf(resultado));
                    textresultado.setText("");
                    operador1 = resultado;
                    resultado = 0;
                }
                else {
                    operador1 = Double.valueOf((String) textresultadoup.getText());
                    operador2 = 100;
                    resultado = operador1 / operador2;
                    textresultadoup.setText(String.valueOf(resultado));
                    textresultado.setText("");
                    operador1 = resultado;
                    resultado = 0;
                }
            }
        });
        Button botonsuma = findViewById(R.id.botonsuma);
        botonsuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if(textresultadoup.getText() == ""){
                   suma = true;
                   operador1 = Double.valueOf((String) textresultado.getText());
                   textresultadoup.setText(textresultado.getText().toString() + "+");
                   textresultado.setText("");
               }
               else {
                   if (resta == true) {
                       operador2 = Double.valueOf((String) textresultado.getText());
                       resultado = operador1 - operador2;
                       textresultado.setText("");
                       textresultadoup.setText(String.valueOf(resultado));
                       resta = false;
                       suma = true;
                       operador1 = resultado;
                   }
                   else if (multi == true) {
                       operador2 = Double.valueOf((String) textresultado.getText());
                       resultado = operador1 * operador2;
                       textresultado.setText("");
                       textresultadoup.setText(String.valueOf(resultado));
                       multi = false;
                       suma = true;
                       operador1 = resultado;
                   }
                   else if (div == true) {
                       operador2 = Double.valueOf((String) textresultado.getText());
                       if (operador2 == 0){
                           Toast.makeText(getApplicationContext(), "Ande vas", Toast.LENGTH_SHORT).show();
                           textresultado.setText("Pintar Infinito");
                           textresultadoup.setText("");
                       }
                       else {
                           resultado = operador1 / operador2;
                           textresultado.setText("");
                           textresultadoup.setText(String.valueOf(resultado));
                           div = false;
                           suma = true;
                           operador1 = resultado;
                       }
                   }
                   else {
                       suma = true;
                       operador2 = Double.valueOf((String) textresultado.getText());
                       resultado = operador1 + operador2;
                       textresultadoup.setText(String.valueOf(resultado));
                       textresultado.setText("");
                       operador1 = Double.valueOf((String) textresultadoup.getText());
                   }
               }

            }
        });
        Button botonresta = findViewById(R.id.botonresta);
        botonresta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if(textresultadoup.getText() == ""){
                    resta = true;
                    operador1 = Double.valueOf((String) textresultado.getText());
                    textresultadoup.setText(textresultado.getText().toString() + "-");
                    textresultado.setText("");
                }
                else {
                    if (suma == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 + operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        suma = false;
                        resta = true;
                        operador1 = resultado;
                    }
                    else if (multi == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 * operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        multi = false;
                        resta = true;
                        operador1 = resultado;
                    }
                    else if (div == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        if (operador2 == 0){
                            Toast.makeText(getApplicationContext(), "Ande vas", Toast.LENGTH_SHORT).show();
                            textresultado.setText("Pintar Infinito");
                            textresultadoup.setText("");
                        }
                        else {
                            resultado = operador1 / operador2;
                            textresultado.setText("");
                            textresultadoup.setText(String.valueOf(resultado));
                            div = false;
                            resta = true;
                            operador1 = resultado;
                        }
                    }
                    else {
                        resta = true;
                        operador1 = Double.valueOf((String) textresultadoup.getText());
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 - operador2;
                        textresultadoup.setText(String.valueOf(resultado));
                        textresultado.setText("");
                        operador1 = Double.valueOf((String) textresultadoup.getText());
                    }
                }

            }
        });
        Button botonmultiplicar = findViewById(R.id.botonmultiplicar);
        botonmultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if(textresultadoup.getText() == ""){
                    multi = true;
                    operador1 = Double.valueOf((String) textresultado.getText());
                    textresultadoup.setText(textresultado.getText().toString() + "X");
                    textresultado.setText("");
                }
                else {
                    if (suma == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 + operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        suma = false;
                        multi = true;
                        operador1 = resultado;
                    }
                    else if (resta == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 - operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        resta = false;
                        multi = true;
                        operador1 = resultado;
                    }
                    else if (div == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        if (operador2 == 0){
                            Toast.makeText(getApplicationContext(), "Ande vas", Toast.LENGTH_SHORT).show();
                            textresultado.setText("Pintar Infinito");
                            textresultadoup.setText("");
                        }
                        else {
                            resultado = operador1 / operador2;
                            textresultado.setText("");
                            textresultadoup.setText(String.valueOf(resultado));
                            div = false;
                            multi = true;
                            operador1 = resultado;
                        }
                    }
                    else {
                        multi = true;
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 * operador2;
                        textresultadoup.setText(String.valueOf(resultado));
                        textresultado.setText("");
                        operador1 = Double.valueOf((String) textresultadoup.getText());
                    }
                }

            }
        });
        Button botondiv = findViewById(R.id.botondiv);
        botondiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if(textresultadoup.getText() == ""){
                    div = true;
                    operador1 = Double.valueOf((String) textresultado.getText());
                    textresultadoup.setText(textresultado.getText().toString() + "/");
                    textresultado.setText("");
                }
                else {
                    if (suma == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 + operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        suma = false;
                        div = true;
                        operador1 = resultado;
                    }
                    else if (multi == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 * operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        multi = false;
                        div = true;
                        operador1 = resultado;
                    }
                    else if (resta == true) {
                        operador2 = Double.valueOf((String) textresultado.getText());
                        resultado = operador1 - operador2;
                        textresultado.setText("");
                        textresultadoup.setText(String.valueOf(resultado));
                        resta = false;
                        div = true;
                        operador1 = resultado;
                    }
                    else{
                        div = true;
                        operador2 = Double.valueOf((String) textresultado.getText());
                        if (operador2 == 0){
                            Toast.makeText(getApplicationContext(), "Ande vas", Toast.LENGTH_SHORT).show();
                            textresultado.setText("Pintar Infinito");
                            textresultadoup.setText("");
                        }
                        else {
                            resultado = operador1 / operador2;
                            textresultadoup.setText(String.valueOf(resultado));
                            textresultado.setText("");
                            operador1 = Double.valueOf((String) textresultadoup.getText());
                        }
                    }
                }
            }
        });
        Button botonigual = findViewById(R.id.botonigual);
        botonigual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textresultado.getText() == "" && textresultadoup.getText() == ""){
                    Toast.makeText(getApplicationContext(), "Escribe algo muchacho", Toast.LENGTH_SHORT).show();
                }
                else if (suma == true) {
                    operador2 = Double.valueOf((String) textresultado.getText());
                    resultado = operador1 + operador2;
                    textresultado.setText(String.valueOf(resultado));
                    textresultadoup.setText("");
                    suma = false;
                    operador1 = 0;
                    operador2 = 0;
                } else if (resta == true) {
                    operador2 = Double.valueOf((String) textresultado.getText());
                    resultado = operador1 - operador2;
                    textresultado.setText(String.valueOf(resultado));
                    textresultadoup.setText("");
                    resta = false;
                    operador1 = 0;
                    operador2 = 0;
                } else if (multi == true) {
                    operador2 = Double.valueOf((String) textresultado.getText());
                    resultado = operador1 * operador2;
                    textresultado.setText(String.valueOf(resultado));
                    textresultadoup.setText("");
                    multi = false;
                    operador1 = 0;
                    operador2 = 0;
                } else if (div == true) {
                    operador2 = Double.valueOf((String) textresultado.getText());
                    if (operador2 == 0){
                        Toast.makeText(getApplicationContext(), "Ande vas", Toast.LENGTH_SHORT).show();
                        textresultado.setText("Pintar Infinito");
                        textresultadoup.setText("");
                        div = false;
                    }
                    else {
                        resultado = operador1 / operador2;
                        textresultado.setText(String.valueOf(resultado));
                        textresultadoup.setText("");
                        div = false;
                        operador1 = 0;
                        operador2 = 0;
                    }
                }
            }
        });
    }
}