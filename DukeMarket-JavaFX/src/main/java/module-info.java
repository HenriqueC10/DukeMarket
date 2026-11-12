module br.dev.henrique.dukemarket.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.dev.henrique.dukemarket.javafx to javafx.fxml;
    exports br.dev.henrique.dukemarket.javafx;
}
