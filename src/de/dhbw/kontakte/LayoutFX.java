package de.dhbw.kontakte;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class LayoutFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Text-Objekt erzeugen und konfigurieren
        Text someText = new Text();
        Text otherText = new Text();
        TextArea area = new TextArea();
        Button button = new Button();
        button.setText("Ändern");
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> someText.setText(area.getText()));
        otherText.setText("§");
        otherText.setX(20.0);
        otherText.setY(200.0);
        someText.setText("Hello World!");
        someText.setFont(new Font(52.0));
        someText.setX(50.0);
        someText.setY(500.0);

        // Event-Handler (Maus-Klick) für Text-Objekt definieren
        someText.addEventHandler(MouseEvent.MOUSE_CLICKED, x -> System.out.println("Source: " + x.getSource().getClass() + ", Target: " + x.getTarget().getClass() + ". Der Text wurde angeklickt!"));
        otherText.addEventHandler(MouseEvent.MOUSE_ENTERED, x -> otherText.setText(area.getText()));


        // Root-Knoten erzeugen und Text-Objekt hinzufügen
        Group group = new Group();
        ObservableList groupChildren = group.getChildren();
        groupChildren.add(someText);
        groupChildren.add(otherText);
        groupChildren.add(area);
        groupChildren.add(button);

        // Szene erzeugen und hinzufügen
        Scene scene1 = new Scene(group, 1000.0, 1000.0);
        primaryStage.setScene(scene1);
        // Zum Testen verwenden wir den Text-Event-Handler auch für die Szene
        // Erkenntnis: Sowohl für die Szene als auch für das Text-Element wird das Event ausgelöst

        //addLayouts(primaryStage);

        // Titel des Fensters ändern
        primaryStage.setTitle("Beispielapplikation zur Vorlesung am 09.04.2021");

        // Fenster anzeigen
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        launch(args);
    }


}