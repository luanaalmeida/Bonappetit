package br.senac.pi.bonappetit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//botão Entrar
        findViewById(R.id.btEntrar).setOnClickListener(AbrirMenu());
        //botão Criar Conta
        findViewById(R.id.btCriarConta).setOnClickListener(cadastrarConta());
    }
//Chamar a Classe Abrir nenu
    private View.OnClickListener AbrirMenu() {
        return new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Menu.class);
                startActivity(intent);

            };
        };
    }

    //Chamar a classe conta
    private View.OnClickListener cadastrarConta() {
        return new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,CriarConta.class);
                startActivity(intent);

            };
        };

    }

}
