package br.ggg.gerenciadortarefasescolares.controllers;

import br.ggg.gerenciadortarefasescolares.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class loginController {

    @FXML
    void clickLogin(ActionEvent event) {
        System.out.printf("clicou");
        HelloApplication.mudarTela();

    }

}
