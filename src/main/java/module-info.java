module lk.cw.orm_therapy_center {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.cw.orm_therapy_center to javafx.fxml;
    exports lk.cw.orm_therapy_center;
}