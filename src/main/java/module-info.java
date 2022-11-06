/**
 * This is a module. Modules were introduced in Java 9.
 */
module ca.bcit.comp2522 {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;

    opens ca.bcit.comp2522 to javafx.fxml;

    exports ca.bcit.comp2522;
    exports ca.bcit.comp2522.step_01_hello_world;
    exports ca.bcit.comp2522.step_02_basic_shapes;
    exports ca.bcit.comp2522.step_03_layouts;
    exports ca.bcit.comp2522.step_04_events_part_1;
    exports ca.bcit.comp2522.step_05_fonts;
    exports ca.bcit.comp2522.step_06_fun_controls;
    exports ca.bcit.comp2522.step_07_animation;
    exports ca.bcit.comp2522.step_08_concurrency;
}