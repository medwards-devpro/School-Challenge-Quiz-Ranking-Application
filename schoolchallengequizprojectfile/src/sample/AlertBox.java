package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by news1 on 24/6/2016.
 */
public class AlertBox {
    private static boolean answer;

    public static boolean confirmBox(String txt,String title, int width, int height)
    {
        Stage window = new Stage();
        VBox layout = new VBox();
        HBox hBox = new HBox();
        Text message = new Text(txt);
        Button btnYes = new Button("Yes");
        Button btnNo = new Button("no");
        Image image = new Image("/sample/question.png",64,64,true,true);
        ImageView imageView = new ImageView(image);

        message.setFont(Font.font("Verdana",10));
        btnYes.setMinSize(50,15);
        btnNo.setMinSize(50,15);
        btnYes.setOnAction(e -> {
            answer = true;
        window.close();});
        btnNo.setOnAction(event -> {
            answer = false;
        window.close();});

        hBox.getChildren().addAll(btnYes,btnNo);
        hBox.setSpacing(15);
        hBox.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(imageView,message,hBox);
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);


        window.setScene(new Scene(layout,width,height));
        window.setTitle(title);
        window.setResizable(false);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();

        return answer;
    }//END CONFIRM BOX

    public static void errorBox(String txt,String title, int width, int height)
    {
        Stage window = new Stage();
        VBox layout = new VBox();
        Text message = new Text(txt);
        Button btnOk = new Button("Ok");
        Image image = new Image("/sample/error.png",32,32,true,true);
        ImageView imageView = new ImageView(image);

        message.setFont(Font.font("Verdana",10));
        btnOk.setMinSize(50,15);
        btnOk.setOnAction(e -> window.close());


        layout.getChildren().addAll(imageView,message,btnOk);
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);


        window.setScene(new Scene(layout,width,height));
        window.setTitle(title);
        window.setResizable(false);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }//END ERROR BOX

    public static void informationBox(String txt,String title, int width, int height)
    {
        Stage window = new Stage();
        VBox layout = new VBox();
        Text message = new Text(txt);
        Button btnOk = new Button("Ok");
        Image image = new Image("/sample/information.png",32,32,true,true);
        ImageView imageView = new ImageView(image);

        message.setFont(Font.font("Verdana",10));
        btnOk.setMinSize(50,15);
        btnOk.setOnAction(e -> window.close());


        layout.getChildren().addAll(imageView,message,btnOk);
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);


        window.setScene(new Scene(layout,width,height));
        window.setTitle(title);
        window.setResizable(false);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }//END INFORMATION BOX

    public static void teamUpdateBox(String txtOne, String txtTwo, String title, int width, int height)
    {
        Stage window = new Stage();
        VBox layout = new VBox();
        Text messageOne = new Text(txtOne);
        Text messageTwo = new Text(txtTwo);
        Button btnOk = new Button("Ok");
        Image image = new Image("/sample/information.png",32,32,true,true);
        ImageView imageView = new ImageView(image);

        messageOne.setFont(Font.font("Verdana",10));
        messageTwo.setFont(Font.font("Verdana",10));
        btnOk.setMinSize(50,15);
        btnOk.setOnAction(e -> window.close());


        layout.getChildren().addAll(imageView,messageOne,messageTwo,btnOk);
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);


        window.setScene(new Scene(layout,width,height));
        window.setTitle(title);
        window.setResizable(false);
        window.initModality(Modality.APPLICATION_MODAL);
        window.showAndWait();
    }//END TEAM UPDATE BOX

}//END CLASS ALERT BOX
