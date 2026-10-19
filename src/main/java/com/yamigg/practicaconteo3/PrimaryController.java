package com.yamigg.practicaconteo3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML ProgressBar progreso;
    @FXML TextField click;
    @FXML Button btnEsperar;
    @FXML Button btnContar;
    
    int cont=0;
    @FXML
    private void btnEsperar(){
       btnEsperar.setDisable(true);
       progreso.setProgress(0);
       
       Thread hilo= new Thread(() ->{
       
       for (int i=0; i<=100; i++){
           int valor = i;
           try{Thread.sleep(100);
           }catch (InterruptedException e){}
           
           Platform.runLater(()->{
               progreso.setProgress(valor/100.0);
           });
       }
       Platform.runLater(()->{
           btnEsperar.setDisable(false);
        });
    });
    hilo.setDaemon(true);
    hilo.start();
    }
               
    @FXML
    private void btnContar() {
        cont++;
        click.setText(cont + " ");
    }
}