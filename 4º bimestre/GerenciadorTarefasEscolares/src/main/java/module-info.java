module com.example.gerenciadortarefasescolares {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gerenciadortarefasescolares to javafx.fxml;
    exports com.example.gerenciadortarefasescolares;
}