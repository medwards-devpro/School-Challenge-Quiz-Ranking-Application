package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Michael Edwards (Intern) on 14/6/2016.
 */

public class Main extends Application {

    private static final int INVITE = 100;
    private static final int ROUND1WIN = 200;
    private static final int ROUND2WIN = 200;
    private static final int ROUND3WIN = 300;
    private static final int ROUND4WIN = 400;
    private static final int ROUND5WIN = 600;
    private static final int ROUND6WIN = 100;
    private static final int ROUND7WIN = 200;
    private static final int FINALSBONUS = 200;
    private static final String schoolSceneCode = "school";
    private static final String round1SceneCode = "round1";
    private static final String round2SceneCode = "round2";
    private static final String round3SceneCode = "round3";
    private static final String round4SceneCode = "round4";
    private static final String round5SceneCode = "round5";
    private static final String round6SceneCode = "round6";
    private static final String round7SceneCode = "round7";

    private static Stage window;
    private Scene sceneHome;
    private Scene sceneRank;
    private Scene sceneSchool;

    private static Scene sceneRound1;//Trial
    private static Scene sceneRound2;//Trial Testing Nov 19
    private static Scene sceneRound3;
    private static Scene sceneRound4;//Trial Testing Nov 22
    private static Scene sceneRound5;//Trial Testing Nov 22
    private static Scene sceneRound6;//Trial Testing Nov 22
    private static Scene sceneRound7;//Trial Testing Nov 22
    private Scene sceneRoundSelection;//Trial

    private Button viewBtn;

    private ChoiceBox<String> cBoxChangeSchool;
    private TableView<TeamRank> rankingSheet;
    private TextField tFieldAddSchool;
    private TextField tFieldChangeSchool;
    private ChoiceBox<String> cBoxDeleteSchool;

    private Button btnRound2;
    private Button btnRound3;
    private Button btnRound4;
    private Button btnRound5;
    private Button btnRound6;
    private Button btnRound7;

    //--------------------------------------------------------ROUND ONE INITIALIZATION------------------------------------------------
    private ChoiceBox<String> cBoxRound1Match1TeamOne;
    private ChoiceBox<String> cBoxRound1Match1TeamTwo;
    private ChoiceBox<String> cBoxRound1Match2TeamOne;
    private ChoiceBox<String> cBoxRound1Match2TeamTwo;
    private ChoiceBox<String> cBoxRound1Match3TeamOne;
    private ChoiceBox<String> cBoxRound1Match3TeamTwo;
    private ChoiceBox<String> cBoxRound1Match4TeamOne;
    private ChoiceBox<String> cBoxRound1Match4TeamTwo;
    private ChoiceBox<String> cBoxRound1Match5TeamOne;
    private ChoiceBox<String> cBoxRound1Match5TeamTwo;
    private ChoiceBox<String> cBoxRound1Match6TeamOne;
    private ChoiceBox<String> cBoxRound1Match6TeamTwo;
    private ChoiceBox<String> cBoxRound1Match7TeamOne;
    private ChoiceBox<String> cBoxRound1Match7TeamTwo;
    private ChoiceBox<String> cBoxRound1Match8TeamOne;
    private ChoiceBox<String> cBoxRound1Match8TeamTwo;
    private ChoiceBox<String> cBoxRound1Match9TeamOne;
    private ChoiceBox<String> cBoxRound1Match9TeamTwo;
    private ChoiceBox<String> cBoxRound1Match10TeamOne;
    private ChoiceBox<String> cBoxRound1Match10TeamTwo;
    private ChoiceBox<String> cBoxRound1Match11TeamOne;
    private ChoiceBox<String> cBoxRound1Match11TeamTwo;
    private ChoiceBox<String> cBoxRound1Match12TeamOne;
    private ChoiceBox<String> cBoxRound1Match12TeamTwo;
    private ChoiceBox<String> cBoxRound1Match13TeamOne;
    private ChoiceBox<String> cBoxRound1Match13TeamTwo;
    private ChoiceBox<String> cBoxRound1Match14TeamOne;
    private ChoiceBox<String> cBoxRound1Match14TeamTwo;
    private ChoiceBox<String> cBoxRound1Match15TeamOne;
    private ChoiceBox<String> cBoxRound1Match15TeamTwo;
    private ChoiceBox<String> cBoxRound1Match16TeamOne;
    private ChoiceBox<String> cBoxRound1Match16TeamTwo;
    private ChoiceBox<String> cBoxRound1Match17TeamOne;
    private ChoiceBox<String> cBoxRound1Match17TeamTwo;
    private ChoiceBox<String> cBoxRound1Match18TeamOne;
    private ChoiceBox<String> cBoxRound1Match18TeamTwo;
    private ChoiceBox<String> cBoxRound1Match19TeamOne;
    private ChoiceBox<String> cBoxRound1Match19TeamTwo;
    private ChoiceBox<String> cBoxRound1Match20TeamOne;
    private ChoiceBox<String> cBoxRound1Match20TeamTwo;
    private ChoiceBox<String> cBoxRound1Match21TeamOne;
    private ChoiceBox<String> cBoxRound1Match21TeamTwo;
    private ChoiceBox<String> cBoxRound1Match22TeamOne;
    private ChoiceBox<String> cBoxRound1Match22TeamTwo;
    private ChoiceBox<String> cBoxRound1Match23TeamOne;
    private ChoiceBox<String> cBoxRound1Match23TeamTwo;
    private ChoiceBox<String> cBoxRound1Match24TeamOne;
    private ChoiceBox<String> cBoxRound1Match24TeamTwo;
    private ChoiceBox<String> cBoxRound1Match25TeamOne;
    private ChoiceBox<String> cBoxRound1Match25TeamTwo;
    private ChoiceBox<String> cBoxRound1Match26TeamOne;
    private ChoiceBox<String> cBoxRound1Match26TeamTwo;
    private ChoiceBox<String> cBoxRound1Match27TeamOne;
    private ChoiceBox<String> cBoxRound1Match27TeamTwo;
    private ChoiceBox<String> cBoxRound1Match28TeamOne;
    private ChoiceBox<String> cBoxRound1Match28TeamTwo;
    private ChoiceBox<String> cBoxRound1Match29TeamOne;
    private ChoiceBox<String> cBoxRound1Match29TeamTwo;
    private ChoiceBox<String> cBoxRound1Match30TeamOne;
    private ChoiceBox<String> cBoxRound1Match30TeamTwo;
    private ChoiceBox<String> cBoxRound1Match31TeamOne;
    private ChoiceBox<String> cBoxRound1Match31TeamTwo;
    private ChoiceBox<String> cBoxRound1Match32TeamOne;
    private ChoiceBox<String> cBoxRound1Match32TeamTwo;

    private TextField tFieldMatch1Team1, tFieldMatch1Team2;//Trial
    private TextField tFieldMatch2Team1, tFieldMatch2Team2;//Trial
    private TextField tFieldMatch3Team1, tFieldMatch3Team2;
    private TextField tFieldMatch4Team1, tFieldMatch4Team2;
    private TextField tFieldMatch5Team1, tFieldMatch5Team2;
    private TextField tFieldMatch6Team1, tFieldMatch6Team2;
    private TextField tFieldMatch7Team1, tFieldMatch7Team2;
    private TextField tFieldMatch8Team1, tFieldMatch8Team2;
    private TextField tFieldMatch9Team1, tFieldMatch9Team2;
    private TextField tFieldMatch10Team1, tFieldMatch10Team2;
    private TextField tFieldMatch11Team1, tFieldMatch11Team2;
    private TextField tFieldMatch12Team1, tFieldMatch12Team2;
    private TextField tFieldMatch13Team1, tFieldMatch13Team2;
    private TextField tFieldMatch14Team1, tFieldMatch14Team2;
    private TextField tFieldMatch15Team1, tFieldMatch15Team2;
    private TextField tFieldMatch16Team1, tFieldMatch16Team2;
    private TextField tFieldMatch17Team1, tFieldMatch17Team2;
    private TextField tFieldMatch18Team1, tFieldMatch18Team2;
    private TextField tFieldMatch19Team1, tFieldMatch19Team2;
    private TextField tFieldMatch20Team1, tFieldMatch20Team2;
    private TextField tFieldMatch21Team1, tFieldMatch21Team2;
    private TextField tFieldMatch22Team1, tFieldMatch22Team2;
    private TextField tFieldMatch23Team1, tFieldMatch23Team2;
    private TextField tFieldMatch24Team1, tFieldMatch24Team2;
    private TextField tFieldMatch25Team1, tFieldMatch25Team2;
    private TextField tFieldMatch26Team1, tFieldMatch26Team2;
    private TextField tFieldMatch27Team1, tFieldMatch27Team2;
    private TextField tFieldMatch28Team1, tFieldMatch28Team2;
    private TextField tFieldMatch29Team1, tFieldMatch29Team2;
    private TextField tFieldMatch30Team1, tFieldMatch30Team2;
    private TextField tFieldMatch31Team1, tFieldMatch31Team2;
    private TextField tFieldMatch32Team1, tFieldMatch32Team2;

    private ChoiceBox<String> cBoxRound1Match1;//Trial
    private ChoiceBox<String> cBoxRound1Match2;//Trial
    private ChoiceBox<String> cBoxRound1Match3;//Trial
    private ChoiceBox<String> cBoxRound1Match4;//Trial
    private ChoiceBox<String> cBoxRound1Match5;//Trial
    private ChoiceBox<String> cBoxRound1Match6;//Trial
    private ChoiceBox<String> cBoxRound1Match7;//Trial
    private ChoiceBox<String> cBoxRound1Match8;//Trial
    private ChoiceBox<String> cBoxRound1Match9;//Trial
    private ChoiceBox<String> cBoxRound1Match10;//Trial
    private ChoiceBox<String> cBoxRound1Match11;//Trial
    private ChoiceBox<String> cBoxRound1Match12;//Trial
    private ChoiceBox<String> cBoxRound1Match13;//Trial
    private ChoiceBox<String> cBoxRound1Match14;//Trial
    private ChoiceBox<String> cBoxRound1Match15;//Trial
    private ChoiceBox<String> cBoxRound1Match16;//Trial
    private ChoiceBox<String> cBoxRound1Match17;//Trial
    private ChoiceBox<String> cBoxRound1Match18;//Trial
    private ChoiceBox<String> cBoxRound1Match19;//Trial
    private ChoiceBox<String> cBoxRound1Match20;//Trial
    private ChoiceBox<String> cBoxRound1Match21;//Trial
    private ChoiceBox<String> cBoxRound1Match22;//Trial
    private ChoiceBox<String> cBoxRound1Match23;//Trial
    private ChoiceBox<String> cBoxRound1Match24;//Trial
    private ChoiceBox<String> cBoxRound1Match25;//Trial
    private ChoiceBox<String> cBoxRound1Match26;//Trial
    private ChoiceBox<String> cBoxRound1Match27;//Trial
    private ChoiceBox<String> cBoxRound1Match28;//Trial
    private ChoiceBox<String> cBoxRound1Match29;//Trial
    private ChoiceBox<String> cBoxRound1Match30;//Trial
    private ChoiceBox<String> cBoxRound1Match31;//Trial
    private ChoiceBox<String> cBoxRound1Match32;//Trial

    private Button btnRound1Match1Submit, btnRound1Match2Submit;//Trial
    private Button btnRound1Match3Submit, btnRound1Match4Submit;//Trial
    private Button btnRound1Match5Submit, btnRound1Match6Submit;//Trial
    private Button btnRound1Match7Submit, btnRound1Match8Submit;//Trial
    private Button btnRound1Match9Submit, btnRound1Match10Submit;//Trial
    private Button btnRound1Match11Submit, btnRound1Match12Submit;//Trial
    private Button btnRound1Match13Submit, btnRound1Match14Submit;//Trial
    private Button btnRound1Match15Submit, btnRound1Match16Submit;//Trial
    private Button btnRound1Match17Submit, btnRound1Match18Submit;//Trial
    private Button btnRound1Match19Submit, btnRound1Match20Submit;//Trial
    private Button btnRound1Match21Submit, btnRound1Match22Submit;//Trial
    private Button btnRound1Match23Submit, btnRound1Match24Submit;//Trial
    private Button btnRound1Match25Submit, btnRound1Match26Submit;//Trial
    private Button btnRound1Match27Submit, btnRound1Match28Submit;//Trial
    private Button btnRound1Match29Submit, btnRound1Match30Submit;//Trial
    private Button btnRound1Match31Submit, btnRound1Match32Submit;//Trial

    private Button btnMatch1Edit, btnMatch2Edit;
    private Button btnMatch3Edit, btnMatch4Edit;
    private Button btnMatch5Edit, btnMatch6Edit;
    private Button btnMatch7Edit, btnMatch8Edit;
    private Button btnMatch9Edit, btnMatch10Edit;
    private Button btnMatch11Edit, btnMatch12Edit;
    private Button btnMatch13Edit, btnMatch14Edit;
    private Button btnMatch15Edit, btnMatch16Edit;
    private Button btnMatch17Edit, btnMatch18Edit;
    private Button btnMatch19Edit, btnMatch20Edit;
    private Button btnMatch21Edit, btnMatch22Edit;
    private Button btnMatch23Edit, btnMatch24Edit;
    private Button btnMatch25Edit, btnMatch26Edit;
    private Button btnMatch27Edit, btnMatch28Edit;
    private Button btnMatch29Edit, btnMatch30Edit;
    private Button btnMatch31Edit, btnMatch32Edit;

    private Button btnMatch1Save, btnMatch2Save;
    private Button btnMatch3Save, btnMatch4Save;
    private Button btnMatch5Save, btnMatch6Save;
    private Button btnMatch7Save, btnMatch8Save;
    private Button btnMatch9Save, btnMatch10Save;
    private Button btnMatch11Save, btnMatch12Save;
    private Button btnMatch13Save, btnMatch14Save;
    private Button btnMatch15Save, btnMatch16Save;
    private Button btnMatch17Save, btnMatch18Save;
    private Button btnMatch19Save, btnMatch20Save;
    private Button btnMatch21Save, btnMatch22Save;
    private Button btnMatch23Save, btnMatch24Save;
    private Button btnMatch25Save, btnMatch26Save;
    private Button btnMatch27Save, btnMatch28Save;
    private Button btnMatch29Save, btnMatch30Save;
    private Button btnMatch31Save, btnMatch32Save;

    private TextField[][] roundOneTextField;
    private ChoiceBox<String>[] roundOneBox;
    private String[] roundOneTeams;

    private HBox match1Box, match2Box;
    private HBox match3Box, match4Box;
    private HBox match5Box, match6Box;
    private HBox match7Box, match8Box;
    private HBox match9Box, match10Box;
    private HBox match11Box, match12Box;
    private HBox match13Box, match14Box;
    private HBox match15Box, match16Box;
    private HBox match17Box, match18Box;
    private HBox match19Box, match20Box;
    private HBox match21Box, match22Box;
    private HBox match23Box, match24Box;
    private HBox match25Box, match26Box;
    private HBox match27Box, match28Box;
    private HBox match29Box, match30Box;
    private HBox match31Box, match32Box;

    private HBox match1btnBox, match2btnBox;
    private HBox match3btnBox, match4btnBox;
    private HBox match5btnBox, match6btnBox;
    private HBox match7btnBox, match8btnBox;
    private HBox match9btnBox, match10btnBox;
    private HBox match11btnBox, match12btnBox;
    private HBox match13btnBox, match14btnBox;
    private HBox match15btnBox, match16btnBox;
    private HBox match17btnBox, match18btnBox;
    private HBox match19btnBox, match20btnBox;
    private HBox match21btnBox, match22btnBox;
    private HBox match23btnBox, match24btnBox;
    private HBox match25btnBox, match26btnBox;
    private HBox match27btnBox, match28btnBox;
    private HBox match29btnBox, match30btnBox;
    private HBox match31btnBox, match32btnBox;

    private Label roundOneMatch1Winner, roundOneMatch2Winner;
    private Label roundOneMatch3Winner, roundOneMatch4Winner;
    private Label roundOneMatch5Winner, roundOneMatch6Winner;
    private Label roundOneMatch7Winner, roundOneMatch8Winner;
    private Label roundOneMatch9Winner, roundOneMatch10Winner;
    private Label roundOneMatch11Winner, roundOneMatch12Winner;
    private Label roundOneMatch13Winner, roundOneMatch14Winner;
    private Label roundOneMatch15Winner, roundOneMatch16Winner;
    private Label roundOneMatch17Winner, roundOneMatch18Winner;
    private Label roundOneMatch19Winner, roundOneMatch20Winner;
    private Label roundOneMatch21Winner, roundOneMatch22Winner;
    private Label roundOneMatch23Winner, roundOneMatch24Winner;
    private Label roundOneMatch25Winner, roundOneMatch26Winner;
    private Label roundOneMatch27Winner, roundOneMatch28Winner;
    private Label roundOneMatch29Winner, roundOneMatch30Winner;
    private Label roundOneMatch31Winner, roundOneMatch32Winner;
    //----------------------------------------------------------END ROUND ONE INITIALIZATION------------------------------------------

    //----------------------------------------------------------ROUND TWO INITIALIZATION--------------------------------------------------
    private ChoiceBox<String> cBoxRound2Match1TeamOne;
    private ChoiceBox<String> cBoxRound2Match1TeamTwo;
    private ChoiceBox<String> cBoxRound2Match2TeamOne;
    private ChoiceBox<String> cBoxRound2Match2TeamTwo;
    private ChoiceBox<String> cBoxRound2Match3TeamOne;
    private ChoiceBox<String> cBoxRound2Match3TeamTwo;
    private ChoiceBox<String> cBoxRound2Match4TeamOne;
    private ChoiceBox<String> cBoxRound2Match4TeamTwo;
    private ChoiceBox<String> cBoxRound2Match5TeamOne;
    private ChoiceBox<String> cBoxRound2Match5TeamTwo;
    private ChoiceBox<String> cBoxRound2Match6TeamOne;
    private ChoiceBox<String> cBoxRound2Match6TeamTwo;
    private ChoiceBox<String> cBoxRound2Match7TeamOne;
    private ChoiceBox<String> cBoxRound2Match7TeamTwo;
    private ChoiceBox<String> cBoxRound2Match8TeamOne;
    private ChoiceBox<String> cBoxRound2Match8TeamTwo;
    private ChoiceBox<String> cBoxRound2Match9TeamOne;
    private ChoiceBox<String> cBoxRound2Match9TeamTwo;
    private ChoiceBox<String> cBoxRound2Match10TeamOne;
    private ChoiceBox<String> cBoxRound2Match10TeamTwo;
    private ChoiceBox<String> cBoxRound2Match11TeamOne;
    private ChoiceBox<String> cBoxRound2Match11TeamTwo;
    private ChoiceBox<String> cBoxRound2Match12TeamOne;
    private ChoiceBox<String> cBoxRound2Match12TeamTwo;
    private ChoiceBox<String> cBoxRound2Match13TeamOne;
    private ChoiceBox<String> cBoxRound2Match13TeamTwo;
    private ChoiceBox<String> cBoxRound2Match14TeamOne;
    private ChoiceBox<String> cBoxRound2Match14TeamTwo;
    private ChoiceBox<String> cBoxRound2Match15TeamOne;
    private ChoiceBox<String> cBoxRound2Match15TeamTwo;
    private ChoiceBox<String> cBoxRound2Match16TeamOne;
    private ChoiceBox<String> cBoxRound2Match16TeamTwo;

    private TextField tFieldRound2Match1Team1, tFieldRound2Match1Team2;
    private TextField tFieldRound2Match2Team1, tFieldRound2Match2Team2;
    private TextField tFieldRound2Match3Team1, tFieldRound2Match3Team2;
    private TextField tFieldRound2Match4Team1, tFieldRound2Match4Team2;
    private TextField tFieldRound2Match5Team1, tFieldRound2Match5Team2;
    private TextField tFieldRound2Match6Team1, tFieldRound2Match6Team2;
    private TextField tFieldRound2Match7Team1, tFieldRound2Match7Team2;
    private TextField tFieldRound2Match8Team1, tFieldRound2Match8Team2;
    private TextField tFieldRound2Match9Team1, tFieldRound2Match9Team2;
    private TextField tFieldRound2Match10Team1, tFieldRound2Match10Team2;
    private TextField tFieldRound2Match11Team1, tFieldRound2Match11Team2;
    private TextField tFieldRound2Match12Team1, tFieldRound2Match12Team2;
    private TextField tFieldRound2Match13Team1, tFieldRound2Match13Team2;
    private TextField tFieldRound2Match14Team1, tFieldRound2Match14Team2;
    private TextField tFieldRound2Match15Team1, tFieldRound2Match15Team2;
    private TextField tFieldRound2Match16Team1, tFieldRound2Match16Team2;

    private ChoiceBox<String> cBoxRound2Match1;//Trial
    private ChoiceBox<String> cBoxRound2Match2;//Trial
    private ChoiceBox<String> cBoxRound2Match3;//Trial
    private ChoiceBox<String> cBoxRound2Match4;//Trial
    private ChoiceBox<String> cBoxRound2Match5;//Trial
    private ChoiceBox<String> cBoxRound2Match6;//Trial
    private ChoiceBox<String> cBoxRound2Match7;//Trial
    private ChoiceBox<String> cBoxRound2Match8;//Trial
    private ChoiceBox<String> cBoxRound2Match9;//Trial
    private ChoiceBox<String> cBoxRound2Match10;//Trial
    private ChoiceBox<String> cBoxRound2Match11;//Trial
    private ChoiceBox<String> cBoxRound2Match12;//Trial
    private ChoiceBox<String> cBoxRound2Match13;//Trial
    private ChoiceBox<String> cBoxRound2Match14;//Trial
    private ChoiceBox<String> cBoxRound2Match15;//Trial
    private ChoiceBox<String> cBoxRound2Match16;//Trial

    private Button btnRound2Match1Submit, btnRound2Match2Submit;//Trial
    private Button btnRound2Match3Submit, btnRound2Match4Submit;//Trial
    private Button btnRound2Match5Submit, btnRound2Match6Submit;//Trial
    private Button btnRound2Match7Submit, btnRound2Match8Submit;//Trial
    private Button btnRound2Match9Submit, btnRound2Match10Submit;//Trial
    private Button btnRound2Match11Submit, btnRound2Match12Submit;//Trial
    private Button btnRound2Match13Submit, btnRound2Match14Submit;//Trial
    private Button btnRound2Match15Submit, btnRound2Match16Submit;//Trial

    private Button btnRound2Match1Edit, btnRound2Match2Edit;
    private Button btnRound2Match3Edit, btnRound2Match4Edit;
    private Button btnRound2Match5Edit, btnRound2Match6Edit;
    private Button btnRound2Match7Edit, btnRound2Match8Edit;
    private Button btnRound2Match9Edit, btnRound2Match10Edit;
    private Button btnRound2Match11Edit, btnRound2Match12Edit;
    private Button btnRound2Match13Edit, btnRound2Match14Edit;
    private Button btnRound2Match15Edit, btnRound2Match16Edit;

    private Button btnRound2Match1Save, btnRound2Match2Save;
    private Button btnRound2Match3Save, btnRound2Match4Save;
    private Button btnRound2Match5Save, btnRound2Match6Save;
    private Button btnRound2Match7Save, btnRound2Match8Save;
    private Button btnRound2Match9Save, btnRound2Match10Save;
    private Button btnRound2Match11Save, btnRound2Match12Save;
    private Button btnRound2Match13Save, btnRound2Match14Save;
    private Button btnRound2Match15Save, btnRound2Match16Save;

    private TextField[][] roundTwoTextField;
    private ChoiceBox<String>[] roundTwoBox;

    private HBox Round2match1Box, Round2match2Box;
    private HBox Round2match3Box, Round2match4Box;
    private HBox Round2match5Box, Round2match6Box;
    private HBox Round2match7Box, Round2match8Box;
    private HBox Round2match9Box, Round2match10Box;
    private HBox Round2match11Box, Round2match12Box;
    private HBox Round2match13Box, Round2match14Box;
    private HBox Round2match15Box, Round2match16Box;

    private HBox Round2match1btnBox, Round2match2btnBox;
    private HBox Round2match3btnBox, Round2match4btnBox;
    private HBox Round2match5btnBox, Round2match6btnBox;
    private HBox Round2match7btnBox, Round2match8btnBox;
    private HBox Round2match9btnBox, Round2match10btnBox;
    private HBox Round2match11btnBox, Round2match12btnBox;
    private HBox Round2match13btnBox, Round2match14btnBox;
    private HBox Round2match15btnBox, Round2match16btnBox;

    private Label round2Match1Winner, round2Match2Winner;
    private Label round2Match3Winner, round2Match4Winner;
    private Label round2Match5Winner, round2Match6Winner;
    private Label round2Match7Winner, round2Match8Winner;
    private Label round2Match9Winner, round2Match10Winner;
    private Label round2Match11Winner, round2Match12Winner;
    private Label round2Match13Winner, round2Match14Winner;
    private Label round2Match15Winner, round2Match16Winner;

    //----------------------------------------------------------END ROUND TWO INITIALIZATION-----------------------------------------------

    //--------------------------------------------------------------ROUND THREE INITIALIZATION----------------------------------------------
    private ChoiceBox<String> cBoxRound3Match1TeamOne, cBoxRound3Match1TeamTwo;
    private ChoiceBox<String> cBoxRound3Match2TeamOne, cBoxRound3Match2TeamTwo;
    private ChoiceBox<String> cBoxRound3Match3TeamOne, cBoxRound3Match3TeamTwo;
    private ChoiceBox<String> cBoxRound3Match4TeamOne, cBoxRound3Match4TeamTwo;
    private ChoiceBox<String> cBoxRound3Match5TeamOne, cBoxRound3Match5TeamTwo;
    private ChoiceBox<String> cBoxRound3Match6TeamOne, cBoxRound3Match6TeamTwo;
    private ChoiceBox<String> cBoxRound3Match7TeamOne, cBoxRound3Match7TeamTwo;
    private ChoiceBox<String> cBoxRound3Match8TeamOne, cBoxRound3Match8TeamTwo;

    private TextField tFieldRound3Match1Team1, tFieldRound3Match1Team2;
    private TextField tFieldRound3Match2Team1, tFieldRound3Match2Team2;
    private TextField tFieldRound3Match3Team1, tFieldRound3Match3Team2;
    private TextField tFieldRound3Match4Team1, tFieldRound3Match4Team2;
    private TextField tFieldRound3Match5Team1, tFieldRound3Match5Team2;
    private TextField tFieldRound3Match6Team1, tFieldRound3Match6Team2;
    private TextField tFieldRound3Match7Team1, tFieldRound3Match7Team2;
    private TextField tFieldRound3Match8Team1, tFieldRound3Match8Team2;

    private ChoiceBox<String> cBoxRound3Match1, cBoxRound3Match2;
    private ChoiceBox<String> cBoxRound3Match3, cBoxRound3Match4;
    private ChoiceBox<String> cBoxRound3Match5, cBoxRound3Match6;
    private ChoiceBox<String> cBoxRound3Match7, cBoxRound3Match8;

    private Button btnRound3Match1Submit, btnRound3Match2Submit;
    private Button btnRound3Match3Submit, btnRound3Match4Submit;
    private Button btnRound3Match5Submit, btnRound3Match6Submit;
    private Button btnRound3Match7Submit, btnRound3Match8Submit;

    private Button btnRound3Match1Edit, btnRound3Match2Edit;
    private Button btnRound3Match3Edit, btnRound3Match4Edit;
    private Button btnRound3Match5Edit, btnRound3Match6Edit;
    private Button btnRound3Match7Edit, btnRound3Match8Edit;

    private Button btnRound3Match1Save, btnRound3Match2Save;
    private Button btnRound3Match3Save, btnRound3Match4Save;
    private Button btnRound3Match5Save, btnRound3Match6Save;
    private Button btnRound3Match7Save, btnRound3Match8Save;


    private TextField[][] roundThreeTextField;
    private ChoiceBox<String>[] roundThreeBox;

    private HBox Round3match1Box, Round3match2Box;
    private HBox Round3match3Box, Round3match4Box;
    private HBox Round3match5Box, Round3match6Box;
    private HBox Round3match7Box, Round3match8Box;

    private HBox Round3match1btnBox, Round3match2btnBox;
    private HBox Round3match3btnBox, Round3match4btnBox;
    private HBox Round3match5btnBox, Round3match6btnBox;
    private HBox Round3match7btnBox, Round3match8btnBox;

    private Label round3Match1Winner, round3Match2Winner;
    private Label round3Match3Winner, round3Match4Winner;
    private Label round3Match5Winner, round3Match6Winner;
    private Label round3Match7Winner, round3Match8Winner;

    //---------------------------------------------------------------END ROUND THREE INITIALIZATION-----------------------------------------
    //----------------------------------------------------------ROUND FOUR INITIALIZATION--------------------------------------------------
    private ChoiceBox<String> cBoxRound4Match1TeamOne;
    private ChoiceBox<String> cBoxRound4Match1TeamTwo;
    private ChoiceBox<String> cBoxRound4Match2TeamOne;
    private ChoiceBox<String> cBoxRound4Match2TeamTwo;
    private ChoiceBox<String> cBoxRound4Match3TeamOne;
    private ChoiceBox<String> cBoxRound4Match3TeamTwo;
    private ChoiceBox<String> cBoxRound4Match4TeamOne;
    private ChoiceBox<String> cBoxRound4Match4TeamTwo;

    private TextField tFieldRound4Match1Team1, tFieldRound4Match1Team2;
    private TextField tFieldRound4Match2Team1, tFieldRound4Match2Team2;
    private TextField tFieldRound4Match3Team1, tFieldRound4Match3Team2;
    private TextField tFieldRound4Match4Team1, tFieldRound4Match4Team2;

    private ChoiceBox<String> cBoxRound4Match1;//Trial
    private ChoiceBox<String> cBoxRound4Match2;//Trial
    private ChoiceBox<String> cBoxRound4Match3;//Trial
    private ChoiceBox<String> cBoxRound4Match4;//Trial

    private Button btnRound4Match1Submit, btnRound4Match2Submit;//Trial
    private Button btnRound4Match3Submit, btnRound4Match4Submit;//Trial

    private Button btnRound4Match1Edit, btnRound4Match2Edit;
    private Button btnRound4Match3Edit, btnRound4Match4Edit;

    private Button btnRound4Match1Save, btnRound4Match2Save;
    private Button btnRound4Match3Save, btnRound4Match4Save;

    private TextField[][] roundFourTextField;
    private ChoiceBox<String>[] roundFourBox;

    private HBox Round4match1Box, Round4match2Box;
    private HBox Round4match3Box, Round4match4Box;

    private HBox Round4match1btnBox, Round4match2btnBox;
    private HBox Round4match3btnBox, Round4match4btnBox;

    private Label round4Match1Winner, round4Match2Winner;
    private Label round4Match3Winner, round4Match4Winner;


    //----------------------------------------------------------END ROUND FOUR INITIALIZATION------------------------------------------

    //----------------------------------------------------------ROUND FIVE INITIALIZATION--------------------------------------------------
    private ChoiceBox<String> cBoxRound5Match1TeamOne;
    private ChoiceBox<String> cBoxRound5Match1TeamTwo;
    private ChoiceBox<String> cBoxRound5Match2TeamOne;
    private ChoiceBox<String> cBoxRound5Match2TeamTwo;

    private TextField tFieldRound5Match1Team1, tFieldRound5Match1Team2;
    private TextField tFieldRound5Match2Team1, tFieldRound5Match2Team2;

    private ChoiceBox<String> cBoxRound5Match1;//Trial
    private ChoiceBox<String> cBoxRound5Match2;//Trial

    private Button btnRound5Match1Submit, btnRound5Match2Submit;//Trial

    private Button btnRound5Match1Edit, btnRound5Match2Edit;

    private Button btnRound5Match1Save, btnRound5Match2Save;

    private TextField[][] roundFiveTextField;
    private ChoiceBox<String>[] roundFiveBox;

    private HBox Round5match1Box, Round5match2Box;

    private HBox Round5match1btnBox, Round5match2btnBox;

    private Label round5Match1Winner, round5Match2Winner;

    //----------------------------------------------------------END ROUND FIVE INITIALIZATION------------------------------------------

    //----------------------------------------------------------ROUND SIX INITIALIZATION--------------------------------------------------
    private ChoiceBox<String> cBoxRound6Match1TeamOne;
    private ChoiceBox<String> cBoxRound6Match1TeamTwo;

    private TextField tFieldRound6Match1Team1, tFieldRound6Match1Team2;

    private ChoiceBox<String> cBoxRound6Match1;//Trial

    private Button btnRound6Match1Submit;//Trial

    private Button btnRound6Match1Edit;

    private Button btnRound6Match1Save;

    private TextField[][] roundSixTextField;
    private ChoiceBox<String>[] roundSixBox;

    private HBox Round6match1Box;

    private HBox Round6match1btnBox;

    private Label round6Match1Winner;

    //----------------------------------------------------------END ROUND SIX INITIALIZATION------------------------------------------

    //----------------------------------------------------------ROUND SEVEN INITIALIZATION--------------------------------------------------
    private ChoiceBox<String> cBoxRound7Match1TeamOne;
    private ChoiceBox<String> cBoxRound7Match1TeamTwo;

    private TextField tFieldRound7Match1Team1, tFieldRound7Match1Team2;

    private ChoiceBox<String> cBoxRound7Match1;//Trial

    private Button btnRound7Match1Submit;//Trial

    private Button btnRound7Match1Edit;

    private Button btnRound7Match1Save;

    private TextField[][] roundSevenTextField;
    private ChoiceBox<String>[] roundSevenBox;

    private HBox Round7match1Box;

    private HBox Round7match1btnBox;

    private Label round7Match1Winner;

    //----------------------------------------------------------END ROUND SEVEN INITIALIZATION------------------------------------------

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        buildHomeScene();
        buildSchoolScene();
        buildRankScene();
        buildRoundSelection();
        buildRoundOneScene();
        buildRoundTwoScene();
        buildRoundThreeScene();
        buildRoundFourScene();
        buildRoundFiveScene();
        buildRoundSixScene();
        buildRoundSevenScene();

        window.setTitle("Schools' Challenge Quiz");
        window.setScene(sceneHome);
        window.setResizable(false);
        window.show();
    }//END START | Builds the different scenes and sets them to the stage

    public static void main(String[] args) {
        launch(args);
    }

    public void buildHomeScene()
    {
        VBox root = new VBox();
        Text promptText = new Text("Please select an option below");
        Button matchBtn = new Button("Enter Match Outcome");
        Button btnSchool = new Button("Edit School List");
        Button btnPrint = new Button("Print Rankings to Excel");
        Button btnReset = new Button("Reset Match Fixtures");
        viewBtn = new Button("View Ranking Sheet");
        Image img = new Image("/sample/SCQpic.png",280,240,true,true);
        ImageView imgView = new ImageView(img);

        matchBtn.setMinSize(145,15);
        btnSchool.setMinSize(145,15);
        btnPrint.setMinSize(145,15);
        viewBtn.setMinSize(145,15);
        btnReset.setMinSize(145,15);

        root.setAlignment(Pos.CENTER);
        root.setSpacing(15);
        promptText.setFont(Font.font("cambria",15));

        root.getChildren().addAll(imgView,promptText,matchBtn,btnSchool,viewBtn,btnPrint,btnReset);

        //matchBtn.setOnAction(e -> window.setScene(sceneMatch));
        matchBtn.setOnAction(e -> window.setScene(sceneRoundSelection));//Trial
        btnSchool.setOnAction(e -> window.setScene(sceneSchool));
        viewBtn.setOnAction
                (e -> {rankingSheet.getItems().clear();
                    rankingSheet.setItems(getRankingSheet());
                    window.setScene(sceneRank);});
        btnPrint.setOnAction(event -> printToExcel());
        btnReset.setOnAction(event -> WriteToFile.resetMatchFixtures());

        sceneHome = new Scene(root,350,500);
    }//END BUILD HOME SCENE

    public void buildRankScene()
    {
        VBox sheetBox =  new VBox();
        Button btnBack = new Button("Go Back");
        rankingSheet = new TableView<>();
        TableColumn<TeamRank,Integer> rankColumn = new TableColumn<>("Ranking");
        TableColumn<TeamRank,String> schoolColumn = new TableColumn<>("School");
        TableColumn<TeamRank,Integer> pointColumn = new TableColumn<>("Points");

        rankColumn.setMinWidth(20);
        schoolColumn.setMinWidth(200);
        pointColumn.setMinWidth(100);

        rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
        schoolColumn.setCellValueFactory(new PropertyValueFactory<>("school"));
        pointColumn.setCellValueFactory(new PropertyValueFactory<>("points"));

        rankColumn.setSortable(false);
        schoolColumn.setSortable(false);
        pointColumn.setSortable(false);

        rankingSheet.getColumns().addAll(rankColumn,schoolColumn,pointColumn);

        sheetBox.setSpacing(10);
        sheetBox.setAlignment(Pos.TOP_CENTER);
        sheetBox.getChildren().addAll(btnBack,rankingSheet);

        btnBack.setOnAction(event -> window.setScene(sceneHome));

        sceneRank = new Scene(sheetBox);
    }//END BUILD RANK SCENE

    public void buildSchoolScene()
    {
        GridPane schoolGrid = new GridPane();
        VBox changeVBox = new VBox();
        Image img = new Image("/sample/SCQpic.png",280,240,true,true);
        ImageView imgSchool = new ImageView(img);
        Label lblChangeSchool = new Label("Edit a School Name:");
        Label lblAddSchool = new Label("Enter New School:");
        Label lblDeleteSchool =  new Label("Delete a School:");
        tFieldAddSchool = new TextField();
        tFieldChangeSchool = new TextField();
        Button btnAddSchool = new Button("Add School");
        Button btnDeleteSchool = new Button("Delete School");
        Button btnSchoolBack = new Button("Go Back");
        Button btnSubmitSchool = new Button("Submit Changes");
        cBoxDeleteSchool = new ChoiceBox<>();
        cBoxChangeSchool = new ChoiceBox<>();

        tFieldChangeSchool.setPromptText("Enter new name");
        tFieldAddSchool.setPromptText("Enter new school");

        cBoxDeleteSchool.setMinSize(165,15);
        cBoxChangeSchool.setMinSize(165,15);
        btnAddSchool.setMinSize(105,15);
        btnDeleteSchool.setMinSize(105,15);
        btnSubmitSchool.setMinSize(105,15);
        changeVBox.setAlignment(Pos.CENTER);
        changeVBox.setSpacing(5);
        schoolGrid.setAlignment(Pos.CENTER);
        schoolGrid.setHgap(10);
        schoolGrid.setVgap(15);

        changeVBox.getChildren().addAll(cBoxChangeSchool,tFieldChangeSchool);

        schoolGrid.setConstraints(imgSchool,0,0,3,1, HPos.CENTER, VPos.TOP);
        schoolGrid.setConstraints(lblAddSchool,0,1, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(tFieldAddSchool,1,1, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(btnAddSchool,2,1, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(lblDeleteSchool,0,2, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(cBoxDeleteSchool,1,2, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(btnDeleteSchool,2,2, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(lblChangeSchool,0,3, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(changeVBox,1,3, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(btnSubmitSchool,2,3, 1, 1, HPos.CENTER, VPos.CENTER);
        schoolGrid.setConstraints(btnSchoolBack,0,4,3,1,HPos.CENTER,VPos.CENTER);
        schoolGrid.getChildren().addAll(imgSchool,lblAddSchool,tFieldAddSchool,btnAddSchool,lblDeleteSchool,
                cBoxDeleteSchool,btnDeleteSchool,lblChangeSchool,changeVBox,btnSubmitSchool,btnSchoolBack);

        generateSortedList(schoolSceneCode);//Generates a sorted school list

        btnAddSchool.setOnAction(event -> addSchoolRecord());
        btnDeleteSchool.setOnAction(event -> deleteSchoolRecord());
        btnSubmitSchool.setOnAction(event -> changeSchoolRecord());
        btnSchoolBack.setOnAction(event -> window.setScene(sceneHome));

        sceneSchool = new Scene(schoolGrid,410,500);
    }//END BUILD SCHOOL SCENE

    public void buildRoundSelection()
    {
        VBox vBoxRoot = new VBox();
        Image img = new Image("/sample/SCQpic.png",280,240,true,true);
        ImageView imgView = new ImageView(img);
        Text promptText = new Text("Please select a Round");
        Button btnBack = new Button("Go Back");
        Button btnRound1 = new Button("Round One");
        btnRound2 = new Button("Round Two");
        btnRound3 = new Button("Round Three");
        btnRound4 = new Button("Round Four");
        btnRound5 = new Button("Round Five");
        btnRound6 = new Button("Round Six");
        btnRound7 = new Button("Round Seven");

        vBoxRoot.getChildren().addAll(imgView,promptText,btnBack,btnRound1,btnRound2,btnRound3,btnRound4,btnRound5,btnRound6,btnRound7);

        btnRound2.setVisible(true); btnRound3.setVisible(true);
        btnRound4.setVisible(true); btnRound5.setVisible(true);
        btnRound6.setVisible(true); btnRound7.setVisible(true);

        btnBack.setMinSize(145,15); btnRound1.setMinSize(145,15);
        btnRound2.setMinSize(145,15); btnRound3.setMinSize(145,15);
        btnRound4.setMinSize(145,15); btnRound5.setMinSize(145,15);
        btnRound6.setMinSize(145,15); btnRound7.setMinSize(145,15);

        vBoxRoot.setSpacing(15);
        vBoxRoot.setAlignment(Pos.CENTER);
        promptText.setFont(Font.font("Cambria",15));

        btnBack.setOnAction(event -> window.setScene(sceneHome));
        btnRound1.setOnAction(event -> window.setScene(sceneRound1));
        btnRound2.setOnAction(event -> window.setScene(sceneRound2)); //Testing Nov 19
        btnRound3.setOnAction(event -> window.setScene(sceneRound3));
        btnRound4.setOnAction(event -> window.setScene(sceneRound4)); //Testing Nov 22
        btnRound5.setOnAction(event -> window.setScene(sceneRound5)); //Testing Nov 22
        btnRound6.setOnAction(event -> window.setScene(sceneRound6)); //Testing Nov 22
        btnRound7.setOnAction(event -> window.setScene(sceneRound7)); //Testing Nov 22
        sceneRoundSelection = new Scene(vBoxRoot,350, 600);
    }//END BUILD ROUND SELECTION

    public void matchResultSubmission(ActionEvent event)
    {
        int round = 0;
        String teamWin = "";
        String teamLose = "";
        String teamOne = "";
        String teamTwo = "";

        //-------------------------------------------ROUND ONE MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound1Match1Submit)) {
            round = 1;
            teamWin = cBoxRound1Match1.getValue();
            teamOne = tFieldMatch1Team1.getText();
            teamTwo = tFieldMatch1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch1Team1.getText();
            }

            roundOneMatch1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 0);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 1 SUBMISSION

        if(event.getSource().equals(btnRound1Match2Submit)) {
            round = 1;
            teamWin = cBoxRound1Match2.getValue();
            teamOne = tFieldMatch2Team1.getText();
            teamTwo = tFieldMatch2Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch2Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch2Team1.getText();
            }

            roundOneMatch2Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 1);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 2 SUBMISSION

        if(event.getSource().equals(btnRound1Match3Submit)) {
            round = 1;
            teamWin = cBoxRound1Match3.getValue();
            teamOne = tFieldMatch3Team1.getText();
            teamTwo = tFieldMatch3Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch3Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch3Team1.getText();
            }

            roundOneMatch3Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 2);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 3 SUBMISSION

        if(event.getSource().equals(btnRound1Match4Submit)) {
            round = 1;
            teamWin = cBoxRound1Match4.getValue();
            teamOne = tFieldMatch4Team1.getText();
            teamTwo = tFieldMatch4Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch4Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch4Team1.getText();
            }

            roundOneMatch4Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 3);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 4 SUBMISSION

        if(event.getSource().equals(btnRound1Match5Submit)) {
            round = 1;
            teamWin = cBoxRound1Match5.getValue();
            teamOne = tFieldMatch5Team1.getText();
            teamTwo = tFieldMatch5Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch5Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch5Team1.getText();
            }

            roundOneMatch5Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 4);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND FIVE SUBMISSION

        if(event.getSource().equals(btnRound1Match6Submit)) {
            round = 1;
            teamWin = cBoxRound1Match6.getValue();
            teamOne = tFieldMatch6Team1.getText();
            teamTwo = tFieldMatch6Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch6Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch6Team1.getText();
            }

            roundOneMatch6Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 5);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 6 SUBMISSION

        if(event.getSource().equals(btnRound1Match7Submit)) {
            round = 1;
            teamWin = cBoxRound1Match7.getValue();
            teamOne = tFieldMatch7Team1.getText();
            teamTwo = tFieldMatch7Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch7Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch7Team1.getText();
            }

            roundOneMatch7Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 6);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 7 SUBMISSION

        if(event.getSource().equals(btnRound1Match8Submit)) {
            round = 1;
            teamWin = cBoxRound1Match8.getValue();
            teamOne = tFieldMatch8Team1.getText();
            teamTwo = tFieldMatch8Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch8Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch8Team1.getText();
            }

            roundOneMatch8Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 7);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 8 SUBMISSION

        if(event.getSource().equals(btnRound1Match9Submit)) {
            round = 1;
            teamWin = cBoxRound1Match9.getValue();
            teamOne = tFieldMatch9Team1.getText();
            teamTwo = tFieldMatch9Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch9Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch9Team1.getText();
            }

            roundOneMatch9Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 8);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 9 SUBMISSION

        if(event.getSource().equals(btnRound1Match10Submit)) {
            round = 1;
            teamWin = cBoxRound1Match10.getValue();
            teamOne = tFieldMatch10Team1.getText();
            teamTwo = tFieldMatch10Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch10Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch10Team1.getText();
            }

            roundOneMatch10Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 9);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 10 SUBMISSION

        if(event.getSource().equals(btnRound1Match11Submit)) {
            round = 1;
            teamWin = cBoxRound1Match11.getValue();
            teamOne = tFieldMatch11Team1.getText();
            teamTwo = tFieldMatch11Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch11Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch11Team1.getText();
            }

            roundOneMatch11Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 10);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 11 SUBMISSION

        if(event.getSource().equals(btnRound1Match12Submit)) {
            round = 1;
            teamWin = cBoxRound1Match12.getValue();
            teamOne = tFieldMatch12Team1.getText();
            teamTwo = tFieldMatch12Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch12Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch12Team1.getText();
            }

            roundOneMatch12Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 11);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 12 SUBMISSION

        if(event.getSource().equals(btnRound1Match13Submit)) {
            round = 1;
            teamWin = cBoxRound1Match13.getValue();
            teamOne = tFieldMatch13Team1.getText();
            teamTwo = tFieldMatch13Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch13Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch13Team1.getText();
            }

            roundOneMatch13Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 12);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 13 SUBMISSION

        if(event.getSource().equals(btnRound1Match14Submit)) {
            round = 1;
            teamWin = cBoxRound1Match14.getValue();
            teamOne = tFieldMatch14Team1.getText();
            teamTwo = tFieldMatch14Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch14Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch14Team1.getText();
            }

            roundOneMatch14Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 13);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 14 SUBMISSION

        if(event.getSource().equals(btnRound1Match15Submit)) {
            round = 1;
            teamWin = cBoxRound1Match15.getValue();
            teamOne = tFieldMatch15Team1.getText();
            teamTwo = tFieldMatch15Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch15Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch15Team1.getText();
            }

            roundOneMatch15Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 14);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 15 SUBMISSION

        if(event.getSource().equals(btnRound1Match16Submit)) {
            round = 1;
            teamWin = cBoxRound1Match16.getValue();
            teamOne = tFieldMatch16Team1.getText();
            teamTwo = tFieldMatch16Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch16Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch16Team1.getText();
            }

            roundOneMatch16Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 15);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 16 SUBMISSION

        if(event.getSource().equals(btnRound1Match17Submit)) {
            round = 1;
            teamWin = cBoxRound1Match17.getValue();
            teamOne = tFieldMatch17Team1.getText();
            teamTwo = tFieldMatch17Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch17Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch17Team1.getText();
            }

            roundOneMatch17Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 16);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 17 SUBMISSION

        if(event.getSource().equals(btnRound1Match18Submit)) {
            round = 1;
            teamWin = cBoxRound1Match18.getValue();
            teamOne = tFieldMatch18Team1.getText();
            teamTwo = tFieldMatch18Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch18Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch18Team1.getText();
            }

            roundOneMatch18Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 17);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 18 SUBMISSION

        if(event.getSource().equals(btnRound1Match19Submit)) {
            round = 1;
            teamWin = cBoxRound1Match19.getValue();
            teamOne = tFieldMatch19Team1.getText();
            teamTwo = tFieldMatch19Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch19Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch19Team1.getText();
            }

            roundOneMatch19Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 18);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 19 SUBMISSION

        if(event.getSource().equals(btnRound1Match20Submit)) {
            round = 1;
            teamWin = cBoxRound1Match20.getValue();
            teamOne = tFieldMatch20Team1.getText();
            teamTwo = tFieldMatch20Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch20Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch20Team1.getText();
            }

            roundOneMatch20Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 19);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 20 SUBMISSION

        if(event.getSource().equals(btnRound1Match21Submit)) {
            round = 1;
            teamWin = cBoxRound1Match21.getValue();
            teamOne = tFieldMatch21Team1.getText();
            teamTwo = tFieldMatch21Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch21Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch21Team1.getText();
            }

            roundOneMatch21Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 20);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 21 SUBMISSION

        if(event.getSource().equals(btnRound1Match22Submit)) {
            round = 1;
            teamWin = cBoxRound1Match22.getValue();
            teamOne = tFieldMatch22Team1.getText();
            teamTwo = tFieldMatch22Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch22Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch22Team1.getText();
            }

            roundOneMatch22Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 21);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 22 SUBMISSION

        if(event.getSource().equals(btnRound1Match23Submit)) {
            round = 1;
            teamWin = cBoxRound1Match23.getValue();
            teamOne = tFieldMatch23Team1.getText();
            teamTwo = tFieldMatch23Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch23Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch23Team1.getText();
            }

            roundOneMatch23Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 22);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 23 SUBMISSION

        if(event.getSource().equals(btnRound1Match24Submit)) {
            round = 1;
            teamWin = cBoxRound1Match24.getValue();
            teamOne = tFieldMatch24Team1.getText();
            teamTwo = tFieldMatch24Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch24Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch24Team1.getText();
            }

            roundOneMatch24Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 23);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 24 SUBMISSION

        if(event.getSource().equals(btnRound1Match25Submit)) {
            round = 1;
            teamWin = cBoxRound1Match25.getValue();
            teamOne = tFieldMatch25Team1.getText();
            teamTwo = tFieldMatch25Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch25Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch25Team1.getText();
            }

            roundOneMatch25Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 24);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 25 SUBMISSION

        if(event.getSource().equals(btnRound1Match26Submit)) {
            round = 1;
            teamWin = cBoxRound1Match26.getValue();
            teamOne = tFieldMatch26Team1.getText();
            teamTwo = tFieldMatch26Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch26Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch26Team1.getText();
            }

            roundOneMatch26Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 25);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 26 SUBMISSION

        if(event.getSource().equals(btnRound1Match27Submit)) {
            round = 1;
            teamWin = cBoxRound1Match27.getValue();
            teamOne = tFieldMatch27Team1.getText();
            teamTwo = tFieldMatch27Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch27Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch27Team1.getText();
            }

            roundOneMatch27Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 26);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 27 SUBMISSION

        if(event.getSource().equals(btnRound1Match28Submit)) {
            round = 1;
            teamWin = cBoxRound1Match28.getValue();
            teamOne = tFieldMatch28Team1.getText();
            teamTwo = tFieldMatch28Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch28Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch28Team1.getText();
            }

            roundOneMatch28Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 27);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 28 SUBMISSION

        if(event.getSource().equals(btnRound1Match29Submit)) {
            round = 1;
            teamWin = cBoxRound1Match29.getValue();
            teamOne = tFieldMatch29Team1.getText();
            teamTwo = tFieldMatch29Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch29Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch29Team1.getText();
            }

            roundOneMatch29Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 28);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 29 SUBMISSION

        if(event.getSource().equals(btnRound1Match30Submit)) {
            round = 1;
            teamWin = cBoxRound1Match30.getValue();
            teamOne = tFieldMatch30Team1.getText();
            teamTwo = tFieldMatch30Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch30Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch30Team1.getText();
            }

            roundOneMatch30Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 29);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 30 SUBMISSION

        if(event.getSource().equals(btnRound1Match31Submit)) {
            round = 1;
            teamWin = cBoxRound1Match31.getValue();
            teamOne = tFieldMatch31Team1.getText();
            teamTwo = tFieldMatch31Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch31Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch31Team1.getText();
            }

            roundOneMatch31Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 30);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 31 SUBMISSION

        if(event.getSource().equals(btnRound1Match32Submit)) {
            round = 1;
            teamWin = cBoxRound1Match32.getValue();
            teamOne = tFieldMatch32Team1.getText();
            teamTwo = tFieldMatch32Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldMatch32Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldMatch32Team1.getText();
            }

            roundOneMatch32Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundOneWinners(teamWin, 31);
            WriteToFile.writeToRoundOneFile(OpenFile.getRoundOneWinners());
            WriteToFile.closeFile();
        }//ROUND ONE MATCH 32 SUBMISSION
        //-------------------------------------------------END ROUND ONE SUBMISSION-----------------------------------------

        //-------------------------------------------ROUND TWO MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound2Match1Submit)) {
            round = 1;
            teamWin = cBoxRound2Match1.getValue();
            teamOne = tFieldRound2Match1Team1.getText();
            teamTwo = tFieldRound2Match1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match1Team1.getText();
            }

            round2Match1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 0);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 1 SUBMISSION

        if(event.getSource().equals(btnRound2Match2Submit)) {
            round = 1;
            teamWin = cBoxRound2Match2.getValue();
            teamOne = tFieldRound2Match2Team1.getText();
            teamTwo = tFieldRound2Match2Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match2Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match2Team1.getText();
            }

            round2Match2Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 1);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 2 SUBMISSION

        if(event.getSource().equals(btnRound2Match3Submit)) {
            round = 1;
            teamWin = cBoxRound2Match3.getValue();
            teamOne = tFieldRound2Match3Team1.getText();
            teamTwo = tFieldRound2Match3Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match3Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match3Team1.getText();
            }

            round2Match3Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 2);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 3 SUBMISSION

        if(event.getSource().equals(btnRound2Match4Submit)) {
            round = 1;
            teamWin = cBoxRound2Match4.getValue();
            teamOne = tFieldRound2Match4Team1.getText();
            teamTwo = tFieldRound2Match4Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match4Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match4Team1.getText();
            }

            round2Match4Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 3);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 4 SUBMISSION

        if(event.getSource().equals(btnRound2Match5Submit)) {
            round = 1;
            teamWin = cBoxRound2Match5.getValue();
            teamOne = tFieldRound2Match5Team1.getText();
            teamTwo = tFieldRound2Match5Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match5Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match5Team1.getText();
            }

            round2Match5Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 4);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 5 SUBMISSION

        if(event.getSource().equals(btnRound2Match6Submit)) {
            round = 1;
            teamWin = cBoxRound2Match6.getValue();
            teamOne = tFieldRound2Match6Team1.getText();
            teamTwo = tFieldRound2Match6Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match6Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match6Team1.getText();
            }

            round2Match6Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 5);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 6 SUBMISSION

        if(event.getSource().equals(btnRound2Match7Submit)) {
            round = 1;
            teamWin = cBoxRound2Match7.getValue();
            teamOne = tFieldRound2Match7Team1.getText();
            teamTwo = tFieldRound2Match7Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match7Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match7Team1.getText();
            }

            round2Match7Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 6);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 7 SUBMISSION

        if(event.getSource().equals(btnRound2Match8Submit)) {
            round = 1;
            teamWin = cBoxRound2Match8.getValue();
            teamOne = tFieldRound2Match8Team1.getText();
            teamTwo = tFieldRound2Match8Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match8Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match8Team1.getText();
            }

            round2Match8Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 7);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 8 SUBMISSION

        if(event.getSource().equals(btnRound2Match9Submit)) {
            round = 1;
            teamWin = cBoxRound2Match9.getValue();
            teamOne = tFieldRound2Match9Team1.getText();
            teamTwo = tFieldRound2Match9Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match9Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match9Team1.getText();
            }

            round2Match9Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 8);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 9 SUBMISSION

        if(event.getSource().equals(btnRound2Match10Submit)) {
            round = 1;
            teamWin = cBoxRound2Match10.getValue();
            teamOne = tFieldRound2Match10Team1.getText();
            teamTwo = tFieldRound2Match10Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match10Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match10Team1.getText();
            }

            round2Match10Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 9);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 10 SUBMISSION

        if(event.getSource().equals(btnRound2Match11Submit)) {
            round = 1;
            teamWin = cBoxRound2Match11.getValue();
            teamOne = tFieldRound2Match11Team1.getText();
            teamTwo = tFieldRound2Match11Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match11Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match11Team1.getText();
            }

            round2Match11Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 10);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 11 SUBMISSION

        if(event.getSource().equals(btnRound2Match12Submit)) {
            round = 1;
            teamWin = cBoxRound2Match12.getValue();
            teamOne = tFieldRound2Match12Team1.getText();
            teamTwo = tFieldRound2Match12Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match12Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match12Team1.getText();
            }

            round2Match12Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 11);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 12 SUBMISSION

        if(event.getSource().equals(btnRound2Match13Submit)) {
            round = 1;
            teamWin = cBoxRound2Match13.getValue();
            teamOne = tFieldRound2Match13Team1.getText();
            teamTwo = tFieldRound2Match13Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match13Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match13Team1.getText();
            }

            round2Match13Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 12);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 13 SUBMISSION

        if(event.getSource().equals(btnRound2Match14Submit)) {
            round = 1;
            teamWin = cBoxRound2Match14.getValue();
            teamOne = tFieldRound2Match14Team1.getText();
            teamTwo = tFieldRound2Match14Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match14Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match14Team1.getText();
            }

            round2Match14Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 13);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 14 SUBMISSION

        if(event.getSource().equals(btnRound2Match15Submit)) {
            round = 1;
            teamWin = cBoxRound2Match15.getValue();
            teamOne = tFieldRound2Match15Team1.getText();
            teamTwo = tFieldRound2Match15Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match15Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match15Team1.getText();
            }

            round2Match15Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 14);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 15 SUBMISSION

        if(event.getSource().equals(btnRound2Match16Submit)) {
            round = 1;
            teamWin = cBoxRound2Match16.getValue();
            teamOne = tFieldRound2Match16Team1.getText();
            teamTwo = tFieldRound2Match16Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound2Match16Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound2Match16Team1.getText();
            }

            round2Match16Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundTwoWinners(teamWin, 15);
            WriteToFile.writeToRoundTwoFile(OpenFile.getRoundTwoWinners());
            WriteToFile.closeFile();
        }//ROUND TWO MATCH 16 SUBMISSION


        //-------------------------------------------------END ROUND TWO SUBMISSION-----------------------------------------

        //-------------------------------------------ROUND THREE MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound3Match1Submit)) {
            round = 1;
            teamWin = cBoxRound3Match1.getValue();
            teamOne = tFieldRound3Match1Team1.getText();
            teamTwo = tFieldRound3Match1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match1Team1.getText();
            }

            round3Match1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 0);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 1 SUBMISSION

        if(event.getSource().equals(btnRound3Match2Submit)) {
            round = 1;
            teamWin = cBoxRound3Match2.getValue();
            teamOne = tFieldRound3Match2Team1.getText();
            teamTwo = tFieldRound3Match2Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match2Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match2Team1.getText();
            }

            round3Match2Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 1);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 2 SUBMISSION

        if(event.getSource().equals(btnRound3Match3Submit)) {
            round = 1;
            teamWin = cBoxRound3Match3.getValue();
            teamOne = tFieldRound3Match3Team1.getText();
            teamTwo = tFieldRound3Match3Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match3Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match3Team1.getText();
            }

            round3Match3Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 2);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 3 SUBMISSION

        if(event.getSource().equals(btnRound3Match4Submit)) {
            round = 1;
            teamWin = cBoxRound3Match4.getValue();
            teamOne = tFieldRound3Match4Team1.getText();
            teamTwo = tFieldRound3Match4Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match4Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match4Team1.getText();
            }

            round3Match4Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 3);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 4 SUBMISSION

        if(event.getSource().equals(btnRound3Match5Submit)) {
            round = 1;
            teamWin = cBoxRound3Match5.getValue();
            teamOne = tFieldRound3Match5Team1.getText();
            teamTwo = tFieldRound3Match5Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match5Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match5Team1.getText();
            }

            round3Match5Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 4);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 5 SUBMISSION

        if(event.getSource().equals(btnRound3Match6Submit)) {
            round = 1;
            teamWin = cBoxRound3Match6.getValue();
            teamOne = tFieldRound3Match6Team1.getText();
            teamTwo = tFieldRound3Match6Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match6Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match6Team1.getText();
            }

            round3Match6Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 5);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 6 SUBMISSION

        if(event.getSource().equals(btnRound3Match7Submit)) {
            round = 1;
            teamWin = cBoxRound3Match7.getValue();
            teamOne = tFieldRound3Match7Team1.getText();
            teamTwo = tFieldRound3Match7Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match7Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match7Team1.getText();
            }

            round3Match7Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 6);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 7 SUBMISSION

        if(event.getSource().equals(btnRound3Match8Submit)) {
            round = 1;
            teamWin = cBoxRound3Match8.getValue();
            teamOne = tFieldRound3Match8Team1.getText();
            teamTwo = tFieldRound3Match8Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound3Match8Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound3Match8Team1.getText();
            }

            round3Match8Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundThreeWinners(teamWin, 7);
            WriteToFile.writeToRoundThreeFile(OpenFile.getRoundThreeWinners());
            WriteToFile.closeFile();
        }//ROUND THREE MATCH 8 SUBMISSION



        //-------------------------------------------------END ROUND THREE SUBMISSION-----------------------------------------

        //-------------------------------------------ROUND FOUR MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound4Match1Submit)) {
            round = 1;
            teamWin = cBoxRound4Match1.getValue();
            teamOne = tFieldRound4Match1Team1.getText();
            teamTwo = tFieldRound4Match1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound4Match1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound4Match1Team1.getText();
            }

            round4Match1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundFourWinners(teamWin, 0);
            WriteToFile.writeToRoundFourFile(OpenFile.getRoundFourWinners());
            WriteToFile.closeFile();
        }//ROUND FOUR MATCH 1 SUBMISSION

        if(event.getSource().equals(btnRound4Match2Submit)) {
            round = 1;
            teamWin = cBoxRound4Match2.getValue();
            teamOne = tFieldRound4Match2Team1.getText();
            teamTwo = tFieldRound4Match2Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound4Match2Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound4Match2Team1.getText();
            }

            round4Match2Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundFourWinners(teamWin, 1);
            WriteToFile.writeToRoundFourFile(OpenFile.getRoundFourWinners());
            WriteToFile.closeFile();
        }//ROUND FOUR MATCH 2 SUBMISSION

        if(event.getSource().equals(btnRound4Match3Submit)) {
            round = 1;
            teamWin = cBoxRound4Match3.getValue();
            teamOne = tFieldRound4Match3Team1.getText();
            teamTwo = tFieldRound4Match3Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound4Match3Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound4Match3Team1.getText();
            }

            round4Match3Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundFourWinners(teamWin, 2);
            WriteToFile.writeToRoundFourFile(OpenFile.getRoundFourWinners());
            WriteToFile.closeFile();
        }//ROUND FOUR MATCH 3 SUBMISSION

        if(event.getSource().equals(btnRound4Match4Submit)) {
            round = 1;
            teamWin = cBoxRound4Match4.getValue();
            teamOne = tFieldRound4Match4Team1.getText();
            teamTwo = tFieldRound4Match4Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound4Match4Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound4Match4Team1.getText();
            }

            round4Match4Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundFourWinners(teamWin, 3);
            WriteToFile.writeToRoundFourFile(OpenFile.getRoundFourWinners());
            WriteToFile.closeFile();
        }//ROUND FOUR MATCH 4 SUBMISSION

        //-------------------------------------------------END ROUND FOUR SUBMISSION-----------------------------------------

        //-------------------------------------------ROUND FIVE MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound5Match1Submit)) {
            round = 1;
            teamWin = cBoxRound5Match1.getValue();
            teamOne = tFieldRound5Match1Team1.getText();
            teamTwo = tFieldRound5Match1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound5Match1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound5Match1Team1.getText();
            }

            round5Match1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundFiveWinners(teamWin, 0);
            OpenFile.setRoundFiveLosers(teamLose, 0);
            WriteToFile.writeToRoundFiveFile(OpenFile.getRoundFiveWinners(), OpenFile.getRoundFiveLosers());
            WriteToFile.closeFile();
        }//ROUND FIVE MATCH 1 SUBMISSION

        if(event.getSource().equals(btnRound5Match2Submit)) {
            round = 1;
            teamWin = cBoxRound5Match2.getValue();
            teamOne = tFieldRound5Match2Team1.getText();
            teamTwo = tFieldRound5Match2Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound5Match2Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound5Match2Team1.getText();
            }

            round5Match2Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundFiveWinners(teamWin, 1);
            OpenFile.setRoundFiveWinners(teamLose, 1);
            WriteToFile.writeToRoundFiveFile(OpenFile.getRoundFiveWinners(), OpenFile.getRoundFiveLosers());
            WriteToFile.closeFile();
            WriteToFile.closeRound5LoserFile();
        }//ROUND FIVE MATCH 2 SUBMISSION


        //-------------------------------------------------END ROUND FIVE SUBMISSION-----------------------------------------

        //-------------------------------------------ROUND SIX MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound6Match1Submit)) {
            round = 1;
            teamWin = cBoxRound6Match1.getValue();
            teamOne = tFieldRound6Match1Team1.getText();
            teamTwo = tFieldRound6Match1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound6Match1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound6Match1Team1.getText();
            }

            round6Match1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundSixWinners(teamWin, 0);
            WriteToFile.writeToRoundSixFile(OpenFile.getRoundSixWinners());
            WriteToFile.closeFile();
        }//ROUND SIX MATCH 1 SUBMISSION

        //-------------------------------------------------END ROUND SIX SUBMISSION-----------------------------------------

        //-------------------------------------------ROUND SEVEN MATCH SUBMISSION---------------------------------------
        if(event.getSource().equals(btnRound7Match1Submit)) {
            round = 1;
            teamWin = cBoxRound7Match1.getValue();
            teamOne = tFieldRound7Match1Team1.getText();
            teamTwo = tFieldRound7Match1Team2.getText();

            if (teamOne.equals(teamWin)) {
                teamLose = tFieldRound7Match1Team2.getText();
            } else if (teamTwo.equals(teamWin)) {
                teamLose = tFieldRound7Match1Team1.getText();
            }

            round7Match1Winner.setText(teamWin + " Won!");
            matchPointsAllotment(round, teamWin, teamLose);
            OpenFile.setRoundSevenWinners(teamWin, 0);
            WriteToFile.writeToRoundSevenFile(OpenFile.getRoundSevenWinners());
            WriteToFile.closeFile();
        }//ROUND SEVEN MATCH 1 SUBMISSION

        //-------------------------------------------------END ROUND SEVEN SUBMISSION-----------------------------------------
    }//END MATCH RESULT SUBMISSION

    public void matchPointsAllotment(int round, String teamWin, String teamLose)
    {
        try {
            if(teamWin.equals("null")|| teamLose.equals("null"))
                AlertBox.errorBox("All fields must have a value","Empty Field",500,100);
            else {

                int teamWinPoints = DatabaseManagement.pointSelectQuery(teamWin);
                int teamLosePoints = DatabaseManagement.pointSelectQuery(teamLose);
                int teamWinRank = DatabaseManagement.rankSelectQuery(teamWin);
                int teamLoseRank = DatabaseManagement.rankSelectQuery(teamLose);

                //---------------------------BONUS CALCULATIONS-----------------------------
                int rankBonus = 0;
                if (teamWinRank > teamLoseRank)
                    rankBonus = teamWinRank - teamLoseRank;
                //--------------------------END BONUS CALCULATIONS--------------------------

                //--------------------------WINNINGS CALCULATIONS-------------------------

                switch (round) {
                    case 1:
                        teamWinPoints = teamWinPoints + INVITE + ROUND1WIN + rankBonus;
                        teamLosePoints = teamLosePoints + INVITE - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);
                        break;
                    case 2:
                        teamWinPoints = teamWinPoints + ROUND2WIN + rankBonus;
                        teamLosePoints = teamLosePoints - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);

                        break;
                    case 3:
                        teamWinPoints = teamWinPoints + ROUND3WIN + rankBonus;
                        teamLosePoints = teamLosePoints - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);

                        break;
                    case 4:
                        teamWinPoints = teamWinPoints + ROUND4WIN + rankBonus;
                        teamLosePoints = teamLosePoints - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);

                        break;
                    case 5:
                        teamWinPoints = teamWinPoints + ROUND5WIN + rankBonus;
                        teamLosePoints = teamLosePoints - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);

                        break;
                    case 6:
                        teamWinPoints = teamWinPoints + ROUND6WIN + rankBonus;
                        teamLosePoints = teamLosePoints - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);

                        break;
                    case 7:
                        teamWinPoints = teamWinPoints + FINALSBONUS + ROUND7WIN + rankBonus;
                        teamLosePoints = teamLosePoints + FINALSBONUS - rankBonus;

                        DatabaseManagement.pointUpdateQuery(teamWin, teamWinPoints);
                        DatabaseManagement.pointUpdateQuery(teamLose, teamLosePoints);

                        AlertBox.teamUpdateBox(teamWin + " is at Rank " + teamWinRank,teamLose + " is at Rank " + teamLoseRank,
                                "Team Update",500,200);

                        boolean status = AlertBox.confirmBox("A new ranking sheet will now be generated. Do you wish to save previous ranking sheet?", "", 500, 125);
                        if (status == true)
                            printToExcel();//Exports previous rankings to Excel

                        DatabaseManagement.getSchoolData();
                        DatabaseManagement.pointTransfer();
                        DatabaseManagement.regenerateRanking();//creates a new ranking sheet
                        break;

                }//END ROUND SWITCH
                //--------------------------------END WINNINGS CALCULATIONS-------------------------
            }//END IF ELSE
        }//END TRY | NULL POINTER CHECK
        catch(NullPointerException e)
        {
            AlertBox.errorBox("All fields must have a value","Missing Value",500,100);
        }//END CATCH | NULL POINTER CHECK

    }//END MATCH POINTS ALLOTMENT | Allot points to teams according to match outcomes

    public void addSchoolRecord()
    {

        String school = tFieldAddSchool.getText();
        if(school.trim().equals(""))
        AlertBox.errorBox("Please enter a name to be added","Empty Field",500,100);
        else {
            Boolean status = DatabaseManagement.addSchool(school);

            if (status == true) {
                clearSchoolList(schoolSceneCode);
                clearSchoolList(round1SceneCode);
                generateSortedList(schoolSceneCode);
                generateSortedList(round1SceneCode);
            }
        }//END IF ELSE

    }//END ADD SCHOOL RECORD

    public void deleteSchoolRecord()
    {
        try {
            String school = cBoxDeleteSchool.getValue();
            if(school.equals(null))
            AlertBox.errorBox("Please select a school to be deleted","Empty field",500,100);
            else {
                int id = DatabaseManagement.getSchoolID(school);
                boolean status = DatabaseManagement.deleteSchool(id,school);

                if (status == true) {
                    clearSchoolList(schoolSceneCode);
                    clearSchoolList(round1SceneCode);
                    generateSortedList(schoolSceneCode);
                    generateSortedList(round1SceneCode);
                }
            }//END IF ELSE | EMPTY FIELD CHECK
        }//END TRY
        catch(NullPointerException e)
        {
            AlertBox.errorBox("Please select a school to be deleted","Empty Field",500,100);
        }//END TRY CATCH | NULL POINTER CHECK
    }//END DELETE SCHOOL RECORD

    public void changeSchoolRecord()
    {
        try {
            String oldName = cBoxChangeSchool.getValue();
            String newName = tFieldChangeSchool.getText();

            if (oldName.equals(null))
            AlertBox.errorBox("A school must be selected to be changed","Empty Field",500,100);
            else if (newName.trim().equals(""))
            AlertBox.errorBox("A new name must be entered to make changes","Empty Field",500,100);
            else {
                int id = DatabaseManagement.getSchoolID(oldName);

                if (id == 0) {
                    AlertBox.errorBox("Could not find "+oldName+" in database","Error",500,100);
                } else {
                    boolean status = DatabaseManagement.updateSchool(id, newName);
                    if (status == true) {
                        AlertBox.informationBox(oldName+" has been changed to "+newName,"",500,100);
                        clearSchoolList(schoolSceneCode);
                        clearSchoolList(round1SceneCode);
                        generateSortedList(schoolSceneCode);
                        generateSortedList(round1SceneCode);
                    }
                }//END IF ELSE
            }//END IF ELSE
            }//END TRY
            catch(NullPointerException e)
            {
                AlertBox.errorBox("Please select a school to be changed","Empty Field",500,100);
            }//END TRY CATCH | NULL POINTER CHECK

    }//END CHANGE SCHOOL RECORD

    public void generateSortedList(String sceneType)
    {
        ObservableList<TeamRank> teamList = DatabaseManagement.getTeamList();
        ObservableList<String> schoolList = FXCollections.observableArrayList();

        for (TeamRank t : teamList)
        {
            schoolList.add(t.getSchool());
        }

        SortedList<String> sortedSchoolList = schoolList.sorted();

        //-------------------------------------ROUND ONE CHECK-----------------------------------
        if(sceneType.equals(round1SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound1Match1TeamOne.getItems().add(s);cBoxRound1Match1TeamTwo.getItems().add(s);
                cBoxRound1Match2TeamOne.getItems().add(s);cBoxRound1Match2TeamTwo.getItems().add(s);
                cBoxRound1Match3TeamOne.getItems().add(s);cBoxRound1Match3TeamTwo.getItems().add(s);
                cBoxRound1Match4TeamOne.getItems().add(s);cBoxRound1Match4TeamTwo.getItems().add(s);
                cBoxRound1Match5TeamOne.getItems().add(s);cBoxRound1Match5TeamTwo.getItems().add(s);
                cBoxRound1Match6TeamOne.getItems().add(s);cBoxRound1Match6TeamTwo.getItems().add(s);
                cBoxRound1Match7TeamOne.getItems().add(s);cBoxRound1Match7TeamTwo.getItems().add(s);
                cBoxRound1Match8TeamOne.getItems().add(s);cBoxRound1Match8TeamTwo.getItems().add(s);
                cBoxRound1Match9TeamOne.getItems().add(s);cBoxRound1Match9TeamTwo.getItems().add(s);
                cBoxRound1Match10TeamOne.getItems().add(s);cBoxRound1Match10TeamTwo.getItems().add(s);
                cBoxRound1Match11TeamOne.getItems().add(s);cBoxRound1Match11TeamTwo.getItems().add(s);
                cBoxRound1Match12TeamOne.getItems().add(s);cBoxRound1Match12TeamTwo.getItems().add(s);
                cBoxRound1Match13TeamOne.getItems().add(s);cBoxRound1Match13TeamTwo.getItems().add(s);
                cBoxRound1Match14TeamOne.getItems().add(s);cBoxRound1Match14TeamTwo.getItems().add(s);
                cBoxRound1Match15TeamOne.getItems().add(s);cBoxRound1Match15TeamTwo.getItems().add(s);
                cBoxRound1Match16TeamOne.getItems().add(s);cBoxRound1Match16TeamTwo.getItems().add(s);
                cBoxRound1Match17TeamOne.getItems().add(s);cBoxRound1Match17TeamTwo.getItems().add(s);
                cBoxRound1Match18TeamOne.getItems().add(s);cBoxRound1Match18TeamTwo.getItems().add(s);
                cBoxRound1Match19TeamOne.getItems().add(s);cBoxRound1Match19TeamTwo.getItems().add(s);
                cBoxRound1Match20TeamOne.getItems().add(s);cBoxRound1Match20TeamTwo.getItems().add(s);
                cBoxRound1Match21TeamOne.getItems().add(s);cBoxRound1Match21TeamTwo.getItems().add(s);
                cBoxRound1Match22TeamOne.getItems().add(s);cBoxRound1Match22TeamTwo.getItems().add(s);
                cBoxRound1Match23TeamOne.getItems().add(s);cBoxRound1Match23TeamTwo.getItems().add(s);
                cBoxRound1Match24TeamOne.getItems().add(s);cBoxRound1Match24TeamTwo.getItems().add(s);
                cBoxRound1Match25TeamOne.getItems().add(s);cBoxRound1Match25TeamTwo.getItems().add(s);
                cBoxRound1Match26TeamOne.getItems().add(s);cBoxRound1Match26TeamTwo.getItems().add(s);
                cBoxRound1Match27TeamOne.getItems().add(s);cBoxRound1Match27TeamTwo.getItems().add(s);
                cBoxRound1Match28TeamOne.getItems().add(s);cBoxRound1Match28TeamTwo.getItems().add(s);
                cBoxRound1Match29TeamOne.getItems().add(s);cBoxRound1Match29TeamTwo.getItems().add(s);
                cBoxRound1Match30TeamOne.getItems().add(s);cBoxRound1Match30TeamTwo.getItems().add(s);
                cBoxRound1Match31TeamOne.getItems().add(s);cBoxRound1Match31TeamTwo.getItems().add(s);
                cBoxRound1Match32TeamOne.getItems().add(s);cBoxRound1Match32TeamTwo.getItems().add(s);
            }
        }//-----------------------------------------------END ROUND ONE CHECK--------------------------------

        //----------------------------------------ROUND TWO CHECK-----------------------------------------
        else if(sceneType.equals(round2SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound2Match1TeamOne.getItems().add(s);cBoxRound2Match1TeamTwo.getItems().add(s);
                cBoxRound2Match2TeamOne.getItems().add(s);cBoxRound2Match2TeamTwo.getItems().add(s);
                cBoxRound2Match3TeamOne.getItems().add(s);cBoxRound2Match3TeamTwo.getItems().add(s);
                cBoxRound2Match4TeamOne.getItems().add(s);cBoxRound2Match4TeamTwo.getItems().add(s);
                cBoxRound2Match5TeamOne.getItems().add(s);cBoxRound2Match5TeamTwo.getItems().add(s);
                cBoxRound2Match6TeamOne.getItems().add(s);cBoxRound2Match6TeamTwo.getItems().add(s);
                cBoxRound2Match7TeamOne.getItems().add(s);cBoxRound2Match7TeamTwo.getItems().add(s);
                cBoxRound2Match8TeamOne.getItems().add(s);cBoxRound2Match8TeamTwo.getItems().add(s);
                cBoxRound2Match9TeamOne.getItems().add(s);cBoxRound2Match9TeamTwo.getItems().add(s);
                cBoxRound2Match10TeamOne.getItems().add(s);cBoxRound2Match10TeamTwo.getItems().add(s);
                cBoxRound2Match11TeamOne.getItems().add(s);cBoxRound2Match11TeamTwo.getItems().add(s);
                cBoxRound2Match12TeamOne.getItems().add(s);cBoxRound2Match12TeamTwo.getItems().add(s);
                cBoxRound2Match13TeamOne.getItems().add(s);cBoxRound2Match13TeamTwo.getItems().add(s);
                cBoxRound2Match14TeamOne.getItems().add(s);cBoxRound2Match14TeamTwo.getItems().add(s);
                cBoxRound2Match15TeamOne.getItems().add(s);cBoxRound2Match15TeamTwo.getItems().add(s);
                cBoxRound2Match16TeamOne.getItems().add(s);cBoxRound2Match16TeamTwo.getItems().add(s);
            }
        }//------------------------------------------END ROUND TWO CHECK-----------------------------------
        //----------------------------------------ROUND THREE CHECK-----------------------------------------
        else if(sceneType.equals(round3SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound3Match1TeamOne.getItems().add(s);cBoxRound3Match1TeamTwo.getItems().add(s);
                cBoxRound3Match2TeamOne.getItems().add(s);cBoxRound3Match2TeamTwo.getItems().add(s);
                cBoxRound3Match3TeamOne.getItems().add(s);cBoxRound3Match3TeamTwo.getItems().add(s);
                cBoxRound3Match4TeamOne.getItems().add(s);cBoxRound3Match4TeamTwo.getItems().add(s);
                cBoxRound3Match5TeamOne.getItems().add(s);cBoxRound3Match5TeamTwo.getItems().add(s);
                cBoxRound3Match6TeamOne.getItems().add(s);cBoxRound3Match6TeamTwo.getItems().add(s);
                cBoxRound3Match7TeamOne.getItems().add(s);cBoxRound3Match7TeamTwo.getItems().add(s);
                cBoxRound3Match8TeamOne.getItems().add(s);cBoxRound3Match8TeamTwo.getItems().add(s);
            }
        }//------------------------------------------END ROUND THREE CHECK-----------------------------------
        //----------------------------------------ROUND FOUR CHECK-----------------------------------------
        else if(sceneType.equals(round4SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound4Match1TeamOne.getItems().add(s);cBoxRound4Match1TeamTwo.getItems().add(s);
                cBoxRound4Match2TeamOne.getItems().add(s);cBoxRound4Match2TeamTwo.getItems().add(s);
                cBoxRound4Match3TeamOne.getItems().add(s);cBoxRound4Match3TeamTwo.getItems().add(s);
                cBoxRound4Match4TeamOne.getItems().add(s);cBoxRound4Match4TeamTwo.getItems().add(s);
            }
        }//------------------------------------------END ROUND FOUR CHECK-----------------------------------
        //----------------------------------------ROUND FIVE CHECK-----------------------------------------
        else if(sceneType.equals(round5SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound5Match1TeamOne.getItems().add(s);cBoxRound5Match1TeamTwo.getItems().add(s);
                cBoxRound5Match2TeamOne.getItems().add(s);cBoxRound5Match2TeamTwo.getItems().add(s);
            }
        }//------------------------------------------END ROUND FIVE CHECK-----------------------------------
        //----------------------------------------ROUND SIX CHECK-----------------------------------------
        else if(sceneType.equals(round6SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound6Match1TeamOne.getItems().add(s);cBoxRound6Match1TeamTwo.getItems().add(s);
            }
        }//------------------------------------------END ROUND SIX CHECK-----------------------------------
        //----------------------------------------ROUND SEVEN CHECK-----------------------------------------
        else if(sceneType.equals(round7SceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxRound7Match1TeamOne.getItems().add(s);cBoxRound7Match1TeamTwo.getItems().add(s);
            }
        }//------------------------------------------END ROUND SEVEN CHECK-----------------------------------
        else if(sceneType.equals(schoolSceneCode))
        {
            for (String s : sortedSchoolList)
            {
                cBoxDeleteSchool.getItems().add(s);
                cBoxChangeSchool.getItems().add(s);
            }
        }

    }//END GENERATE SORTED LIST

    public void clearSchoolList(String code)
    {
        if(code.equals(round1SceneCode))
        {
            cBoxRound1Match1TeamOne.getItems().clear();cBoxRound1Match1TeamTwo.getItems().clear();
            cBoxRound1Match2TeamOne.getItems().clear();cBoxRound1Match2TeamTwo.getItems().clear();
            cBoxRound1Match3TeamOne.getItems().clear();cBoxRound1Match3TeamTwo.getItems().clear();
            cBoxRound1Match4TeamOne.getItems().clear();cBoxRound1Match4TeamTwo.getItems().clear();
            cBoxRound1Match5TeamOne.getItems().clear();cBoxRound1Match5TeamTwo.getItems().clear();
            cBoxRound1Match6TeamOne.getItems().clear();cBoxRound1Match6TeamTwo.getItems().clear();
            cBoxRound1Match7TeamOne.getItems().clear();cBoxRound1Match7TeamTwo.getItems().clear();
            cBoxRound1Match8TeamOne.getItems().clear();cBoxRound1Match8TeamTwo.getItems().clear();
            cBoxRound1Match9TeamOne.getItems().clear();cBoxRound1Match9TeamTwo.getItems().clear();
            cBoxRound1Match10TeamOne.getItems().clear();cBoxRound1Match10TeamTwo.getItems().clear();
            cBoxRound1Match11TeamOne.getItems().clear();cBoxRound1Match11TeamTwo.getItems().clear();
            cBoxRound1Match12TeamOne.getItems().clear();cBoxRound1Match12TeamTwo.getItems().clear();
            cBoxRound1Match13TeamOne.getItems().clear();cBoxRound1Match13TeamTwo.getItems().clear();
            cBoxRound1Match14TeamOne.getItems().clear();cBoxRound1Match14TeamTwo.getItems().clear();
            cBoxRound1Match15TeamOne.getItems().clear();cBoxRound1Match15TeamTwo.getItems().clear();
            cBoxRound1Match16TeamOne.getItems().clear();cBoxRound1Match16TeamTwo.getItems().clear();
            cBoxRound1Match17TeamOne.getItems().clear();cBoxRound1Match17TeamTwo.getItems().clear();
            cBoxRound1Match18TeamOne.getItems().clear();cBoxRound1Match18TeamTwo.getItems().clear();
            cBoxRound1Match19TeamOne.getItems().clear();cBoxRound1Match19TeamTwo.getItems().clear();
            cBoxRound1Match20TeamOne.getItems().clear();cBoxRound1Match20TeamTwo.getItems().clear();
            cBoxRound1Match21TeamOne.getItems().clear();cBoxRound1Match21TeamTwo.getItems().clear();
            cBoxRound1Match22TeamOne.getItems().clear();cBoxRound1Match22TeamTwo.getItems().clear();
            cBoxRound1Match23TeamOne.getItems().clear();cBoxRound1Match23TeamTwo.getItems().clear();
            cBoxRound1Match24TeamOne.getItems().clear();cBoxRound1Match24TeamTwo.getItems().clear();
            cBoxRound1Match25TeamOne.getItems().clear();cBoxRound1Match25TeamTwo.getItems().clear();
            cBoxRound1Match26TeamOne.getItems().clear();cBoxRound1Match26TeamTwo.getItems().clear();
            cBoxRound1Match27TeamOne.getItems().clear();cBoxRound1Match27TeamTwo.getItems().clear();
            cBoxRound1Match28TeamOne.getItems().clear();cBoxRound1Match28TeamTwo.getItems().clear();
            cBoxRound1Match29TeamOne.getItems().clear();cBoxRound1Match29TeamTwo.getItems().clear();
            cBoxRound1Match30TeamOne.getItems().clear();cBoxRound1Match30TeamTwo.getItems().clear();
            cBoxRound1Match31TeamOne.getItems().clear();cBoxRound1Match31TeamTwo.getItems().clear();
            cBoxRound1Match32TeamOne.getItems().clear();cBoxRound1Match32TeamTwo.getItems().clear();
        }
        else if(code.equals(schoolSceneCode))
        {
            cBoxDeleteSchool.getItems().clear();
            cBoxChangeSchool.getItems().clear();
        }
    }//END CLEAR SCHOOL LIST

    public void printToExcel()
    {
        Stage mainStage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose File Location");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Microsoft Excel", "*.xls"));
        File file = fileChooser.showSaveDialog(mainStage);


        if(file != null) {

            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("Ranking Sheet");
            HSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("Rank");
            header.createCell(1).setCellValue("School Name");
            header.createCell(2).setCellValue("Points");

            ObservableList<TeamRank> teamRanking = getRankingSheet();

            int index = 1;

            for (TeamRank t : teamRanking) {
                HSSFRow row = sheet.createRow(index);
                row.createCell(0).setCellValue(t.getRank());
                row.createCell(1).setCellValue(t.getSchool());
                row.createCell(2).setCellValue(t.getPoints());
                index++;
            }//END FOR EACH

            try {
                FileOutputStream fileOutput = new FileOutputStream(file);
                wb.write(fileOutput);
                fileOutput.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                AlertBox.errorBox("An error occurred when exporting data to excel","Export Error",500,100);
            }
        }//END IF

    }//END PRINT TO EXCEL | Export ranking sheet to excel

    public ObservableList<TeamRank> getRankingSheet()
    {
        ObservableList<TeamRank> team = DatabaseManagement.getTeamList();

        return team;
    }//END GET RANKING SHEET

    public void initializeMatchPairing()
    {
        ObservableList<TeamRank> teamList = DatabaseManagement.getTeamList();
        OpenFile.openRoundOnePairings();
        roundOneTeams = OpenFile.getRoundOnePairings();

        if(roundOneTeams[0].length() > 1)
        {
            round1MatchPairing();
        }
        else
        {
            for(int i = 0; i <= 63; i++)
            {
                roundOneTeams[i] = teamList.get(i).getSchool();
            }

            round1MatchPairing();
            WriteToFile.writeToRoundOnePairings(roundOneTeams);
        }

    }//END INITIALIZE MATCH PAIRING

    //---------------------------------------------------ROUND ONE CONFIGURATION-------------------------------------------------

    public void buildRoundOneScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");
        VBox match1BoxHolder = new VBox(); VBox match2BoxHolder = new VBox();
        VBox match3BoxHolder = new VBox(); VBox match4BoxHolder = new VBox();
        VBox match5BoxHolder = new VBox(); VBox match6BoxHolder = new VBox();
        VBox match7BoxHolder = new VBox(); VBox match8BoxHolder = new VBox();
        VBox match9BoxHolder = new VBox(); VBox match10BoxHolder = new VBox();
        VBox match11BoxHolder = new VBox(); VBox match12BoxHolder = new VBox();
        VBox match13BoxHolder = new VBox(); VBox match14BoxHolder = new VBox();
        VBox match15BoxHolder = new VBox(); VBox match16BoxHolder = new VBox();
        VBox match17BoxHolder = new VBox(); VBox match18BoxHolder = new VBox();
        VBox match19BoxHolder = new VBox(); VBox match20BoxHolder = new VBox();
        VBox match21BoxHolder = new VBox(); VBox match22BoxHolder = new VBox();
        VBox match23BoxHolder = new VBox(); VBox match24BoxHolder = new VBox();
        VBox match25BoxHolder = new VBox(); VBox match26BoxHolder = new VBox();
        VBox match27BoxHolder = new VBox(); VBox match28BoxHolder = new VBox();
        VBox match29BoxHolder = new VBox(); VBox match30BoxHolder = new VBox();
        VBox match31BoxHolder = new VBox(); VBox match32BoxHolder = new VBox();

        match1Box = new HBox(); match2Box = new HBox();
        match3Box = new HBox(); match4Box = new HBox();
        match5Box = new HBox(); match6Box = new HBox();
        match7Box = new HBox(); match8Box = new HBox();
        match9Box = new HBox(); match10Box = new HBox();
        match11Box = new HBox(); match12Box = new HBox();
        match13Box = new HBox(); match14Box = new HBox();
        match15Box = new HBox(); match16Box = new HBox();
        match17Box = new HBox(); match18Box = new HBox();
        match19Box = new HBox(); match20Box = new HBox();
        match21Box = new HBox(); match22Box = new HBox();
        match23Box = new HBox(); match24Box = new HBox();
        match25Box = new HBox(); match26Box = new HBox();
        match27Box = new HBox(); match28Box = new HBox();
        match29Box = new HBox(); match30Box = new HBox();
        match31Box = new HBox(); match32Box = new HBox();

        match1btnBox = new HBox();match2btnBox = new HBox();
        match3btnBox = new HBox();match4btnBox = new HBox();
        match5btnBox = new HBox();match6btnBox = new HBox();
        match7btnBox = new HBox();match8btnBox = new HBox();
        match9btnBox = new HBox();match10btnBox = new HBox();
        match11btnBox = new HBox();match12btnBox = new HBox();
        match13btnBox = new HBox();match14btnBox = new HBox();
        match15btnBox = new HBox();match16btnBox = new HBox();
        match17btnBox = new HBox();match18btnBox = new HBox();
        match19btnBox = new HBox();match20btnBox = new HBox();
        match21btnBox = new HBox();match22btnBox = new HBox();
        match23btnBox = new HBox();match24btnBox = new HBox();
        match25btnBox = new HBox();match26btnBox = new HBox();
        match27btnBox = new HBox();match28btnBox = new HBox();
        match29btnBox = new HBox();match30btnBox = new HBox();
        match31btnBox = new HBox();match32btnBox = new HBox();

        cBoxRound1Match1TeamOne = new ChoiceBox<>();cBoxRound1Match1TeamTwo = new ChoiceBox<>();
        cBoxRound1Match2TeamOne = new ChoiceBox<>();cBoxRound1Match2TeamTwo = new ChoiceBox<>();
        cBoxRound1Match3TeamOne = new ChoiceBox<>();cBoxRound1Match3TeamTwo = new ChoiceBox<>();
        cBoxRound1Match4TeamOne = new ChoiceBox<>();cBoxRound1Match4TeamTwo = new ChoiceBox<>();
        cBoxRound1Match5TeamOne = new ChoiceBox<>();cBoxRound1Match5TeamTwo = new ChoiceBox<>();
        cBoxRound1Match6TeamOne = new ChoiceBox<>();cBoxRound1Match6TeamTwo = new ChoiceBox<>();
        cBoxRound1Match7TeamOne = new ChoiceBox<>();cBoxRound1Match7TeamTwo = new ChoiceBox<>();
        cBoxRound1Match8TeamOne = new ChoiceBox<>();cBoxRound1Match8TeamTwo = new ChoiceBox<>();
        cBoxRound1Match9TeamOne = new ChoiceBox<>();cBoxRound1Match9TeamTwo = new ChoiceBox<>();
        cBoxRound1Match10TeamOne = new ChoiceBox<>();cBoxRound1Match10TeamTwo = new ChoiceBox<>();
        cBoxRound1Match11TeamOne = new ChoiceBox<>();cBoxRound1Match11TeamTwo = new ChoiceBox<>();
        cBoxRound1Match12TeamOne = new ChoiceBox<>();cBoxRound1Match12TeamTwo = new ChoiceBox<>();
        cBoxRound1Match13TeamOne = new ChoiceBox<>();cBoxRound1Match13TeamTwo = new ChoiceBox<>();
        cBoxRound1Match14TeamOne = new ChoiceBox<>();cBoxRound1Match14TeamTwo = new ChoiceBox<>();
        cBoxRound1Match15TeamOne = new ChoiceBox<>();cBoxRound1Match15TeamTwo = new ChoiceBox<>();
        cBoxRound1Match16TeamOne = new ChoiceBox<>();cBoxRound1Match16TeamTwo = new ChoiceBox<>();
        cBoxRound1Match17TeamOne = new ChoiceBox<>();cBoxRound1Match17TeamTwo = new ChoiceBox<>();
        cBoxRound1Match18TeamOne = new ChoiceBox<>();cBoxRound1Match18TeamTwo = new ChoiceBox<>();
        cBoxRound1Match19TeamOne = new ChoiceBox<>();cBoxRound1Match19TeamTwo = new ChoiceBox<>();
        cBoxRound1Match20TeamOne = new ChoiceBox<>();cBoxRound1Match20TeamTwo = new ChoiceBox<>();
        cBoxRound1Match21TeamOne = new ChoiceBox<>();cBoxRound1Match21TeamTwo = new ChoiceBox<>();
        cBoxRound1Match22TeamOne = new ChoiceBox<>();cBoxRound1Match22TeamTwo = new ChoiceBox<>();
        cBoxRound1Match23TeamOne = new ChoiceBox<>();cBoxRound1Match23TeamTwo = new ChoiceBox<>();
        cBoxRound1Match24TeamOne = new ChoiceBox<>();cBoxRound1Match24TeamTwo = new ChoiceBox<>();
        cBoxRound1Match25TeamOne = new ChoiceBox<>();cBoxRound1Match25TeamTwo = new ChoiceBox<>();
        cBoxRound1Match26TeamOne = new ChoiceBox<>();cBoxRound1Match26TeamTwo = new ChoiceBox<>();
        cBoxRound1Match27TeamOne = new ChoiceBox<>();cBoxRound1Match27TeamTwo = new ChoiceBox<>();
        cBoxRound1Match28TeamOne = new ChoiceBox<>();cBoxRound1Match28TeamTwo = new ChoiceBox<>();
        cBoxRound1Match29TeamOne = new ChoiceBox<>();cBoxRound1Match29TeamTwo = new ChoiceBox<>();
        cBoxRound1Match30TeamOne = new ChoiceBox<>();cBoxRound1Match30TeamTwo = new ChoiceBox<>();
        cBoxRound1Match31TeamOne = new ChoiceBox<>();cBoxRound1Match31TeamTwo = new ChoiceBox<>();
        cBoxRound1Match32TeamOne = new ChoiceBox<>();cBoxRound1Match32TeamTwo = new ChoiceBox<>();

        btnMatch1Edit = new Button("Edit School Fields");
        btnMatch2Edit = new Button("Edit School Fields");
        btnMatch3Edit = new Button("Edit School Fields");
        btnMatch4Edit = new Button("Edit School Fields");
        btnMatch5Edit = new Button("Edit School Fields");
        btnMatch6Edit = new Button("Edit School Fields");
        btnMatch7Edit = new Button("Edit School Fields");
        btnMatch8Edit = new Button("Edit School Fields");
        btnMatch9Edit = new Button("Edit School Fields");
        btnMatch10Edit = new Button("Edit School Fields");
        btnMatch11Edit = new Button("Edit School Fields");
        btnMatch12Edit = new Button("Edit School Fields");
        btnMatch13Edit = new Button("Edit School Fields");
        btnMatch14Edit = new Button("Edit School Fields");
        btnMatch15Edit = new Button("Edit School Fields");
        btnMatch16Edit = new Button("Edit School Fields");
        btnMatch17Edit = new Button("Edit School Fields");
        btnMatch18Edit = new Button("Edit School Fields");
        btnMatch19Edit = new Button("Edit School Fields");
        btnMatch20Edit = new Button("Edit School Fields");
        btnMatch21Edit = new Button("Edit School Fields");
        btnMatch22Edit = new Button("Edit School Fields");
        btnMatch23Edit = new Button("Edit School Fields");
        btnMatch24Edit = new Button("Edit School Fields");
        btnMatch25Edit = new Button("Edit School Fields");
        btnMatch26Edit = new Button("Edit School Fields");
        btnMatch27Edit = new Button("Edit School Fields");
        btnMatch28Edit = new Button("Edit School Fields");
        btnMatch29Edit = new Button("Edit School Fields");
        btnMatch30Edit = new Button("Edit School Fields");
        btnMatch31Edit = new Button("Edit School Fields");
        btnMatch32Edit = new Button("Edit School Fields");

        btnMatch1Save = new Button("Save Field Changes");
        btnMatch2Save = new Button("Save Field Changes");
        btnMatch3Save = new Button("Save Field Changes");
        btnMatch4Save = new Button("Save Field Changes");
        btnMatch5Save = new Button("Save Field Changes");
        btnMatch6Save = new Button("Save Field Changes");
        btnMatch7Save = new Button("Save Field Changes");
        btnMatch8Save = new Button("Save Field Changes");
        btnMatch9Save = new Button("Save Field Changes");
        btnMatch10Save = new Button("Save Field Changes");
        btnMatch11Save = new Button("Save Field Changes");
        btnMatch12Save = new Button("Save Field Changes");
        btnMatch13Save = new Button("Save Field Changes");
        btnMatch14Save = new Button("Save Field Changes");
        btnMatch15Save = new Button("Save Field Changes");
        btnMatch16Save = new Button("Save Field Changes");
        btnMatch17Save = new Button("Save Field Changes");
        btnMatch18Save = new Button("Save Field Changes");
        btnMatch19Save = new Button("Save Field Changes");
        btnMatch20Save = new Button("Save Field Changes");
        btnMatch21Save = new Button("Save Field Changes");
        btnMatch22Save = new Button("Save Field Changes");
        btnMatch23Save = new Button("Save Field Changes");
        btnMatch24Save = new Button("Save Field Changes");
        btnMatch25Save = new Button("Save Field Changes");
        btnMatch26Save = new Button("Save Field Changes");
        btnMatch27Save = new Button("Save Field Changes");
        btnMatch28Save = new Button("Save Field Changes");
        btnMatch29Save = new Button("Save Field Changes");
        btnMatch30Save = new Button("Save Field Changes");
        btnMatch31Save = new Button("Save Field Changes");
        btnMatch32Save = new Button("Save Field Changes");

        tFieldMatch1Team1 = new TextField(); tFieldMatch1Team2 = new TextField();
        tFieldMatch2Team1 = new TextField(); tFieldMatch2Team2 = new TextField();
        tFieldMatch3Team1 = new TextField(); tFieldMatch3Team2 = new TextField();
        tFieldMatch4Team1 = new TextField(); tFieldMatch4Team2 = new TextField();
        tFieldMatch5Team1 = new TextField(); tFieldMatch5Team2 = new TextField();
        tFieldMatch6Team1 = new TextField(); tFieldMatch6Team2 = new TextField();
        tFieldMatch7Team1 = new TextField(); tFieldMatch7Team2 = new TextField();
        tFieldMatch8Team1 = new TextField(); tFieldMatch8Team2 = new TextField();
        tFieldMatch9Team1 = new TextField(); tFieldMatch9Team2 = new TextField();
        tFieldMatch10Team1 = new TextField(); tFieldMatch10Team2 = new TextField();
        tFieldMatch11Team1 = new TextField(); tFieldMatch11Team2 = new TextField();
        tFieldMatch12Team1 = new TextField(); tFieldMatch12Team2 = new TextField();
        tFieldMatch13Team1 = new TextField(); tFieldMatch13Team2 = new TextField();
        tFieldMatch14Team1 = new TextField(); tFieldMatch14Team2 = new TextField();
        tFieldMatch15Team1 = new TextField(); tFieldMatch15Team2 = new TextField();
        tFieldMatch16Team1 = new TextField(); tFieldMatch16Team2 = new TextField();
        tFieldMatch17Team1 = new TextField(); tFieldMatch17Team2 = new TextField();
        tFieldMatch18Team1 = new TextField(); tFieldMatch18Team2 = new TextField();
        tFieldMatch19Team1 = new TextField(); tFieldMatch19Team2 = new TextField();
        tFieldMatch20Team1 = new TextField(); tFieldMatch20Team2 = new TextField();
        tFieldMatch21Team1 = new TextField(); tFieldMatch21Team2 = new TextField();
        tFieldMatch22Team1 = new TextField(); tFieldMatch22Team2 = new TextField();
        tFieldMatch23Team1 = new TextField(); tFieldMatch23Team2 = new TextField();
        tFieldMatch24Team1 = new TextField(); tFieldMatch24Team2 = new TextField();
        tFieldMatch25Team1 = new TextField(); tFieldMatch25Team2 = new TextField();
        tFieldMatch26Team1 = new TextField(); tFieldMatch26Team2 = new TextField();
        tFieldMatch27Team1 = new TextField(); tFieldMatch27Team2 = new TextField();
        tFieldMatch28Team1 = new TextField(); tFieldMatch28Team2 = new TextField();
        tFieldMatch29Team1 = new TextField(); tFieldMatch29Team2 = new TextField();
        tFieldMatch30Team1 = new TextField(); tFieldMatch30Team2 = new TextField();
        tFieldMatch31Team1 = new TextField(); tFieldMatch31Team2 = new TextField();
        tFieldMatch32Team1 = new TextField(); tFieldMatch32Team2 = new TextField();

        cBoxRound1Match1 = new ChoiceBox<>(); cBoxRound1Match2 = new ChoiceBox<>();
        cBoxRound1Match3 = new ChoiceBox<>(); cBoxRound1Match4 = new ChoiceBox<>();
        cBoxRound1Match5 = new ChoiceBox<>(); cBoxRound1Match6 = new ChoiceBox<>();
        cBoxRound1Match7 = new ChoiceBox<>(); cBoxRound1Match8 = new ChoiceBox<>();
        cBoxRound1Match9 = new ChoiceBox<>(); cBoxRound1Match10 = new ChoiceBox<>();
        cBoxRound1Match11 = new ChoiceBox<>(); cBoxRound1Match12 = new ChoiceBox<>();
        cBoxRound1Match13 = new ChoiceBox<>(); cBoxRound1Match14 = new ChoiceBox<>();
        cBoxRound1Match15 = new ChoiceBox<>(); cBoxRound1Match16 = new ChoiceBox<>();
        cBoxRound1Match17 = new ChoiceBox<>(); cBoxRound1Match18 = new ChoiceBox<>();
        cBoxRound1Match19 = new ChoiceBox<>(); cBoxRound1Match20 = new ChoiceBox<>();
        cBoxRound1Match21 = new ChoiceBox<>(); cBoxRound1Match22 = new ChoiceBox<>();
        cBoxRound1Match23 = new ChoiceBox<>(); cBoxRound1Match24 = new ChoiceBox<>();
        cBoxRound1Match25 = new ChoiceBox<>(); cBoxRound1Match26 = new ChoiceBox<>();
        cBoxRound1Match27 = new ChoiceBox<>(); cBoxRound1Match28 = new ChoiceBox<>();
        cBoxRound1Match29 = new ChoiceBox<>(); cBoxRound1Match30 = new ChoiceBox<>();
        cBoxRound1Match31 = new ChoiceBox<>(); cBoxRound1Match32 = new ChoiceBox<>();

        btnRound1Match1Submit = new Button("Submit"); btnRound1Match2Submit = new Button("Submit");
        btnRound1Match3Submit = new Button("Submit"); btnRound1Match4Submit = new Button("Submit");
        btnRound1Match5Submit = new Button("Submit"); btnRound1Match6Submit = new Button("Submit");
        btnRound1Match7Submit = new Button("Submit"); btnRound1Match8Submit = new Button("Submit");
        btnRound1Match9Submit = new Button("Submit"); btnRound1Match10Submit = new Button("Submit");
        btnRound1Match11Submit = new Button("Submit"); btnRound1Match12Submit = new Button("Submit");
        btnRound1Match13Submit = new Button("Submit"); btnRound1Match14Submit = new Button("Submit");
        btnRound1Match15Submit = new Button("Submit"); btnRound1Match16Submit = new Button("Submit");
        btnRound1Match17Submit = new Button("Submit"); btnRound1Match18Submit = new Button("Submit");
        btnRound1Match19Submit = new Button("Submit"); btnRound1Match20Submit = new Button("Submit");
        btnRound1Match21Submit = new Button("Submit"); btnRound1Match22Submit = new Button("Submit");
        btnRound1Match23Submit = new Button("Submit"); btnRound1Match24Submit = new Button("Submit");
        btnRound1Match25Submit = new Button("Submit"); btnRound1Match26Submit = new Button("Submit");
        btnRound1Match27Submit = new Button("Submit"); btnRound1Match28Submit = new Button("Submit");
        btnRound1Match29Submit = new Button("Submit"); btnRound1Match30Submit = new Button("Submit");
        btnRound1Match31Submit = new Button("Submit"); btnRound1Match32Submit = new Button("Submit");

        roundOneMatch1Winner = new Label(""); roundOneMatch2Winner = new Label("");
        roundOneMatch3Winner = new Label(""); roundOneMatch4Winner = new Label("");
        roundOneMatch5Winner = new Label(""); roundOneMatch6Winner = new Label("");
        roundOneMatch7Winner = new Label(""); roundOneMatch8Winner = new Label("");
        roundOneMatch9Winner = new Label(""); roundOneMatch10Winner = new Label("");
        roundOneMatch11Winner = new Label(""); roundOneMatch12Winner = new Label("");
        roundOneMatch13Winner = new Label(""); roundOneMatch14Winner = new Label("");
        roundOneMatch15Winner = new Label(""); roundOneMatch16Winner = new Label("");
        roundOneMatch17Winner = new Label(""); roundOneMatch18Winner = new Label("");
        roundOneMatch19Winner = new Label(""); roundOneMatch20Winner = new Label("");
        roundOneMatch21Winner = new Label(""); roundOneMatch22Winner = new Label("");
        roundOneMatch23Winner = new Label(""); roundOneMatch24Winner = new Label("");
        roundOneMatch25Winner = new Label(""); roundOneMatch26Winner = new Label("");
        roundOneMatch27Winner = new Label(""); roundOneMatch28Winner = new Label("");
        roundOneMatch29Winner = new Label(""); roundOneMatch30Winner = new Label("");
        roundOneMatch31Winner = new Label(""); roundOneMatch32Winner = new Label("");

        match1btnBox.getChildren().addAll(btnMatch1Edit, roundOneMatch1Winner); match2btnBox.getChildren().addAll(btnMatch2Edit, roundOneMatch2Winner);
        match3btnBox.getChildren().addAll(btnMatch3Edit, roundOneMatch3Winner); match4btnBox.getChildren().addAll(btnMatch4Edit, roundOneMatch4Winner);
        match5btnBox.getChildren().addAll(btnMatch5Edit, roundOneMatch5Winner); match6btnBox.getChildren().addAll(btnMatch6Edit, roundOneMatch6Winner);
        match7btnBox.getChildren().addAll(btnMatch7Edit, roundOneMatch7Winner); match8btnBox.getChildren().addAll(btnMatch8Edit, roundOneMatch8Winner);
        match9btnBox.getChildren().addAll(btnMatch9Edit, roundOneMatch9Winner); match10btnBox.getChildren().addAll(btnMatch10Edit, roundOneMatch10Winner);
        match11btnBox.getChildren().addAll(btnMatch11Edit, roundOneMatch11Winner); match12btnBox.getChildren().addAll(btnMatch12Edit, roundOneMatch12Winner);
        match13btnBox.getChildren().addAll(btnMatch13Edit, roundOneMatch13Winner); match14btnBox.getChildren().addAll(btnMatch14Edit, roundOneMatch14Winner);
        match15btnBox.getChildren().addAll(btnMatch15Edit, roundOneMatch15Winner); match16btnBox.getChildren().addAll(btnMatch16Edit, roundOneMatch16Winner);
        match17btnBox.getChildren().addAll(btnMatch17Edit, roundOneMatch17Winner); match18btnBox.getChildren().addAll(btnMatch18Edit, roundOneMatch18Winner);
        match19btnBox.getChildren().addAll(btnMatch19Edit, roundOneMatch19Winner); match20btnBox.getChildren().addAll(btnMatch20Edit, roundOneMatch20Winner);
        match21btnBox.getChildren().addAll(btnMatch21Edit, roundOneMatch21Winner); match22btnBox.getChildren().addAll(btnMatch22Edit, roundOneMatch21Winner);
        match23btnBox.getChildren().addAll(btnMatch23Edit, roundOneMatch23Winner); match24btnBox.getChildren().addAll(btnMatch24Edit, roundOneMatch23Winner);
        match25btnBox.getChildren().addAll(btnMatch25Edit, roundOneMatch25Winner); match26btnBox.getChildren().addAll(btnMatch26Edit, roundOneMatch25Winner);
        match27btnBox.getChildren().addAll(btnMatch27Edit, roundOneMatch27Winner); match28btnBox.getChildren().addAll(btnMatch28Edit, roundOneMatch27Winner);
        match29btnBox.getChildren().addAll(btnMatch29Edit, roundOneMatch29Winner); match30btnBox.getChildren().addAll(btnMatch30Edit, roundOneMatch29Winner);
        match31btnBox.getChildren().addAll(btnMatch31Edit, roundOneMatch31Winner); match32btnBox.getChildren().addAll(btnMatch32Edit, roundOneMatch32Winner);

        match1Box.getChildren().addAll(tFieldMatch1Team1, tFieldMatch1Team2,cBoxRound1Match1,btnRound1Match1Submit);
        match2Box.getChildren().addAll(tFieldMatch2Team1, tFieldMatch2Team2,cBoxRound1Match2,btnRound1Match2Submit);
        match3Box.getChildren().addAll(tFieldMatch3Team1, tFieldMatch3Team2,cBoxRound1Match3,btnRound1Match3Submit);
        match4Box.getChildren().addAll(tFieldMatch4Team1, tFieldMatch4Team2,cBoxRound1Match4,btnRound1Match4Submit);
        match5Box.getChildren().addAll(tFieldMatch5Team1, tFieldMatch5Team2,cBoxRound1Match5,btnRound1Match5Submit);
        match6Box.getChildren().addAll(tFieldMatch6Team1, tFieldMatch6Team2,cBoxRound1Match6,btnRound1Match6Submit);
        match7Box.getChildren().addAll(tFieldMatch7Team1, tFieldMatch7Team2,cBoxRound1Match7,btnRound1Match7Submit);
        match8Box.getChildren().addAll(tFieldMatch8Team1, tFieldMatch8Team2,cBoxRound1Match8,btnRound1Match8Submit);
        match9Box.getChildren().addAll(tFieldMatch9Team1, tFieldMatch9Team2,cBoxRound1Match9,btnRound1Match9Submit);
        match10Box.getChildren().addAll(tFieldMatch10Team1, tFieldMatch10Team2,cBoxRound1Match10,btnRound1Match10Submit);
        match11Box.getChildren().addAll(tFieldMatch11Team1, tFieldMatch11Team2,cBoxRound1Match11,btnRound1Match11Submit);
        match12Box.getChildren().addAll(tFieldMatch12Team1, tFieldMatch12Team2,cBoxRound1Match12,btnRound1Match12Submit);
        match13Box.getChildren().addAll(tFieldMatch13Team1, tFieldMatch13Team2,cBoxRound1Match13,btnRound1Match13Submit);
        match14Box.getChildren().addAll(tFieldMatch14Team1, tFieldMatch14Team2,cBoxRound1Match14,btnRound1Match14Submit);
        match15Box.getChildren().addAll(tFieldMatch15Team1, tFieldMatch15Team2,cBoxRound1Match15,btnRound1Match15Submit);
        match16Box.getChildren().addAll(tFieldMatch16Team1, tFieldMatch16Team2,cBoxRound1Match16,btnRound1Match16Submit);
        match17Box.getChildren().addAll(tFieldMatch17Team1, tFieldMatch17Team2,cBoxRound1Match17,btnRound1Match17Submit);
        match18Box.getChildren().addAll(tFieldMatch18Team1, tFieldMatch18Team2,cBoxRound1Match18,btnRound1Match18Submit);
        match19Box.getChildren().addAll(tFieldMatch19Team1, tFieldMatch19Team2,cBoxRound1Match19,btnRound1Match19Submit);
        match20Box.getChildren().addAll(tFieldMatch20Team1, tFieldMatch20Team2,cBoxRound1Match20,btnRound1Match20Submit);
        match21Box.getChildren().addAll(tFieldMatch21Team1, tFieldMatch21Team2,cBoxRound1Match21,btnRound1Match21Submit);
        match22Box.getChildren().addAll(tFieldMatch22Team1, tFieldMatch22Team2,cBoxRound1Match22,btnRound1Match22Submit);
        match23Box.getChildren().addAll(tFieldMatch23Team1, tFieldMatch23Team2,cBoxRound1Match23,btnRound1Match23Submit);
        match24Box.getChildren().addAll(tFieldMatch24Team1, tFieldMatch24Team2,cBoxRound1Match24,btnRound1Match24Submit);
        match25Box.getChildren().addAll(tFieldMatch25Team1, tFieldMatch25Team2,cBoxRound1Match25,btnRound1Match25Submit);
        match26Box.getChildren().addAll(tFieldMatch26Team1, tFieldMatch26Team2,cBoxRound1Match26,btnRound1Match26Submit);
        match27Box.getChildren().addAll(tFieldMatch27Team1, tFieldMatch27Team2,cBoxRound1Match27,btnRound1Match27Submit);
        match28Box.getChildren().addAll(tFieldMatch28Team1, tFieldMatch28Team2,cBoxRound1Match28,btnRound1Match28Submit);
        match29Box.getChildren().addAll(tFieldMatch29Team1, tFieldMatch29Team2,cBoxRound1Match29,btnRound1Match29Submit);
        match30Box.getChildren().addAll(tFieldMatch30Team1, tFieldMatch30Team2,cBoxRound1Match30,btnRound1Match30Submit);
        match31Box.getChildren().addAll(tFieldMatch31Team1, tFieldMatch31Team2,cBoxRound1Match31,btnRound1Match31Submit);
        match32Box.getChildren().addAll(tFieldMatch32Team1, tFieldMatch32Team2,cBoxRound1Match32,btnRound1Match32Submit);

        match1Box.setSpacing(15);match2Box.setSpacing(15);match3Box.setSpacing(15);match4Box.setSpacing(15);
        match5Box.setSpacing(15);match6Box.setSpacing(15);match7Box.setSpacing(15);match8Box.setSpacing(15);
        match9Box.setSpacing(15);match10Box.setSpacing(15);match11Box.setSpacing(15);match12Box.setSpacing(15);
        match13Box.setSpacing(15);match14Box.setSpacing(15);match15Box.setSpacing(15);match16Box.setSpacing(15);
        match17Box.setSpacing(15);match18Box.setSpacing(15);match19Box.setSpacing(15);match20Box.setSpacing(15);
        match21Box.setSpacing(15);match22Box.setSpacing(15);match23Box.setSpacing(15);match24Box.setSpacing(15);
        match25Box.setSpacing(15);match26Box.setSpacing(15);match27Box.setSpacing(15);match28Box.setSpacing(15);
        match29Box.setSpacing(15);match30Box.setSpacing(15);match31Box.setSpacing(15);match32Box.setSpacing(15);

        btnRound1Match1Submit.setMinSize(120,15);btnRound1Match2Submit.setMinSize(120,15);
        btnRound1Match3Submit.setMinSize(120,15);btnRound1Match4Submit.setMinSize(120,15);
        btnRound1Match5Submit.setMinSize(120,15);btnRound1Match6Submit.setMinSize(120,15);
        btnRound1Match7Submit.setMinSize(120,15);btnRound1Match8Submit.setMinSize(120,15);
        btnRound1Match9Submit.setMinSize(120,15);btnRound1Match10Submit.setMinSize(120,15);
        btnRound1Match11Submit.setMinSize(120,15);btnRound1Match12Submit.setMinSize(120,15);
        btnRound1Match13Submit.setMinSize(120,15);btnRound1Match14Submit.setMinSize(120,15);
        btnRound1Match15Submit.setMinSize(120,15);btnRound1Match16Submit.setMinSize(120,15);
        btnRound1Match17Submit.setMinSize(120,15);btnRound1Match18Submit.setMinSize(120,15);
        btnRound1Match19Submit.setMinSize(120,15);btnRound1Match20Submit.setMinSize(120,15);
        btnRound1Match21Submit.setMinSize(120,15);btnRound1Match22Submit.setMinSize(120,15);
        btnRound1Match23Submit.setMinSize(120,15);btnRound1Match24Submit.setMinSize(120,15);
        btnRound1Match25Submit.setMinSize(120,15);btnRound1Match26Submit.setMinSize(120,15);
        btnRound1Match27Submit.setMinSize(120,15);btnRound1Match28Submit.setMinSize(120,15);
        btnRound1Match29Submit.setMinSize(120,15);btnRound1Match30Submit.setMinSize(120,15);
        btnRound1Match31Submit.setMinSize(120,15);btnRound1Match32Submit.setMinSize(120,15);

        cBoxRound1Match1.setMinSize(175,15);cBoxRound1Match2.setMinSize(175,15);
        cBoxRound1Match3.setMinSize(175,15);cBoxRound1Match4.setMinSize(175,15);
        cBoxRound1Match5.setMinSize(175,15);cBoxRound1Match6.setMinSize(175,15);
        cBoxRound1Match7.setMinSize(175,15);cBoxRound1Match8.setMinSize(175,15);
        cBoxRound1Match9.setMinSize(175,15);cBoxRound1Match10.setMinSize(175,15);
        cBoxRound1Match11.setMinSize(175,15);cBoxRound1Match12.setMinSize(175,15);
        cBoxRound1Match13.setMinSize(175,15);cBoxRound1Match14.setMinSize(175,15);
        cBoxRound1Match15.setMinSize(175,15);cBoxRound1Match16.setMinSize(175,15);
        cBoxRound1Match17.setMinSize(175,15);cBoxRound1Match18.setMinSize(175,15);
        cBoxRound1Match19.setMinSize(175,15);cBoxRound1Match20.setMinSize(175,15);
        cBoxRound1Match21.setMinSize(175,15);cBoxRound1Match22.setMinSize(175,15);
        cBoxRound1Match23.setMinSize(175,15);cBoxRound1Match24.setMinSize(175,15);
        cBoxRound1Match25.setMinSize(175,15);cBoxRound1Match26.setMinSize(175,15);
        cBoxRound1Match27.setMinSize(175,15);cBoxRound1Match28.setMinSize(175,15);
        cBoxRound1Match29.setMinSize(175,15);cBoxRound1Match30.setMinSize(175,15);
        cBoxRound1Match31.setMinSize(175,15);cBoxRound1Match32.setMinSize(175,15);

        tFieldMatch1Team1.setMinSize(175,15);tFieldMatch1Team2.setMinSize(175,15);
        tFieldMatch2Team1.setMinSize(175,15);tFieldMatch2Team2.setMinSize(175,15);
        tFieldMatch3Team1.setMinSize(175,15);tFieldMatch3Team2.setMinSize(175,15);
        tFieldMatch4Team1.setMinSize(175,15);tFieldMatch4Team2.setMinSize(175,15);
        tFieldMatch5Team1.setMinSize(175,15);tFieldMatch5Team2.setMinSize(175,15);
        tFieldMatch6Team1.setMinSize(175,15);tFieldMatch6Team2.setMinSize(175,15);
        tFieldMatch7Team1.setMinSize(175,15);tFieldMatch7Team2.setMinSize(175,15);
        tFieldMatch8Team1.setMinSize(175,15);tFieldMatch8Team2.setMinSize(175,15);
        tFieldMatch9Team1.setMinSize(175,15);tFieldMatch9Team2.setMinSize(175,15);
        tFieldMatch10Team1.setMinSize(175,15);tFieldMatch10Team2.setMinSize(175,15);
        tFieldMatch11Team1.setMinSize(175,15);tFieldMatch11Team2.setMinSize(175,15);
        tFieldMatch12Team1.setMinSize(175,15);tFieldMatch12Team2.setMinSize(175,15);
        tFieldMatch13Team1.setMinSize(175,15);tFieldMatch13Team2.setMinSize(175,15);
        tFieldMatch14Team1.setMinSize(175,15);tFieldMatch14Team2.setMinSize(175,15);
        tFieldMatch15Team1.setMinSize(175,15);tFieldMatch15Team2.setMinSize(175,15);
        tFieldMatch16Team1.setMinSize(175,15);tFieldMatch16Team2.setMinSize(175,15);
        tFieldMatch17Team1.setMinSize(175,15);tFieldMatch17Team2.setMinSize(175,15);
        tFieldMatch18Team1.setMinSize(175,15);tFieldMatch18Team2.setMinSize(175,15);
        tFieldMatch19Team1.setMinSize(175,15);tFieldMatch19Team2.setMinSize(175,15);
        tFieldMatch20Team1.setMinSize(175,15);tFieldMatch20Team2.setMinSize(175,15);
        tFieldMatch21Team1.setMinSize(175,15);tFieldMatch21Team2.setMinSize(175,15);
        tFieldMatch22Team1.setMinSize(175,15);tFieldMatch22Team2.setMinSize(175,15);
        tFieldMatch23Team1.setMinSize(175,15);tFieldMatch23Team2.setMinSize(175,15);
        tFieldMatch24Team1.setMinSize(175,15);tFieldMatch24Team2.setMinSize(175,15);
        tFieldMatch25Team1.setMinSize(175,15);tFieldMatch25Team2.setMinSize(175,15);
        tFieldMatch26Team1.setMinSize(175,15);tFieldMatch26Team2.setMinSize(175,15);
        tFieldMatch27Team1.setMinSize(175,15);tFieldMatch27Team2.setMinSize(175,15);
        tFieldMatch28Team1.setMinSize(175,15);tFieldMatch28Team2.setMinSize(175,15);
        tFieldMatch29Team1.setMinSize(175,15);tFieldMatch29Team2.setMinSize(175,15);
        tFieldMatch30Team1.setMinSize(175,15);tFieldMatch30Team2.setMinSize(175,15);
        tFieldMatch31Team1.setMinSize(175,15);tFieldMatch31Team2.setMinSize(175,15);
        tFieldMatch32Team1.setMinSize(175,15);tFieldMatch32Team2.setMinSize(175,15);

        match1BoxHolder.getChildren().addAll(match1Box,match1btnBox);  match17BoxHolder.getChildren().addAll(match17Box,match17btnBox);
        match2BoxHolder.getChildren().addAll(match2Box,match2btnBox);  match18BoxHolder.getChildren().addAll(match18Box,match18btnBox);
        match3BoxHolder.getChildren().addAll(match3Box,match3btnBox);  match19BoxHolder.getChildren().addAll(match19Box,match19btnBox);
        match4BoxHolder.getChildren().addAll(match4Box,match4btnBox);  match20BoxHolder.getChildren().addAll(match20Box,match20btnBox);
        match5BoxHolder.getChildren().addAll(match5Box,match5btnBox);  match21BoxHolder.getChildren().addAll(match21Box,match21btnBox);
        match6BoxHolder.getChildren().addAll(match6Box,match6btnBox);  match22BoxHolder.getChildren().addAll(match22Box,match22btnBox);
        match7BoxHolder.getChildren().addAll(match7Box,match7btnBox);  match23BoxHolder.getChildren().addAll(match23Box,match23btnBox);
        match8BoxHolder.getChildren().addAll(match8Box,match8btnBox);  match24BoxHolder.getChildren().addAll(match24Box,match25btnBox);
        match9BoxHolder.getChildren().addAll(match9Box,match9btnBox);  match25BoxHolder.getChildren().addAll(match25Box,match25btnBox);
        match10BoxHolder.getChildren().addAll(match10Box,match10btnBox);  match26BoxHolder.getChildren().addAll(match26Box,match26btnBox);
        match11BoxHolder.getChildren().addAll(match11Box,match11btnBox);  match27BoxHolder.getChildren().addAll(match27Box,match27btnBox);
        match12BoxHolder.getChildren().addAll(match12Box,match12btnBox);  match28BoxHolder.getChildren().addAll(match28Box,match28btnBox);
        match13BoxHolder.getChildren().addAll(match13Box,match13btnBox);  match29BoxHolder.getChildren().addAll(match29Box,match29btnBox);
        match14BoxHolder.getChildren().addAll(match14Box,match14btnBox);  match30BoxHolder.getChildren().addAll(match30Box,match30btnBox);
        match15BoxHolder.getChildren().addAll(match15Box,match15btnBox);  match31BoxHolder.getChildren().addAll(match31Box,match31btnBox);
        match16BoxHolder.getChildren().addAll(match16Box,match16btnBox);  match32BoxHolder.getChildren().addAll(match32Box,match32btnBox);

        Accordion matchContainer = new Accordion();
        TitledPane match1Pane = new TitledPane("Match One",match1BoxHolder);
        TitledPane match2Pane = new TitledPane("Match Two", match2BoxHolder);
        TitledPane match3Pane = new TitledPane("Match Three", match3BoxHolder);
        TitledPane match4Pane = new TitledPane("Match Four", match4BoxHolder);
        TitledPane match5Pane = new TitledPane("Match Five", match5BoxHolder);
        TitledPane match6Pane = new TitledPane("Match Six", match6BoxHolder);
        TitledPane match7Pane = new TitledPane("Match Seven", match7BoxHolder);
        TitledPane match8Pane = new TitledPane("Match Eight", match8BoxHolder);
        TitledPane match9Pane = new TitledPane("Match Nine", match9BoxHolder);
        TitledPane match10Pane = new TitledPane("Match Ten", match10BoxHolder);
        TitledPane match11Pane = new TitledPane("Match Eleven", match11BoxHolder);
        TitledPane match12Pane = new TitledPane("Match Twelve", match12BoxHolder);
        TitledPane match13Pane = new TitledPane("Match Thirteen", match13BoxHolder);
        TitledPane match14Pane = new TitledPane("Match Fourteen", match14BoxHolder);
        TitledPane match15Pane = new TitledPane("Match Fifteen", match15BoxHolder);
        TitledPane match16Pane = new TitledPane("Match Sixteen", match16BoxHolder);
        TitledPane match17Pane = new TitledPane("Match Seventeen", match17BoxHolder);
        TitledPane match18Pane = new TitledPane("Match Eighteen", match18BoxHolder);
        TitledPane match19Pane = new TitledPane("Match Nineteen", match19BoxHolder);
        TitledPane match20Pane = new TitledPane("Match Twenty", match20BoxHolder);
        TitledPane match21Pane = new TitledPane("Match Twenty-One", match21BoxHolder);
        TitledPane match22Pane = new TitledPane("Match Twenty-Two", match22BoxHolder);
        TitledPane match23Pane = new TitledPane("Match Twenty-Three", match23BoxHolder);
        TitledPane match24Pane = new TitledPane("Match Twenty-Four", match24BoxHolder);
        TitledPane match25Pane = new TitledPane("Match Twenty-Five", match25BoxHolder);
        TitledPane match26Pane = new TitledPane("Match Twenty-Six", match26BoxHolder);
        TitledPane match27Pane = new TitledPane("Match Twenty-Seven", match27BoxHolder);
        TitledPane match28Pane = new TitledPane("Match Twenty-Eight", match28BoxHolder);
        TitledPane match29Pane = new TitledPane("Match Twenty-Nine", match29BoxHolder);
        TitledPane match30Pane = new TitledPane("Match Thirty", match30BoxHolder);
        TitledPane match31Pane = new TitledPane("Match Thirty-One", match31BoxHolder);
        TitledPane match32Pane = new TitledPane("Match Thirty-Two", match32BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        matchContainer.getPanes().addAll(match1Pane,match2Pane,match3Pane,match4Pane,match5Pane,
                match6Pane,match7Pane,match8Pane,match9Pane,match10Pane,match11Pane,match12Pane,match13Pane,match14Pane
                ,match15Pane,match16Pane,match17Pane,match18Pane,match19Pane,match20Pane,match21Pane,match22Pane,match23Pane
                ,match24Pane,match25Pane,match26Pane,match27Pane,match28Pane,match29Pane,match30Pane,match31Pane,match32Pane);

        scrollPane.setContent(matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round One",verticalContainer);

        rootPane.setCollapsible(false);
        matchContainer.setMinWidth(962);

        btnMatch1Edit.setMinSize(175,15);btnMatch2Edit.setMinSize(175,15);
        btnMatch3Edit.setMinSize(175,15);btnMatch4Edit.setMinSize(175,15);
        btnMatch5Edit.setMinSize(175,15);btnMatch6Edit.setMinSize(175,15);
        btnMatch7Edit.setMinSize(175,15);btnMatch8Edit.setMinSize(175,15);
        btnMatch9Edit.setMinSize(175,15);btnMatch10Edit.setMinSize(175,15);
        btnMatch11Edit.setMinSize(175,15);btnMatch12Edit.setMinSize(175,15);
        btnMatch13Edit.setMinSize(175,15);btnMatch14Edit.setMinSize(175,15);
        btnMatch15Edit.setMinSize(175,15);btnMatch16Edit.setMinSize(175,15);
        btnMatch17Edit.setMinSize(175,15);btnMatch18Edit.setMinSize(175,15);
        btnMatch19Edit.setMinSize(175,15);btnMatch20Edit.setMinSize(175,15);
        btnMatch21Edit.setMinSize(175,15);btnMatch22Edit.setMinSize(175,15);
        btnMatch23Edit.setMinSize(175,15);btnMatch24Edit.setMinSize(175,15);
        btnMatch25Edit.setMinSize(175,15);btnMatch26Edit.setMinSize(175,15);
        btnMatch27Edit.setMinSize(175,15);btnMatch28Edit.setMinSize(175,15);
        btnMatch29Edit.setMinSize(175,15);btnMatch30Edit.setMinSize(175,15);
        btnMatch31Edit.setMinSize(175,15);btnMatch32Edit.setMinSize(175,15);

        btnMatch1Save.setMinSize(175,15);btnMatch2Save.setMinSize(175,15);
        btnMatch3Save.setMinSize(175,15);btnMatch4Save.setMinSize(175,15);
        btnMatch5Save.setMinSize(175,15);btnMatch6Save.setMinSize(175,15);
        btnMatch7Save.setMinSize(175,15);btnMatch8Save.setMinSize(175,15);
        btnMatch9Save.setMinSize(175,15);btnMatch10Save.setMinSize(175,15);
        btnMatch11Save.setMinSize(175,15);btnMatch12Save.setMinSize(175,15);
        btnMatch13Save.setMinSize(175,15);btnMatch14Save.setMinSize(175,15);
        btnMatch15Save.setMinSize(175,15);btnMatch16Save.setMinSize(175,15);
        btnMatch17Save.setMinSize(175,15);btnMatch18Save.setMinSize(175,15);
        btnMatch19Save.setMinSize(175,15);btnMatch20Save.setMinSize(175,15);
        btnMatch21Save.setMinSize(175,15);btnMatch22Save.setMinSize(175,15);
        btnMatch23Save.setMinSize(175,15);btnMatch24Save.setMinSize(175,15);
        btnMatch25Save.setMinSize(175,15);btnMatch26Save.setMinSize(175,15);
        btnMatch27Save.setMinSize(175,15);btnMatch28Save.setMinSize(175,15);
        btnMatch29Save.setMinSize(175,15);btnMatch30Save.setMinSize(175,15);
        btnMatch31Save.setMinSize(175,15);btnMatch32Save.setMinSize(175,15);

        match1BoxHolder.setSpacing(10); match2BoxHolder.setSpacing(10);
        match3BoxHolder.setSpacing(10); match4BoxHolder.setSpacing(10);
        match5BoxHolder.setSpacing(10); match6BoxHolder.setSpacing(10);
        match7BoxHolder.setSpacing(10); match8BoxHolder.setSpacing(10);
        match9BoxHolder.setSpacing(10); match10BoxHolder.setSpacing(10);
        match11BoxHolder.setSpacing(10); match12BoxHolder.setSpacing(10);
        match13BoxHolder.setSpacing(10); match14BoxHolder.setSpacing(10);
        match15BoxHolder.setSpacing(10); match16BoxHolder.setSpacing(10);
        match17BoxHolder.setSpacing(10); match18BoxHolder.setSpacing(10);
        match19BoxHolder.setSpacing(10); match20BoxHolder.setSpacing(10);
        match21BoxHolder.setSpacing(10); match22BoxHolder.setSpacing(10);
        match23BoxHolder.setSpacing(10); match24BoxHolder.setSpacing(10);
        match25BoxHolder.setSpacing(10); match26BoxHolder.setSpacing(10);
        match27BoxHolder.setSpacing(10); match28BoxHolder.setSpacing(10);
        match29BoxHolder.setSpacing(10); match30BoxHolder.setSpacing(10);
        match31BoxHolder.setSpacing(10); match32BoxHolder.setSpacing(10);

        match1btnBox.setSpacing(15);match2btnBox.setSpacing(15);
        match3btnBox.setSpacing(15);match4btnBox.setSpacing(15);
        match5btnBox.setSpacing(15);match6btnBox.setSpacing(15);
        match7btnBox.setSpacing(15);match8btnBox.setSpacing(15);
        match9btnBox.setSpacing(15);match10btnBox.setSpacing(15);
        match11btnBox.setSpacing(15);match12btnBox.setSpacing(15);
        match13btnBox.setSpacing(15);match14btnBox.setSpacing(15);
        match15btnBox.setSpacing(15);match16btnBox.setSpacing(15);
        match17btnBox.setSpacing(15);match18btnBox.setSpacing(15);
        match19btnBox.setSpacing(15);match20btnBox.setSpacing(15);
        match21btnBox.setSpacing(15);match22btnBox.setSpacing(15);
        match23btnBox.setSpacing(15);match24btnBox.setSpacing(15);
        match25btnBox.setSpacing(15);match26btnBox.setSpacing(15);
        match27btnBox.setSpacing(15);match28btnBox.setSpacing(15);
        match29btnBox.setSpacing(15);match30btnBox.setSpacing(15);
        match31btnBox.setSpacing(15);match32btnBox.setSpacing(15);

        tFieldMatch1Team1.setEditable(false);tFieldMatch1Team2.setEditable(false);
        tFieldMatch2Team1.setEditable(false);tFieldMatch2Team2.setEditable(false);
        tFieldMatch3Team1.setEditable(false);tFieldMatch3Team2.setEditable(false);
        tFieldMatch4Team1.setEditable(false);tFieldMatch4Team2.setEditable(false);
        tFieldMatch5Team1.setEditable(false);tFieldMatch5Team2.setEditable(false);
        tFieldMatch6Team1.setEditable(false);tFieldMatch6Team2.setEditable(false);
        tFieldMatch7Team1.setEditable(false);tFieldMatch7Team2.setEditable(false);
        tFieldMatch8Team1.setEditable(false);tFieldMatch8Team2.setEditable(false);
        tFieldMatch9Team1.setEditable(false);tFieldMatch9Team2.setEditable(false);
        tFieldMatch10Team1.setEditable(false);tFieldMatch10Team2.setEditable(false);
        tFieldMatch11Team1.setEditable(false);tFieldMatch11Team2.setEditable(false);
        tFieldMatch12Team1.setEditable(false);tFieldMatch12Team2.setEditable(false);
        tFieldMatch13Team1.setEditable(false);tFieldMatch13Team2.setEditable(false);
        tFieldMatch14Team1.setEditable(false);tFieldMatch14Team2.setEditable(false);
        tFieldMatch15Team1.setEditable(false);tFieldMatch15Team2.setEditable(false);
        tFieldMatch16Team1.setEditable(false);tFieldMatch16Team2.setEditable(false);
        tFieldMatch17Team1.setEditable(false);tFieldMatch17Team2.setEditable(false);
        tFieldMatch18Team1.setEditable(false);tFieldMatch18Team2.setEditable(false);
        tFieldMatch19Team1.setEditable(false);tFieldMatch19Team2.setEditable(false);
        tFieldMatch20Team1.setEditable(false);tFieldMatch20Team2.setEditable(false);
        tFieldMatch21Team1.setEditable(false);tFieldMatch21Team2.setEditable(false);
        tFieldMatch22Team1.setEditable(false);tFieldMatch22Team2.setEditable(false);
        tFieldMatch23Team1.setEditable(false);tFieldMatch23Team2.setEditable(false);
        tFieldMatch24Team1.setEditable(false);tFieldMatch24Team2.setEditable(false);
        tFieldMatch25Team1.setEditable(false);tFieldMatch25Team2.setEditable(false);
        tFieldMatch26Team1.setEditable(false);tFieldMatch26Team2.setEditable(false);
        tFieldMatch27Team1.setEditable(false);tFieldMatch27Team2.setEditable(false);
        tFieldMatch28Team1.setEditable(false);tFieldMatch28Team2.setEditable(false);
        tFieldMatch29Team1.setEditable(false);tFieldMatch29Team2.setEditable(false);
        tFieldMatch30Team1.setEditable(false);tFieldMatch30Team2.setEditable(false);
        tFieldMatch31Team1.setEditable(false);tFieldMatch31Team2.setEditable(false);
        tFieldMatch32Team1.setEditable(false);tFieldMatch32Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnMatch1Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch2Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch3Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch4Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch5Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch6Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch7Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch8Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch9Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch10Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch11Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch12Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch13Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch14Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch15Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch16Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch17Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch18Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch19Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch20Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch21Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch22Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch23Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch24Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch25Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch26Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch27Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch28Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch29Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch30Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch31Edit.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch32Edit.setOnAction(event -> editRound1SchoolFields(event));

        btnMatch1Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch2Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch3Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch4Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch5Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch6Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch7Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch8Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch9Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch10Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch11Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch12Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch13Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch14Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch15Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch16Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch17Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch18Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch19Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch20Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch21Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch22Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch23Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch24Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch25Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch26Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch27Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch28Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch29Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch30Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch31Save.setOnAction(event -> editRound1SchoolFields(event));
        btnMatch32Save.setOnAction(event -> editRound1SchoolFields(event));

        btnRound1Match1Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match2Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match3Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match4Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match5Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match6Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match7Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match8Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match9Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match10Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match11Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match12Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match13Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match14Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match15Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match16Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match17Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match18Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match19Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match20Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match21Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match22Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match23Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match24Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match25Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match26Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match27Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match28Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match29Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match30Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match31Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound1Match32Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round1SceneCode);//Generates a sorted school list
        buildRoundOneArray();
        initializeMatchPairing();
        getRoundOneWinners();

        sceneRound1 = new Scene(rootPane, 1000, 550);
    }//END ROUND ONE SCENE

    public void getRoundOneWinners()
    {
        OpenFile.openRoundOneFile();
        String[] roundOneWinners = OpenFile.getRoundOneWinners();

        if(roundOneWinners[0].length() > 1)
            roundOneMatch1Winner.setText(roundOneWinners[0] + " Won!");

        if(roundOneWinners[1].length() > 1)
            roundOneMatch2Winner.setText(roundOneWinners[1] + " Won!");

        if(roundOneWinners[2].length() > 1)
            roundOneMatch3Winner.setText(roundOneWinners[2] + " Won!");

        if(roundOneWinners[3].length() > 1)
            roundOneMatch4Winner.setText(roundOneWinners[3] + " Won!");

        if(roundOneWinners[4].length() > 1)
            roundOneMatch5Winner.setText(roundOneWinners[4] + " Won!");

        if(roundOneWinners[5].length() > 1)
            roundOneMatch6Winner.setText(roundOneWinners[5] + " Won!");

        if(roundOneWinners[6].length() > 1)
            roundOneMatch7Winner.setText(roundOneWinners[6] + " Won!");

        if(roundOneWinners[7].length() > 1)
            roundOneMatch8Winner.setText(roundOneWinners[7] + " Won!");

        if(roundOneWinners[8].length() > 1)
            roundOneMatch9Winner.setText(roundOneWinners[8] + " Won!");

        if(roundOneWinners[9].length() > 1)
            roundOneMatch10Winner.setText(roundOneWinners[9] + " Won!");

        if(roundOneWinners[10].length() > 1)
            roundOneMatch11Winner.setText(roundOneWinners[10] + " Won!");

        if(roundOneWinners[11].length() > 1)
            roundOneMatch12Winner.setText(roundOneWinners[11] + " Won!");

        if(roundOneWinners[12].length() > 1)
            roundOneMatch13Winner.setText(roundOneWinners[12] + " Won!");

        if(roundOneWinners[13].length() > 1)
            roundOneMatch14Winner.setText(roundOneWinners[13] + " Won!");

        if(roundOneWinners[14].length() > 1)
            roundOneMatch15Winner.setText(roundOneWinners[14] + " Won!");

        if(roundOneWinners[15].length() > 1)
            roundOneMatch16Winner.setText(roundOneWinners[15] + " Won!");

        if(roundOneWinners[16].length() > 1)
            roundOneMatch17Winner.setText(roundOneWinners[16] + " Won!");

        if(roundOneWinners[17].length() > 1)
            roundOneMatch18Winner.setText(roundOneWinners[17] + " Won!");

        if(roundOneWinners[18].length() > 1)
            roundOneMatch19Winner.setText(roundOneWinners[18] + " Won!");

        if(roundOneWinners[19].length() > 1)
            roundOneMatch20Winner.setText(roundOneWinners[19] + " Won!");

        if(roundOneWinners[20].length() > 1)
            roundOneMatch21Winner.setText(roundOneWinners[20] + " Won!");

        if(roundOneWinners[21].length() > 1)
            roundOneMatch22Winner.setText(roundOneWinners[21] + " Won!");

        if(roundOneWinners[22].length() > 1)
            roundOneMatch23Winner.setText(roundOneWinners[22] + " Won!");

        if(roundOneWinners[23].length() > 1)
            roundOneMatch24Winner.setText(roundOneWinners[23] + " Won!");

        if(roundOneWinners[24].length() > 1)
            roundOneMatch25Winner.setText(roundOneWinners[24] + " Won!");

        if(roundOneWinners[25].length() > 1)
            roundOneMatch26Winner.setText(roundOneWinners[25] + " Won!");

        if(roundOneWinners[26].length() > 1)
            roundOneMatch27Winner.setText(roundOneWinners[26] + " Won!");

        if(roundOneWinners[27].length() > 1)
            roundOneMatch28Winner.setText(roundOneWinners[27] + " Won!");

        if(roundOneWinners[28].length() > 1)
            roundOneMatch29Winner.setText(roundOneWinners[28] + " Won!");

        if(roundOneWinners[29].length() > 1)
            roundOneMatch30Winner.setText(roundOneWinners[29] + " Won!");

        if(roundOneWinners[30].length() > 1)
            roundOneMatch31Winner.setText(roundOneWinners[30] + " Won!");

        if(roundOneWinners[31].length() > 1)
            roundOneMatch32Winner.setText(roundOneWinners[31] + " Won!");


        OpenFile.closeRoundOneFile();

    }//END GET ROUND ONE WINNERS

    public void buildRoundOneArray()
    {
        roundOneTextField = new TextField[32][2];
        roundOneBox = new ChoiceBox[32];

        roundOneTextField[0][0] = tFieldMatch1Team1;roundOneTextField[0][1] = tFieldMatch1Team2;
        roundOneTextField[1][0] = tFieldMatch2Team1;roundOneTextField[1][1] = tFieldMatch2Team2;
        roundOneTextField[2][0] = tFieldMatch3Team1;roundOneTextField[2][1] = tFieldMatch3Team2;
        roundOneTextField[3][0] = tFieldMatch4Team1;roundOneTextField[3][1] = tFieldMatch4Team2;
        roundOneTextField[4][0] = tFieldMatch5Team1;roundOneTextField[4][1] = tFieldMatch5Team2;
        roundOneTextField[5][0] = tFieldMatch6Team1;roundOneTextField[5][1] = tFieldMatch6Team2;
        roundOneTextField[6][0] = tFieldMatch7Team1;roundOneTextField[6][1] = tFieldMatch7Team2;
        roundOneTextField[7][0] = tFieldMatch8Team1;roundOneTextField[7][1] = tFieldMatch8Team2;
        roundOneTextField[8][0] = tFieldMatch9Team1;roundOneTextField[8][1] = tFieldMatch9Team2;
        roundOneTextField[9][0] = tFieldMatch10Team1;roundOneTextField[9][1] = tFieldMatch10Team2;
        roundOneTextField[10][0] = tFieldMatch11Team1;roundOneTextField[10][1] = tFieldMatch11Team2;
        roundOneTextField[11][0] = tFieldMatch12Team1;roundOneTextField[11][1] = tFieldMatch12Team2;
        roundOneTextField[12][0] = tFieldMatch13Team1;roundOneTextField[12][1] = tFieldMatch13Team2;
        roundOneTextField[13][0] = tFieldMatch14Team1;roundOneTextField[13][1] = tFieldMatch14Team2;
        roundOneTextField[14][0] = tFieldMatch15Team1;roundOneTextField[14][1] = tFieldMatch15Team2;
        roundOneTextField[15][0] = tFieldMatch16Team1;roundOneTextField[15][1] = tFieldMatch16Team2;
        roundOneTextField[16][0] = tFieldMatch17Team1;roundOneTextField[16][1] = tFieldMatch17Team2;
        roundOneTextField[17][0] = tFieldMatch18Team1;roundOneTextField[17][1] = tFieldMatch18Team2;
        roundOneTextField[18][0] = tFieldMatch19Team1;roundOneTextField[18][1] = tFieldMatch19Team2;
        roundOneTextField[19][0] = tFieldMatch20Team1;roundOneTextField[19][1] = tFieldMatch20Team2;
        roundOneTextField[20][0] = tFieldMatch21Team1;roundOneTextField[20][1] = tFieldMatch21Team2;
        roundOneTextField[21][0] = tFieldMatch22Team1;roundOneTextField[21][1] = tFieldMatch22Team2;
        roundOneTextField[22][0] = tFieldMatch23Team1;roundOneTextField[22][1] = tFieldMatch23Team2;
        roundOneTextField[23][0] = tFieldMatch24Team1;roundOneTextField[23][1] = tFieldMatch24Team2;
        roundOneTextField[24][0] = tFieldMatch25Team1;roundOneTextField[24][1] = tFieldMatch25Team2;
        roundOneTextField[25][0] = tFieldMatch26Team1;roundOneTextField[25][1] = tFieldMatch26Team2;
        roundOneTextField[26][0] = tFieldMatch27Team1;roundOneTextField[26][1] = tFieldMatch27Team2;
        roundOneTextField[27][0] = tFieldMatch28Team1;roundOneTextField[27][1] = tFieldMatch28Team2;
        roundOneTextField[28][0] = tFieldMatch29Team1;roundOneTextField[28][1] = tFieldMatch29Team2;
        roundOneTextField[29][0] = tFieldMatch30Team1;roundOneTextField[29][1] = tFieldMatch30Team2;
        roundOneTextField[30][0] = tFieldMatch31Team1;roundOneTextField[30][1] = tFieldMatch31Team2;
        roundOneTextField[31][0] = tFieldMatch32Team1;roundOneTextField[31][1] = tFieldMatch32Team2;

        roundOneBox[0] = cBoxRound1Match1;roundOneBox[17] = cBoxRound1Match18;
        roundOneBox[1] = cBoxRound1Match2;roundOneBox[18] = cBoxRound1Match19;
        roundOneBox[2] = cBoxRound1Match3;roundOneBox[19] = cBoxRound1Match20;
        roundOneBox[3] = cBoxRound1Match4;roundOneBox[20] = cBoxRound1Match21;
        roundOneBox[4] = cBoxRound1Match5;roundOneBox[21] = cBoxRound1Match22;
        roundOneBox[5] = cBoxRound1Match6;roundOneBox[22] = cBoxRound1Match23;
        roundOneBox[6] = cBoxRound1Match7;roundOneBox[23] = cBoxRound1Match24;
        roundOneBox[7] = cBoxRound1Match8;roundOneBox[24] = cBoxRound1Match25;
        roundOneBox[8] = cBoxRound1Match9;roundOneBox[25] = cBoxRound1Match26;
        roundOneBox[9] = cBoxRound1Match10;roundOneBox[26] = cBoxRound1Match27;
        roundOneBox[10] = cBoxRound1Match11;roundOneBox[27] = cBoxRound1Match28;
        roundOneBox[11] = cBoxRound1Match12;roundOneBox[28] = cBoxRound1Match29;
        roundOneBox[12] = cBoxRound1Match13;roundOneBox[29] = cBoxRound1Match30;
        roundOneBox[13] = cBoxRound1Match14;roundOneBox[30] = cBoxRound1Match31;
        roundOneBox[14] = cBoxRound1Match15;roundOneBox[31] = cBoxRound1Match32;
        roundOneBox[15] = cBoxRound1Match16;
        roundOneBox[16] = cBoxRound1Match17;

    }//END BUILD ROUND ONE TEXT FIELD ARRAY

    public void editRound1SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnMatch1Edit))
        {
            match1Box.getChildren().removeAll(tFieldMatch1Team1,tFieldMatch1Team2);
            cBoxRound1Match1TeamOne.setMinSize(175,15);
            cBoxRound1Match1TeamTwo.setMinSize(175,15);
            cBoxRound1Match1TeamOne.setValue(tFieldMatch1Team1.getText());
            cBoxRound1Match1TeamTwo.setValue(tFieldMatch1Team2.getText());
            match1Box.getChildren().add(0, cBoxRound1Match1TeamOne);
            match1Box.getChildren().add(1, cBoxRound1Match1TeamTwo);
            cBoxRound1Match1.setVisible(false);
            btnRound1Match1Submit.setVisible(false);


            match1btnBox.getChildren().remove(btnMatch1Edit);
            match1btnBox.getChildren().add(0,btnMatch1Save);


        }
        else if(event.getSource().equals(btnMatch1Save))
        {
            tFieldMatch1Team1.setText(cBoxRound1Match1TeamOne.getValue());
            tFieldMatch1Team2.setText(cBoxRound1Match1TeamTwo.getValue());
            match1Box.getChildren().removeAll(cBoxRound1Match1TeamOne, cBoxRound1Match1TeamTwo);
            match1Box.getChildren().add(0,tFieldMatch1Team1);
            match1Box.getChildren().add(1,tFieldMatch1Team2);
            match1btnBox.getChildren().remove(btnMatch1Save);
            match1btnBox.getChildren().add(0,btnMatch1Edit);

            cBoxRound1Match1.getItems().clear();
            cBoxRound1Match1.getItems().addAll(tFieldMatch1Team1.getText(),tFieldMatch1Team2.getText());
            cBoxRound1Match1.setVisible(true);
            btnRound1Match1Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ONE----------------------------------------

        //---------------------------------------MATCH TWO--------------------------------------------
        if(event.getSource().equals(btnMatch2Edit))
        {
            match2Box.getChildren().removeAll(tFieldMatch2Team1,tFieldMatch2Team2);
            cBoxRound1Match2TeamOne.setMinSize(175,15);
            cBoxRound1Match2TeamTwo.setMinSize(175,15);
            cBoxRound1Match2TeamOne.setValue(tFieldMatch2Team1.getText());
            cBoxRound1Match2TeamTwo.setValue(tFieldMatch2Team2.getText());
            match2Box.getChildren().add(0, cBoxRound1Match2TeamOne);
            match2Box.getChildren().add(1, cBoxRound1Match2TeamTwo);
            cBoxRound1Match2.setVisible(false);
            btnRound1Match2Submit.setVisible(false);


            match2btnBox.getChildren().remove(btnMatch2Edit);
            match2btnBox.getChildren().add(0,btnMatch2Save);


        }
        else if(event.getSource().equals(btnMatch2Save))
        {
            tFieldMatch2Team1.setText(cBoxRound1Match2TeamOne.getValue());
            tFieldMatch2Team2.setText(cBoxRound1Match2TeamTwo.getValue());
            match2Box.getChildren().removeAll(cBoxRound1Match2TeamOne, cBoxRound1Match2TeamTwo);
            match2Box.getChildren().add(0,tFieldMatch2Team1);
            match2Box.getChildren().add(1,tFieldMatch2Team2);
            match2btnBox.getChildren().remove(btnMatch2Save);
            match2btnBox.getChildren().add(0,btnMatch2Edit);

            cBoxRound1Match2.getItems().clear();
            cBoxRound1Match2.getItems().addAll(tFieldMatch2Team1.getText(),tFieldMatch2Team2.getText());
            cBoxRound1Match2.setVisible(true);
            btnRound1Match2Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWO----------------------------------------

        //---------------------------------------MATCH THREE--------------------------------------------
        if(event.getSource().equals(btnMatch3Edit))
        {
            match3Box.getChildren().removeAll(tFieldMatch3Team1,tFieldMatch3Team2);
            cBoxRound1Match3TeamOne.setMinSize(175,15);
            cBoxRound1Match3TeamTwo.setMinSize(175,15);
            cBoxRound1Match3TeamOne.setValue(tFieldMatch3Team1.getText());
            cBoxRound1Match3TeamTwo.setValue(tFieldMatch3Team2.getText());
            match3Box.getChildren().add(0, cBoxRound1Match3TeamOne);
            match3Box.getChildren().add(1, cBoxRound1Match3TeamTwo);
            cBoxRound1Match3.setVisible(false);
            btnRound1Match3Submit.setVisible(false);


            match3btnBox.getChildren().remove(btnMatch3Edit);
            match3btnBox.getChildren().add(0,btnMatch3Save);


        }
        else if(event.getSource().equals(btnMatch3Save))
        {
            tFieldMatch3Team1.setText(cBoxRound1Match3TeamOne.getValue());
            tFieldMatch3Team2.setText(cBoxRound1Match3TeamTwo.getValue());
            match3Box.getChildren().removeAll(cBoxRound1Match3TeamOne, cBoxRound1Match3TeamTwo);
            match3Box.getChildren().add(0,tFieldMatch3Team1);
            match3Box.getChildren().add(1,tFieldMatch3Team2);
            match3btnBox.getChildren().remove(btnMatch3Save);
            match3btnBox.getChildren().add(0,btnMatch3Edit);

            cBoxRound1Match3.getItems().clear();
            cBoxRound1Match3.getItems().addAll(tFieldMatch3Team1.getText(),tFieldMatch3Team2.getText());
            cBoxRound1Match3.setVisible(true);
            btnRound1Match3Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THREE----------------------------------------

        //---------------------------------------MATCH FOUR--------------------------------------------
        if(event.getSource().equals(btnMatch4Edit))
        {
            match4Box.getChildren().removeAll(tFieldMatch4Team1,tFieldMatch4Team2);
            cBoxRound1Match4TeamOne.setMinSize(175,15);
            cBoxRound1Match4TeamTwo.setMinSize(175,15);
            cBoxRound1Match4TeamOne.setValue(tFieldMatch4Team1.getText());
            cBoxRound1Match4TeamTwo.setValue(tFieldMatch4Team2.getText());
            match4Box.getChildren().add(0, cBoxRound1Match4TeamOne);
            match4Box.getChildren().add(1, cBoxRound1Match4TeamTwo);
            cBoxRound1Match4.setVisible(false);
            btnRound1Match4Submit.setVisible(false);


            match4btnBox.getChildren().remove(btnMatch4Edit);
            match4btnBox.getChildren().add(0,btnMatch4Save);


        }
        else if(event.getSource().equals(btnMatch4Save))
        {
            tFieldMatch4Team1.setText(cBoxRound1Match4TeamOne.getValue());
            tFieldMatch4Team2.setText(cBoxRound1Match4TeamTwo.getValue());
            match4Box.getChildren().removeAll(cBoxRound1Match4TeamOne, cBoxRound1Match4TeamTwo);
            match4Box.getChildren().add(0,tFieldMatch4Team1);
            match4Box.getChildren().add(1,tFieldMatch4Team2);
            match4btnBox.getChildren().remove(btnMatch4Save);
            match4btnBox.getChildren().add(0,btnMatch4Edit);

            cBoxRound1Match4.getItems().clear();
            cBoxRound1Match4.getItems().addAll(tFieldMatch4Team1.getText(),tFieldMatch4Team2.getText());
            cBoxRound1Match4.setVisible(true);
            btnRound1Match4Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FOUR----------------------------------------

        //---------------------------------------MATCH FIVE--------------------------------------------
        if(event.getSource().equals(btnMatch5Edit))
        {
            match5Box.getChildren().removeAll(tFieldMatch5Team1,tFieldMatch5Team2);
            cBoxRound1Match5TeamOne.setMinSize(175,15);
            cBoxRound1Match5TeamTwo.setMinSize(175,15);
            cBoxRound1Match5TeamOne.setValue(tFieldMatch5Team1.getText());
            cBoxRound1Match5TeamTwo.setValue(tFieldMatch5Team2.getText());
            match5Box.getChildren().add(0, cBoxRound1Match5TeamOne);
            match5Box.getChildren().add(1, cBoxRound1Match5TeamTwo);
            cBoxRound1Match5.setVisible(false);
            btnRound1Match5Submit.setVisible(false);


            match5btnBox.getChildren().remove(btnMatch5Edit);
            match5btnBox.getChildren().add(0,btnMatch5Save);


        }
        else if(event.getSource().equals(btnMatch5Save))
        {
            tFieldMatch5Team1.setText(cBoxRound1Match5TeamOne.getValue());
            tFieldMatch5Team2.setText(cBoxRound1Match5TeamTwo.getValue());
            match5Box.getChildren().removeAll(cBoxRound1Match5TeamOne, cBoxRound1Match5TeamTwo);
            match5Box.getChildren().add(0,tFieldMatch5Team1);
            match5Box.getChildren().add(1,tFieldMatch5Team2);
            match5btnBox.getChildren().remove(btnMatch5Save);
            match5btnBox.getChildren().add(0,btnMatch5Edit);

            cBoxRound1Match5.getItems().clear();
            cBoxRound1Match5.getItems().addAll(tFieldMatch5Team1.getText(),tFieldMatch5Team2.getText());
            cBoxRound1Match5.setVisible(true);
            btnRound1Match5Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FIVE----------------------------------------

        //---------------------------------------MATCH SIX--------------------------------------------
        if(event.getSource().equals(btnMatch6Edit))
        {
            match6Box.getChildren().removeAll(tFieldMatch6Team1,tFieldMatch6Team2);
            cBoxRound1Match6TeamOne.setMinSize(175,15);
            cBoxRound1Match6TeamTwo.setMinSize(175,15);
            cBoxRound1Match6TeamOne.setValue(tFieldMatch6Team1.getText());
            cBoxRound1Match6TeamTwo.setValue(tFieldMatch6Team2.getText());
            match6Box.getChildren().add(0, cBoxRound1Match6TeamOne);
            match6Box.getChildren().add(1, cBoxRound1Match6TeamTwo);
            cBoxRound1Match6.setVisible(false);
            btnRound1Match6Submit.setVisible(false);


            match6btnBox.getChildren().remove(btnMatch6Edit);
            match6btnBox.getChildren().add(0,btnMatch6Save);


        }
        else if(event.getSource().equals(btnMatch6Save))
        {
            tFieldMatch6Team1.setText(cBoxRound1Match6TeamOne.getValue());
            tFieldMatch6Team2.setText(cBoxRound1Match6TeamTwo.getValue());
            match6Box.getChildren().removeAll(cBoxRound1Match6TeamOne, cBoxRound1Match6TeamTwo);
            match6Box.getChildren().add(0,tFieldMatch6Team1);
            match6Box.getChildren().add(1,tFieldMatch6Team2);
            match6btnBox.getChildren().remove(btnMatch6Save);
            match6btnBox.getChildren().add(0,btnMatch6Edit);

            cBoxRound1Match6.getItems().clear();
            cBoxRound1Match6.getItems().addAll(tFieldMatch6Team1.getText(),tFieldMatch6Team2.getText());
            cBoxRound1Match6.setVisible(true);
            btnRound1Match6Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SIX----------------------------------------

        //---------------------------------------MATCH SEVEN--------------------------------------------
        if(event.getSource().equals(btnMatch7Edit))
        {
            match7Box.getChildren().removeAll(tFieldMatch7Team1,tFieldMatch7Team2);
            cBoxRound1Match7TeamOne.setMinSize(175,15);
            cBoxRound1Match7TeamTwo.setMinSize(175,15);
            cBoxRound1Match7TeamOne.setValue(tFieldMatch7Team1.getText());
            cBoxRound1Match7TeamTwo.setValue(tFieldMatch7Team2.getText());
            match7Box.getChildren().add(0, cBoxRound1Match7TeamOne);
            match7Box.getChildren().add(1, cBoxRound1Match7TeamTwo);
            cBoxRound1Match7.setVisible(false);
            btnRound1Match7Submit.setVisible(false);


            match7btnBox.getChildren().remove(btnMatch7Edit);
            match7btnBox.getChildren().add(0,btnMatch7Save);


        }
        else if(event.getSource().equals(btnMatch7Save))
        {
            tFieldMatch7Team1.setText(cBoxRound1Match7TeamOne.getValue());
            tFieldMatch7Team2.setText(cBoxRound1Match7TeamTwo.getValue());
            match7Box.getChildren().removeAll(cBoxRound1Match7TeamOne, cBoxRound1Match7TeamTwo);
            match7Box.getChildren().add(0,tFieldMatch7Team1);
            match7Box.getChildren().add(1,tFieldMatch7Team2);
            match7btnBox.getChildren().remove(btnMatch7Save);
            match7btnBox.getChildren().add(0,btnMatch7Edit);

            cBoxRound1Match7.getItems().clear();
            cBoxRound1Match7.getItems().addAll(tFieldMatch7Team1.getText(),tFieldMatch7Team2.getText());
            cBoxRound1Match7.setVisible(true);
            btnRound1Match7Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SEVEN----------------------------------------

        //---------------------------------------MATCH EIGHT--------------------------------------------
        if(event.getSource().equals(btnMatch8Edit))
        {
            match8Box.getChildren().removeAll(tFieldMatch8Team1,tFieldMatch8Team2);
            cBoxRound1Match8TeamOne.setMinSize(175,15);
            cBoxRound1Match8TeamTwo.setMinSize(175,15);
            cBoxRound1Match8TeamOne.setValue(tFieldMatch8Team1.getText());
            cBoxRound1Match8TeamTwo.setValue(tFieldMatch8Team2.getText());
            match8Box.getChildren().add(0, cBoxRound1Match8TeamOne);
            match8Box.getChildren().add(1, cBoxRound1Match8TeamTwo);
            cBoxRound1Match8.setVisible(false);
            btnRound1Match8Submit.setVisible(false);


            match8btnBox.getChildren().remove(btnMatch8Edit);
            match8btnBox.getChildren().add(0,btnMatch8Save);


        }
        else if(event.getSource().equals(btnMatch8Save))
        {
            tFieldMatch8Team1.setText(cBoxRound1Match8TeamOne.getValue());
            tFieldMatch8Team2.setText(cBoxRound1Match8TeamTwo.getValue());
            match8Box.getChildren().removeAll(cBoxRound1Match8TeamOne, cBoxRound1Match8TeamTwo);
            match8Box.getChildren().add(0,tFieldMatch8Team1);
            match8Box.getChildren().add(1,tFieldMatch8Team2);
            match8btnBox.getChildren().remove(btnMatch8Save);
            match8btnBox.getChildren().add(0,btnMatch8Edit);

            cBoxRound1Match8.getItems().clear();
            cBoxRound1Match8.getItems().addAll(tFieldMatch8Team1.getText(),tFieldMatch8Team2.getText());
            cBoxRound1Match8.setVisible(true);
            btnRound1Match8Submit.setVisible(true);

        }
        //-------------------------------------END MATCH EIGHT----------------------------------------

        //---------------------------------------MATCH NINE--------------------------------------------
        if(event.getSource().equals(btnMatch9Edit))
        {
            match9Box.getChildren().removeAll(tFieldMatch9Team1,tFieldMatch9Team2);
            cBoxRound1Match9TeamOne.setMinSize(175,15);
            cBoxRound1Match9TeamTwo.setMinSize(175,15);
            cBoxRound1Match9TeamOne.setValue(tFieldMatch9Team1.getText());
            cBoxRound1Match9TeamTwo.setValue(tFieldMatch9Team2.getText());
            match9Box.getChildren().add(0, cBoxRound1Match9TeamOne);
            match9Box.getChildren().add(1, cBoxRound1Match9TeamTwo);
            cBoxRound1Match9.setVisible(false);
            btnRound1Match9Submit.setVisible(false);


            match9btnBox.getChildren().remove(btnMatch9Edit);
            match9btnBox.getChildren().add(0,btnMatch9Save);


        }
        else if(event.getSource().equals(btnMatch9Save))
        {
            tFieldMatch9Team1.setText(cBoxRound1Match9TeamOne.getValue());
            tFieldMatch9Team2.setText(cBoxRound1Match9TeamTwo.getValue());
            match9Box.getChildren().removeAll(cBoxRound1Match9TeamOne, cBoxRound1Match9TeamTwo);
            match9Box.getChildren().add(0,tFieldMatch9Team1);
            match9Box.getChildren().add(1,tFieldMatch9Team2);
            match9btnBox.getChildren().remove(btnMatch9Save);
            match9btnBox.getChildren().add(0,btnMatch9Edit);

            cBoxRound1Match9.getItems().clear();
            cBoxRound1Match9.getItems().addAll(tFieldMatch9Team1.getText(),tFieldMatch9Team2.getText());
            cBoxRound1Match9.setVisible(true);
            btnRound1Match9Submit.setVisible(true);

        }
        //-------------------------------------END MATCH NINE----------------------------------------

        //---------------------------------------MATCH TEN--------------------------------------------
        if(event.getSource().equals(btnMatch10Edit))
        {
            match10Box.getChildren().removeAll(tFieldMatch10Team1,tFieldMatch10Team2);
            cBoxRound1Match10TeamOne.setMinSize(175,15);
            cBoxRound1Match10TeamTwo.setMinSize(175,15);
            cBoxRound1Match10TeamOne.setValue(tFieldMatch10Team1.getText());
            cBoxRound1Match10TeamTwo.setValue(tFieldMatch10Team2.getText());
            match10Box.getChildren().add(0, cBoxRound1Match10TeamOne);
            match10Box.getChildren().add(1, cBoxRound1Match10TeamTwo);
            cBoxRound1Match10.setVisible(false);
            btnRound1Match10Submit.setVisible(false);


            match10btnBox.getChildren().remove(btnMatch10Edit);
            match10btnBox.getChildren().add(0,btnMatch10Save);


        }
        else if(event.getSource().equals(btnMatch10Save))
        {
            tFieldMatch10Team1.setText(cBoxRound1Match10TeamOne.getValue());
            tFieldMatch10Team2.setText(cBoxRound1Match10TeamTwo.getValue());
            match10Box.getChildren().removeAll(cBoxRound1Match10TeamOne, cBoxRound1Match10TeamTwo);
            match10Box.getChildren().add(0,tFieldMatch10Team1);
            match10Box.getChildren().add(1,tFieldMatch10Team2);
            match10btnBox.getChildren().remove(btnMatch10Save);
            match10btnBox.getChildren().add(0,btnMatch10Edit);

            cBoxRound1Match10.getItems().clear();
            cBoxRound1Match10.getItems().addAll(tFieldMatch10Team1.getText(),tFieldMatch10Team2.getText());
            cBoxRound1Match10.setVisible(true);
            btnRound1Match10Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TEN----------------------------------------

        //---------------------------------------MATCH ELEVEN--------------------------------------------
        if(event.getSource().equals(btnMatch11Edit))
        {
            match11Box.getChildren().removeAll(tFieldMatch11Team1,tFieldMatch11Team2);
            cBoxRound1Match11TeamOne.setMinSize(175,15);
            cBoxRound1Match11TeamTwo.setMinSize(175,15);
            cBoxRound1Match11TeamOne.setValue(tFieldMatch11Team1.getText());
            cBoxRound1Match11TeamTwo.setValue(tFieldMatch11Team2.getText());
            match11Box.getChildren().add(0, cBoxRound1Match11TeamOne);
            match11Box.getChildren().add(1, cBoxRound1Match11TeamTwo);
            cBoxRound1Match11.setVisible(false);
            btnRound1Match11Submit.setVisible(false);


            match11btnBox.getChildren().remove(btnMatch11Edit);
            match11btnBox.getChildren().add(0,btnMatch11Save);


        }
        else if(event.getSource().equals(btnMatch11Save))
        {
            tFieldMatch11Team1.setText(cBoxRound1Match11TeamOne.getValue());
            tFieldMatch11Team2.setText(cBoxRound1Match11TeamTwo.getValue());
            match11Box.getChildren().removeAll(cBoxRound1Match11TeamOne, cBoxRound1Match11TeamTwo);
            match11Box.getChildren().add(0,tFieldMatch11Team1);
            match11Box.getChildren().add(1,tFieldMatch11Team2);
            match11btnBox.getChildren().remove(btnMatch11Save);
            match11btnBox.getChildren().add(0,btnMatch11Edit);

            cBoxRound1Match11.getItems().clear();
            cBoxRound1Match11.getItems().addAll(tFieldMatch11Team1.getText(),tFieldMatch11Team2.getText());
            cBoxRound1Match11.setVisible(true);
            btnRound1Match11Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ELEVEN----------------------------------------

        //---------------------------------------MATCH TWELVE--------------------------------------------
        if(event.getSource().equals(btnMatch12Edit))
        {
            match12Box.getChildren().removeAll(tFieldMatch12Team1,tFieldMatch12Team2);
            cBoxRound1Match12TeamOne.setMinSize(175,15);
            cBoxRound1Match12TeamTwo.setMinSize(175,15);
            cBoxRound1Match12TeamOne.setValue(tFieldMatch12Team1.getText());
            cBoxRound1Match12TeamTwo.setValue(tFieldMatch12Team2.getText());
            match12Box.getChildren().add(0, cBoxRound1Match12TeamOne);
            match12Box.getChildren().add(1, cBoxRound1Match12TeamTwo);
            cBoxRound1Match12.setVisible(false);
            btnRound1Match12Submit.setVisible(false);


            match12btnBox.getChildren().remove(btnMatch12Edit);
            match12btnBox.getChildren().add(0,btnMatch12Save);


        }
        else if(event.getSource().equals(btnMatch12Save))
        {
            tFieldMatch12Team1.setText(cBoxRound1Match12TeamOne.getValue());
            tFieldMatch12Team2.setText(cBoxRound1Match12TeamTwo.getValue());
            match12Box.getChildren().removeAll(cBoxRound1Match12TeamOne, cBoxRound1Match12TeamTwo);
            match12Box.getChildren().add(0,tFieldMatch12Team1);
            match12Box.getChildren().add(1,tFieldMatch12Team2);
            match12btnBox.getChildren().remove(btnMatch12Save);
            match12btnBox.getChildren().add(0,btnMatch12Edit);

            cBoxRound1Match12.getItems().clear();
            cBoxRound1Match12.getItems().addAll(tFieldMatch12Team1.getText(),tFieldMatch12Team2.getText());
            cBoxRound1Match12.setVisible(true);
            btnRound1Match12Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWELVE----------------------------------------

        //---------------------------------------MATCH THIRTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch13Edit))
        {
            match13Box.getChildren().removeAll(tFieldMatch13Team1,tFieldMatch13Team2);
            cBoxRound1Match13TeamOne.setMinSize(175,15);
            cBoxRound1Match13TeamTwo.setMinSize(175,15);
            cBoxRound1Match13TeamOne.setValue(tFieldMatch13Team1.getText());
            cBoxRound1Match13TeamTwo.setValue(tFieldMatch13Team2.getText());
            match13Box.getChildren().add(0, cBoxRound1Match13TeamOne);
            match13Box.getChildren().add(1, cBoxRound1Match13TeamTwo);
            cBoxRound1Match13.setVisible(false);
            btnRound1Match13Submit.setVisible(false);


            match13btnBox.getChildren().remove(btnMatch13Edit);
            match13btnBox.getChildren().add(0,btnMatch13Save);


        }
        else if(event.getSource().equals(btnMatch13Save))
        {
            tFieldMatch13Team1.setText(cBoxRound1Match13TeamOne.getValue());
            tFieldMatch13Team2.setText(cBoxRound1Match13TeamTwo.getValue());
            match13Box.getChildren().removeAll(cBoxRound1Match13TeamOne, cBoxRound1Match13TeamTwo);
            match13Box.getChildren().add(0,tFieldMatch13Team1);
            match13Box.getChildren().add(1,tFieldMatch13Team2);
            match13btnBox.getChildren().remove(btnMatch13Save);
            match13btnBox.getChildren().add(0,btnMatch13Edit);

            cBoxRound1Match13.getItems().clear();
            cBoxRound1Match13.getItems().addAll(tFieldMatch13Team1.getText(),tFieldMatch13Team2.getText());
            cBoxRound1Match13.setVisible(true);
            btnRound1Match13Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THIRTEEN----------------------------------------

        //---------------------------------------MATCH FOURTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch14Edit))
        {
            match14Box.getChildren().removeAll(tFieldMatch14Team1,tFieldMatch14Team2);
            cBoxRound1Match14TeamOne.setMinSize(175,15);
            cBoxRound1Match14TeamTwo.setMinSize(175,15);
            cBoxRound1Match14TeamOne.setValue(tFieldMatch14Team1.getText());
            cBoxRound1Match14TeamTwo.setValue(tFieldMatch14Team2.getText());
            match14Box.getChildren().add(0, cBoxRound1Match14TeamOne);
            match14Box.getChildren().add(1, cBoxRound1Match14TeamTwo);
            cBoxRound1Match14.setVisible(false);
            btnRound1Match14Submit.setVisible(false);


            match14btnBox.getChildren().remove(btnMatch14Edit);
            match14btnBox.getChildren().add(0,btnMatch14Save);


        }
        else if(event.getSource().equals(btnMatch14Save))
        {
            tFieldMatch14Team1.setText(cBoxRound1Match14TeamOne.getValue());
            tFieldMatch14Team2.setText(cBoxRound1Match14TeamTwo.getValue());
            match14Box.getChildren().removeAll(cBoxRound1Match14TeamOne, cBoxRound1Match14TeamTwo);
            match14Box.getChildren().add(0,tFieldMatch14Team1);
            match14Box.getChildren().add(1,tFieldMatch14Team2);
            match14btnBox.getChildren().remove(btnMatch14Save);
            match14btnBox.getChildren().add(0,btnMatch14Edit);

            cBoxRound1Match14.getItems().clear();
            cBoxRound1Match14.getItems().addAll(tFieldMatch14Team1.getText(),tFieldMatch14Team2.getText());
            cBoxRound1Match14.setVisible(true);
            btnRound1Match14Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FOURTEEN----------------------------------------

        //---------------------------------------MATCH FIFTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch15Edit))
        {
            match15Box.getChildren().removeAll(tFieldMatch15Team1,tFieldMatch15Team2);
            cBoxRound1Match15TeamOne.setMinSize(175,15);
            cBoxRound1Match15TeamTwo.setMinSize(175,15);
            cBoxRound1Match15TeamOne.setValue(tFieldMatch15Team1.getText());
            cBoxRound1Match15TeamTwo.setValue(tFieldMatch15Team2.getText());
            match15Box.getChildren().add(0, cBoxRound1Match15TeamOne);
            match15Box.getChildren().add(1, cBoxRound1Match15TeamTwo);
            cBoxRound1Match15.setVisible(false);
            btnRound1Match15Submit.setVisible(false);


            match15btnBox.getChildren().remove(btnMatch15Edit);
            match15btnBox.getChildren().add(0,btnMatch15Save);


        }
        else if(event.getSource().equals(btnMatch15Save))
        {
            tFieldMatch15Team1.setText(cBoxRound1Match15TeamOne.getValue());
            tFieldMatch15Team2.setText(cBoxRound1Match15TeamTwo.getValue());
            match15Box.getChildren().removeAll(cBoxRound1Match15TeamOne, cBoxRound1Match15TeamTwo);
            match15Box.getChildren().add(0,tFieldMatch15Team1);
            match15Box.getChildren().add(1,tFieldMatch15Team2);
            match15btnBox.getChildren().remove(btnMatch15Save);
            match15btnBox.getChildren().add(0,btnMatch15Edit);

            cBoxRound1Match15.getItems().clear();
            cBoxRound1Match15.getItems().addAll(tFieldMatch15Team1.getText(),tFieldMatch15Team2.getText());
            cBoxRound1Match15.setVisible(true);
            btnRound1Match15Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FIFTEEN----------------------------------------

        //---------------------------------------MATCH SIXTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch16Edit))
        {
            match16Box.getChildren().removeAll(tFieldMatch16Team1,tFieldMatch16Team2);
            cBoxRound1Match16TeamOne.setMinSize(175,15);
            cBoxRound1Match16TeamTwo.setMinSize(175,15);
            cBoxRound1Match16TeamOne.setValue(tFieldMatch16Team1.getText());
            cBoxRound1Match16TeamTwo.setValue(tFieldMatch16Team2.getText());
            match16Box.getChildren().add(0, cBoxRound1Match16TeamOne);
            match16Box.getChildren().add(1, cBoxRound1Match16TeamTwo);
            cBoxRound1Match16.setVisible(false);
            btnRound1Match16Submit.setVisible(false);


            match16btnBox.getChildren().remove(btnMatch16Edit);
            match16btnBox.getChildren().add(0,btnMatch16Save);


        }
        else if(event.getSource().equals(btnMatch16Save))
        {
            tFieldMatch16Team1.setText(cBoxRound1Match16TeamOne.getValue());
            tFieldMatch16Team2.setText(cBoxRound1Match16TeamTwo.getValue());
            match16Box.getChildren().removeAll(cBoxRound1Match16TeamOne, cBoxRound1Match16TeamTwo);
            match16Box.getChildren().add(0,tFieldMatch16Team1);
            match16Box.getChildren().add(1,tFieldMatch16Team2);
            match16btnBox.getChildren().remove(btnMatch16Save);
            match16btnBox.getChildren().add(0,btnMatch16Edit);

            cBoxRound1Match16.getItems().clear();
            cBoxRound1Match16.getItems().addAll(tFieldMatch16Team1.getText(),tFieldMatch16Team2.getText());
            cBoxRound1Match16.setVisible(true);
            btnRound1Match16Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SIXTEEN----------------------------------------

        //---------------------------------------MATCH SIXTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch16Edit))
        {
            match16Box.getChildren().removeAll(tFieldMatch16Team1,tFieldMatch16Team2);
            cBoxRound1Match16TeamOne.setMinSize(175,15);
            cBoxRound1Match16TeamTwo.setMinSize(175,15);
            cBoxRound1Match16TeamOne.setValue(tFieldMatch16Team1.getText());
            cBoxRound1Match16TeamTwo.setValue(tFieldMatch16Team2.getText());
            match16Box.getChildren().add(0, cBoxRound1Match16TeamOne);
            match16Box.getChildren().add(1, cBoxRound1Match16TeamTwo);
            cBoxRound1Match16.setVisible(false);
            btnRound1Match16Submit.setVisible(false);


            match16btnBox.getChildren().remove(btnMatch16Edit);
            match16btnBox.getChildren().add(0,btnMatch16Save);


        }
        else if(event.getSource().equals(btnMatch16Save))
        {
            tFieldMatch16Team1.setText(cBoxRound1Match16TeamOne.getValue());
            tFieldMatch16Team2.setText(cBoxRound1Match16TeamTwo.getValue());
            match16Box.getChildren().removeAll(cBoxRound1Match16TeamOne, cBoxRound1Match16TeamTwo);
            match16Box.getChildren().add(0,tFieldMatch16Team1);
            match16Box.getChildren().add(1,tFieldMatch16Team2);
            match16btnBox.getChildren().remove(btnMatch16Save);
            match16btnBox.getChildren().add(0,btnMatch16Edit);

            cBoxRound1Match16.getItems().clear();
            cBoxRound1Match16.getItems().addAll(tFieldMatch16Team1.getText(),tFieldMatch16Team2.getText());
            cBoxRound1Match16.setVisible(true);
            btnRound1Match16Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SIXTEEN----------------------------------------

        //---------------------------------------MATCH SEVENTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch17Edit))
        {
            match17Box.getChildren().removeAll(tFieldMatch17Team1,tFieldMatch17Team2);
            cBoxRound1Match17TeamOne.setMinSize(175,15);
            cBoxRound1Match17TeamTwo.setMinSize(175,15);
            cBoxRound1Match17TeamOne.setValue(tFieldMatch17Team1.getText());
            cBoxRound1Match17TeamTwo.setValue(tFieldMatch17Team2.getText());
            match17Box.getChildren().add(0, cBoxRound1Match17TeamOne);
            match17Box.getChildren().add(1, cBoxRound1Match17TeamTwo);
            cBoxRound1Match17.setVisible(false);
            btnRound1Match17Submit.setVisible(false);


            match17btnBox.getChildren().remove(btnMatch17Edit);
            match17btnBox.getChildren().add(0,btnMatch17Save);


        }
        else if(event.getSource().equals(btnMatch17Save))
        {
            tFieldMatch17Team1.setText(cBoxRound1Match17TeamOne.getValue());
            tFieldMatch17Team2.setText(cBoxRound1Match17TeamTwo.getValue());
            match17Box.getChildren().removeAll(cBoxRound1Match17TeamOne, cBoxRound1Match17TeamTwo);
            match17Box.getChildren().add(0,tFieldMatch17Team1);
            match17Box.getChildren().add(1,tFieldMatch17Team2);
            match17btnBox.getChildren().remove(btnMatch17Save);
            match17btnBox.getChildren().add(0,btnMatch17Edit);

            cBoxRound1Match17.getItems().clear();
            cBoxRound1Match17.getItems().addAll(tFieldMatch17Team1.getText(),tFieldMatch17Team2.getText());
            cBoxRound1Match17.setVisible(true);
            btnRound1Match17Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SEVENTEEN----------------------------------------

        //---------------------------------------MATCH EIGHTEEN--------------------------------------------
        if(event.getSource().equals(btnMatch18Edit))
        {
            match18Box.getChildren().removeAll(tFieldMatch18Team1,tFieldMatch18Team2);
            cBoxRound1Match18TeamOne.setMinSize(175,15);
            cBoxRound1Match18TeamTwo.setMinSize(175,15);
            cBoxRound1Match18TeamOne.setValue(tFieldMatch18Team1.getText());
            cBoxRound1Match18TeamTwo.setValue(tFieldMatch18Team2.getText());
            match18Box.getChildren().add(0, cBoxRound1Match18TeamOne);
            match18Box.getChildren().add(1, cBoxRound1Match18TeamTwo);
            cBoxRound1Match18.setVisible(false);
            btnRound1Match18Submit.setVisible(false);


            match18btnBox.getChildren().remove(btnMatch18Edit);
            match18btnBox.getChildren().add(0,btnMatch18Save);


        }
        else if(event.getSource().equals(btnMatch18Save))
        {
            tFieldMatch18Team1.setText(cBoxRound1Match18TeamOne.getValue());
            tFieldMatch18Team2.setText(cBoxRound1Match18TeamTwo.getValue());
            match18Box.getChildren().removeAll(cBoxRound1Match18TeamOne, cBoxRound1Match18TeamTwo);
            match18Box.getChildren().add(0,tFieldMatch18Team1);
            match18Box.getChildren().add(1,tFieldMatch18Team2);
            match18btnBox.getChildren().remove(btnMatch18Save);
            match18btnBox.getChildren().add(0,btnMatch18Edit);

            cBoxRound1Match18.getItems().clear();
            cBoxRound1Match18.getItems().addAll(tFieldMatch18Team1.getText(),tFieldMatch18Team2.getText());
            cBoxRound1Match18.setVisible(true);
            btnRound1Match18Submit.setVisible(true);

        }
        //-------------------------------------END MATCH EIGHTEEN----------------------------------------

        //---------------------------------------MATCH NINETEEN--------------------------------------------
        if(event.getSource().equals(btnMatch19Edit))
        {
            match19Box.getChildren().removeAll(tFieldMatch19Team1,tFieldMatch19Team2);
            cBoxRound1Match19TeamOne.setMinSize(175,15);
            cBoxRound1Match19TeamTwo.setMinSize(175,15);
            cBoxRound1Match19TeamOne.setValue(tFieldMatch19Team1.getText());
            cBoxRound1Match19TeamTwo.setValue(tFieldMatch19Team2.getText());
            match19Box.getChildren().add(0, cBoxRound1Match19TeamOne);
            match19Box.getChildren().add(1, cBoxRound1Match19TeamTwo);
            cBoxRound1Match19.setVisible(false);
            btnRound1Match19Submit.setVisible(false);


            match19btnBox.getChildren().remove(btnMatch19Edit);
            match19btnBox.getChildren().add(0,btnMatch19Save);


        }
        else if(event.getSource().equals(btnMatch19Save))
        {
            tFieldMatch19Team1.setText(cBoxRound1Match19TeamOne.getValue());
            tFieldMatch19Team2.setText(cBoxRound1Match19TeamTwo.getValue());
            match19Box.getChildren().removeAll(cBoxRound1Match19TeamOne, cBoxRound1Match19TeamTwo);
            match19Box.getChildren().add(0,tFieldMatch19Team1);
            match19Box.getChildren().add(1,tFieldMatch19Team2);
            match19btnBox.getChildren().remove(btnMatch19Save);
            match19btnBox.getChildren().add(0,btnMatch19Edit);

            cBoxRound1Match19.getItems().clear();
            cBoxRound1Match19.getItems().addAll(tFieldMatch19Team1.getText(),tFieldMatch19Team2.getText());
            cBoxRound1Match19.setVisible(true);
            btnRound1Match19Submit.setVisible(true);

        }
        //-------------------------------------END MATCH NINETEEN----------------------------------------

        //---------------------------------------MATCH TWENTY--------------------------------------------
        if(event.getSource().equals(btnMatch20Edit))
        {
            match20Box.getChildren().removeAll(tFieldMatch20Team1,tFieldMatch20Team2);
            cBoxRound1Match20TeamOne.setMinSize(175,15);
            cBoxRound1Match20TeamTwo.setMinSize(175,15);
            cBoxRound1Match20TeamOne.setValue(tFieldMatch20Team1.getText());
            cBoxRound1Match20TeamTwo.setValue(tFieldMatch20Team2.getText());
            match20Box.getChildren().add(0, cBoxRound1Match20TeamOne);
            match20Box.getChildren().add(1, cBoxRound1Match20TeamTwo);
            cBoxRound1Match20.setVisible(false);
            btnRound1Match20Submit.setVisible(false);


            match20btnBox.getChildren().remove(btnMatch20Edit);
            match20btnBox.getChildren().add(0,btnMatch20Save);


        }
        else if(event.getSource().equals(btnMatch20Save))
        {
            tFieldMatch20Team1.setText(cBoxRound1Match20TeamOne.getValue());
            tFieldMatch20Team2.setText(cBoxRound1Match20TeamTwo.getValue());
            match20Box.getChildren().removeAll(cBoxRound1Match20TeamOne, cBoxRound1Match20TeamTwo);
            match20Box.getChildren().add(0,tFieldMatch20Team1);
            match20Box.getChildren().add(1,tFieldMatch20Team2);
            match20btnBox.getChildren().remove(btnMatch20Save);
            match20btnBox.getChildren().add(0,btnMatch20Edit);

            cBoxRound1Match20.getItems().clear();
            cBoxRound1Match20.getItems().addAll(tFieldMatch20Team1.getText(),tFieldMatch20Team2.getText());
            cBoxRound1Match20.setVisible(true);
            btnRound1Match20Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY----------------------------------------

        //---------------------------------------MATCH TWENTYONE--------------------------------------------
        if(event.getSource().equals(btnMatch21Edit))
        {
            match21Box.getChildren().removeAll(tFieldMatch21Team1,tFieldMatch21Team2);
            cBoxRound1Match21TeamOne.setMinSize(175,15);
            cBoxRound1Match21TeamTwo.setMinSize(175,15);
            cBoxRound1Match21TeamOne.setValue(tFieldMatch21Team1.getText());
            cBoxRound1Match21TeamTwo.setValue(tFieldMatch21Team2.getText());
            match21Box.getChildren().add(0, cBoxRound1Match21TeamOne);
            match21Box.getChildren().add(1, cBoxRound1Match21TeamTwo);
            cBoxRound1Match21.setVisible(false);
            btnRound1Match21Submit.setVisible(false);


            match21btnBox.getChildren().remove(btnMatch21Edit);
            match21btnBox.getChildren().add(0,btnMatch21Save);


        }
        else if(event.getSource().equals(btnMatch21Save))
        {
            tFieldMatch21Team1.setText(cBoxRound1Match21TeamOne.getValue());
            tFieldMatch21Team2.setText(cBoxRound1Match21TeamTwo.getValue());
            match21Box.getChildren().removeAll(cBoxRound1Match21TeamOne, cBoxRound1Match21TeamTwo);
            match21Box.getChildren().add(0,tFieldMatch21Team1);
            match21Box.getChildren().add(1,tFieldMatch21Team2);
            match21btnBox.getChildren().remove(btnMatch21Save);
            match21btnBox.getChildren().add(0,btnMatch21Edit);

            cBoxRound1Match21.getItems().clear();
            cBoxRound1Match21.getItems().addAll(tFieldMatch21Team1.getText(),tFieldMatch21Team2.getText());
            cBoxRound1Match21.setVisible(true);
            btnRound1Match19Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTYONE----------------------------------------

        //---------------------------------------MATCH TWENTY-TWO--------------------------------------------
        if(event.getSource().equals(btnMatch22Edit))
        {
            match22Box.getChildren().removeAll(tFieldMatch22Team1,tFieldMatch22Team2);
            cBoxRound1Match22TeamOne.setMinSize(175,15);
            cBoxRound1Match22TeamTwo.setMinSize(175,15);
            cBoxRound1Match22TeamOne.setValue(tFieldMatch22Team1.getText());
            cBoxRound1Match22TeamTwo.setValue(tFieldMatch22Team2.getText());
            match22Box.getChildren().add(0, cBoxRound1Match22TeamOne);
            match22Box.getChildren().add(1, cBoxRound1Match22TeamTwo);
            cBoxRound1Match22.setVisible(false);
            btnRound1Match22Submit.setVisible(false);


            match22btnBox.getChildren().remove(btnMatch22Edit);
            match22btnBox.getChildren().add(0,btnMatch22Save);


        }
        else if(event.getSource().equals(btnMatch22Save))
        {
            tFieldMatch22Team1.setText(cBoxRound1Match22TeamOne.getValue());
            tFieldMatch22Team2.setText(cBoxRound1Match22TeamTwo.getValue());
            match22Box.getChildren().removeAll(cBoxRound1Match22TeamOne, cBoxRound1Match22TeamTwo);
            match22Box.getChildren().add(0,tFieldMatch22Team1);
            match22Box.getChildren().add(1,tFieldMatch22Team2);
            match22btnBox.getChildren().remove(btnMatch22Save);
            match22btnBox.getChildren().add(0,btnMatch22Edit);

            cBoxRound1Match22.getItems().clear();
            cBoxRound1Match22.getItems().addAll(tFieldMatch22Team1.getText(),tFieldMatch22Team2.getText());
            cBoxRound1Match22.setVisible(true);
            btnRound1Match19Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-TWO----------------------------------------

        //---------------------------------------MATCH TWENTY-THREE--------------------------------------------
        if(event.getSource().equals(btnMatch23Edit))
        {
            match23Box.getChildren().removeAll(tFieldMatch23Team1,tFieldMatch23Team2);
            cBoxRound1Match23TeamOne.setMinSize(175,15);
            cBoxRound1Match23TeamTwo.setMinSize(175,15);
            cBoxRound1Match23TeamOne.setValue(tFieldMatch23Team1.getText());
            cBoxRound1Match23TeamTwo.setValue(tFieldMatch23Team2.getText());
            match23Box.getChildren().add(0, cBoxRound1Match23TeamOne);
            match23Box.getChildren().add(1, cBoxRound1Match23TeamTwo);
            cBoxRound1Match23.setVisible(false);
            btnRound1Match23Submit.setVisible(false);


            match23btnBox.getChildren().remove(btnMatch23Edit);
            match23btnBox.getChildren().add(0,btnMatch23Save);


        }
        else if(event.getSource().equals(btnMatch23Save))
        {
            tFieldMatch23Team1.setText(cBoxRound1Match23TeamOne.getValue());
            tFieldMatch23Team2.setText(cBoxRound1Match23TeamTwo.getValue());
            match23Box.getChildren().removeAll(cBoxRound1Match23TeamOne, cBoxRound1Match23TeamTwo);
            match23Box.getChildren().add(0,tFieldMatch23Team1);
            match23Box.getChildren().add(1,tFieldMatch23Team2);
            match23btnBox.getChildren().remove(btnMatch23Save);
            match23btnBox.getChildren().add(0,btnMatch23Edit);

            cBoxRound1Match23.getItems().clear();
            cBoxRound1Match23.getItems().addAll(tFieldMatch23Team1.getText(),tFieldMatch23Team2.getText());
            cBoxRound1Match23.setVisible(true);
            btnRound1Match19Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-THREE----------------------------------------

        //---------------------------------------MATCH TWENTY-FOUR--------------------------------------------
        if(event.getSource().equals(btnMatch24Edit))
        {
            match24Box.getChildren().removeAll(tFieldMatch24Team1,tFieldMatch24Team2);
            cBoxRound1Match24TeamOne.setMinSize(175,15);
            cBoxRound1Match24TeamTwo.setMinSize(175,15);
            cBoxRound1Match24TeamOne.setValue(tFieldMatch24Team1.getText());
            cBoxRound1Match24TeamTwo.setValue(tFieldMatch24Team2.getText());
            match24Box.getChildren().add(0, cBoxRound1Match24TeamOne);
            match24Box.getChildren().add(1, cBoxRound1Match24TeamTwo);
            cBoxRound1Match24.setVisible(false);
            btnRound1Match24Submit.setVisible(false);


            match24btnBox.getChildren().remove(btnMatch24Edit);
            match24btnBox.getChildren().add(0,btnMatch24Save);


        }
        else if(event.getSource().equals(btnMatch24Save))
        {
            tFieldMatch24Team1.setText(cBoxRound1Match24TeamOne.getValue());
            tFieldMatch24Team2.setText(cBoxRound1Match24TeamTwo.getValue());
            match24Box.getChildren().removeAll(cBoxRound1Match24TeamOne, cBoxRound1Match24TeamTwo);
            match24Box.getChildren().add(0,tFieldMatch24Team1);
            match24Box.getChildren().add(1,tFieldMatch24Team2);
            match24btnBox.getChildren().remove(btnMatch24Save);
            match24btnBox.getChildren().add(0,btnMatch24Edit);

            cBoxRound1Match24.getItems().clear();
            cBoxRound1Match24.getItems().addAll(tFieldMatch24Team1.getText(),tFieldMatch24Team2.getText());
            cBoxRound1Match24.setVisible(true);
            btnRound1Match24Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-FOUR----------------------------------------

        //---------------------------------------MATCH TWENTY-FIVE--------------------------------------------
        if(event.getSource().equals(btnMatch25Edit))
        {
            match25Box.getChildren().removeAll(tFieldMatch25Team1,tFieldMatch25Team2);
            cBoxRound1Match25TeamOne.setMinSize(175,15);
            cBoxRound1Match25TeamTwo.setMinSize(175,15);
            cBoxRound1Match25TeamOne.setValue(tFieldMatch25Team1.getText());
            cBoxRound1Match25TeamTwo.setValue(tFieldMatch25Team2.getText());
            match25Box.getChildren().add(0, cBoxRound1Match25TeamOne);
            match25Box.getChildren().add(1, cBoxRound1Match25TeamTwo);
            cBoxRound1Match25.setVisible(false);
            btnRound1Match25Submit.setVisible(false);


            match25btnBox.getChildren().remove(btnMatch25Edit);
            match25btnBox.getChildren().add(0,btnMatch25Save);


        }
        else if(event.getSource().equals(btnMatch25Save))
        {
            tFieldMatch25Team1.setText(cBoxRound1Match25TeamOne.getValue());
            tFieldMatch25Team2.setText(cBoxRound1Match25TeamTwo.getValue());
            match25Box.getChildren().removeAll(cBoxRound1Match25TeamOne, cBoxRound1Match25TeamTwo);
            match25Box.getChildren().add(0,tFieldMatch25Team1);
            match25Box.getChildren().add(1,tFieldMatch25Team2);
            match25btnBox.getChildren().remove(btnMatch25Save);
            match25btnBox.getChildren().add(0,btnMatch25Edit);

            cBoxRound1Match25.getItems().clear();
            cBoxRound1Match25.getItems().addAll(tFieldMatch25Team1.getText(),tFieldMatch25Team2.getText());
            cBoxRound1Match25.setVisible(true);
            btnRound1Match25Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-FIVE----------------------------------------

        //---------------------------------------MATCH TWENTY-SIX--------------------------------------------
        if(event.getSource().equals(btnMatch26Edit))
        {
            match26Box.getChildren().removeAll(tFieldMatch26Team1,tFieldMatch26Team2);
            cBoxRound1Match26TeamOne.setMinSize(175,15);
            cBoxRound1Match26TeamTwo.setMinSize(175,15);
            cBoxRound1Match26TeamOne.setValue(tFieldMatch26Team1.getText());
            cBoxRound1Match26TeamTwo.setValue(tFieldMatch26Team2.getText());
            match26Box.getChildren().add(0, cBoxRound1Match26TeamOne);
            match26Box.getChildren().add(1, cBoxRound1Match26TeamTwo);
            cBoxRound1Match26.setVisible(false);
            btnRound1Match26Submit.setVisible(false);


            match26btnBox.getChildren().remove(btnMatch26Edit);
            match26btnBox.getChildren().add(0,btnMatch26Save);


        }
        else if(event.getSource().equals(btnMatch26Save))
        {
            tFieldMatch26Team1.setText(cBoxRound1Match26TeamOne.getValue());
            tFieldMatch26Team2.setText(cBoxRound1Match26TeamTwo.getValue());
            match26Box.getChildren().removeAll(cBoxRound1Match26TeamOne, cBoxRound1Match26TeamTwo);
            match26Box.getChildren().add(0,tFieldMatch26Team1);
            match26Box.getChildren().add(1,tFieldMatch26Team2);
            match26btnBox.getChildren().remove(btnMatch26Save);
            match26btnBox.getChildren().add(0,btnMatch26Edit);

            cBoxRound1Match26.getItems().clear();
            cBoxRound1Match26.getItems().addAll(tFieldMatch26Team1.getText(),tFieldMatch26Team2.getText());
            cBoxRound1Match26.setVisible(true);
            btnRound1Match19Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-SIX----------------------------------------

        //---------------------------------------MATCH TWENTY-SEVEN--------------------------------------------
        if(event.getSource().equals(btnMatch27Edit))
        {
            match27Box.getChildren().removeAll(tFieldMatch27Team1,tFieldMatch27Team2);
            cBoxRound1Match27TeamOne.setMinSize(175,15);
            cBoxRound1Match27TeamTwo.setMinSize(175,15);
            cBoxRound1Match27TeamOne.setValue(tFieldMatch27Team1.getText());
            cBoxRound1Match27TeamTwo.setValue(tFieldMatch27Team2.getText());
            match27Box.getChildren().add(0, cBoxRound1Match27TeamOne);
            match27Box.getChildren().add(1, cBoxRound1Match27TeamTwo);
            cBoxRound1Match27.setVisible(false);
            btnRound1Match27Submit.setVisible(false);


            match27btnBox.getChildren().remove(btnMatch27Edit);
            match27btnBox.getChildren().add(0,btnMatch27Save);


        }
        else if(event.getSource().equals(btnMatch27Save))
        {
            tFieldMatch27Team1.setText(cBoxRound1Match27TeamOne.getValue());
            tFieldMatch27Team2.setText(cBoxRound1Match27TeamTwo.getValue());
            match27Box.getChildren().removeAll(cBoxRound1Match27TeamOne, cBoxRound1Match27TeamTwo);
            match27Box.getChildren().add(0,tFieldMatch27Team1);
            match27Box.getChildren().add(1,tFieldMatch27Team2);
            match27btnBox.getChildren().remove(btnMatch27Save);
            match27btnBox.getChildren().add(0,btnMatch27Edit);

            cBoxRound1Match27.getItems().clear();
            cBoxRound1Match27.getItems().addAll(tFieldMatch27Team1.getText(),tFieldMatch27Team2.getText());
            cBoxRound1Match27.setVisible(true);
            btnRound1Match27Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-SEVEN----------------------------------------

        //---------------------------------------MATCH TWENTY-EIGHT--------------------------------------------
        if(event.getSource().equals(btnMatch28Edit))
        {
            match28Box.getChildren().removeAll(tFieldMatch28Team1,tFieldMatch28Team2);
            cBoxRound1Match28TeamOne.setMinSize(175,15);
            cBoxRound1Match28TeamTwo.setMinSize(175,15);
            cBoxRound1Match28TeamOne.setValue(tFieldMatch28Team1.getText());
            cBoxRound1Match28TeamTwo.setValue(tFieldMatch28Team2.getText());
            match28Box.getChildren().add(0, cBoxRound1Match28TeamOne);
            match28Box.getChildren().add(1, cBoxRound1Match28TeamTwo);
            cBoxRound1Match28.setVisible(false);
            btnRound1Match28Submit.setVisible(false);


            match28btnBox.getChildren().remove(btnMatch28Edit);
            match28btnBox.getChildren().add(0,btnMatch28Save);


        }
        else if(event.getSource().equals(btnMatch28Save))
        {
            tFieldMatch28Team1.setText(cBoxRound1Match28TeamOne.getValue());
            tFieldMatch28Team2.setText(cBoxRound1Match28TeamTwo.getValue());
            match28Box.getChildren().removeAll(cBoxRound1Match28TeamOne, cBoxRound1Match28TeamTwo);
            match28Box.getChildren().add(0,tFieldMatch28Team1);
            match28Box.getChildren().add(1,tFieldMatch28Team2);
            match28btnBox.getChildren().remove(btnMatch28Save);
            match28btnBox.getChildren().add(0,btnMatch28Edit);

            cBoxRound1Match28.getItems().clear();
            cBoxRound1Match28.getItems().addAll(tFieldMatch28Team1.getText(),tFieldMatch28Team2.getText());
            cBoxRound1Match28.setVisible(true);
            btnRound1Match28Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-EIGHT----------------------------------------

        //---------------------------------------MATCH TWENTY-NINE--------------------------------------------
        if(event.getSource().equals(btnMatch29Edit))
        {
            match29Box.getChildren().removeAll(tFieldMatch29Team1,tFieldMatch29Team2);
            cBoxRound1Match29TeamOne.setMinSize(175,15);
            cBoxRound1Match29TeamTwo.setMinSize(175,15);
            cBoxRound1Match29TeamOne.setValue(tFieldMatch29Team1.getText());
            cBoxRound1Match29TeamTwo.setValue(tFieldMatch29Team2.getText());
            match29Box.getChildren().add(0, cBoxRound1Match29TeamOne);
            match29Box.getChildren().add(1, cBoxRound1Match29TeamTwo);
            cBoxRound1Match29.setVisible(false);
            btnRound1Match29Submit.setVisible(false);


            match29btnBox.getChildren().remove(btnMatch29Edit);
            match29btnBox.getChildren().add(0,btnMatch29Save);


        }
        else if(event.getSource().equals(btnMatch29Save))
        {
            tFieldMatch29Team1.setText(cBoxRound1Match29TeamOne.getValue());
            tFieldMatch29Team2.setText(cBoxRound1Match29TeamTwo.getValue());
            match29Box.getChildren().removeAll(cBoxRound1Match29TeamOne, cBoxRound1Match29TeamTwo);
            match29Box.getChildren().add(0,tFieldMatch29Team1);
            match29Box.getChildren().add(1,tFieldMatch29Team2);
            match29btnBox.getChildren().remove(btnMatch29Save);
            match29btnBox.getChildren().add(0,btnMatch29Edit);

            cBoxRound1Match29.getItems().clear();
            cBoxRound1Match29.getItems().addAll(tFieldMatch29Team1.getText(),tFieldMatch29Team2.getText());
            cBoxRound1Match29.setVisible(true);
            btnRound1Match29Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWENTY-NINE----------------------------------------

        //---------------------------------------MATCH THIRTY--------------------------------------------
        if(event.getSource().equals(btnMatch30Edit))
        {
            match30Box.getChildren().removeAll(tFieldMatch30Team1,tFieldMatch30Team2);
            cBoxRound1Match30TeamOne.setMinSize(175,15);
            cBoxRound1Match30TeamTwo.setMinSize(175,15);
            cBoxRound1Match30TeamOne.setValue(tFieldMatch30Team1.getText());
            cBoxRound1Match30TeamTwo.setValue(tFieldMatch30Team2.getText());
            match30Box.getChildren().add(0, cBoxRound1Match30TeamOne);
            match30Box.getChildren().add(1, cBoxRound1Match30TeamTwo);
            cBoxRound1Match30.setVisible(false);
            btnRound1Match30Submit.setVisible(false);


            match30btnBox.getChildren().remove(btnMatch30Edit);
            match30btnBox.getChildren().add(0,btnMatch30Save);


        }
        else if(event.getSource().equals(btnMatch30Save))
        {
            tFieldMatch30Team1.setText(cBoxRound1Match30TeamOne.getValue());
            tFieldMatch30Team2.setText(cBoxRound1Match30TeamTwo.getValue());
            match30Box.getChildren().removeAll(cBoxRound1Match30TeamOne, cBoxRound1Match30TeamTwo);
            match30Box.getChildren().add(0,tFieldMatch30Team1);
            match30Box.getChildren().add(1,tFieldMatch30Team2);
            match30btnBox.getChildren().remove(btnMatch30Save);
            match30btnBox.getChildren().add(0,btnMatch30Edit);

            cBoxRound1Match30.getItems().clear();
            cBoxRound1Match30.getItems().addAll(tFieldMatch30Team1.getText(),tFieldMatch30Team2.getText());
            cBoxRound1Match30.setVisible(true);
            btnRound1Match30Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THIRTY----------------------------------------

        //---------------------------------------MATCH THIRTY ONE--------------------------------------------
        if(event.getSource().equals(btnMatch31Edit))
        {
            match31Box.getChildren().removeAll(tFieldMatch31Team1,tFieldMatch31Team2);
            cBoxRound1Match31TeamOne.setMinSize(175,15);
            cBoxRound1Match31TeamTwo.setMinSize(175,15);
            cBoxRound1Match31TeamOne.setValue(tFieldMatch31Team1.getText());
            cBoxRound1Match31TeamTwo.setValue(tFieldMatch31Team2.getText());
            match31Box.getChildren().add(0, cBoxRound1Match31TeamOne);
            match31Box.getChildren().add(1, cBoxRound1Match31TeamTwo);
            cBoxRound1Match31.setVisible(false);
            btnRound1Match31Submit.setVisible(false);


            match31btnBox.getChildren().remove(btnMatch31Edit);
            match31btnBox.getChildren().add(0,btnMatch31Save);


        }
        else if(event.getSource().equals(btnMatch31Save))
        {
            tFieldMatch31Team1.setText(cBoxRound1Match31TeamOne.getValue());
            tFieldMatch31Team2.setText(cBoxRound1Match31TeamTwo.getValue());
            match31Box.getChildren().removeAll(cBoxRound1Match31TeamOne, cBoxRound1Match31TeamTwo);
            match31Box.getChildren().add(0,tFieldMatch31Team1);
            match31Box.getChildren().add(1,tFieldMatch31Team2);
            match31btnBox.getChildren().remove(btnMatch31Save);
            match31btnBox.getChildren().add(0,btnMatch31Edit);

            cBoxRound1Match31.getItems().clear();
            cBoxRound1Match31.getItems().addAll(tFieldMatch31Team1.getText(),tFieldMatch31Team2.getText());
            cBoxRound1Match31.setVisible(true);
            btnRound1Match31Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THIRTY ONE----------------------------------------

        //---------------------------------------MATCH THIRTY TWO--------------------------------------------
        if(event.getSource().equals(btnMatch32Edit))
        {
            match32Box.getChildren().removeAll(tFieldMatch32Team1,tFieldMatch32Team2);
            cBoxRound1Match32TeamOne.setMinSize(175,15);
            cBoxRound1Match32TeamTwo.setMinSize(175,15);
            cBoxRound1Match32TeamOne.setValue(tFieldMatch32Team1.getText());
            cBoxRound1Match32TeamTwo.setValue(tFieldMatch32Team2.getText());
            match32Box.getChildren().add(0, cBoxRound1Match32TeamOne);
            match32Box.getChildren().add(1, cBoxRound1Match32TeamTwo);
            cBoxRound1Match32.setVisible(false);
            btnRound1Match32Submit.setVisible(false);


            match32btnBox.getChildren().remove(btnMatch32Edit);
            match32btnBox.getChildren().add(0,btnMatch32Save);


        }
        else if(event.getSource().equals(btnMatch32Save))
        {
            tFieldMatch32Team1.setText(cBoxRound1Match32TeamOne.getValue());
            tFieldMatch32Team2.setText(cBoxRound1Match32TeamTwo.getValue());
            match32Box.getChildren().removeAll(cBoxRound1Match32TeamOne, cBoxRound1Match32TeamTwo);
            match32Box.getChildren().add(0,tFieldMatch32Team1);
            match32Box.getChildren().add(1,tFieldMatch32Team2);
            match32btnBox.getChildren().remove(btnMatch32Save);
            match32btnBox.getChildren().add(0,btnMatch32Edit);

            cBoxRound1Match32.getItems().clear();
            cBoxRound1Match32.getItems().addAll(tFieldMatch32Team1.getText(),tFieldMatch32Team2.getText());
            cBoxRound1Match32.setVisible(true);
            btnRound1Match32Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THIRTY TWO----------------------------------------

    }//END EDIT SCHOOL FIELDS

    public void round1MatchPairing()
    {
        tFieldMatch1Team1.setText(roundOneTeams[0]);tFieldMatch1Team2.setText(roundOneTeams[32]);
        tFieldMatch2Team1.setText(roundOneTeams[1]);tFieldMatch2Team2.setText(roundOneTeams[33]);
        tFieldMatch3Team1.setText(roundOneTeams[2]);tFieldMatch3Team2.setText(roundOneTeams[34]);
        tFieldMatch4Team1.setText(roundOneTeams[3]);tFieldMatch4Team2.setText(roundOneTeams[35]);
        tFieldMatch5Team1.setText(roundOneTeams[4]);tFieldMatch5Team2.setText(roundOneTeams[36]);
        tFieldMatch6Team1.setText(roundOneTeams[5]);tFieldMatch6Team2.setText(roundOneTeams[37]);
        tFieldMatch7Team1.setText(roundOneTeams[6]);tFieldMatch7Team2.setText(roundOneTeams[38]);
        tFieldMatch8Team1.setText(roundOneTeams[7]);tFieldMatch8Team2.setText(roundOneTeams[39]);
        tFieldMatch9Team1.setText(roundOneTeams[8]);tFieldMatch9Team2.setText(roundOneTeams[40]);
        tFieldMatch10Team1.setText(roundOneTeams[9]);tFieldMatch10Team2.setText(roundOneTeams[41]);
        tFieldMatch11Team1.setText(roundOneTeams[10]);tFieldMatch11Team2.setText(roundOneTeams[42]);
        tFieldMatch12Team1.setText(roundOneTeams[11]);tFieldMatch12Team2.setText(roundOneTeams[43]);
        tFieldMatch13Team1.setText(roundOneTeams[12]);tFieldMatch13Team2.setText(roundOneTeams[44]);
        tFieldMatch14Team1.setText(roundOneTeams[13]);tFieldMatch14Team2.setText(roundOneTeams[45]);
        tFieldMatch15Team1.setText(roundOneTeams[14]);tFieldMatch15Team2.setText(roundOneTeams[46]);
        tFieldMatch16Team1.setText(roundOneTeams[15]);tFieldMatch16Team2.setText(roundOneTeams[47]);
        tFieldMatch17Team1.setText(roundOneTeams[16]);tFieldMatch17Team2.setText(roundOneTeams[48]);
        tFieldMatch18Team1.setText(roundOneTeams[17]);tFieldMatch18Team2.setText(roundOneTeams[49]);
        tFieldMatch19Team1.setText(roundOneTeams[18]);tFieldMatch19Team2.setText(roundOneTeams[50]);
        tFieldMatch20Team1.setText(roundOneTeams[19]);tFieldMatch20Team2.setText(roundOneTeams[51]);
        tFieldMatch21Team1.setText(roundOneTeams[20]);tFieldMatch21Team2.setText(roundOneTeams[52]);
        tFieldMatch22Team1.setText(roundOneTeams[21]);tFieldMatch22Team2.setText(roundOneTeams[53]);
        tFieldMatch23Team1.setText(roundOneTeams[22]);tFieldMatch23Team2.setText(roundOneTeams[54]);
        tFieldMatch24Team1.setText(roundOneTeams[23]);tFieldMatch24Team2.setText(roundOneTeams[55]);
        tFieldMatch25Team1.setText(roundOneTeams[24]);tFieldMatch25Team2.setText(roundOneTeams[56]);
        tFieldMatch26Team1.setText(roundOneTeams[25]);tFieldMatch26Team2.setText(roundOneTeams[57]);
        tFieldMatch27Team1.setText(roundOneTeams[26]);tFieldMatch27Team2.setText(roundOneTeams[58]);
        tFieldMatch28Team1.setText(roundOneTeams[27]);tFieldMatch28Team2.setText(roundOneTeams[59]);
        tFieldMatch29Team1.setText(roundOneTeams[28]);tFieldMatch29Team2.setText(roundOneTeams[60]);
        tFieldMatch30Team1.setText(roundOneTeams[29]);tFieldMatch30Team2.setText(roundOneTeams[61]);
        tFieldMatch31Team1.setText(roundOneTeams[30]);tFieldMatch31Team2.setText(roundOneTeams[62]);
        tFieldMatch32Team1.setText(roundOneTeams[31]);tFieldMatch32Team2.setText(roundOneTeams[63]);

        cBoxRound1Match1.getItems().addAll(roundOneTeams[0],roundOneTeams[32]);
        cBoxRound1Match2.getItems().addAll(roundOneTeams[1],roundOneTeams[33]);
        cBoxRound1Match3.getItems().addAll(roundOneTeams[2],roundOneTeams[34]);
        cBoxRound1Match4.getItems().addAll(roundOneTeams[3],roundOneTeams[35]);
        cBoxRound1Match5.getItems().addAll(roundOneTeams[4],roundOneTeams[36]);
        cBoxRound1Match6.getItems().addAll(roundOneTeams[5],roundOneTeams[37]);
        cBoxRound1Match7.getItems().addAll(roundOneTeams[6],roundOneTeams[38]);
        cBoxRound1Match8.getItems().addAll(roundOneTeams[7],roundOneTeams[39]);
        cBoxRound1Match9.getItems().addAll(roundOneTeams[8],roundOneTeams[40]);
        cBoxRound1Match10.getItems().addAll(roundOneTeams[9],roundOneTeams[41]);
        cBoxRound1Match11.getItems().addAll(roundOneTeams[10],roundOneTeams[42]);
        cBoxRound1Match12.getItems().addAll(roundOneTeams[11],roundOneTeams[43]);
        cBoxRound1Match13.getItems().addAll(roundOneTeams[12],roundOneTeams[44]);
        cBoxRound1Match14.getItems().addAll(roundOneTeams[13],roundOneTeams[45]);
        cBoxRound1Match15.getItems().addAll(roundOneTeams[14],roundOneTeams[46]);
        cBoxRound1Match16.getItems().addAll(roundOneTeams[15],roundOneTeams[47]);
        cBoxRound1Match17.getItems().addAll(roundOneTeams[16],roundOneTeams[48]);
        cBoxRound1Match18.getItems().addAll(roundOneTeams[17],roundOneTeams[49]);
        cBoxRound1Match19.getItems().addAll(roundOneTeams[18],roundOneTeams[50]);
        cBoxRound1Match20.getItems().addAll(roundOneTeams[19],roundOneTeams[51]);
        cBoxRound1Match21.getItems().addAll(roundOneTeams[20],roundOneTeams[52]);
        cBoxRound1Match22.getItems().addAll(roundOneTeams[21],roundOneTeams[53]);
        cBoxRound1Match23.getItems().addAll(roundOneTeams[22],roundOneTeams[54]);
        cBoxRound1Match24.getItems().addAll(roundOneTeams[23],roundOneTeams[55]);
        cBoxRound1Match25.getItems().addAll(roundOneTeams[24],roundOneTeams[56]);
        cBoxRound1Match26.getItems().addAll(roundOneTeams[25],roundOneTeams[57]);
        cBoxRound1Match27.getItems().addAll(roundOneTeams[26],roundOneTeams[58]);
        cBoxRound1Match28.getItems().addAll(roundOneTeams[27],roundOneTeams[59]);
        cBoxRound1Match29.getItems().addAll(roundOneTeams[28],roundOneTeams[60]);
        cBoxRound1Match30.getItems().addAll(roundOneTeams[29],roundOneTeams[61]);
        cBoxRound1Match31.getItems().addAll(roundOneTeams[30],roundOneTeams[62]);
        cBoxRound1Match32.getItems().addAll(roundOneTeams[31],roundOneTeams[63]);
    }//END ROUND 1 MATCH PAIRING

    //------------------------------------------------END ROUND ONE CONFIGURATIONS------------------------------------------------

    //---------------------------------------------------ROUND TWO CONFIGURATION-------------------------------------------------
    public void buildRoundTwoScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");

        VBox round2Match1BoxHolder = new VBox(); VBox round2Match2BoxHolder = new VBox();
        VBox round2Match3BoxHolder = new VBox(); VBox round2Match4BoxHolder = new VBox();
        VBox round2Match5BoxHolder = new VBox(); VBox round2Match6BoxHolder = new VBox();
        VBox round2Match7BoxHolder = new VBox(); VBox round2Match8BoxHolder = new VBox();
        VBox round2Match9BoxHolder = new VBox(); VBox round2Match10BoxHolder = new VBox();
        VBox round2Match11BoxHolder = new VBox(); VBox round2Match12BoxHolder = new VBox();
        VBox round2Match13BoxHolder = new VBox(); VBox round2Match14BoxHolder = new VBox();
        VBox round2Match15BoxHolder = new VBox(); VBox round2Match16BoxHolder = new VBox();

        Round2match1Box = new HBox(); Round2match2Box = new HBox();
        Round2match3Box = new HBox(); Round2match4Box = new HBox();
        Round2match5Box = new HBox(); Round2match6Box = new HBox();
        Round2match7Box = new HBox(); Round2match8Box = new HBox();
        Round2match9Box = new HBox(); Round2match10Box = new HBox();
        Round2match11Box = new HBox(); Round2match12Box = new HBox();
        Round2match13Box = new HBox(); Round2match14Box = new HBox();
        Round2match15Box = new HBox(); Round2match16Box = new HBox();

        Round2match1btnBox = new HBox();Round2match2btnBox = new HBox();
        Round2match3btnBox = new HBox();Round2match4btnBox = new HBox();
        Round2match5btnBox = new HBox();Round2match6btnBox = new HBox();
        Round2match7btnBox = new HBox();Round2match8btnBox = new HBox();
        Round2match9btnBox = new HBox();Round2match10btnBox = new HBox();
        Round2match11btnBox = new HBox();Round2match12btnBox = new HBox();
        Round2match13btnBox = new HBox();Round2match14btnBox = new HBox();
        Round2match15btnBox = new HBox();Round2match16btnBox = new HBox();

        cBoxRound2Match1TeamOne = new ChoiceBox<>();cBoxRound2Match1TeamTwo = new ChoiceBox<>();
        cBoxRound2Match2TeamOne = new ChoiceBox<>();cBoxRound2Match2TeamTwo = new ChoiceBox<>();
        cBoxRound2Match3TeamOne = new ChoiceBox<>();cBoxRound2Match3TeamTwo = new ChoiceBox<>();
        cBoxRound2Match4TeamOne = new ChoiceBox<>();cBoxRound2Match4TeamTwo = new ChoiceBox<>();
        cBoxRound2Match5TeamOne = new ChoiceBox<>();cBoxRound2Match5TeamTwo = new ChoiceBox<>();
        cBoxRound2Match6TeamOne = new ChoiceBox<>();cBoxRound2Match6TeamTwo = new ChoiceBox<>();
        cBoxRound2Match7TeamOne = new ChoiceBox<>();cBoxRound2Match7TeamTwo = new ChoiceBox<>();
        cBoxRound2Match8TeamOne = new ChoiceBox<>();cBoxRound2Match8TeamTwo = new ChoiceBox<>();
        cBoxRound2Match9TeamOne = new ChoiceBox<>();cBoxRound2Match9TeamTwo = new ChoiceBox<>();
        cBoxRound2Match10TeamOne = new ChoiceBox<>();cBoxRound2Match10TeamTwo = new ChoiceBox<>();
        cBoxRound2Match11TeamOne = new ChoiceBox<>();cBoxRound2Match11TeamTwo = new ChoiceBox<>();
        cBoxRound2Match12TeamOne = new ChoiceBox<>();cBoxRound2Match12TeamTwo = new ChoiceBox<>();
        cBoxRound2Match13TeamOne = new ChoiceBox<>();cBoxRound2Match13TeamTwo = new ChoiceBox<>();
        cBoxRound2Match14TeamOne = new ChoiceBox<>();cBoxRound2Match14TeamTwo = new ChoiceBox<>();
        cBoxRound2Match15TeamOne = new ChoiceBox<>();cBoxRound2Match15TeamTwo = new ChoiceBox<>();
        cBoxRound2Match16TeamOne = new ChoiceBox<>();cBoxRound2Match16TeamTwo = new ChoiceBox<>();

        btnRound2Match1Edit = new Button("Edit School Fields");
        btnRound2Match2Edit = new Button("Edit School Fields");
        btnRound2Match3Edit = new Button("Edit School Fields");
        btnRound2Match4Edit = new Button("Edit School Fields");
        btnRound2Match5Edit = new Button("Edit School Fields");
        btnRound2Match6Edit = new Button("Edit School Fields");
        btnRound2Match7Edit = new Button("Edit School Fields");
        btnRound2Match8Edit = new Button("Edit School Fields");
        btnRound2Match9Edit = new Button("Edit School Fields");
        btnRound2Match10Edit = new Button("Edit School Fields");
        btnRound2Match11Edit = new Button("Edit School Fields");
        btnRound2Match12Edit = new Button("Edit School Fields");
        btnRound2Match13Edit = new Button("Edit School Fields");
        btnRound2Match14Edit = new Button("Edit School Fields");
        btnRound2Match15Edit = new Button("Edit School Fields");
        btnRound2Match16Edit = new Button("Edit School Fields");

        btnRound2Match1Save = new Button("Save Field Changes");
        btnRound2Match2Save = new Button("Save Field Changes");
        btnRound2Match3Save = new Button("Save Field Changes");
        btnRound2Match4Save = new Button("Save Field Changes");
        btnRound2Match5Save = new Button("Save Field Changes");
        btnRound2Match6Save = new Button("Save Field Changes");
        btnRound2Match7Save = new Button("Save Field Changes");
        btnRound2Match8Save = new Button("Save Field Changes");
        btnRound2Match9Save = new Button("Save Field Changes");
        btnRound2Match10Save = new Button("Save Field Changes");
        btnRound2Match11Save = new Button("Save Field Changes");
        btnRound2Match12Save = new Button("Save Field Changes");
        btnRound2Match13Save = new Button("Save Field Changes");
        btnRound2Match14Save = new Button("Save Field Changes");
        btnRound2Match15Save = new Button("Save Field Changes");
        btnRound2Match16Save = new Button("Save Field Changes");

        tFieldRound2Match1Team1 = new TextField(); tFieldRound2Match1Team2 = new TextField();
        tFieldRound2Match2Team1 = new TextField(); tFieldRound2Match2Team2 = new TextField();
        tFieldRound2Match3Team1 = new TextField(); tFieldRound2Match3Team2 = new TextField();
        tFieldRound2Match4Team1 = new TextField(); tFieldRound2Match4Team2 = new TextField();
        tFieldRound2Match5Team1 = new TextField(); tFieldRound2Match5Team2 = new TextField();
        tFieldRound2Match6Team1 = new TextField(); tFieldRound2Match6Team2 = new TextField();
        tFieldRound2Match7Team1 = new TextField(); tFieldRound2Match7Team2 = new TextField();
        tFieldRound2Match8Team1 = new TextField(); tFieldRound2Match8Team2 = new TextField();
        tFieldRound2Match9Team1 = new TextField(); tFieldRound2Match9Team2 = new TextField();
        tFieldRound2Match10Team1 = new TextField(); tFieldRound2Match10Team2 = new TextField();
        tFieldRound2Match11Team1 = new TextField(); tFieldRound2Match11Team2 = new TextField();
        tFieldRound2Match12Team1 = new TextField(); tFieldRound2Match12Team2 = new TextField();
        tFieldRound2Match13Team1 = new TextField(); tFieldRound2Match13Team2 = new TextField();
        tFieldRound2Match14Team1 = new TextField(); tFieldRound2Match14Team2 = new TextField();
        tFieldRound2Match15Team1 = new TextField(); tFieldRound2Match15Team2 = new TextField();
        tFieldRound2Match16Team1 = new TextField(); tFieldRound2Match16Team2 = new TextField();

        cBoxRound2Match1 = new ChoiceBox<>(); cBoxRound2Match2 = new ChoiceBox<>();
        cBoxRound2Match3 = new ChoiceBox<>(); cBoxRound2Match4 = new ChoiceBox<>();
        cBoxRound2Match5 = new ChoiceBox<>(); cBoxRound2Match6 = new ChoiceBox<>();
        cBoxRound2Match7 = new ChoiceBox<>(); cBoxRound2Match8 = new ChoiceBox<>();
        cBoxRound2Match9 = new ChoiceBox<>(); cBoxRound2Match10 = new ChoiceBox<>();
        cBoxRound2Match11 = new ChoiceBox<>(); cBoxRound2Match12 = new ChoiceBox<>();
        cBoxRound2Match13 = new ChoiceBox<>(); cBoxRound2Match14 = new ChoiceBox<>();
        cBoxRound2Match15 = new ChoiceBox<>(); cBoxRound2Match16 = new ChoiceBox<>();

        btnRound2Match1Submit = new Button("Submit"); btnRound2Match2Submit = new Button("Submit");
        btnRound2Match3Submit = new Button("Submit"); btnRound2Match4Submit = new Button("Submit");
        btnRound2Match5Submit = new Button("Submit"); btnRound2Match6Submit = new Button("Submit");
        btnRound2Match7Submit = new Button("Submit"); btnRound2Match8Submit = new Button("Submit");
        btnRound2Match9Submit = new Button("Submit"); btnRound2Match10Submit = new Button("Submit");
        btnRound2Match11Submit = new Button("Submit"); btnRound2Match12Submit = new Button("Submit");
        btnRound2Match13Submit = new Button("Submit"); btnRound2Match14Submit = new Button("Submit");
        btnRound2Match15Submit = new Button("Submit"); btnRound2Match16Submit = new Button("Submit");

        round2Match1Winner = new Label(""); round2Match2Winner = new Label("");
        round2Match3Winner = new Label(""); round2Match4Winner = new Label("");
        round2Match5Winner = new Label(""); round2Match6Winner = new Label("");
        round2Match7Winner = new Label(""); round2Match8Winner = new Label("");
        round2Match9Winner = new Label(""); round2Match10Winner = new Label("");
        round2Match11Winner = new Label(""); round2Match12Winner = new Label("");
        round2Match13Winner = new Label(""); round2Match14Winner = new Label("");
        round2Match15Winner = new Label(""); round2Match16Winner = new Label("");

        Round2match1btnBox.getChildren().addAll(btnRound2Match1Edit, round2Match1Winner); Round2match2btnBox.getChildren().addAll(btnRound2Match2Edit, round2Match2Winner);
        Round2match3btnBox.getChildren().addAll(btnRound2Match3Edit, round2Match3Winner); Round2match4btnBox.getChildren().addAll(btnRound2Match4Edit, round2Match4Winner);
        Round2match5btnBox.getChildren().addAll(btnRound2Match5Edit, round2Match5Winner); Round2match6btnBox.getChildren().addAll(btnRound2Match6Edit, round2Match6Winner);
        Round2match7btnBox.getChildren().addAll(btnRound2Match7Edit, round2Match7Winner); Round2match8btnBox.getChildren().addAll(btnRound2Match8Edit, round2Match8Winner);
        Round2match9btnBox.getChildren().addAll(btnRound2Match9Edit, round2Match9Winner); Round2match10btnBox.getChildren().addAll(btnRound2Match10Edit, round2Match10Winner);
        Round2match11btnBox.getChildren().addAll(btnRound2Match11Edit, round2Match11Winner); Round2match12btnBox.getChildren().addAll(btnRound2Match12Edit, round2Match12Winner);
        Round2match13btnBox.getChildren().addAll(btnRound2Match13Edit, round2Match13Winner); Round2match14btnBox.getChildren().addAll(btnRound2Match14Edit, round2Match14Winner);
        Round2match15btnBox.getChildren().addAll(btnRound2Match15Edit, round2Match15Winner); Round2match16btnBox.getChildren().addAll(btnRound2Match16Edit, round2Match16Winner);

        Round2match1Box.getChildren().addAll(tFieldRound2Match1Team1, tFieldRound2Match1Team2,cBoxRound2Match1,btnRound2Match1Submit);
        Round2match2Box.getChildren().addAll(tFieldRound2Match2Team1, tFieldRound2Match2Team2,cBoxRound2Match2,btnRound2Match2Submit);
        Round2match3Box.getChildren().addAll(tFieldRound2Match3Team1, tFieldRound2Match3Team2,cBoxRound2Match3,btnRound2Match3Submit);
        Round2match4Box.getChildren().addAll(tFieldRound2Match4Team1, tFieldRound2Match4Team2,cBoxRound2Match4,btnRound2Match4Submit);
        Round2match5Box.getChildren().addAll(tFieldRound2Match5Team1, tFieldRound2Match5Team2,cBoxRound2Match5,btnRound2Match5Submit);
        Round2match6Box.getChildren().addAll(tFieldRound2Match6Team1, tFieldRound2Match6Team2,cBoxRound2Match6,btnRound2Match6Submit);
        Round2match7Box.getChildren().addAll(tFieldRound2Match7Team1, tFieldRound2Match7Team2,cBoxRound2Match7,btnRound2Match7Submit);
        Round2match8Box.getChildren().addAll(tFieldRound2Match8Team1, tFieldRound2Match8Team2,cBoxRound2Match8,btnRound2Match8Submit);
        Round2match9Box.getChildren().addAll(tFieldRound2Match9Team1, tFieldRound2Match9Team2,cBoxRound2Match9,btnRound2Match9Submit);
        Round2match10Box.getChildren().addAll(tFieldRound2Match10Team1, tFieldRound2Match10Team2,cBoxRound2Match10,btnRound2Match10Submit);
        Round2match11Box.getChildren().addAll(tFieldRound2Match11Team1, tFieldRound2Match11Team2,cBoxRound2Match11,btnRound2Match11Submit);
        Round2match12Box.getChildren().addAll(tFieldRound2Match12Team1, tFieldRound2Match12Team2,cBoxRound2Match12,btnRound2Match12Submit);
        Round2match13Box.getChildren().addAll(tFieldRound2Match13Team1, tFieldRound2Match13Team2,cBoxRound2Match13,btnRound2Match13Submit);
        Round2match14Box.getChildren().addAll(tFieldRound2Match14Team1, tFieldRound2Match14Team2,cBoxRound2Match14,btnRound2Match14Submit);
        Round2match15Box.getChildren().addAll(tFieldRound2Match15Team1, tFieldRound2Match15Team2,cBoxRound2Match15,btnRound2Match15Submit);
        Round2match16Box.getChildren().addAll(tFieldRound2Match16Team1, tFieldRound2Match16Team2,cBoxRound2Match16,btnRound2Match16Submit);

        Round2match1Box.setSpacing(15);Round2match2Box.setSpacing(15);Round2match3Box.setSpacing(15);Round2match4Box.setSpacing(15);
        Round2match5Box.setSpacing(15);Round2match6Box.setSpacing(15);Round2match7Box.setSpacing(15);Round2match8Box.setSpacing(15);
        Round2match9Box.setSpacing(15);Round2match10Box.setSpacing(15);Round2match11Box.setSpacing(15);Round2match12Box.setSpacing(15);
        Round2match13Box.setSpacing(15);Round2match14Box.setSpacing(15);Round2match15Box.setSpacing(15);Round2match16Box.setSpacing(15);

        btnRound2Match1Submit.setMinSize(120,15);btnRound2Match2Submit.setMinSize(120,15);
        btnRound2Match3Submit.setMinSize(120,15);btnRound2Match4Submit.setMinSize(120,15);
        btnRound2Match5Submit.setMinSize(120,15);btnRound2Match6Submit.setMinSize(120,15);
        btnRound2Match7Submit.setMinSize(120,15);btnRound2Match8Submit.setMinSize(120,15);
        btnRound2Match9Submit.setMinSize(120,15);btnRound2Match10Submit.setMinSize(120,15);
        btnRound2Match11Submit.setMinSize(120,15);btnRound2Match12Submit.setMinSize(120,15);
        btnRound2Match13Submit.setMinSize(120,15);btnRound2Match14Submit.setMinSize(120,15);
        btnRound2Match15Submit.setMinSize(120,15);btnRound2Match16Submit.setMinSize(120,15);

        cBoxRound2Match1.setMinSize(175,15);cBoxRound2Match2.setMinSize(175,15);
        cBoxRound2Match3.setMinSize(175,15);cBoxRound2Match4.setMinSize(175,15);
        cBoxRound2Match5.setMinSize(175,15);cBoxRound2Match6.setMinSize(175,15);
        cBoxRound2Match7.setMinSize(175,15);cBoxRound2Match8.setMinSize(175,15);
        cBoxRound2Match9.setMinSize(175,15);cBoxRound2Match10.setMinSize(175,15);
        cBoxRound2Match11.setMinSize(175,15);cBoxRound2Match12.setMinSize(175,15);
        cBoxRound2Match13.setMinSize(175,15);cBoxRound2Match14.setMinSize(175,15);
        cBoxRound2Match15.setMinSize(175,15);cBoxRound2Match16.setMinSize(175,15);

        tFieldRound2Match1Team1.setMinSize(175,15);tFieldRound2Match1Team2.setMinSize(175,15);
        tFieldRound2Match2Team1.setMinSize(175,15);tFieldRound2Match2Team2.setMinSize(175,15);
        tFieldRound2Match3Team1.setMinSize(175,15);tFieldRound2Match3Team2.setMinSize(175,15);
        tFieldRound2Match4Team1.setMinSize(175,15);tFieldRound2Match4Team2.setMinSize(175,15);
        tFieldRound2Match5Team1.setMinSize(175,15);tFieldRound2Match5Team2.setMinSize(175,15);
        tFieldRound2Match6Team1.setMinSize(175,15);tFieldRound2Match6Team2.setMinSize(175,15);
        tFieldRound2Match7Team1.setMinSize(175,15);tFieldRound2Match7Team2.setMinSize(175,15);
        tFieldRound2Match8Team1.setMinSize(175,15);tFieldRound2Match8Team2.setMinSize(175,15);
        tFieldRound2Match9Team1.setMinSize(175,15);tFieldRound2Match9Team2.setMinSize(175,15);
        tFieldRound2Match10Team1.setMinSize(175,15);tFieldRound2Match10Team2.setMinSize(175,15);
        tFieldRound2Match11Team1.setMinSize(175,15);tFieldRound2Match11Team2.setMinSize(175,15);
        tFieldRound2Match12Team1.setMinSize(175,15);tFieldRound2Match12Team2.setMinSize(175,15);
        tFieldRound2Match13Team1.setMinSize(175,15);tFieldRound2Match13Team2.setMinSize(175,15);
        tFieldRound2Match14Team1.setMinSize(175,15);tFieldRound2Match14Team2.setMinSize(175,15);
        tFieldRound2Match15Team1.setMinSize(175,15);tFieldRound2Match15Team2.setMinSize(175,15);
        tFieldRound2Match16Team1.setMinSize(175,15);tFieldRound2Match16Team2.setMinSize(175,15);

        round2Match1BoxHolder.getChildren().addAll(Round2match1Box,Round2match1btnBox);
        round2Match2BoxHolder.getChildren().addAll(Round2match2Box,Round2match2btnBox);
        round2Match3BoxHolder.getChildren().addAll(Round2match3Box,Round2match3btnBox);
        round2Match4BoxHolder.getChildren().addAll(Round2match4Box,Round2match4btnBox);
        round2Match5BoxHolder.getChildren().addAll(Round2match5Box,Round2match5btnBox);
        round2Match6BoxHolder.getChildren().addAll(Round2match6Box,Round2match6btnBox);
        round2Match7BoxHolder.getChildren().addAll(Round2match7Box,Round2match7btnBox);
        round2Match8BoxHolder.getChildren().addAll(Round2match8Box,Round2match8btnBox);
        round2Match9BoxHolder.getChildren().addAll(Round2match9Box,Round2match9btnBox);
        round2Match10BoxHolder.getChildren().addAll(Round2match10Box,Round2match10btnBox);
        round2Match11BoxHolder.getChildren().addAll(Round2match11Box,Round2match11btnBox);
        round2Match12BoxHolder.getChildren().addAll(Round2match12Box,Round2match12btnBox);
        round2Match13BoxHolder.getChildren().addAll(Round2match13Box,Round2match13btnBox);
        round2Match14BoxHolder.getChildren().addAll(Round2match14Box,Round2match14btnBox);
        round2Match15BoxHolder.getChildren().addAll(Round2match15Box,Round2match15btnBox);
        round2Match16BoxHolder.getChildren().addAll(Round2match16Box,Round2match16btnBox);

        Accordion round2matchContainer = new Accordion();
        TitledPane round2Match1Pane = new TitledPane("Match One",round2Match1BoxHolder);
        TitledPane round2Match2Pane = new TitledPane("Match Two", round2Match2BoxHolder);
        TitledPane round2Match3Pane = new TitledPane("Match Three", round2Match3BoxHolder);
        TitledPane round2Match4Pane = new TitledPane("Match Four", round2Match4BoxHolder);
        TitledPane round2Match5Pane = new TitledPane("Match Five", round2Match5BoxHolder);
        TitledPane round2Match6Pane = new TitledPane("Match Six", round2Match6BoxHolder);
        TitledPane round2Match7Pane = new TitledPane("Match Seven", round2Match7BoxHolder);
        TitledPane round2Match8Pane = new TitledPane("Match Eight", round2Match8BoxHolder);
        TitledPane round2Match9Pane = new TitledPane("Match Nine", round2Match9BoxHolder);
        TitledPane round2Match10Pane = new TitledPane("Match Ten", round2Match10BoxHolder);
        TitledPane round2Match11Pane = new TitledPane("Match Eleven", round2Match11BoxHolder);
        TitledPane round2Match12Pane = new TitledPane("Match Twelve", round2Match12BoxHolder);
        TitledPane round2Match13Pane = new TitledPane("Match Thirteen", round2Match13BoxHolder);
        TitledPane round2Match14Pane = new TitledPane("Match Fourteen", round2Match14BoxHolder);
        TitledPane round2Match15Pane = new TitledPane("Match Fifteen", round2Match15BoxHolder);
        TitledPane round2Match16Pane = new TitledPane("Match Sixteen", round2Match16BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        round2matchContainer.getPanes().addAll(round2Match1Pane,round2Match2Pane,round2Match3Pane,round2Match4Pane,round2Match5Pane,
                round2Match6Pane,round2Match7Pane,round2Match8Pane,round2Match9Pane,round2Match10Pane,round2Match11Pane,round2Match12Pane,round2Match13Pane,round2Match14Pane
                ,round2Match15Pane,round2Match16Pane);

        scrollPane.setContent(round2matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round Two",verticalContainer);

        rootPane.setCollapsible(false);
        round2matchContainer.setMinWidth(962);

        btnRound2Match1Edit.setMinSize(175,15);btnRound2Match2Edit.setMinSize(175,15);
        btnRound2Match3Edit.setMinSize(175,15);btnRound2Match4Edit.setMinSize(175,15);
        btnRound2Match5Edit.setMinSize(175,15);btnRound2Match6Edit.setMinSize(175,15);
        btnRound2Match7Edit.setMinSize(175,15);btnRound2Match8Edit.setMinSize(175,15);
        btnRound2Match9Edit.setMinSize(175,15);btnRound2Match10Edit.setMinSize(175,15);
        btnRound2Match11Edit.setMinSize(175,15);btnRound2Match12Edit.setMinSize(175,15);
        btnRound2Match13Edit.setMinSize(175,15);btnRound2Match14Edit.setMinSize(175,15);
        btnRound2Match15Edit.setMinSize(175,15);btnRound2Match16Edit.setMinSize(175,15);

        btnRound2Match1Save.setMinSize(175,15);btnRound2Match2Save.setMinSize(175,15);
        btnRound2Match3Save.setMinSize(175,15);btnRound2Match4Save.setMinSize(175,15);
        btnRound2Match5Save.setMinSize(175,15);btnRound2Match6Save.setMinSize(175,15);
        btnRound2Match7Save.setMinSize(175,15);btnRound2Match8Save.setMinSize(175,15);
        btnRound2Match9Save.setMinSize(175,15);btnRound2Match10Save.setMinSize(175,15);
        btnRound2Match11Save.setMinSize(175,15);btnRound2Match12Save.setMinSize(175,15);
        btnRound2Match13Save.setMinSize(175,15);btnRound2Match14Save.setMinSize(175,15);
        btnRound2Match15Save.setMinSize(175,15);btnRound2Match16Save.setMinSize(175,15);


        round2Match1BoxHolder.setSpacing(10); round2Match2BoxHolder.setSpacing(10);
        round2Match3BoxHolder.setSpacing(10); round2Match4BoxHolder.setSpacing(10);
        round2Match5BoxHolder.setSpacing(10); round2Match6BoxHolder.setSpacing(10);
        round2Match7BoxHolder.setSpacing(10); round2Match8BoxHolder.setSpacing(10);
        round2Match9BoxHolder.setSpacing(10); round2Match10BoxHolder.setSpacing(10);
        round2Match11BoxHolder.setSpacing(10); round2Match12BoxHolder.setSpacing(10);
        round2Match13BoxHolder.setSpacing(10); round2Match14BoxHolder.setSpacing(10);
        round2Match15BoxHolder.setSpacing(10); round2Match16BoxHolder.setSpacing(10);


        Round2match1btnBox.setSpacing(15);Round2match2btnBox.setSpacing(15);
        Round2match3btnBox.setSpacing(15);Round2match4btnBox.setSpacing(15);
        Round2match5btnBox.setSpacing(15);Round2match6btnBox.setSpacing(15);
        Round2match7btnBox.setSpacing(15);Round2match8btnBox.setSpacing(15);
        Round2match9btnBox.setSpacing(15);Round2match10btnBox.setSpacing(15);
        Round2match11btnBox.setSpacing(15);Round2match12btnBox.setSpacing(15);
        Round2match13btnBox.setSpacing(15);Round2match14btnBox.setSpacing(15);
        Round2match15btnBox.setSpacing(15);Round2match16btnBox.setSpacing(15);


        tFieldRound2Match1Team1.setEditable(false);tFieldRound2Match1Team2.setEditable(false);
        tFieldRound2Match2Team1.setEditable(false);tFieldRound2Match2Team2.setEditable(false);
        tFieldRound2Match3Team1.setEditable(false);tFieldRound2Match3Team2.setEditable(false);
        tFieldRound2Match4Team1.setEditable(false);tFieldRound2Match4Team2.setEditable(false);
        tFieldRound2Match5Team1.setEditable(false);tFieldRound2Match5Team2.setEditable(false);
        tFieldRound2Match6Team1.setEditable(false);tFieldRound2Match6Team2.setEditable(false);
        tFieldRound2Match7Team1.setEditable(false);tFieldRound2Match7Team2.setEditable(false);
        tFieldRound2Match8Team1.setEditable(false);tFieldRound2Match8Team2.setEditable(false);
        tFieldRound2Match9Team1.setEditable(false);tFieldRound2Match9Team2.setEditable(false);
        tFieldRound2Match10Team1.setEditable(false);tFieldRound2Match10Team2.setEditable(false);
        tFieldRound2Match11Team1.setEditable(false);tFieldRound2Match11Team2.setEditable(false);
        tFieldRound2Match12Team1.setEditable(false);tFieldRound2Match12Team2.setEditable(false);
        tFieldRound2Match13Team1.setEditable(false);tFieldRound2Match13Team2.setEditable(false);
        tFieldRound2Match14Team1.setEditable(false);tFieldRound2Match14Team2.setEditable(false);
        tFieldRound2Match15Team1.setEditable(false);tFieldRound2Match15Team2.setEditable(false);
        tFieldRound2Match16Team1.setEditable(false);tFieldRound2Match16Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnRound2Match1Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match2Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match3Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match4Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match5Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match6Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match7Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match8Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match9Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match10Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match11Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match12Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match13Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match14Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match15Edit.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match16Edit.setOnAction(event -> editRound2SchoolFields(event));

        btnRound2Match1Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match2Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match3Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match4Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match5Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match6Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match7Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match8Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match9Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match10Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match11Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match12Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match13Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match14Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match15Save.setOnAction(event -> editRound2SchoolFields(event));
        btnRound2Match16Save.setOnAction(event -> editRound2SchoolFields(event));

        btnRound2Match1Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match2Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match3Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match4Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match5Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match6Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match7Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match8Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match9Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match10Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match11Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match12Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match13Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match14Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match15Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound2Match16Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round2SceneCode);//Generates a sorted school list
        buildRoundTwoArray();
        round2MatchPairing();
        getRoundTwoWinners();
        sceneRound2 = new Scene(rootPane, 1000, 550); // Testing this Nov 19
    }

    public void buildRoundTwoArray(){
        roundTwoTextField = new TextField[16][2];
        roundTwoBox = new ChoiceBox[16];

        roundTwoTextField[0][0] = tFieldRound2Match1Team1;roundTwoTextField[0][1] = tFieldRound2Match1Team2;
        roundTwoTextField[1][0] = tFieldRound2Match2Team1;roundTwoTextField[1][1] = tFieldRound2Match2Team2;
        roundTwoTextField[2][0] = tFieldRound2Match3Team1;roundTwoTextField[2][1] = tFieldRound2Match3Team2;
        roundTwoTextField[3][0] = tFieldRound2Match4Team1;roundTwoTextField[3][1] = tFieldRound2Match4Team2;
        roundTwoTextField[4][0] = tFieldRound2Match5Team1;roundTwoTextField[4][1] = tFieldRound2Match5Team2;
        roundTwoTextField[5][0] = tFieldRound2Match6Team1;roundTwoTextField[5][1] = tFieldRound2Match6Team2;
        roundTwoTextField[6][0] = tFieldRound2Match7Team1;roundTwoTextField[6][1] = tFieldRound2Match7Team2;
        roundTwoTextField[7][0] = tFieldRound2Match8Team1;roundTwoTextField[7][1] = tFieldRound2Match8Team2;
        roundTwoTextField[8][0] = tFieldRound2Match9Team1;roundTwoTextField[8][1] = tFieldRound2Match9Team2;
        roundTwoTextField[9][0] = tFieldRound2Match10Team1;roundTwoTextField[9][1] = tFieldRound2Match10Team2;
        roundTwoTextField[10][0] = tFieldRound2Match11Team1;roundTwoTextField[10][1] = tFieldRound2Match11Team2;
        roundTwoTextField[11][0] = tFieldRound2Match12Team1;roundTwoTextField[11][1] = tFieldRound2Match12Team2;
        roundTwoTextField[12][0] = tFieldRound2Match13Team1;roundTwoTextField[12][1] = tFieldRound2Match13Team2;
        roundTwoTextField[13][0] = tFieldRound2Match14Team1;roundTwoTextField[13][1] = tFieldRound2Match14Team2;
        roundTwoTextField[14][0] = tFieldRound2Match15Team1;roundTwoTextField[14][1] = tFieldRound2Match15Team2;
        roundTwoTextField[15][0] = tFieldRound2Match16Team1;roundTwoTextField[15][1] = tFieldRound2Match16Team2;

        roundTwoBox[0] = cBoxRound2Match1;roundTwoBox[8] = cBoxRound2Match9;
        roundTwoBox[1] = cBoxRound2Match2;roundTwoBox[9] = cBoxRound2Match10;
        roundTwoBox[2] = cBoxRound2Match3;roundTwoBox[9] = cBoxRound2Match10;
        roundTwoBox[3] = cBoxRound2Match4;roundTwoBox[10] = cBoxRound2Match11;
        roundTwoBox[4] = cBoxRound2Match5;roundTwoBox[11] = cBoxRound2Match12;
        roundTwoBox[5] = cBoxRound2Match6;roundTwoBox[12] = cBoxRound2Match13;
        roundTwoBox[6] = cBoxRound2Match7;roundTwoBox[13] = cBoxRound2Match14;
        roundTwoBox[7] = cBoxRound2Match8;roundTwoBox[14] = cBoxRound2Match15;
        roundTwoBox[15] = cBoxRound2Match16;

    }//END ROUND TWO BUILD ARRAY

    public void getRoundTwoWinners()
    {
        OpenFile.openRoundTwoFile();
        String[] roundTwoWinners = OpenFile.getRoundTwoWinners();

        if(roundTwoWinners[0].length() > 1)
            round2Match1Winner.setText(roundTwoWinners[0] + " Won!");

        if(roundTwoWinners[1].length() > 1)
            round2Match2Winner.setText(roundTwoWinners[1] + " Won!");

        if(roundTwoWinners[2].length() > 1)
            round2Match3Winner.setText(roundTwoWinners[2] + " Won!");

        if(roundTwoWinners[3].length() > 1)
            round2Match4Winner.setText(roundTwoWinners[3] + " Won!");

        if(roundTwoWinners[4].length() > 1)
            round2Match5Winner.setText(roundTwoWinners[4] + " Won!");

        if(roundTwoWinners[5].length() > 1)
            round2Match6Winner.setText(roundTwoWinners[5] + " Won!");

        if(roundTwoWinners[6].length() > 1)
            round2Match7Winner.setText(roundTwoWinners[6] + " Won!");

        if(roundTwoWinners[7].length() > 1)
            round2Match8Winner.setText(roundTwoWinners[7] + " Won!");

        if(roundTwoWinners[8].length() > 1)
            round2Match9Winner.setText(roundTwoWinners[8] + " Won!");

        if(roundTwoWinners[9].length() > 1)
            round2Match10Winner.setText(roundTwoWinners[9] + " Won!");

        if(roundTwoWinners[10].length() > 1)
            round2Match11Winner.setText(roundTwoWinners[10] + " Won!");

        if(roundTwoWinners[11].length() > 1)
            round2Match12Winner.setText(roundTwoWinners[11] + " Won!");

        if(roundTwoWinners[12].length() > 1)
            round2Match13Winner.setText(roundTwoWinners[12] + " Won!");

        if(roundTwoWinners[13].length() > 1)
            round2Match14Winner.setText(roundTwoWinners[13] + " Won!");

        if(roundTwoWinners[14].length() > 1)
            round2Match15Winner.setText(roundTwoWinners[14] + " Won!");

        if(roundTwoWinners[15].length() > 1)
            round2Match16Winner.setText(roundTwoWinners[15] + " Won!");


        OpenFile.closeRoundTwoFile();

    }//END GET ROUND TWO WINNERS

    public void editRound2SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnRound2Match1Edit))
        {
            Round2match1Box.getChildren().removeAll(tFieldRound2Match1Team1,tFieldRound2Match1Team2);
            cBoxRound2Match1TeamOne.setMinSize(175,15);
            cBoxRound2Match1TeamTwo.setMinSize(175,15);
            cBoxRound2Match1TeamOne.setValue(tFieldRound2Match1Team1.getText());
            cBoxRound2Match1TeamTwo.setValue(tFieldRound2Match1Team2.getText());
            Round2match1Box.getChildren().add(0, cBoxRound2Match1TeamOne); // Changed
            Round2match1Box.getChildren().add(1, cBoxRound2Match1TeamTwo); // Changed
            cBoxRound2Match1.setVisible(false);
            btnRound2Match1Submit.setVisible(false);


            Round2match1btnBox.getChildren().remove(btnRound2Match1Edit);
            Round2match1btnBox.getChildren().add(0,btnRound2Match1Save);


        }
        else if(event.getSource().equals(btnRound2Match1Save))
        {
            tFieldRound2Match1Team1.setText(cBoxRound2Match1TeamOne.getValue());// This also changed
            tFieldRound2Match1Team2.setText(cBoxRound2Match1TeamTwo.getValue()); // This also changed
            Round2match1Box.getChildren().removeAll(cBoxRound2Match1TeamOne, cBoxRound2Match1TeamTwo);
            Round2match1Box.getChildren().add(0,tFieldRound2Match1Team1);
            Round2match1Box.getChildren().add(1,tFieldRound2Match1Team2);
            Round2match1btnBox.getChildren().remove(btnRound2Match1Save);
            Round2match1btnBox.getChildren().add(0,btnRound2Match1Edit);

            cBoxRound2Match1.getItems().clear();
            cBoxRound2Match1.getItems().addAll(tFieldRound2Match1Team1.getText(),tFieldRound2Match1Team2.getText());
            cBoxRound2Match1.setVisible(true);
            btnRound2Match1Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ONE----------------------------------------

        //---------------------------------------MATCH TWO--------------------------------------------
        if(event.getSource().equals(btnRound2Match2Edit))
        {
            Round2match2Box.getChildren().removeAll(tFieldRound2Match2Team1,tFieldRound2Match2Team2);
            cBoxRound2Match2TeamOne.setMinSize(175,15);
            cBoxRound2Match2TeamTwo.setMinSize(175,15);
            cBoxRound2Match2TeamOne.setValue(tFieldRound2Match2Team1.getText());
            cBoxRound2Match2TeamTwo.setValue(tFieldRound2Match2Team2.getText());
            Round2match2Box.getChildren().add(0, cBoxRound2Match2TeamOne);
            Round2match2Box.getChildren().add(1, cBoxRound2Match2TeamTwo);
            cBoxRound2Match2.setVisible(false);
            btnRound2Match2Submit.setVisible(false);


            Round2match2btnBox.getChildren().remove(btnRound2Match2Edit);
            Round2match2btnBox.getChildren().add(0,btnRound2Match2Save);


        }
        else if(event.getSource().equals(btnRound2Match2Save))
        {
            tFieldRound2Match2Team1.setText(cBoxRound2Match2TeamOne.getValue());
            tFieldRound2Match2Team2.setText(cBoxRound2Match2TeamTwo.getValue());
            Round2match2Box.getChildren().removeAll(cBoxRound2Match2TeamOne, cBoxRound2Match2TeamTwo);
            Round2match2Box.getChildren().add(0,tFieldRound2Match2Team1);
            Round2match2Box.getChildren().add(1,tFieldRound2Match2Team2);
            Round2match2btnBox.getChildren().remove(btnRound2Match2Save);
            Round2match2btnBox.getChildren().add(0,btnRound2Match2Edit);

            cBoxRound2Match2.getItems().clear();
            cBoxRound2Match2.getItems().addAll(tFieldRound2Match2Team1.getText(),tFieldRound2Match2Team2.getText());
            cBoxRound2Match2.setVisible(true);
            btnRound2Match2Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWO----------------------------------------

        //---------------------------------------MATCH THREE--------------------------------------------
        if(event.getSource().equals(btnRound2Match3Edit))
        {
            Round2match3Box.getChildren().removeAll(tFieldRound2Match3Team1,tFieldRound2Match3Team2);
            cBoxRound2Match3TeamOne.setMinSize(175,15);
            cBoxRound2Match3TeamTwo.setMinSize(175,15);
            cBoxRound2Match3TeamOne.setValue(tFieldRound2Match3Team1.getText());
            cBoxRound2Match3TeamTwo.setValue(tFieldRound2Match3Team2.getText());
            Round2match3Box.getChildren().add(0, cBoxRound2Match3TeamOne);
            Round2match3Box.getChildren().add(1, cBoxRound2Match3TeamTwo);
            cBoxRound2Match3.setVisible(false);
            btnRound2Match3Submit.setVisible(false);


            Round2match3btnBox.getChildren().remove(btnRound2Match3Edit);
            Round2match3btnBox.getChildren().add(0,btnRound2Match3Save);


        }
        else if(event.getSource().equals(btnRound2Match3Save))
        {
            tFieldRound2Match3Team1.setText(cBoxRound2Match3TeamOne.getValue());
            tFieldRound2Match3Team2.setText(cBoxRound2Match3TeamTwo.getValue());
            Round2match3Box.getChildren().removeAll(cBoxRound2Match3TeamOne, cBoxRound2Match3TeamTwo);
            Round2match3Box.getChildren().add(0,tFieldRound2Match3Team1);
            Round2match3Box.getChildren().add(1,tFieldRound2Match3Team2);
            Round2match3btnBox.getChildren().remove(btnRound2Match3Save);
            Round2match3btnBox.getChildren().add(0,btnRound2Match3Edit);

            cBoxRound2Match3.getItems().clear();
            cBoxRound2Match3.getItems().addAll(tFieldRound2Match3Team1.getText(),tFieldRound2Match3Team2.getText());
            cBoxRound2Match3.setVisible(true);
            btnRound2Match3Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THREE----------------------------------------

        //---------------------------------------MATCH FOUR--------------------------------------------
        if(event.getSource().equals(btnRound2Match4Edit))
        {
            Round2match4Box.getChildren().removeAll(tFieldRound2Match4Team1,tFieldRound2Match4Team2);
            cBoxRound2Match4TeamOne.setMinSize(175,15);
            cBoxRound2Match4TeamTwo.setMinSize(175,15);
            cBoxRound2Match4TeamOne.setValue(tFieldRound2Match4Team1.getText());
            cBoxRound2Match4TeamTwo.setValue(tFieldRound2Match4Team2.getText());
            Round2match4Box.getChildren().add(0, cBoxRound2Match4TeamOne);
            Round2match4Box.getChildren().add(1, cBoxRound2Match4TeamTwo);
            cBoxRound2Match4.setVisible(false);
            btnRound2Match4Submit.setVisible(false);


            Round2match4btnBox.getChildren().remove(btnRound2Match4Edit);
            Round2match4btnBox.getChildren().add(0,btnRound2Match4Save);


        }
        else if(event.getSource().equals(btnRound2Match4Save))
        {
            tFieldRound2Match4Team1.setText(cBoxRound2Match4TeamOne.getValue());
            tFieldRound2Match4Team2.setText(cBoxRound2Match4TeamTwo.getValue());
            Round2match4Box.getChildren().removeAll(cBoxRound2Match4TeamOne, cBoxRound2Match4TeamTwo);
            Round2match4Box.getChildren().add(0,tFieldRound2Match4Team1);
            Round2match4Box.getChildren().add(1,tFieldRound2Match4Team2);
            Round2match4btnBox.getChildren().remove(btnRound2Match4Save);
            Round2match4btnBox.getChildren().add(0,btnRound2Match4Edit);

            cBoxRound2Match4.getItems().clear();
            cBoxRound2Match4.getItems().addAll(tFieldRound2Match4Team1.getText(),tFieldRound2Match4Team2.getText());
            cBoxRound2Match4.setVisible(true);
            btnRound2Match4Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FOUR----------------------------------------

        //---------------------------------------MATCH FIVE--------------------------------------------
        if(event.getSource().equals(btnRound2Match5Edit))
        {
            Round2match5Box.getChildren().removeAll(tFieldRound2Match5Team1,tFieldRound2Match5Team2);
            cBoxRound2Match5TeamOne.setMinSize(175,15);
            cBoxRound2Match5TeamTwo.setMinSize(175,15);
            cBoxRound2Match5TeamOne.setValue(tFieldRound2Match5Team1.getText());
            cBoxRound2Match5TeamTwo.setValue(tFieldRound2Match5Team2.getText());
            Round2match5Box.getChildren().add(0, cBoxRound2Match5TeamOne);
            Round2match5Box.getChildren().add(1, cBoxRound2Match5TeamTwo);
            cBoxRound2Match5.setVisible(false);
            btnRound2Match5Submit.setVisible(false);


            Round2match5btnBox.getChildren().remove(btnRound2Match5Edit);
            Round2match5btnBox.getChildren().add(0,btnRound2Match5Save);


        }
        else if(event.getSource().equals(btnRound2Match5Save))
        {
            tFieldRound2Match5Team1.setText(cBoxRound2Match5TeamOne.getValue());
            tFieldRound2Match5Team2.setText(cBoxRound2Match5TeamTwo.getValue());
            Round2match5Box.getChildren().removeAll(cBoxRound2Match5TeamOne, cBoxRound2Match5TeamTwo);
            Round2match5Box.getChildren().add(0,tFieldRound2Match5Team1);
            Round2match6Box.getChildren().add(1,tFieldRound2Match5Team2);
            Round2match5btnBox.getChildren().remove(btnRound2Match5Save);
            Round2match5btnBox.getChildren().add(0,btnRound2Match5Edit);

            cBoxRound2Match5.getItems().clear();
            cBoxRound2Match5.getItems().addAll(tFieldRound2Match5Team1.getText(),tFieldRound2Match5Team2.getText());
            cBoxRound2Match5.setVisible(true);
            btnRound2Match5Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FIVE----------------------------------------

        //---------------------------------------MATCH SIX--------------------------------------------
        if(event.getSource().equals(btnRound2Match6Edit))
        {
            Round2match6Box.getChildren().removeAll(tFieldRound2Match6Team1,tFieldRound2Match6Team2);
            cBoxRound2Match6TeamOne.setMinSize(175,15);
            cBoxRound2Match6TeamTwo.setMinSize(175,15);
            cBoxRound2Match6TeamOne.setValue(tFieldRound2Match6Team1.getText());
            cBoxRound2Match6TeamTwo.setValue(tFieldRound2Match6Team2.getText());
            Round2match6Box.getChildren().add(0, cBoxRound2Match6TeamOne);
            Round2match6Box.getChildren().add(1, cBoxRound2Match6TeamTwo);
            cBoxRound2Match6.setVisible(false);
            btnRound2Match6Submit.setVisible(false);


            Round2match6btnBox.getChildren().remove(btnRound2Match6Edit);
            Round2match6btnBox.getChildren().add(0,btnRound2Match6Save);


        }
        else if(event.getSource().equals(btnRound2Match6Save))
        {
            tFieldRound2Match6Team1.setText(cBoxRound2Match6TeamOne.getValue());
            tFieldRound2Match6Team2.setText(cBoxRound2Match6TeamTwo.getValue());
            Round2match6Box.getChildren().removeAll(cBoxRound2Match6TeamOne, cBoxRound2Match6TeamTwo);
            Round2match6Box.getChildren().add(0,tFieldRound2Match6Team1);
            Round2match6Box.getChildren().add(1,tFieldRound2Match6Team2);
            Round2match6btnBox.getChildren().remove(btnRound2Match6Save);
            Round2match6btnBox.getChildren().add(0,btnRound2Match6Edit);

            cBoxRound2Match6.getItems().clear();
            cBoxRound2Match6.getItems().addAll(tFieldRound2Match6Team1.getText(),tFieldRound2Match6Team2.getText());
            cBoxRound2Match6.setVisible(true);
            btnRound2Match6Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SIX----------------------------------------

        //---------------------------------------MATCH SEVEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match7Edit))
        {
            Round2match7Box.getChildren().removeAll(tFieldRound2Match7Team1,tFieldRound2Match7Team2);
            cBoxRound2Match7TeamOne.setMinSize(175,15);
            cBoxRound2Match7TeamTwo.setMinSize(175,15);
            cBoxRound2Match7TeamOne.setValue(tFieldRound2Match7Team1.getText());
            cBoxRound2Match7TeamTwo.setValue(tFieldRound2Match7Team2.getText());
            Round2match7Box.getChildren().add(0, cBoxRound2Match7TeamOne);
            Round2match7Box.getChildren().add(1, cBoxRound2Match7TeamTwo);
            cBoxRound2Match7.setVisible(false);
            btnRound2Match7Submit.setVisible(false);


            Round2match7btnBox.getChildren().remove(btnRound2Match7Edit);
            Round2match7btnBox.getChildren().add(0,btnRound2Match7Save);


        }
        else if(event.getSource().equals(btnRound2Match7Save))
        {
            tFieldRound2Match7Team1.setText(cBoxRound2Match7TeamOne.getValue());
            tFieldRound2Match7Team2.setText(cBoxRound2Match7TeamTwo.getValue());
            Round2match7Box.getChildren().removeAll(cBoxRound2Match7TeamOne, cBoxRound2Match7TeamTwo);
            Round2match7Box.getChildren().add(0,tFieldRound2Match7Team1);
            Round2match7Box.getChildren().add(1,tFieldRound2Match7Team2);
            Round2match7btnBox.getChildren().remove(btnRound2Match7Save);
            Round2match7btnBox.getChildren().add(0,btnRound2Match7Edit);

            cBoxRound2Match7.getItems().clear();
            cBoxRound2Match7.getItems().addAll(tFieldRound2Match7Team1.getText(),tFieldRound2Match7Team2.getText());
            cBoxRound2Match7.setVisible(true);
            btnRound2Match7Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SEVEN----------------------------------------

        //---------------------------------------MATCH EIGHT--------------------------------------------
        if(event.getSource().equals(btnRound2Match8Edit))
        {
            Round2match8Box.getChildren().removeAll(tFieldRound2Match8Team1,tFieldRound2Match8Team2);
            cBoxRound2Match8TeamOne.setMinSize(175,15);
            cBoxRound2Match8TeamTwo.setMinSize(175,15);
            cBoxRound2Match8TeamOne.setValue(tFieldRound2Match8Team1.getText());
            cBoxRound2Match8TeamTwo.setValue(tFieldRound2Match8Team2.getText());
            Round2match8Box.getChildren().add(0, cBoxRound2Match8TeamOne);
            Round2match8Box.getChildren().add(1, cBoxRound2Match8TeamTwo);
            cBoxRound2Match8.setVisible(false);
            btnRound2Match8Submit.setVisible(false);


            Round2match8btnBox.getChildren().remove(btnRound2Match8Edit);
            Round2match8btnBox.getChildren().add(0,btnRound2Match8Save);


        }
        else if(event.getSource().equals(btnRound2Match8Save))
        {
            tFieldRound2Match8Team1.setText(cBoxRound2Match8TeamOne.getValue());
            tFieldRound2Match8Team2.setText(cBoxRound2Match8TeamTwo.getValue());
            Round2match8Box.getChildren().removeAll(cBoxRound2Match8TeamOne, cBoxRound2Match8TeamTwo);
            Round2match8Box.getChildren().add(0,tFieldRound2Match8Team1);
            Round2match8Box.getChildren().add(1,tFieldRound2Match8Team2);
            Round2match8btnBox.getChildren().remove(btnRound2Match8Save);
            Round2match8btnBox.getChildren().add(0,btnRound2Match8Edit);

            cBoxRound2Match8.getItems().clear();
            cBoxRound2Match8.getItems().addAll(tFieldRound2Match8Team1.getText(),tFieldRound2Match8Team2.getText());
            cBoxRound2Match8.setVisible(true);
            btnRound2Match8Submit.setVisible(true);

        }
        //-------------------------------------END MATCH EIGHT----------------------------------------

        //---------------------------------------MATCH NINE--------------------------------------------
        if(event.getSource().equals(btnRound2Match9Edit))
        {
            Round2match9Box.getChildren().removeAll(tFieldRound2Match9Team1,tFieldRound2Match9Team2);
            cBoxRound2Match9TeamOne.setMinSize(175,15);
            cBoxRound2Match9TeamTwo.setMinSize(175,15);
            cBoxRound2Match9TeamOne.setValue(tFieldRound2Match9Team1.getText());
            cBoxRound2Match9TeamTwo.setValue(tFieldRound2Match9Team2.getText());
            Round2match9Box.getChildren().add(0, cBoxRound2Match9TeamOne);
            Round2match9Box.getChildren().add(1, cBoxRound2Match9TeamTwo);
            cBoxRound2Match9.setVisible(false);
            btnRound2Match9Submit.setVisible(false);


            Round2match9btnBox.getChildren().remove(btnRound2Match9Edit);
            Round2match9btnBox.getChildren().add(0,btnRound2Match9Save);


        }
        else if(event.getSource().equals(btnRound2Match9Save))
        {
            tFieldRound2Match9Team1.setText(cBoxRound2Match9TeamOne.getValue());
            tFieldRound2Match9Team2.setText(cBoxRound2Match9TeamTwo.getValue());
            Round2match9Box.getChildren().removeAll(cBoxRound2Match9TeamOne, cBoxRound2Match9TeamTwo);
            Round2match9Box.getChildren().add(0,tFieldRound2Match9Team1);
            Round2match9Box.getChildren().add(1,tFieldRound2Match9Team2);
            Round2match9btnBox.getChildren().remove(btnRound2Match9Save);
            Round2match9btnBox.getChildren().add(0,btnRound2Match9Edit);

            cBoxRound2Match9.getItems().clear();
            cBoxRound2Match9.getItems().addAll(tFieldRound2Match9Team1.getText(),tFieldRound2Match9Team2.getText());
            cBoxRound2Match9.setVisible(true);
            btnRound2Match9Submit.setVisible(true);

        }
        //-------------------------------------END MATCH NINE----------------------------------------

        //---------------------------------------MATCH TEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match10Edit))
        {
            Round2match10Box.getChildren().removeAll(tFieldRound2Match10Team1,tFieldRound2Match10Team2);
            cBoxRound2Match10TeamOne.setMinSize(175,15);
            cBoxRound2Match10TeamTwo.setMinSize(175,15);
            cBoxRound2Match10TeamOne.setValue(tFieldRound2Match10Team1.getText());
            cBoxRound2Match10TeamTwo.setValue(tFieldRound2Match10Team2.getText());
            Round2match10Box.getChildren().add(0, cBoxRound2Match10TeamOne);
            Round2match10Box.getChildren().add(1, cBoxRound2Match10TeamTwo);
            cBoxRound2Match10.setVisible(false);
            btnRound2Match10Submit.setVisible(false);


            Round2match10btnBox.getChildren().remove(btnRound2Match10Edit);
            Round2match10btnBox.getChildren().add(0,btnRound2Match10Save);


        }
        else if(event.getSource().equals(btnRound2Match10Save))
        {
            tFieldRound2Match10Team1.setText(cBoxRound2Match10TeamOne.getValue());
            tFieldRound2Match10Team2.setText(cBoxRound2Match10TeamTwo.getValue());
            Round2match10Box.getChildren().removeAll(cBoxRound2Match10TeamOne, cBoxRound2Match10TeamTwo);
            Round2match10Box.getChildren().add(0,tFieldRound2Match10Team1);
            Round2match10Box.getChildren().add(1,tFieldRound2Match10Team2);
            Round2match10btnBox.getChildren().remove(btnRound2Match10Save);
            Round2match10btnBox.getChildren().add(0,btnRound2Match10Edit);

            cBoxRound2Match10.getItems().clear();
            cBoxRound2Match10.getItems().addAll(tFieldRound2Match10Team1.getText(),tFieldRound2Match10Team2.getText());
            cBoxRound2Match10.setVisible(true);
            btnRound2Match10Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TEN----------------------------------------

        //---------------------------------------MATCH ELEVEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match11Edit))
        {
            Round2match11Box.getChildren().removeAll(tFieldRound2Match11Team1,tFieldRound2Match11Team2);
            cBoxRound2Match11TeamOne.setMinSize(175,15);
            cBoxRound2Match11TeamTwo.setMinSize(175,15);
            cBoxRound2Match11TeamOne.setValue(tFieldRound2Match11Team1.getText());
            cBoxRound2Match11TeamTwo.setValue(tFieldRound2Match11Team2.getText());
            Round2match11Box.getChildren().add(0, cBoxRound2Match11TeamOne);
            Round2match11Box.getChildren().add(1, cBoxRound2Match11TeamTwo);
            cBoxRound2Match11.setVisible(false);
            btnRound2Match11Submit.setVisible(false);


            Round2match11btnBox.getChildren().remove(btnRound2Match11Edit);
            Round2match11btnBox.getChildren().add(0,btnRound2Match11Save);


        }
        else if(event.getSource().equals(btnRound2Match11Save))
        {
            tFieldRound2Match11Team1.setText(cBoxRound2Match11TeamOne.getValue());
            tFieldRound2Match11Team2.setText(cBoxRound2Match11TeamTwo.getValue());
            Round2match11Box.getChildren().removeAll(cBoxRound2Match11TeamOne, cBoxRound2Match11TeamTwo);
            Round2match11Box.getChildren().add(0,tFieldRound2Match11Team1);
            Round2match11Box.getChildren().add(1,tFieldRound2Match11Team2);
            Round2match11btnBox.getChildren().remove(btnRound2Match11Save);
            Round2match11btnBox.getChildren().add(0,btnRound2Match11Edit);

            cBoxRound2Match11.getItems().clear();
            cBoxRound2Match11.getItems().addAll(tFieldRound2Match11Team1.getText(),tFieldRound2Match11Team2.getText());
            cBoxRound2Match11.setVisible(true);
            btnRound2Match11Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ELEVEN----------------------------------------

        //---------------------------------------MATCH TWELVE--------------------------------------------
        if(event.getSource().equals(btnRound2Match12Edit))
        {
            Round2match12Box.getChildren().removeAll(tFieldRound2Match12Team1,tFieldRound2Match12Team2);
            cBoxRound2Match12TeamOne.setMinSize(175,15);
            cBoxRound2Match12TeamTwo.setMinSize(175,15);
            cBoxRound2Match12TeamOne.setValue(tFieldRound2Match12Team1.getText());
            cBoxRound2Match12TeamTwo.setValue(tFieldRound2Match12Team2.getText());
            Round2match12Box.getChildren().add(0, cBoxRound2Match12TeamOne);
            Round2match12Box.getChildren().add(1, cBoxRound2Match12TeamTwo);
            cBoxRound2Match12.setVisible(false);
            btnRound2Match12Submit.setVisible(false);


            Round2match12btnBox.getChildren().remove(btnRound2Match12Edit);
            Round2match12btnBox.getChildren().add(0,btnRound2Match12Save);


        }
        else if(event.getSource().equals(btnRound2Match12Save))
        {
            tFieldRound2Match12Team1.setText(cBoxRound2Match12TeamOne.getValue());
            tFieldRound2Match12Team2.setText(cBoxRound2Match12TeamTwo.getValue());
            Round2match12Box.getChildren().removeAll(cBoxRound2Match12TeamOne, cBoxRound2Match12TeamTwo);
            Round2match12Box.getChildren().add(0,tFieldRound2Match12Team1);
            Round2match12Box.getChildren().add(1,tFieldRound2Match12Team2);
            Round2match12btnBox.getChildren().remove(btnRound2Match12Save);
            Round2match12btnBox.getChildren().add(0,btnRound2Match12Edit);

            cBoxRound2Match12.getItems().clear();
            cBoxRound2Match12.getItems().addAll(tFieldRound2Match12Team1.getText(),tFieldRound2Match12Team2.getText());
            cBoxRound2Match12.setVisible(true);
            btnRound2Match12Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWELVE----------------------------------------

        //---------------------------------------MATCH THIRTEEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match13Edit))
        {
            Round2match13Box.getChildren().removeAll(tFieldRound2Match13Team1,tFieldRound2Match13Team2);
            cBoxRound2Match13TeamOne.setMinSize(175,15);
            cBoxRound2Match13TeamTwo.setMinSize(175,15);
            cBoxRound2Match13TeamOne.setValue(tFieldRound2Match13Team1.getText());
            cBoxRound2Match13TeamTwo.setValue(tFieldRound2Match13Team2.getText());
            Round2match13Box.getChildren().add(0, cBoxRound2Match13TeamOne);
            Round2match13Box.getChildren().add(1, cBoxRound2Match13TeamTwo);
            cBoxRound2Match13.setVisible(false);
            btnRound2Match13Submit.setVisible(false);


            Round2match13btnBox.getChildren().remove(btnRound2Match13Edit);
            Round2match13btnBox.getChildren().add(0,btnRound2Match13Save);


        }
        else if(event.getSource().equals(btnRound2Match13Save))
        {
            tFieldRound2Match13Team1.setText(cBoxRound2Match13TeamOne.getValue());
            tFieldRound2Match13Team2.setText(cBoxRound2Match13TeamTwo.getValue());
            Round2match13Box.getChildren().removeAll(cBoxRound2Match13TeamOne, cBoxRound2Match13TeamTwo);
            Round2match13Box.getChildren().add(0,tFieldRound2Match13Team1);
            Round2match13Box.getChildren().add(1,tFieldRound2Match13Team2);
            Round2match13btnBox.getChildren().remove(btnRound2Match13Save);
            Round2match13btnBox.getChildren().add(0,btnRound2Match13Edit);

            cBoxRound2Match13.getItems().clear();
            cBoxRound2Match13.getItems().addAll(tFieldRound2Match13Team1.getText(),tFieldRound2Match13Team2.getText());
            cBoxRound2Match13.setVisible(true);
            btnRound2Match13Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THIRTEEN----------------------------------------

        //---------------------------------------MATCH FOURTEEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match14Edit))
        {
            Round2match14Box.getChildren().removeAll(tFieldRound2Match14Team1,tFieldRound2Match14Team2);
            cBoxRound2Match14TeamOne.setMinSize(175,15);
            cBoxRound2Match14TeamTwo.setMinSize(175,15);
            cBoxRound2Match14TeamOne.setValue(tFieldRound2Match14Team1.getText());
            cBoxRound2Match14TeamTwo.setValue(tFieldRound2Match14Team2.getText());
            Round2match14Box.getChildren().add(0, cBoxRound2Match14TeamOne);
            Round2match14Box.getChildren().add(1, cBoxRound2Match14TeamTwo);
            cBoxRound2Match14.setVisible(false);
            btnRound2Match14Submit.setVisible(false);


            Round2match14btnBox.getChildren().remove(btnRound2Match14Edit);
            Round2match14btnBox.getChildren().add(0,btnRound2Match14Save);


        }
        else if(event.getSource().equals(btnRound2Match14Save))
        {
            tFieldRound2Match14Team1.setText(cBoxRound2Match14TeamOne.getValue());
            tFieldRound2Match14Team2.setText(cBoxRound2Match14TeamTwo.getValue());
            Round2match14Box.getChildren().removeAll(cBoxRound2Match14TeamOne, cBoxRound2Match14TeamTwo);
            Round2match14Box.getChildren().add(0,tFieldRound2Match14Team1);
            Round2match14Box.getChildren().add(1,tFieldRound2Match14Team2);
            Round2match14btnBox.getChildren().remove(btnRound2Match14Save);
            Round2match14btnBox.getChildren().add(0,btnRound2Match14Edit);

            cBoxRound2Match14.getItems().clear();
            cBoxRound2Match14.getItems().addAll(tFieldRound2Match14Team1.getText(),tFieldRound2Match14Team2.getText());
            cBoxRound2Match14.setVisible(true);
            btnRound2Match14Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FOURTEEN----------------------------------------

        //---------------------------------------MATCH FIFTEEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match15Edit))
        {
            Round2match15Box.getChildren().removeAll(tFieldRound2Match15Team1,tFieldRound2Match15Team2);
            cBoxRound2Match15TeamOne.setMinSize(175,15);
            cBoxRound2Match15TeamTwo.setMinSize(175,15);
            cBoxRound2Match15TeamOne.setValue(tFieldRound2Match15Team1.getText());
            cBoxRound2Match15TeamTwo.setValue(tFieldRound2Match15Team2.getText());
            Round2match15Box.getChildren().add(0, cBoxRound2Match15TeamOne);
            Round2match15Box.getChildren().add(1, cBoxRound2Match15TeamTwo);
            cBoxRound2Match15.setVisible(false);
            btnRound2Match15Submit.setVisible(false);


            Round2match15btnBox.getChildren().remove(btnRound2Match15Edit);
            Round2match15btnBox.getChildren().add(0,btnRound2Match15Save);


        }
        else if(event.getSource().equals(btnRound2Match15Save))
        {
            tFieldRound2Match15Team1.setText(cBoxRound2Match15TeamOne.getValue());
            tFieldRound2Match15Team2.setText(cBoxRound2Match15TeamTwo.getValue());
            Round2match15Box.getChildren().removeAll(cBoxRound2Match15TeamOne, cBoxRound2Match15TeamTwo);
            Round2match15Box.getChildren().add(0,tFieldRound2Match15Team1);
            Round2match15Box.getChildren().add(1,tFieldRound2Match15Team2);
            Round2match15btnBox.getChildren().remove(btnRound2Match15Save);
            Round2match15btnBox.getChildren().add(0,btnRound2Match15Edit);

            cBoxRound2Match15.getItems().clear();
            cBoxRound2Match15.getItems().addAll(tFieldRound2Match15Team1.getText(),tFieldRound2Match15Team2.getText());
            cBoxRound2Match15.setVisible(true);
            btnRound2Match15Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FIFTEEN----------------------------------------

        //---------------------------------------MATCH SIXTEEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match16Edit))
        {
            Round2match16Box.getChildren().removeAll(tFieldRound2Match16Team1,tFieldRound2Match16Team2);
            cBoxRound2Match16TeamOne.setMinSize(175,15);
            cBoxRound2Match16TeamTwo.setMinSize(175,15);
            cBoxRound2Match16TeamOne.setValue(tFieldRound2Match16Team1.getText());
            cBoxRound2Match16TeamTwo.setValue(tFieldRound2Match16Team2.getText());
            Round2match16Box.getChildren().add(0, cBoxRound2Match16TeamOne);
            Round2match16Box.getChildren().add(1, cBoxRound2Match16TeamTwo);
            cBoxRound2Match16.setVisible(false);
            btnRound2Match16Submit.setVisible(false);


            Round2match16btnBox.getChildren().remove(btnRound2Match16Edit);
            Round2match16btnBox.getChildren().add(0,btnRound2Match16Save);


        }
        else if(event.getSource().equals(btnRound2Match16Save))
        {
            tFieldRound2Match16Team1.setText(cBoxRound2Match16TeamOne.getValue());
            tFieldRound2Match16Team2.setText(cBoxRound2Match16TeamTwo.getValue());
            Round2match16Box.getChildren().removeAll(cBoxRound2Match16TeamOne, cBoxRound2Match16TeamTwo);
            Round2match16Box.getChildren().add(0,tFieldRound2Match16Team1);
            Round2match16Box.getChildren().add(1,tFieldRound2Match16Team2);
            Round2match16btnBox.getChildren().remove(btnRound2Match16Save);
            Round2match16btnBox.getChildren().add(0,btnRound2Match16Edit);

            cBoxRound2Match16.getItems().clear();
            cBoxRound2Match16.getItems().addAll(tFieldRound2Match16Team1.getText(),tFieldRound2Match16Team2.getText());
            cBoxRound2Match16.setVisible(true);
            btnRound2Match16Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SIXTEEN----------------------------------------

    }//END EDIT SCHOOL FIELDS

    public void round2MatchPairing()
    {
        String [] round1Winners = OpenFile.getRoundOneWinners();

        if(round1Winners[0].length() > 1)
            tFieldRound2Match1Team1.setText(round1Winners[0]);

        if(round1Winners[1].length() > 1)
            tFieldRound2Match1Team2.setText(round1Winners[1]);

        if(round1Winners[2].length() > 1)
            tFieldRound2Match2Team1.setText(round1Winners[2]);

        if(round1Winners[3].length() > 1)
            tFieldRound2Match2Team2.setText(round1Winners[3]);

        if(round1Winners[4].length() > 1)
            tFieldRound2Match3Team1.setText(round1Winners[4]);

        if(round1Winners[5].length() > 1)
            tFieldRound2Match3Team2.setText(round1Winners[5]);

        if(round1Winners[6].length() > 1)
            tFieldRound2Match4Team1.setText(round1Winners[6]);

        if(round1Winners[7].length() > 1)
            tFieldRound2Match4Team2.setText(round1Winners[7]);

        if(round1Winners[8].length() > 1)
            tFieldRound2Match5Team1.setText(round1Winners[8]);

        if(round1Winners[9].length() > 1)
            tFieldRound2Match5Team2.setText(round1Winners[9]);

        if(round1Winners[10].length() > 1)
            tFieldRound2Match6Team1.setText(round1Winners[10]);

        if(round1Winners[11].length() > 1)
            tFieldRound2Match6Team2.setText(round1Winners[11]);

        if(round1Winners[12].length() > 1)
            tFieldRound2Match7Team1.setText(round1Winners[12]);

        if(round1Winners[13].length() > 1)
            tFieldRound2Match7Team2.setText(round1Winners[13]);

        if(round1Winners[14].length() > 1)
            tFieldRound2Match8Team1.setText(round1Winners[14]);

        if(round1Winners[15].length() > 1)
            tFieldRound2Match8Team2.setText(round1Winners[15]);

        if(round1Winners[16].length() > 1)
            tFieldRound2Match9Team1.setText(round1Winners[16]);

        if(round1Winners[17].length() > 1)
            tFieldRound2Match9Team2.setText(round1Winners[17]);

        if(round1Winners[18].length() > 1)
            tFieldRound2Match10Team1.setText(round1Winners[18]);

        if(round1Winners[19].length() > 1)
            tFieldRound2Match10Team2.setText(round1Winners[19]);

        if(round1Winners[20].length() > 1)
            tFieldRound2Match11Team1.setText(round1Winners[20]);

        if(round1Winners[21].length() > 1)
            tFieldRound2Match11Team2.setText(round1Winners[21]);

        if(round1Winners[22].length() > 1)
            tFieldRound2Match12Team1.setText(round1Winners[22]);

        if(round1Winners[23].length() > 1)
            tFieldRound2Match12Team2.setText(round1Winners[23]);

        if(round1Winners[24].length() > 1)
            tFieldRound2Match13Team1.setText(round1Winners[24]);

        if(round1Winners[25].length() > 1)
            tFieldRound2Match13Team2.setText(round1Winners[25]);

        if(round1Winners[26].length() > 1)
            tFieldRound2Match14Team1.setText(round1Winners[26]);

        if(round1Winners[27].length() > 1)
            tFieldRound2Match14Team2.setText(round1Winners[27]);

        if(round1Winners[28].length() > 1)
            tFieldRound2Match15Team1.setText(round1Winners[28]);

        if(round1Winners[29].length() > 1)
            tFieldRound2Match15Team2.setText(round1Winners[29]);

        if(round1Winners[30].length() > 1)
            tFieldRound2Match16Team1.setText(round1Winners[30]);

        if(round1Winners[31].length() > 1)
            tFieldRound2Match16Team2.setText(round1Winners[31]);

        if(round1Winners[0].length() > 1 & round1Winners[1].length() > 1)
            cBoxRound2Match1.getItems().addAll(round1Winners[0], round1Winners[1]);

        if(round1Winners[2].length() > 1 & round1Winners[3].length() > 1)
            cBoxRound2Match2.getItems().addAll(round1Winners[2], round1Winners[3]);

        if(round1Winners[4].length() > 1 & round1Winners[5].length() > 1)
            cBoxRound2Match3.getItems().addAll(round1Winners[4], round1Winners[5]);

        if(round1Winners[6].length() > 1 & round1Winners[7].length() > 1)
            cBoxRound2Match4.getItems().addAll(round1Winners[6], round1Winners[7]);

        if(round1Winners[8].length() > 1 & round1Winners[9].length() > 1)
            cBoxRound2Match5.getItems().addAll(round1Winners[8], round1Winners[9]);

        if(round1Winners[10].length() > 1 & round1Winners[11].length() > 1)
            cBoxRound2Match6.getItems().addAll(round1Winners[10], round1Winners[11]);

        if(round1Winners[12].length() > 1 & round1Winners[13].length() > 1)
            cBoxRound2Match7.getItems().addAll(round1Winners[12], round1Winners[13]);

        if(round1Winners[14].length() > 1 & round1Winners[15].length() > 1)
            cBoxRound2Match8.getItems().addAll(round1Winners[14], round1Winners[15]);

        if(round1Winners[16].length() > 1 & round1Winners[17].length() > 1)
            cBoxRound2Match9.getItems().addAll(round1Winners[16], round1Winners[17]);

        if(round1Winners[18].length() > 1 & round1Winners[19].length() > 1)
            cBoxRound2Match10.getItems().addAll(round1Winners[18], round1Winners[19]);

        if(round1Winners[20].length() > 1 & round1Winners[21].length() > 1)
            cBoxRound2Match11.getItems().addAll(round1Winners[20], round1Winners[21]);

        if(round1Winners[22].length() > 1 & round1Winners[23].length() > 1)
            cBoxRound2Match12.getItems().addAll(round1Winners[22], round1Winners[23]);

        if(round1Winners[24].length() > 1 & round1Winners[25].length() > 1)
            cBoxRound2Match13.getItems().addAll(round1Winners[24], round1Winners[25]);

        if(round1Winners[26].length() > 1 & round1Winners[27].length() > 1)
            cBoxRound2Match14.getItems().addAll(round1Winners[26], round1Winners[27]);

        if(round1Winners[28].length() > 1 & round1Winners[29].length() > 1)
            cBoxRound2Match15.getItems().addAll(round1Winners[28], round1Winners[29]);

        if(round1Winners[30].length() > 1 & round1Winners[31].length() > 1)
            cBoxRound2Match16.getItems().addAll(round1Winners[30], round1Winners[31]);

    }//END ROUND 2 MATCH PAIRING
    //-------------------------------------------------END ROUND TWO CONFIGURATIONS----------------------------------------------

    //---------------------------------------------------ROUND THREE CONFIGURATIONS------------------------------------------------
    public void buildRoundThreeScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");

        VBox round3Match1BoxHolder = new VBox(); VBox round3Match2BoxHolder = new VBox();
        VBox round3Match3BoxHolder = new VBox(); VBox round3Match4BoxHolder = new VBox();
        VBox round3Match5BoxHolder = new VBox(); VBox round3Match6BoxHolder = new VBox();
        VBox round3Match7BoxHolder = new VBox(); VBox round3Match8BoxHolder = new VBox();

        Round3match1Box = new HBox(); Round3match2Box = new HBox();
        Round3match3Box = new HBox(); Round3match4Box = new HBox();
        Round3match5Box = new HBox(); Round3match6Box = new HBox();
        Round3match7Box = new HBox(); Round3match8Box = new HBox();

        Round3match1btnBox = new HBox();Round3match2btnBox = new HBox();
        Round3match3btnBox = new HBox();Round3match4btnBox = new HBox();
        Round3match5btnBox = new HBox();Round3match6btnBox = new HBox();
        Round3match7btnBox = new HBox();Round3match8btnBox = new HBox();

        cBoxRound3Match1TeamOne = new ChoiceBox<>();cBoxRound3Match1TeamTwo = new ChoiceBox<>();
        cBoxRound3Match2TeamOne = new ChoiceBox<>();cBoxRound3Match2TeamTwo = new ChoiceBox<>();
        cBoxRound3Match3TeamOne = new ChoiceBox<>();cBoxRound3Match3TeamTwo = new ChoiceBox<>();
        cBoxRound3Match4TeamOne = new ChoiceBox<>();cBoxRound3Match4TeamTwo = new ChoiceBox<>();
        cBoxRound3Match5TeamOne = new ChoiceBox<>();cBoxRound3Match5TeamTwo = new ChoiceBox<>();
        cBoxRound3Match6TeamOne = new ChoiceBox<>();cBoxRound3Match6TeamTwo = new ChoiceBox<>();
        cBoxRound3Match7TeamOne = new ChoiceBox<>();cBoxRound3Match7TeamTwo = new ChoiceBox<>();
        cBoxRound3Match8TeamOne = new ChoiceBox<>();cBoxRound3Match8TeamTwo = new ChoiceBox<>();

        btnRound3Match1Edit = new Button("Edit School Fields");
        btnRound3Match2Edit = new Button("Edit School Fields");
        btnRound3Match3Edit = new Button("Edit School Fields");
        btnRound3Match4Edit = new Button("Edit School Fields");
        btnRound3Match5Edit = new Button("Edit School Fields");
        btnRound3Match6Edit = new Button("Edit School Fields");
        btnRound3Match7Edit = new Button("Edit School Fields");
        btnRound3Match8Edit = new Button("Edit School Fields");

        btnRound3Match1Save = new Button("Save Field Changes");
        btnRound3Match2Save = new Button("Save Field Changes");
        btnRound3Match3Save = new Button("Save Field Changes");
        btnRound3Match4Save = new Button("Save Field Changes");
        btnRound3Match5Save = new Button("Save Field Changes");
        btnRound3Match6Save = new Button("Save Field Changes");
        btnRound3Match7Save = new Button("Save Field Changes");
        btnRound3Match8Save = new Button("Save Field Changes");

        tFieldRound3Match1Team1 = new TextField(); tFieldRound3Match1Team2 = new TextField();
        tFieldRound3Match2Team1 = new TextField(); tFieldRound3Match2Team2 = new TextField();
        tFieldRound3Match3Team1 = new TextField(); tFieldRound3Match3Team2 = new TextField();
        tFieldRound3Match4Team1 = new TextField(); tFieldRound3Match4Team2 = new TextField();
        tFieldRound3Match5Team1 = new TextField(); tFieldRound3Match5Team2 = new TextField();
        tFieldRound3Match6Team1 = new TextField(); tFieldRound3Match6Team2 = new TextField();
        tFieldRound3Match7Team1 = new TextField(); tFieldRound3Match7Team2 = new TextField();
        tFieldRound3Match8Team1 = new TextField(); tFieldRound3Match8Team2 = new TextField();


        cBoxRound3Match1 = new ChoiceBox<>(); cBoxRound3Match2 = new ChoiceBox<>();
        cBoxRound3Match3 = new ChoiceBox<>(); cBoxRound3Match4 = new ChoiceBox<>();
        cBoxRound3Match5 = new ChoiceBox<>(); cBoxRound3Match6 = new ChoiceBox<>();
        cBoxRound3Match7 = new ChoiceBox<>(); cBoxRound3Match8 = new ChoiceBox<>();

        btnRound3Match1Submit = new Button("Submit"); btnRound3Match2Submit = new Button("Submit");
        btnRound3Match3Submit = new Button("Submit"); btnRound3Match4Submit = new Button("Submit");
        btnRound3Match5Submit = new Button("Submit"); btnRound3Match6Submit = new Button("Submit");
        btnRound3Match7Submit = new Button("Submit"); btnRound3Match8Submit = new Button("Submit");

        round3Match1Winner = new Label(""); round3Match2Winner = new Label("");
        round3Match3Winner = new Label(""); round3Match4Winner = new Label("");
        round3Match5Winner = new Label(""); round3Match6Winner = new Label("");
        round3Match7Winner = new Label(""); round3Match8Winner = new Label("");

        Round3match1btnBox.getChildren().addAll(btnRound3Match1Edit, round3Match1Winner); Round3match2btnBox.getChildren().addAll(btnRound3Match2Edit, round3Match2Winner);
        Round3match3btnBox.getChildren().addAll(btnRound3Match3Edit, round3Match3Winner); Round3match4btnBox.getChildren().addAll(btnRound3Match4Edit, round3Match4Winner);
        Round3match5btnBox.getChildren().addAll(btnRound3Match5Edit, round3Match5Winner); Round3match6btnBox.getChildren().addAll(btnRound3Match6Edit, round3Match6Winner);
        Round3match7btnBox.getChildren().addAll(btnRound3Match7Edit, round3Match7Winner); Round3match8btnBox.getChildren().addAll(btnRound3Match8Edit, round3Match8Winner);

        Round3match1Box.getChildren().addAll(tFieldRound3Match1Team1, tFieldRound3Match1Team2,cBoxRound3Match1,btnRound3Match1Submit);
        Round3match2Box.getChildren().addAll(tFieldRound3Match2Team1, tFieldRound3Match2Team2,cBoxRound3Match2,btnRound3Match2Submit);
        Round3match3Box.getChildren().addAll(tFieldRound3Match3Team1, tFieldRound3Match3Team2,cBoxRound3Match3,btnRound3Match3Submit);
        Round3match4Box.getChildren().addAll(tFieldRound3Match4Team1, tFieldRound3Match4Team2,cBoxRound3Match4,btnRound3Match4Submit);
        Round3match5Box.getChildren().addAll(tFieldRound3Match5Team1, tFieldRound3Match5Team2,cBoxRound3Match5,btnRound3Match5Submit);
        Round3match6Box.getChildren().addAll(tFieldRound3Match6Team1, tFieldRound3Match6Team2,cBoxRound3Match6,btnRound3Match6Submit);
        Round3match7Box.getChildren().addAll(tFieldRound3Match7Team1, tFieldRound3Match7Team2,cBoxRound3Match7,btnRound3Match7Submit);
        Round3match8Box.getChildren().addAll(tFieldRound3Match8Team1, tFieldRound3Match8Team2,cBoxRound3Match8,btnRound3Match8Submit);

        Round3match1Box.setSpacing(15);Round3match2Box.setSpacing(15);Round3match3Box.setSpacing(15);Round3match4Box.setSpacing(15);
        Round3match5Box.setSpacing(15);Round3match6Box.setSpacing(15);Round3match7Box.setSpacing(15);Round3match8Box.setSpacing(15);

        btnRound3Match1Submit.setMinSize(120,15);btnRound3Match2Submit.setMinSize(120,15);
        btnRound3Match3Submit.setMinSize(120,15);btnRound3Match4Submit.setMinSize(120,15);
        btnRound3Match5Submit.setMinSize(120,15);btnRound3Match6Submit.setMinSize(120,15);
        btnRound3Match7Submit.setMinSize(120,15);btnRound3Match8Submit.setMinSize(120,15);


        cBoxRound3Match1.setMinSize(175,15);cBoxRound3Match2.setMinSize(175,15);
        cBoxRound3Match3.setMinSize(175,15);cBoxRound3Match4.setMinSize(175,15);
        cBoxRound3Match5.setMinSize(175,15);cBoxRound3Match6.setMinSize(175,15);
        cBoxRound3Match7.setMinSize(175,15);cBoxRound3Match8.setMinSize(175,15);

        tFieldRound3Match1Team1.setMinSize(175,15);tFieldRound3Match1Team2.setMinSize(175,15);
        tFieldRound3Match2Team1.setMinSize(175,15);tFieldRound3Match2Team2.setMinSize(175,15);
        tFieldRound3Match3Team1.setMinSize(175,15);tFieldRound3Match3Team2.setMinSize(175,15);
        tFieldRound3Match4Team1.setMinSize(175,15);tFieldRound3Match4Team2.setMinSize(175,15);
        tFieldRound3Match5Team1.setMinSize(175,15);tFieldRound3Match5Team2.setMinSize(175,15);
        tFieldRound3Match6Team1.setMinSize(175,15);tFieldRound3Match6Team2.setMinSize(175,15);
        tFieldRound3Match7Team1.setMinSize(175,15);tFieldRound3Match7Team2.setMinSize(175,15);
        tFieldRound3Match8Team1.setMinSize(175,15);tFieldRound3Match8Team2.setMinSize(175,15);

        round3Match1BoxHolder.getChildren().addAll(Round3match1Box,Round3match1btnBox);
        round3Match2BoxHolder.getChildren().addAll(Round3match2Box,Round3match2btnBox);
        round3Match3BoxHolder.getChildren().addAll(Round3match3Box,Round3match3btnBox);
        round3Match4BoxHolder.getChildren().addAll(Round3match4Box,Round3match4btnBox);
        round3Match5BoxHolder.getChildren().addAll(Round3match5Box,Round3match5btnBox);
        round3Match6BoxHolder.getChildren().addAll(Round3match6Box,Round3match6btnBox);
        round3Match7BoxHolder.getChildren().addAll(Round3match7Box,Round3match7btnBox);
        round3Match8BoxHolder.getChildren().addAll(Round3match8Box,Round3match8btnBox);

        Accordion round3matchContainer = new Accordion();
        TitledPane round3Match1Pane = new TitledPane("Match One",round3Match1BoxHolder);
        TitledPane round3Match2Pane = new TitledPane("Match Two", round3Match2BoxHolder);
        TitledPane round3Match3Pane = new TitledPane("Match Three", round3Match3BoxHolder);
        TitledPane round3Match4Pane = new TitledPane("Match Four", round3Match4BoxHolder);
        TitledPane round3Match5Pane = new TitledPane("Match Five", round3Match5BoxHolder);
        TitledPane round3Match6Pane = new TitledPane("Match Six", round3Match6BoxHolder);
        TitledPane round3Match7Pane = new TitledPane("Match Seven", round3Match7BoxHolder);
        TitledPane round3Match8Pane = new TitledPane("Match Eight", round3Match8BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        round3matchContainer.getPanes().addAll(round3Match1Pane,round3Match2Pane,round3Match3Pane,round3Match4Pane,round3Match5Pane,
                round3Match6Pane,round3Match7Pane,round3Match8Pane);

        scrollPane.setContent(round3matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round Two",verticalContainer);

        rootPane.setCollapsible(false);
        round3matchContainer.setMinWidth(962);

        btnRound3Match1Edit.setMinSize(175,15);btnRound3Match2Edit.setMinSize(175,15);
        btnRound3Match3Edit.setMinSize(175,15);btnRound3Match4Edit.setMinSize(175,15);
        btnRound3Match5Edit.setMinSize(175,15);btnRound3Match6Edit.setMinSize(175,15);
        btnRound3Match7Edit.setMinSize(175,15);btnRound3Match8Edit.setMinSize(175,15);

        btnRound3Match1Save.setMinSize(175,15);btnRound3Match2Save.setMinSize(175,15);
        btnRound3Match3Save.setMinSize(175,15);btnRound3Match4Save.setMinSize(175,15);
        btnRound3Match5Save.setMinSize(175,15);btnRound3Match6Save.setMinSize(175,15);
        btnRound3Match7Save.setMinSize(175,15);btnRound3Match8Save.setMinSize(175,15);


        round3Match1BoxHolder.setSpacing(10); round3Match2BoxHolder.setSpacing(10);
        round3Match3BoxHolder.setSpacing(10); round3Match4BoxHolder.setSpacing(10);
        round3Match5BoxHolder.setSpacing(10); round3Match6BoxHolder.setSpacing(10);
        round3Match7BoxHolder.setSpacing(10); round3Match8BoxHolder.setSpacing(10);

        Round3match1btnBox.setSpacing(15);Round3match2btnBox.setSpacing(15);
        Round3match3btnBox.setSpacing(15);Round3match4btnBox.setSpacing(15);
        Round3match5btnBox.setSpacing(15);Round3match6btnBox.setSpacing(15);
        Round3match7btnBox.setSpacing(15);Round3match8btnBox.setSpacing(15);

        tFieldRound3Match1Team1.setEditable(false);tFieldRound3Match1Team2.setEditable(false);
        tFieldRound3Match2Team1.setEditable(false);tFieldRound3Match2Team2.setEditable(false);
        tFieldRound3Match3Team1.setEditable(false);tFieldRound3Match3Team2.setEditable(false);
        tFieldRound3Match4Team1.setEditable(false);tFieldRound3Match4Team2.setEditable(false);
        tFieldRound3Match5Team1.setEditable(false);tFieldRound3Match5Team2.setEditable(false);
        tFieldRound3Match6Team1.setEditable(false);tFieldRound3Match6Team2.setEditable(false);
        tFieldRound3Match7Team1.setEditable(false);tFieldRound3Match7Team2.setEditable(false);
        tFieldRound3Match8Team1.setEditable(false);tFieldRound3Match8Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnRound3Match1Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match2Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match3Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match4Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match5Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match6Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match7Edit.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match8Edit.setOnAction(event -> editRound3SchoolFields(event));

        btnRound3Match1Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match2Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match3Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match4Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match5Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match6Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match7Save.setOnAction(event -> editRound3SchoolFields(event));
        btnRound3Match8Save.setOnAction(event -> editRound3SchoolFields(event));

        btnRound3Match1Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match2Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match3Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match4Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match5Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match6Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match7Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound3Match8Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round3SceneCode);//Generates a sorted school list
        buildRoundThreeArray();
        round3MatchPairing();
        getRoundThreeWinners();
        sceneRound3 = new Scene(rootPane, 1000, 550); // Testing this Nov 19
    }

    public void buildRoundThreeArray(){
        roundThreeTextField = new TextField[8][2];
        roundThreeBox = new ChoiceBox[8];

        roundThreeTextField[0][0] = tFieldRound3Match1Team1;roundThreeTextField[0][1] = tFieldRound3Match1Team2;
        roundThreeTextField[1][0] = tFieldRound3Match2Team1;roundThreeTextField[1][1] = tFieldRound3Match2Team2;
        roundThreeTextField[2][0] = tFieldRound3Match3Team1;roundThreeTextField[2][1] = tFieldRound3Match3Team2;
        roundThreeTextField[3][0] = tFieldRound3Match4Team1;roundThreeTextField[3][1] = tFieldRound3Match4Team2;
        roundThreeTextField[4][0] = tFieldRound3Match5Team1;roundThreeTextField[4][1] = tFieldRound3Match5Team2;
        roundThreeTextField[5][0] = tFieldRound3Match6Team1;roundThreeTextField[5][1] = tFieldRound3Match6Team2;
        roundThreeTextField[6][0] = tFieldRound3Match7Team1;roundThreeTextField[6][1] = tFieldRound3Match7Team2;
        roundThreeTextField[7][0] = tFieldRound3Match8Team1;roundThreeTextField[7][1] = tFieldRound3Match8Team2;

        roundThreeBox[0] = cBoxRound3Match1;
        roundThreeBox[1] = cBoxRound3Match2;
        roundThreeBox[2] = cBoxRound3Match3;
        roundThreeBox[3] = cBoxRound3Match4;
        roundThreeBox[4] = cBoxRound3Match5;
        roundThreeBox[5] = cBoxRound3Match6;
        roundThreeBox[6] = cBoxRound3Match7;
        roundThreeBox[7] = cBoxRound3Match8;

    }//END ROUND THREE BUILD ARRAY

    public void getRoundThreeWinners()
    {
        OpenFile.openRoundThreeFile();
        String[] roundThreeWinners = OpenFile.getRoundThreeWinners();

        if(roundThreeWinners[0].length() > 1)
            round3Match1Winner.setText(roundThreeWinners[0] + " Won!");

        if(roundThreeWinners[1].length() > 1)
            round3Match2Winner.setText(roundThreeWinners[1] + " Won!");

        if(roundThreeWinners[2].length() > 1)
            round3Match3Winner.setText(roundThreeWinners[2] + " Won!");

        if(roundThreeWinners[3].length() > 1)
            round3Match4Winner.setText(roundThreeWinners[3] + " Won!");

        if(roundThreeWinners[4].length() > 1)
            round3Match5Winner.setText(roundThreeWinners[4] + " Won!");

        if(roundThreeWinners[5].length() > 1)
            round3Match6Winner.setText(roundThreeWinners[5] + " Won!");

        if(roundThreeWinners[6].length() > 1)
            round3Match7Winner.setText(roundThreeWinners[6] + " Won!");

        if(roundThreeWinners[7].length() > 1)
            round3Match8Winner.setText(roundThreeWinners[7] + " Won!");

        OpenFile.closeRoundThreeFile();

    }//END GET ROUND THREE WINNERS

    public void editRound3SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnRound2Match1Edit))
        {
            Round2match1Box.getChildren().removeAll(tFieldRound2Match1Team1,tFieldRound2Match1Team2);
            cBoxRound2Match1TeamOne.setMinSize(175,15);
            cBoxRound2Match1TeamTwo.setMinSize(175,15);
            cBoxRound2Match1TeamOne.setValue(tFieldRound2Match1Team1.getText());
            cBoxRound2Match1TeamTwo.setValue(tFieldRound2Match1Team2.getText());
            Round2match1Box.getChildren().add(0, cBoxRound1Match1TeamOne); // Changed
            Round2match1Box.getChildren().add(1, cBoxRound1Match1TeamTwo); // Changed
            cBoxRound2Match1.setVisible(false);
            btnRound2Match1Submit.setVisible(false);


            Round2match1btnBox.getChildren().remove(btnRound2Match1Edit);
            Round2match1btnBox.getChildren().add(0,btnRound2Match1Save);


        }
        else if(event.getSource().equals(btnRound2Match1Save))
        {
            tFieldRound2Match1Team1.setText(cBoxRound1Match1TeamOne.getValue());// This also changed
            tFieldRound2Match1Team2.setText(cBoxRound1Match1TeamTwo.getValue()); // This also changed
            Round2match1Box.getChildren().removeAll(cBoxRound2Match1TeamOne, cBoxRound2Match1TeamTwo);
            Round2match1Box.getChildren().add(0,tFieldRound2Match1Team1);
            Round2match1Box.getChildren().add(1,tFieldRound2Match1Team2);
            Round2match1btnBox.getChildren().remove(cBoxRound1Match1TeamOne); // This is the attempt to remove the unwanted added controls
            Round2match1btnBox.getChildren().remove(cBoxRound1Match1TeamTwo);// This is the attempt to remove the unwanted added controls
            Round2match1btnBox.getChildren().add(0,btnRound2Match1Edit);

            cBoxRound2Match1.getItems().clear();
            cBoxRound2Match1.getItems().addAll(tFieldRound2Match1Team1.getText(),tFieldRound2Match1Team2.getText());
            cBoxRound2Match1.setVisible(true);
            btnRound2Match1Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ONE----------------------------------------

        //---------------------------------------MATCH TWO--------------------------------------------
        if(event.getSource().equals(btnRound2Match2Edit))
        {
            Round2match2Box.getChildren().removeAll(tFieldRound2Match2Team1,tFieldRound2Match2Team2);
            cBoxRound2Match2TeamOne.setMinSize(175,15);
            cBoxRound2Match2TeamTwo.setMinSize(175,15);
            cBoxRound2Match2TeamOne.setValue(tFieldRound2Match2Team1.getText());
            cBoxRound2Match2TeamTwo.setValue(tFieldRound2Match2Team2.getText());
            Round2match2Box.getChildren().add(0, cBoxRound2Match2TeamOne);
            Round2match2Box.getChildren().add(1, cBoxRound2Match2TeamTwo);
            cBoxRound2Match2.setVisible(false);
            btnRound2Match2Submit.setVisible(false);


            Round2match2btnBox.getChildren().remove(btnRound2Match2Edit);
            Round2match2btnBox.getChildren().add(0,btnRound2Match2Save);


        }
        else if(event.getSource().equals(btnRound2Match2Save))
        {
            tFieldRound2Match2Team1.setText(cBoxRound2Match2TeamOne.getValue());
            tFieldRound2Match2Team2.setText(cBoxRound2Match2TeamTwo.getValue());
            Round2match2Box.getChildren().removeAll(cBoxRound2Match2TeamOne, cBoxRound2Match2TeamTwo);
            Round2match2Box.getChildren().add(0,tFieldRound2Match2Team1);
            Round2match2Box.getChildren().add(1,tFieldRound2Match2Team2);
            Round2match2btnBox.getChildren().remove(btnRound2Match2Save);
            Round2match2btnBox.getChildren().add(0,btnRound2Match2Edit);

            cBoxRound2Match2.getItems().clear();
            cBoxRound2Match2.getItems().addAll(tFieldRound2Match2Team1.getText(),tFieldRound2Match2Team2.getText());
            cBoxRound2Match2.setVisible(true);
            btnRound2Match2Submit.setVisible(true);

        }
        //-------------------------------------END MATCH TWO----------------------------------------

        //---------------------------------------MATCH THREE--------------------------------------------
        if(event.getSource().equals(btnRound2Match3Edit))
        {
            Round2match3Box.getChildren().removeAll(tFieldRound2Match3Team1,tFieldRound2Match3Team2);
            cBoxRound2Match3TeamOne.setMinSize(175,15);
            cBoxRound2Match3TeamTwo.setMinSize(175,15);
            cBoxRound2Match3TeamOne.setValue(tFieldRound2Match3Team1.getText());
            cBoxRound2Match3TeamTwo.setValue(tFieldRound2Match3Team2.getText());
            Round2match3Box.getChildren().add(0, cBoxRound2Match3TeamOne);
            Round2match3Box.getChildren().add(1, cBoxRound2Match3TeamTwo);
            cBoxRound2Match3.setVisible(false);
            btnRound2Match3Submit.setVisible(false);


            Round2match3btnBox.getChildren().remove(btnRound2Match3Edit);
            Round2match3btnBox.getChildren().add(0,btnRound2Match3Save);


        }
        else if(event.getSource().equals(btnRound2Match3Save))
        {
            tFieldRound2Match3Team1.setText(cBoxRound2Match3TeamOne.getValue());
            tFieldRound2Match3Team2.setText(cBoxRound2Match3TeamTwo.getValue());
            Round2match3Box.getChildren().removeAll(cBoxRound2Match3TeamOne, cBoxRound2Match3TeamTwo);
            Round2match3Box.getChildren().add(0,tFieldRound2Match3Team1);
            Round2match3Box.getChildren().add(1,tFieldRound2Match3Team2);
            Round2match3btnBox.getChildren().remove(btnRound2Match3Save);
            Round2match3btnBox.getChildren().add(0,btnRound2Match3Edit);

            cBoxRound2Match3.getItems().clear();
            cBoxRound2Match3.getItems().addAll(tFieldRound2Match3Team1.getText(),tFieldRound2Match3Team2.getText());
            cBoxRound2Match3.setVisible(true);
            btnRound2Match3Submit.setVisible(true);

        }
        //-------------------------------------END MATCH THREE----------------------------------------

        //---------------------------------------MATCH FOUR--------------------------------------------
        if(event.getSource().equals(btnRound2Match4Edit))
        {
            Round2match4Box.getChildren().removeAll(tFieldRound2Match4Team1,tFieldRound2Match4Team2);
            cBoxRound2Match4TeamOne.setMinSize(175,15);
            cBoxRound2Match4TeamTwo.setMinSize(175,15);
            cBoxRound2Match4TeamOne.setValue(tFieldRound2Match4Team1.getText());
            cBoxRound2Match4TeamTwo.setValue(tFieldRound2Match4Team2.getText());
            Round2match4Box.getChildren().add(0, cBoxRound2Match4TeamOne);
            Round2match4Box.getChildren().add(1, cBoxRound2Match4TeamTwo);
            cBoxRound2Match4.setVisible(false);
            btnRound2Match4Submit.setVisible(false);


            Round2match4btnBox.getChildren().remove(btnRound2Match4Edit);
            Round2match4btnBox.getChildren().add(0,btnRound2Match4Save);


        }
        else if(event.getSource().equals(btnRound2Match4Save))
        {
            tFieldRound2Match4Team1.setText(cBoxRound2Match4TeamOne.getValue());
            tFieldRound2Match4Team2.setText(cBoxRound2Match4TeamTwo.getValue());
            Round2match4Box.getChildren().removeAll(cBoxRound2Match4TeamOne, cBoxRound2Match4TeamTwo);
            Round2match4Box.getChildren().add(0,tFieldRound2Match4Team1);
            Round2match4Box.getChildren().add(1,tFieldRound2Match4Team2);
            Round2match4btnBox.getChildren().remove(btnRound2Match4Save);
            Round2match4btnBox.getChildren().add(0,btnRound2Match4Edit);

            cBoxRound2Match4.getItems().clear();
            cBoxRound2Match4.getItems().addAll(tFieldRound2Match4Team1.getText(),tFieldRound2Match4Team2.getText());
            cBoxRound2Match4.setVisible(true);
            btnRound2Match4Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FOUR----------------------------------------

        //---------------------------------------MATCH FIVE--------------------------------------------
        if(event.getSource().equals(btnRound2Match5Edit))
        {
            Round2match5Box.getChildren().removeAll(tFieldRound2Match5Team1,tFieldRound2Match5Team2);
            cBoxRound2Match5TeamOne.setMinSize(175,15);
            cBoxRound2Match5TeamTwo.setMinSize(175,15);
            cBoxRound2Match5TeamOne.setValue(tFieldRound2Match5Team1.getText());
            cBoxRound2Match5TeamTwo.setValue(tFieldRound2Match5Team2.getText());
            Round2match5Box.getChildren().add(0, cBoxRound2Match5TeamOne);
            Round2match5Box.getChildren().add(1, cBoxRound2Match5TeamTwo);
            cBoxRound2Match5.setVisible(false);
            btnRound2Match5Submit.setVisible(false);


            Round2match5btnBox.getChildren().remove(btnRound2Match5Edit);
            Round2match5btnBox.getChildren().add(0,btnRound2Match5Save);


        }
        else if(event.getSource().equals(btnRound2Match5Save))
        {
            tFieldRound2Match5Team1.setText(cBoxRound2Match5TeamOne.getValue());
            tFieldRound2Match5Team2.setText(cBoxRound2Match5TeamTwo.getValue());
            Round2match5Box.getChildren().removeAll(cBoxRound2Match5TeamOne, cBoxRound2Match5TeamTwo);
            Round2match5Box.getChildren().add(0,tFieldRound2Match5Team1);
            Round2match6Box.getChildren().add(1,tFieldRound2Match5Team2);
            Round2match5btnBox.getChildren().remove(btnRound2Match5Save);
            Round2match5btnBox.getChildren().add(0,btnRound2Match5Edit);

            cBoxRound2Match5.getItems().clear();
            cBoxRound2Match5.getItems().addAll(tFieldRound2Match5Team1.getText(),tFieldRound2Match5Team2.getText());
            cBoxRound2Match5.setVisible(true);
            btnRound2Match5Submit.setVisible(true);

        }
        //-------------------------------------END MATCH FIVE----------------------------------------

        //---------------------------------------MATCH SIX--------------------------------------------
        if(event.getSource().equals(btnRound2Match6Edit))
        {
            Round2match6Box.getChildren().removeAll(tFieldRound2Match6Team1,tFieldRound2Match6Team2);
            cBoxRound2Match6TeamOne.setMinSize(175,15);
            cBoxRound2Match6TeamTwo.setMinSize(175,15);
            cBoxRound2Match6TeamOne.setValue(tFieldRound2Match6Team1.getText());
            cBoxRound2Match6TeamTwo.setValue(tFieldRound2Match6Team2.getText());
            Round2match6Box.getChildren().add(0, cBoxRound2Match6TeamOne);
            Round2match6Box.getChildren().add(1, cBoxRound2Match6TeamTwo);
            cBoxRound2Match6.setVisible(false);
            btnRound2Match6Submit.setVisible(false);


            Round2match6btnBox.getChildren().remove(btnRound2Match6Edit);
            Round2match6btnBox.getChildren().add(0,btnRound2Match6Save);


        }
        else if(event.getSource().equals(btnRound2Match6Save))
        {
            tFieldRound2Match6Team1.setText(cBoxRound2Match6TeamOne.getValue());
            tFieldRound2Match6Team2.setText(cBoxRound2Match6TeamTwo.getValue());
            Round2match6Box.getChildren().removeAll(cBoxRound2Match6TeamOne, cBoxRound2Match6TeamTwo);
            Round2match6Box.getChildren().add(0,tFieldRound2Match6Team1);
            Round2match6Box.getChildren().add(1,tFieldRound2Match6Team2);
            Round2match6btnBox.getChildren().remove(btnRound2Match6Save);
            Round2match6btnBox.getChildren().add(0,btnRound2Match6Edit);

            cBoxRound2Match6.getItems().clear();
            cBoxRound2Match6.getItems().addAll(tFieldRound2Match6Team1.getText(),tFieldRound2Match6Team2.getText());
            cBoxRound2Match6.setVisible(true);
            btnRound2Match6Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SIX----------------------------------------

        //---------------------------------------MATCH SEVEN--------------------------------------------
        if(event.getSource().equals(btnRound2Match7Edit))
        {
            Round2match7Box.getChildren().removeAll(tFieldRound2Match7Team1,tFieldRound2Match7Team2);
            cBoxRound2Match7TeamOne.setMinSize(175,15);
            cBoxRound2Match7TeamTwo.setMinSize(175,15);
            cBoxRound2Match7TeamOne.setValue(tFieldRound2Match7Team1.getText());
            cBoxRound2Match7TeamTwo.setValue(tFieldRound2Match7Team2.getText());
            Round2match7Box.getChildren().add(0, cBoxRound2Match7TeamOne);
            Round2match7Box.getChildren().add(1, cBoxRound2Match7TeamTwo);
            cBoxRound2Match7.setVisible(false);
            btnRound2Match7Submit.setVisible(false);


            Round2match7btnBox.getChildren().remove(btnRound2Match7Edit);
            Round2match7btnBox.getChildren().add(0,btnRound2Match7Save);


        }
        else if(event.getSource().equals(btnRound2Match7Save))
        {
            tFieldRound2Match7Team1.setText(cBoxRound2Match7TeamOne.getValue());
            tFieldRound2Match7Team2.setText(cBoxRound2Match7TeamTwo.getValue());
            Round2match7Box.getChildren().removeAll(cBoxRound2Match7TeamOne, cBoxRound2Match7TeamTwo);
            Round2match7Box.getChildren().add(0,tFieldRound2Match7Team1);
            Round2match7Box.getChildren().add(1,tFieldRound2Match7Team2);
            Round2match7btnBox.getChildren().remove(btnRound2Match7Save);
            Round2match7btnBox.getChildren().add(0,btnRound2Match7Edit);

            cBoxRound2Match7.getItems().clear();
            cBoxRound2Match7.getItems().addAll(tFieldRound2Match7Team1.getText(),tFieldRound2Match7Team2.getText());
            cBoxRound2Match7.setVisible(true);
            btnRound2Match7Submit.setVisible(true);

        }
        //-------------------------------------END MATCH SEVEN----------------------------------------

        //---------------------------------------MATCH EIGHT--------------------------------------------
        if(event.getSource().equals(btnRound2Match8Edit))
        {
            Round2match8Box.getChildren().removeAll(tFieldRound2Match8Team1,tFieldRound2Match8Team2);
            cBoxRound2Match8TeamOne.setMinSize(175,15);
            cBoxRound2Match8TeamTwo.setMinSize(175,15);
            cBoxRound2Match8TeamOne.setValue(tFieldRound2Match8Team1.getText());
            cBoxRound2Match8TeamTwo.setValue(tFieldRound2Match8Team2.getText());
            Round2match8Box.getChildren().add(0, cBoxRound2Match8TeamOne);
            Round2match8Box.getChildren().add(1, cBoxRound2Match8TeamTwo);
            cBoxRound2Match8.setVisible(false);
            btnRound2Match8Submit.setVisible(false);


            Round2match8btnBox.getChildren().remove(btnRound2Match8Edit);
            Round2match8btnBox.getChildren().add(0,btnRound2Match8Save);


        }
        else if(event.getSource().equals(btnRound2Match8Save))
        {
            tFieldRound2Match8Team1.setText(cBoxRound2Match8TeamOne.getValue());
            tFieldRound2Match8Team2.setText(cBoxRound2Match8TeamTwo.getValue());
            Round2match8Box.getChildren().removeAll(cBoxRound2Match8TeamOne, cBoxRound2Match8TeamTwo);
            Round2match8Box.getChildren().add(0,tFieldRound2Match8Team1);
            Round2match8Box.getChildren().add(1,tFieldRound2Match8Team2);
            Round2match8btnBox.getChildren().remove(btnRound2Match8Save);
            Round2match8btnBox.getChildren().add(0,btnRound2Match8Edit);

            cBoxRound2Match8.getItems().clear();
            cBoxRound2Match8.getItems().addAll(tFieldRound2Match8Team1.getText(),tFieldRound2Match8Team2.getText());
            cBoxRound2Match8.setVisible(true);
            btnRound2Match8Submit.setVisible(true);

        }
        //-------------------------------------END MATCH EIGHT----------------------------------------

    }//END EDIT SCHOOL FIELDS

    public void round3MatchPairing()
    {
        String [] round2Winners = OpenFile.getRoundTwoWinners();

        if(round2Winners[0].length() > 1)
            tFieldRound3Match1Team1.setText(round2Winners[0]);

        if(round2Winners[1].length() > 1)
            tFieldRound3Match1Team2.setText(round2Winners[1]);

        if(round2Winners[2].length() > 1)
            tFieldRound3Match2Team1.setText(round2Winners[2]);

        if(round2Winners[3].length() > 1)
            tFieldRound3Match2Team2.setText(round2Winners[3]);

        if(round2Winners[4].length() > 1)
            tFieldRound3Match3Team1.setText(round2Winners[4]);

        if(round2Winners[5].length() > 1)
            tFieldRound3Match3Team2.setText(round2Winners[5]);

        if(round2Winners[6].length() > 1)
            tFieldRound3Match4Team1.setText(round2Winners[6]);

        if(round2Winners[7].length() > 1)
            tFieldRound3Match4Team2.setText(round2Winners[7]);

        if(round2Winners[8].length() > 1)
            tFieldRound3Match5Team1.setText(round2Winners[8]);

        if(round2Winners[9].length() > 1)
            tFieldRound3Match5Team2.setText(round2Winners[9]);

        if(round2Winners[10].length() > 1)
            tFieldRound3Match6Team1.setText(round2Winners[10]);

        if(round2Winners[11].length() > 1)
            tFieldRound3Match6Team2.setText(round2Winners[11]);

        if(round2Winners[12].length() > 1)
            tFieldRound3Match7Team1.setText(round2Winners[12]);

        if(round2Winners[13].length() > 1)
            tFieldRound3Match7Team2.setText(round2Winners[13]);

        if(round2Winners[14].length() > 1)
            tFieldRound3Match8Team1.setText(round2Winners[14]);

        if(round2Winners[15].length() > 1)
            tFieldRound3Match8Team2.setText(round2Winners[15]);

        if(round2Winners[0].length() > 1 & round2Winners[1].length() > 1)
        cBoxRound3Match1.getItems().addAll(round2Winners[0], round2Winners[1]);

        if(round2Winners[2].length() > 1 & round2Winners[3].length() > 1)
        cBoxRound3Match2.getItems().addAll(round2Winners[2], round2Winners[3]);

        if(round2Winners[4].length() > 1 & round2Winners[5].length() > 1)
            cBoxRound3Match3.getItems().addAll(round2Winners[4], round2Winners[5]);

        if(round2Winners[6].length() > 1 & round2Winners[7].length() > 1)
            cBoxRound3Match4.getItems().addAll(round2Winners[6], round2Winners[7]);

        if(round2Winners[8].length() > 1 & round2Winners[9].length() > 1)
            cBoxRound3Match5.getItems().addAll(round2Winners[8], round2Winners[9]);

        if(round2Winners[10].length() > 1 & round2Winners[11].length() > 1)
            cBoxRound3Match6.getItems().addAll(round2Winners[10], round2Winners[11]);

        if(round2Winners[12].length() > 1 & round2Winners[13].length() > 1)
            cBoxRound3Match7.getItems().addAll(round2Winners[12], round2Winners[13]);

        if(round2Winners[14].length() > 1 & round2Winners[15].length() > 1)
            cBoxRound3Match8.getItems().addAll(round2Winners[14], round2Winners[15]);


    }//END ROUND 3 MATCH PAIRING
    //---------------------------------------------------ROUND THREE CONFIGURATIONS------------------------------------------------

    //---------------------------------------------------ROUND FOUR CONFIGURATION-------------------------------------------------
    public void buildRoundFourScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");

        VBox round4Match1BoxHolder = new VBox(); VBox round4Match2BoxHolder = new VBox();
        VBox round4Match3BoxHolder = new VBox(); VBox round4Match4BoxHolder = new VBox();

        Round4match1Box = new HBox(); Round4match2Box = new HBox();
        Round4match3Box = new HBox(); Round4match4Box = new HBox();

        Round4match1btnBox = new HBox();Round4match2btnBox = new HBox();
        Round4match3btnBox = new HBox();Round4match4btnBox = new HBox();

        cBoxRound4Match1TeamOne = new ChoiceBox<>();cBoxRound4Match1TeamTwo = new ChoiceBox<>();
        cBoxRound4Match2TeamOne = new ChoiceBox<>();cBoxRound4Match2TeamTwo = new ChoiceBox<>();
        cBoxRound4Match3TeamOne = new ChoiceBox<>();cBoxRound4Match3TeamTwo = new ChoiceBox<>();
        cBoxRound4Match4TeamOne = new ChoiceBox<>();cBoxRound4Match4TeamTwo = new ChoiceBox<>();

        btnRound4Match1Edit = new Button("Edit School Fields");
        btnRound4Match2Edit = new Button("Edit School Fields");
        btnRound4Match3Edit = new Button("Edit School Fields");
        btnRound4Match4Edit = new Button("Edit School Fields");

        btnRound4Match1Save = new Button("Save Field Changes");
        btnRound4Match2Save = new Button("Save Field Changes");
        btnRound4Match3Save = new Button("Save Field Changes");
        btnRound4Match4Save = new Button("Save Field Changes");

        tFieldRound4Match1Team1 = new TextField(); tFieldRound4Match1Team2 = new TextField();
        tFieldRound4Match2Team1 = new TextField(); tFieldRound4Match2Team2 = new TextField();
        tFieldRound4Match3Team1 = new TextField(); tFieldRound4Match3Team2 = new TextField();
        tFieldRound4Match4Team1 = new TextField(); tFieldRound4Match4Team2 = new TextField();

        cBoxRound4Match1 = new ChoiceBox<>(); cBoxRound4Match2 = new ChoiceBox<>();
        cBoxRound4Match3 = new ChoiceBox<>(); cBoxRound4Match4 = new ChoiceBox<>();

        btnRound4Match1Submit = new Button("Submit"); btnRound4Match2Submit = new Button("Submit");
        btnRound4Match3Submit = new Button("Submit"); btnRound4Match4Submit = new Button("Submit");

        round4Match1Winner = new Label(""); round4Match2Winner = new Label("");
        round4Match3Winner = new Label(""); round4Match4Winner = new Label("");

        Round4match1btnBox.getChildren().addAll(btnRound4Match1Edit, round4Match1Winner); Round4match2btnBox.getChildren().addAll(btnRound4Match2Edit, round4Match2Winner);
        Round4match3btnBox.getChildren().addAll(btnRound4Match3Edit, round4Match3Winner); Round4match4btnBox.getChildren().addAll(btnRound4Match4Edit, round4Match4Winner);

        Round4match1Box.getChildren().addAll(tFieldRound4Match1Team1, tFieldRound4Match1Team2,cBoxRound4Match1,btnRound4Match1Submit);
        Round4match2Box.getChildren().addAll(tFieldRound4Match2Team1, tFieldRound4Match2Team2,cBoxRound4Match2,btnRound4Match2Submit);
        Round4match3Box.getChildren().addAll(tFieldRound4Match3Team1, tFieldRound4Match3Team2,cBoxRound4Match3,btnRound4Match3Submit);
        Round4match4Box.getChildren().addAll(tFieldRound4Match4Team1, tFieldRound4Match4Team2,cBoxRound4Match4,btnRound4Match4Submit);

        Round4match1Box.setSpacing(15);Round4match2Box.setSpacing(15);Round4match3Box.setSpacing(15);Round4match4Box.setSpacing(15);

        btnRound4Match1Submit.setMinSize(120,15);btnRound4Match2Submit.setMinSize(120,15);
        btnRound4Match3Submit.setMinSize(120,15);btnRound4Match4Submit.setMinSize(120,15);

        cBoxRound4Match1.setMinSize(175,15);cBoxRound4Match2.setMinSize(175,15);
        cBoxRound4Match3.setMinSize(175,15);cBoxRound4Match4.setMinSize(175,15);

        tFieldRound4Match1Team1.setMinSize(175,15);tFieldRound4Match1Team2.setMinSize(175,15);
        tFieldRound4Match2Team1.setMinSize(175,15);tFieldRound4Match2Team2.setMinSize(175,15);
        tFieldRound4Match3Team1.setMinSize(175,15);tFieldRound4Match3Team2.setMinSize(175,15);
        tFieldRound4Match4Team1.setMinSize(175,15);tFieldRound4Match4Team2.setMinSize(175,15);

        round4Match1BoxHolder.getChildren().addAll(Round4match1Box,Round4match1btnBox);
        round4Match2BoxHolder.getChildren().addAll(Round4match2Box,Round4match2btnBox);
        round4Match3BoxHolder.getChildren().addAll(Round4match3Box,Round4match3btnBox);
        round4Match4BoxHolder.getChildren().addAll(Round4match4Box,Round4match4btnBox);

        Accordion round4matchContainer = new Accordion();
        TitledPane round4Match1Pane = new TitledPane("Match One",round4Match1BoxHolder);
        TitledPane round4Match2Pane = new TitledPane("Match Two", round4Match2BoxHolder);
        TitledPane round4Match3Pane = new TitledPane("Match Three", round4Match3BoxHolder);
        TitledPane round4Match4Pane = new TitledPane("Match Four", round4Match4BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        round4matchContainer.getPanes().addAll(round4Match1Pane,round4Match2Pane,round4Match3Pane,round4Match4Pane);

        scrollPane.setContent(round4matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round Four",verticalContainer);

        rootPane.setCollapsible(false);
        round4matchContainer.setMinWidth(962);

        btnRound4Match1Edit.setMinSize(175,15);btnRound4Match2Edit.setMinSize(175,15);
        btnRound4Match3Edit.setMinSize(175,15);btnRound4Match4Edit.setMinSize(175,15);

        btnRound4Match1Save.setMinSize(175,15);btnRound4Match2Save.setMinSize(175,15);
        btnRound4Match3Save.setMinSize(175,15);btnRound4Match4Save.setMinSize(175,15);

        round4Match1BoxHolder.setSpacing(10); round4Match2BoxHolder.setSpacing(10);
        round4Match3BoxHolder.setSpacing(10); round4Match4BoxHolder.setSpacing(10);

        Round4match1btnBox.setSpacing(15);Round4match2btnBox.setSpacing(15);
        Round4match3btnBox.setSpacing(15);Round4match4btnBox.setSpacing(15);

        tFieldRound4Match1Team1.setEditable(false);tFieldRound4Match1Team2.setEditable(false);
        tFieldRound4Match2Team1.setEditable(false);tFieldRound4Match2Team2.setEditable(false);
        tFieldRound4Match3Team1.setEditable(false);tFieldRound4Match3Team2.setEditable(false);
        tFieldRound4Match4Team1.setEditable(false);tFieldRound4Match4Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnRound4Match1Edit.setOnAction(event -> editRound4SchoolFields(event));
        btnRound4Match2Edit.setOnAction(event -> editRound4SchoolFields(event));
        btnRound4Match3Edit.setOnAction(event -> editRound4SchoolFields(event));
        btnRound4Match4Edit.setOnAction(event -> editRound4SchoolFields(event));

        btnRound4Match1Save.setOnAction(event -> editRound4SchoolFields(event));
        btnRound4Match2Save.setOnAction(event -> editRound4SchoolFields(event));
        btnRound4Match3Save.setOnAction(event -> editRound4SchoolFields(event));
        btnRound4Match4Save.setOnAction(event -> editRound4SchoolFields(event));


        btnRound4Match1Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound4Match2Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound4Match3Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound4Match4Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round4SceneCode);//Generates a sorted school list
        buildRoundFourArray();
        round4MatchPairing();
        getRoundFourWinners();
        sceneRound4 = new Scene(rootPane, 1000, 550); // Testing this Nov 19
    }

    public void buildRoundFourArray(){
        roundFourTextField = new TextField[4][2];
        roundFourBox = new ChoiceBox[4];

        roundFourTextField[0][0] = tFieldRound4Match1Team1;roundFourTextField[0][1] = tFieldRound4Match1Team2;
        roundFourTextField[1][0] = tFieldRound4Match2Team1;roundFourTextField[1][1] = tFieldRound4Match2Team2;
        roundFourTextField[2][0] = tFieldRound4Match3Team1;roundFourTextField[2][1] = tFieldRound4Match3Team2;
        roundFourTextField[3][0] = tFieldRound4Match4Team1;roundFourTextField[3][1] = tFieldRound4Match4Team2;

        roundFourBox[0] = cBoxRound4Match1;
        roundFourBox[1] = cBoxRound4Match2;
        roundFourBox[2] = cBoxRound4Match3;
        roundFourBox[3] = cBoxRound4Match4;
    }//END ROUND FOUR BUILD ARRAY

    public void getRoundFourWinners()
    {
        OpenFile.openRoundFourFile();
        String[] roundFourWinners = OpenFile.getRoundFourWinners();

        if(roundFourWinners[0].length() > 1)
            round4Match1Winner.setText(roundFourWinners[0] + " Won!");

        if(roundFourWinners[1].length() > 1)
            round4Match2Winner.setText(roundFourWinners[1] + " Won!");

        if(roundFourWinners[2].length() > 1)
            round4Match3Winner.setText(roundFourWinners[2] + " Won!");

        if(roundFourWinners[3].length() > 1)
            round4Match4Winner.setText(roundFourWinners[3] + " Won!");

        OpenFile.closeRoundFourFile();
    }//END GET ROUND FOUR WINNERS

    public void editRound4SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnRound4Match1Edit))
        {
            Round4match1Box.getChildren().removeAll(tFieldRound4Match1Team1,tFieldRound4Match1Team2);
            cBoxRound4Match1TeamOne.setMinSize(175,15);
            cBoxRound4Match1TeamTwo.setMinSize(175,15);
            cBoxRound4Match1TeamOne.setValue(tFieldRound4Match1Team1.getText());
            cBoxRound4Match1TeamTwo.setValue(tFieldRound4Match1Team2.getText());
            Round4match1Box.getChildren().add(0, cBoxRound1Match1TeamOne); // Changed
            Round4match1Box.getChildren().add(1, cBoxRound1Match1TeamTwo); // Changed
            cBoxRound4Match1.setVisible(false);
            btnRound4Match1Submit.setVisible(false);

            Round4match1btnBox.getChildren().remove(btnRound4Match1Edit);
            Round4match1btnBox.getChildren().add(0,btnRound4Match1Save);
        }
        else if(event.getSource().equals(btnRound4Match1Save))
        {
            tFieldRound4Match1Team1.setText(cBoxRound1Match1TeamOne.getValue());// This also changed
            tFieldRound4Match1Team2.setText(cBoxRound1Match1TeamTwo.getValue()); // This also changed
            Round4match1Box.getChildren().removeAll(cBoxRound4Match1TeamOne, cBoxRound4Match1TeamTwo);
            Round4match1Box.getChildren().add(0,tFieldRound4Match1Team1);
            Round4match1Box.getChildren().add(1,tFieldRound4Match1Team2);
            Round4match1btnBox.getChildren().remove(cBoxRound1Match1TeamOne); // This is the attempt to remove the unwanted added controls
            Round4match1btnBox.getChildren().remove(cBoxRound1Match1TeamTwo);// This is the attempt to remove the unwanted added controls
            Round4match1btnBox.getChildren().add(0,btnRound4Match1Edit);

            cBoxRound4Match1.getItems().clear();
            cBoxRound4Match1.getItems().addAll(tFieldRound4Match1Team1.getText(),tFieldRound4Match1Team2.getText());
            cBoxRound4Match1.setVisible(true);
            btnRound4Match1Submit.setVisible(true);
        }
        //-------------------------------------END MATCH ONE----------------------------------------

        //---------------------------------------MATCH TWO--------------------------------------------
        if(event.getSource().equals(btnRound4Match2Edit))
        {
            Round4match2Box.getChildren().removeAll(tFieldRound4Match2Team1,tFieldRound4Match2Team2);
            cBoxRound4Match2TeamOne.setMinSize(175,15);
            cBoxRound4Match2TeamTwo.setMinSize(175,15);
            cBoxRound4Match2TeamOne.setValue(tFieldRound4Match2Team1.getText());
            cBoxRound4Match2TeamTwo.setValue(tFieldRound4Match2Team2.getText());
            Round4match2Box.getChildren().add(0, cBoxRound4Match2TeamOne);
            Round4match2Box.getChildren().add(1, cBoxRound4Match2TeamTwo);
            cBoxRound4Match2.setVisible(false);
            btnRound4Match2Submit.setVisible(false);

            Round4match2btnBox.getChildren().remove(btnRound4Match2Edit);
            Round4match2btnBox.getChildren().add(0,btnRound4Match2Save);
        }
        else if(event.getSource().equals(btnRound4Match2Save))
        {
            tFieldRound4Match2Team1.setText(cBoxRound4Match2TeamOne.getValue());
            tFieldRound4Match2Team2.setText(cBoxRound4Match2TeamTwo.getValue());
            Round4match2Box.getChildren().removeAll(cBoxRound4Match2TeamOne, cBoxRound4Match2TeamTwo);
            Round4match2Box.getChildren().add(0,tFieldRound4Match2Team1);
            Round4match2Box.getChildren().add(1,tFieldRound4Match2Team2);
            Round4match2btnBox.getChildren().remove(btnRound4Match2Save);
            Round4match2btnBox.getChildren().add(0,btnRound4Match2Edit);

            cBoxRound4Match2.getItems().clear();
            cBoxRound4Match2.getItems().addAll(tFieldRound4Match2Team1.getText(),tFieldRound4Match2Team2.getText());
            cBoxRound4Match2.setVisible(true);
            btnRound4Match2Submit.setVisible(true);
        }
        //-------------------------------------END MATCH TWO----------------------------------------

        //---------------------------------------MATCH THREE--------------------------------------------
        if(event.getSource().equals(btnRound4Match3Edit))
        {
            Round4match3Box.getChildren().removeAll(tFieldRound4Match3Team1,tFieldRound4Match3Team2);
            cBoxRound4Match3TeamOne.setMinSize(175,15);
            cBoxRound4Match3TeamTwo.setMinSize(175,15);
            cBoxRound4Match3TeamOne.setValue(tFieldRound4Match3Team1.getText());
            cBoxRound4Match3TeamTwo.setValue(tFieldRound4Match3Team2.getText());
            Round4match3Box.getChildren().add(0, cBoxRound4Match3TeamOne);
            Round4match3Box.getChildren().add(1, cBoxRound4Match3TeamTwo);
            cBoxRound4Match3.setVisible(false);
            btnRound4Match3Submit.setVisible(false);

            Round4match3btnBox.getChildren().remove(btnRound4Match3Edit);
            Round4match3btnBox.getChildren().add(0,btnRound4Match3Save);
        }
        else if(event.getSource().equals(btnRound4Match3Save))
        {
            tFieldRound4Match3Team1.setText(cBoxRound4Match3TeamOne.getValue());
            tFieldRound4Match3Team2.setText(cBoxRound4Match3TeamTwo.getValue());
            Round4match3Box.getChildren().removeAll(cBoxRound4Match3TeamOne, cBoxRound4Match3TeamTwo);
            Round4match3Box.getChildren().add(0,tFieldRound4Match3Team1);
            Round4match3Box.getChildren().add(1,tFieldRound4Match3Team2);
            Round4match3btnBox.getChildren().remove(btnRound4Match3Save);
            Round4match3btnBox.getChildren().add(0,btnRound4Match3Edit);

            cBoxRound4Match3.getItems().clear();
            cBoxRound4Match3.getItems().addAll(tFieldRound4Match3Team1.getText(),tFieldRound4Match3Team2.getText());
            cBoxRound4Match3.setVisible(true);
            btnRound4Match3Submit.setVisible(true);
        }
        //-------------------------------------END MATCH THREE----------------------------------------

        //---------------------------------------MATCH FOUR--------------------------------------------
        if(event.getSource().equals(btnRound4Match4Edit))
        {
            Round4match4Box.getChildren().removeAll(tFieldRound4Match4Team1,tFieldRound4Match4Team2);
            cBoxRound4Match4TeamOne.setMinSize(175,15);
            cBoxRound4Match4TeamTwo.setMinSize(175,15);
            cBoxRound4Match4TeamOne.setValue(tFieldRound4Match4Team1.getText());
            cBoxRound4Match4TeamTwo.setValue(tFieldRound4Match4Team2.getText());
            Round4match4Box.getChildren().add(0, cBoxRound4Match4TeamOne);
            Round4match4Box.getChildren().add(1, cBoxRound4Match4TeamTwo);
            cBoxRound4Match4.setVisible(false);
            btnRound4Match4Submit.setVisible(false);

            Round4match4btnBox.getChildren().remove(btnRound4Match4Edit);
            Round4match4btnBox.getChildren().add(0,btnRound4Match4Save);
        }
        else if(event.getSource().equals(btnRound4Match4Save))
        {
            tFieldRound4Match4Team1.setText(cBoxRound4Match4TeamOne.getValue());
            tFieldRound4Match4Team2.setText(cBoxRound4Match4TeamTwo.getValue());
            Round4match4Box.getChildren().removeAll(cBoxRound4Match4TeamOne, cBoxRound4Match4TeamTwo);
            Round4match4Box.getChildren().add(0,tFieldRound4Match4Team1);
            Round4match4Box.getChildren().add(1,tFieldRound4Match4Team2);
            Round4match4btnBox.getChildren().remove(btnRound4Match4Save);
            Round4match4btnBox.getChildren().add(0,btnRound4Match4Edit);

            cBoxRound4Match4.getItems().clear();
            cBoxRound4Match4.getItems().addAll(tFieldRound4Match4Team1.getText(),tFieldRound4Match4Team2.getText());
            cBoxRound4Match4.setVisible(true);
            btnRound4Match4Submit.setVisible(true);
        }
        //-------------------------------------END MATCH FOUR----------------------------------------
    }//END EDIT SCHOOL FIELDS

    public void round4MatchPairing()
    {
        String [] round3Winners = OpenFile.getRoundThreeWinners();

        if(round3Winners[0].length() > 1)
            tFieldRound4Match1Team1.setText(round3Winners[0]);

        if(round3Winners[1].length() > 1)
            tFieldRound4Match1Team2.setText(round3Winners[1]);

        if(round3Winners[2].length() > 1)
            tFieldRound4Match2Team1.setText(round3Winners[2]);

        if(round3Winners[3].length() > 1)
            tFieldRound4Match2Team2.setText(round3Winners[3]);

        if(round3Winners[4].length() > 1)
            tFieldRound4Match3Team1.setText(round3Winners[4]);

        if(round3Winners[5].length() > 1)
            tFieldRound4Match3Team2.setText(round3Winners[5]);

        if(round3Winners[6].length() > 1)
            tFieldRound4Match4Team1.setText(round3Winners[6]);

        if(round3Winners[7].length() > 1)
            tFieldRound4Match4Team2.setText(round3Winners[7]);

        if(round3Winners[0].length() > 1 & round3Winners[1].length() > 1)
            cBoxRound4Match1.getItems().addAll(round3Winners[0], round3Winners[1]);

        if(round3Winners[2].length() > 1 & round3Winners[3].length() > 1)
            cBoxRound4Match2.getItems().addAll(round3Winners[2], round3Winners[3]);

        if(round3Winners[4].length() > 1 & round3Winners[5].length() > 1)
            cBoxRound4Match3.getItems().addAll(round3Winners[4], round3Winners[5]);

        if(round3Winners[6].length() > 1 & round3Winners[7].length() > 1)
            cBoxRound4Match4.getItems().addAll(round3Winners[6], round3Winners[7]);

    }//END ROUND 4 MATCH PAIRING
    //-------------------------------------------------END ROUND FOUR CONFIGURATIONS----------------------------------------------

    //---------------------------------------------------ROUND FIVE CONFIGURATION-------------------------------------------------
    public void buildRoundFiveScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");

        VBox round5Match1BoxHolder = new VBox(); VBox round5Match2BoxHolder = new VBox();

        Round5match1Box = new HBox(); Round5match2Box = new HBox();

        Round5match1btnBox = new HBox();Round5match2btnBox = new HBox();

        cBoxRound5Match1TeamOne = new ChoiceBox<>();cBoxRound5Match1TeamTwo = new ChoiceBox<>();
        cBoxRound5Match2TeamOne = new ChoiceBox<>();cBoxRound5Match2TeamTwo = new ChoiceBox<>();

        btnRound5Match1Edit = new Button("Edit School Fields");
        btnRound5Match2Edit = new Button("Edit School Fields");

        btnRound5Match1Save = new Button("Save Field Changes");
        btnRound5Match2Save = new Button("Save Field Changes");

        tFieldRound5Match1Team1 = new TextField(); tFieldRound5Match1Team2 = new TextField();
        tFieldRound5Match2Team1 = new TextField(); tFieldRound5Match2Team2 = new TextField();

        cBoxRound5Match1 = new ChoiceBox<>(); cBoxRound5Match2 = new ChoiceBox<>();

        btnRound5Match1Submit = new Button("Submit"); btnRound5Match2Submit = new Button("Submit");

        round5Match1Winner = new Label(""); round5Match2Winner = new Label("");


        Round5match1btnBox.getChildren().addAll(btnRound5Match1Edit, round5Match1Winner); Round5match2btnBox.getChildren().addAll(btnRound5Match2Edit, round5Match2Winner);

        Round5match1Box.getChildren().addAll(tFieldRound5Match1Team1, tFieldRound5Match1Team2,cBoxRound5Match1,btnRound5Match1Submit);
        Round5match2Box.getChildren().addAll(tFieldRound5Match2Team1, tFieldRound5Match2Team2,cBoxRound5Match2,btnRound5Match2Submit);

        Round5match1Box.setSpacing(15);Round5match2Box.setSpacing(15);

        btnRound5Match1Submit.setMinSize(120,15);btnRound5Match2Submit.setMinSize(120,15);

        cBoxRound5Match1.setMinSize(175,15);cBoxRound5Match2.setMinSize(175,15);

        tFieldRound5Match1Team1.setMinSize(175,15);tFieldRound5Match1Team2.setMinSize(175,15);
        tFieldRound5Match2Team1.setMinSize(175,15);tFieldRound5Match2Team2.setMinSize(175,15);

        round5Match1BoxHolder.getChildren().addAll(Round5match1Box,Round5match1btnBox);
        round5Match2BoxHolder.getChildren().addAll(Round5match2Box,Round5match2btnBox);

        Accordion round5matchContainer = new Accordion();
        TitledPane round5Match1Pane = new TitledPane("Match One",round5Match1BoxHolder);
        TitledPane round5Match2Pane = new TitledPane("Match Two", round5Match2BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        round5matchContainer.getPanes().addAll(round5Match1Pane,round5Match2Pane);

        scrollPane.setContent(round5matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round Five",verticalContainer);

        rootPane.setCollapsible(false);
        round5matchContainer.setMinWidth(962);

        btnRound5Match1Edit.setMinSize(175,15);btnRound5Match2Edit.setMinSize(175,15);

        btnRound5Match1Save.setMinSize(175,15);btnRound5Match2Save.setMinSize(175,15);

        round5Match1BoxHolder.setSpacing(10); round5Match2BoxHolder.setSpacing(10);

        Round5match1btnBox.setSpacing(15);Round5match2btnBox.setSpacing(15);

        tFieldRound5Match1Team1.setEditable(false);tFieldRound5Match1Team2.setEditable(false);
        tFieldRound5Match2Team1.setEditable(false);tFieldRound5Match2Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnRound5Match1Edit.setOnAction(event -> editRound5SchoolFields(event));
        btnRound5Match2Edit.setOnAction(event -> editRound5SchoolFields(event));

        btnRound5Match1Save.setOnAction(event -> editRound5SchoolFields(event));
        btnRound5Match2Save.setOnAction(event -> editRound5SchoolFields(event));

        btnRound5Match1Submit.setOnAction(event -> matchResultSubmission(event));
        btnRound5Match2Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round5SceneCode);//Generates a sorted school list
        buildRoundFiveArray();
        round5MatchPairing();
        getRoundFiveWinners();
        sceneRound5 = new Scene(rootPane, 1000, 550); // Testing this Nov 19
    }

    public void buildRoundFiveArray(){
        roundFiveTextField = new TextField[2][2];
        roundFiveBox = new ChoiceBox[2];

        roundFiveTextField[0][0] = tFieldRound5Match1Team1;roundFiveTextField[0][1] = tFieldRound5Match1Team2;
        roundFiveTextField[1][0] = tFieldRound5Match2Team1;roundFiveTextField[1][1] = tFieldRound5Match2Team2;

        roundFiveBox[0] = cBoxRound5Match1;
        roundFiveBox[1] = cBoxRound5Match2;
    }//END ROUND FIVE BUILD ARRAY

    public void getRoundFiveWinners()
    {
        OpenFile.openRoundFiveFile();
        String[] roundFiveWinners = OpenFile.getRoundFiveWinners();

        if(roundFiveWinners[0].length() > 1)
            round5Match1Winner.setText(roundFiveWinners[0] + " Won!");

        if(roundFiveWinners[1].length() > 1)
            round5Match2Winner.setText(roundFiveWinners[1] + " Won!");

        OpenFile.closeRoundFiveFile();
    }//END GET ROUND FIVE WINNERS

    public void editRound5SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnRound5Match1Edit))
        {
            Round5match1Box.getChildren().removeAll(tFieldRound5Match1Team1,tFieldRound5Match1Team2);
            cBoxRound5Match1TeamOne.setMinSize(175,15);
            cBoxRound5Match1TeamTwo.setMinSize(175,15);
            cBoxRound5Match1TeamOne.setValue(tFieldRound5Match1Team1.getText());
            cBoxRound5Match1TeamTwo.setValue(tFieldRound5Match1Team2.getText());
            Round5match1Box.getChildren().add(0, cBoxRound1Match1TeamOne); // Changed
            Round5match1Box.getChildren().add(1, cBoxRound1Match1TeamTwo); // Changed
            cBoxRound5Match1.setVisible(false);
            btnRound5Match1Submit.setVisible(false);

            Round5match1btnBox.getChildren().remove(btnRound5Match1Edit);
            Round5match1btnBox.getChildren().add(0,btnRound5Match1Save);
        }
        else if(event.getSource().equals(btnRound5Match1Save))
        {
            tFieldRound5Match1Team1.setText(cBoxRound1Match1TeamOne.getValue());// This also changed
            tFieldRound5Match1Team2.setText(cBoxRound1Match1TeamTwo.getValue()); // This also changed
            Round5match1Box.getChildren().removeAll(cBoxRound5Match1TeamOne, cBoxRound5Match1TeamTwo);
            Round5match1Box.getChildren().add(0,tFieldRound5Match1Team1);
            Round5match1Box.getChildren().add(1,tFieldRound5Match1Team2);
            Round5match1btnBox.getChildren().remove(cBoxRound1Match1TeamOne); // This is the attempt to remove the unwanted added controls
            Round5match1btnBox.getChildren().remove(cBoxRound1Match1TeamTwo);// This is the attempt to remove the unwanted added controls
            Round5match1btnBox.getChildren().add(0,btnRound5Match1Edit);

            cBoxRound5Match1.getItems().clear();
            cBoxRound5Match1.getItems().addAll(tFieldRound5Match1Team1.getText(),tFieldRound5Match1Team2.getText());
            cBoxRound5Match1.setVisible(true);
            btnRound5Match1Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ONE----------------------------------------

        //---------------------------------------MATCH TWO--------------------------------------------
        if(event.getSource().equals(btnRound5Match2Edit))
        {
            Round5match2Box.getChildren().removeAll(tFieldRound5Match2Team1,tFieldRound5Match2Team2);
            cBoxRound5Match2TeamOne.setMinSize(175,15);
            cBoxRound5Match2TeamTwo.setMinSize(175,15);
            cBoxRound5Match2TeamOne.setValue(tFieldRound5Match2Team1.getText());
            cBoxRound5Match2TeamTwo.setValue(tFieldRound5Match2Team2.getText());
            Round5match2Box.getChildren().add(0, cBoxRound5Match2TeamOne);
            Round5match2Box.getChildren().add(1, cBoxRound5Match2TeamTwo);
            cBoxRound5Match2.setVisible(false);
            btnRound5Match2Submit.setVisible(false);

            Round5match2btnBox.getChildren().remove(btnRound5Match2Edit);
            Round5match2btnBox.getChildren().add(0,btnRound5Match2Save);
        }
        else if(event.getSource().equals(btnRound5Match2Save))
        {
            tFieldRound5Match2Team1.setText(cBoxRound5Match2TeamOne.getValue());
            tFieldRound5Match2Team2.setText(cBoxRound5Match2TeamTwo.getValue());
            Round5match2Box.getChildren().removeAll(cBoxRound5Match2TeamOne, cBoxRound5Match2TeamTwo);
            Round5match2Box.getChildren().add(0,tFieldRound5Match2Team1);
            Round5match2Box.getChildren().add(1,tFieldRound5Match2Team2);
            Round5match2btnBox.getChildren().remove(btnRound5Match2Save);
            Round5match2btnBox.getChildren().add(0,btnRound5Match2Edit);

            cBoxRound5Match2.getItems().clear();
            cBoxRound5Match2.getItems().addAll(tFieldRound5Match2Team1.getText(),tFieldRound5Match2Team2.getText());
            cBoxRound5Match2.setVisible(true);
            btnRound5Match2Submit.setVisible(true);
        }
        //-------------------------------------END MATCH TWO----------------------------------------
    }//END EDIT SCHOOL FIELDS

    public void round5MatchPairing()
    {
        String [] round4Winners = OpenFile.getRoundFourWinners();

        if(round4Winners[0].length() > 1)
            tFieldRound5Match1Team1.setText(round4Winners[0]);

        if(round4Winners[1].length() > 1)
            tFieldRound5Match1Team2.setText(round4Winners[1]);

        if(round4Winners[2].length() > 1)
            tFieldRound5Match2Team1.setText(round4Winners[2]);

        if(round4Winners[3].length() > 1)
            tFieldRound5Match2Team2.setText(round4Winners[3]);

        if(round4Winners[0].length() > 1 & round4Winners[1].length() > 1)
            cBoxRound5Match1.getItems().addAll(round4Winners[0], round4Winners[1]);

        if(round4Winners[2].length() > 1 & round4Winners[3].length() > 1)
            cBoxRound5Match2.getItems().addAll(round4Winners[2], round4Winners[3]);

    }//END ROUND 5 MATCH PAIRING
    //-------------------------------------------------END ROUND FIVE CONFIGURATIONS----------------------------------------------

    //---------------------------------------------------ROUND SIX CONFIGURATION-------------------------------------------------
    public void buildRoundSixScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");

        VBox round6Match1BoxHolder = new VBox();

        Round6match1Box = new HBox();

        Round6match1btnBox = new HBox();

        cBoxRound6Match1TeamOne = new ChoiceBox<>();cBoxRound6Match1TeamTwo = new ChoiceBox<>();


        btnRound6Match1Edit = new Button("Edit School Fields");

        btnRound6Match1Save = new Button("Save Field Changes");

        tFieldRound6Match1Team1 = new TextField(); tFieldRound6Match1Team2 = new TextField();

        cBoxRound6Match1 = new ChoiceBox<>();

        btnRound6Match1Submit = new Button("Submit");

        round6Match1Winner = new Label("");

        Round6match1btnBox.getChildren().addAll(btnRound6Match1Edit, round6Match1Winner);

        Round6match1Box.getChildren().addAll(tFieldRound6Match1Team1, tFieldRound6Match1Team2,cBoxRound6Match1,btnRound6Match1Submit);

        Round6match1Box.setSpacing(15);

        btnRound6Match1Submit.setMinSize(120,15);

        cBoxRound6Match1.setMinSize(175,15);

        tFieldRound6Match1Team1.setMinSize(175,15);tFieldRound6Match1Team2.setMinSize(175,15);

        round6Match1BoxHolder.getChildren().addAll(Round6match1Box,Round6match1btnBox);

        Accordion round6matchContainer = new Accordion();
        TitledPane round6Match1Pane = new TitledPane("Match One",round6Match1BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        round6matchContainer.getPanes().addAll(round6Match1Pane);

        scrollPane.setContent(round6matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round Six",verticalContainer);

        rootPane.setCollapsible(false);
        round6matchContainer.setMinWidth(962);

        btnRound6Match1Edit.setMinSize(175,15);

        btnRound6Match1Save.setMinSize(175,15);

        round6Match1BoxHolder.setSpacing(10);

        Round6match1btnBox.setSpacing(15);

        tFieldRound6Match1Team1.setEditable(false);tFieldRound6Match1Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnRound6Match1Edit.setOnAction(event -> editRound6SchoolFields(event));

        btnRound6Match1Save.setOnAction(event -> editRound6SchoolFields(event));

        btnRound6Match1Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round6SceneCode);//Generates a sorted school list
        buildRoundSixArray();
        round6MatchPairing();
        getRoundSixWinners();
        sceneRound6 = new Scene(rootPane, 1000, 550); // Testing this Nov 19
    }

    public void buildRoundSixArray(){
        roundSixTextField = new TextField[1][2];
        roundSixBox = new ChoiceBox[1];

        roundSixTextField[0][0] = tFieldRound6Match1Team1;roundSixTextField[0][1] = tFieldRound6Match1Team2;

        roundSixBox[0] = cBoxRound6Match1;
    }//END ROUND SIX BUILD ARRAY

    public void getRoundSixWinners()
    {
        OpenFile.openRoundSixFile();
        String[] roundSixWinners = OpenFile.getRoundSixWinners();

        if(roundSixWinners[0].length() > 1)
            round6Match1Winner.setText(roundSixWinners[0] + " Won!");

        OpenFile.closeRoundSixFile();
    }//END GET ROUND SIX WINNERS

    public void editRound6SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnRound6Match1Edit))
        {
            Round6match1Box.getChildren().removeAll(tFieldRound6Match1Team1,tFieldRound6Match1Team2);
            cBoxRound6Match1TeamOne.setMinSize(175,15);
            cBoxRound6Match1TeamTwo.setMinSize(175,15);
            cBoxRound6Match1TeamOne.setValue(tFieldRound6Match1Team1.getText());
            cBoxRound6Match1TeamTwo.setValue(tFieldRound6Match1Team2.getText());
            Round6match1Box.getChildren().add(0, cBoxRound1Match1TeamOne); // Changed
            Round6match1Box.getChildren().add(1, cBoxRound1Match1TeamTwo); // Changed
            cBoxRound6Match1.setVisible(false);
            btnRound6Match1Submit.setVisible(false);

            Round6match1btnBox.getChildren().remove(btnRound6Match1Edit);
            Round6match1btnBox.getChildren().add(0,btnRound6Match1Save);
        }
        else if(event.getSource().equals(btnRound6Match1Save))
        {
            tFieldRound6Match1Team1.setText(cBoxRound1Match1TeamOne.getValue());// This also changed
            tFieldRound6Match1Team2.setText(cBoxRound1Match1TeamTwo.getValue()); // This also changed
            Round6match1Box.getChildren().removeAll(cBoxRound6Match1TeamOne, cBoxRound6Match1TeamTwo);
            Round6match1Box.getChildren().add(0,tFieldRound6Match1Team1);
            Round6match1Box.getChildren().add(1,tFieldRound6Match1Team2);
            Round6match1btnBox.getChildren().remove(cBoxRound1Match1TeamOne); // This is the attempt to remove the unwanted added controls
            Round6match1btnBox.getChildren().remove(cBoxRound1Match1TeamTwo);// This is the attempt to remove the unwanted added controls
            Round6match1btnBox.getChildren().add(0,btnRound6Match1Edit);

            cBoxRound6Match1.getItems().clear();
            cBoxRound6Match1.getItems().addAll(tFieldRound6Match1Team1.getText(),tFieldRound6Match1Team2.getText());
            cBoxRound6Match1.setVisible(true);
            btnRound6Match1Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ONE----------------------------------------
    }//END EDIT SCHOOL FIELDS

    public void round6MatchPairing()
    {
        String [] round5Losers = OpenFile.getRoundFiveLosers();

        if(round5Losers[0].length() > 1)
            tFieldRound6Match1Team1.setText(round5Losers[0]);

        if(round5Losers[1].length() > 1)
            tFieldRound6Match1Team2.setText(round5Losers[1]);

        if(round5Losers[1].length() > 1 & round5Losers[0].length() > 1)
            cBoxRound6Match1.getItems().addAll(round5Losers[0], round5Losers[1]);

    }//END ROUND 6 MATCH PAIRING
    //-------------------------------------------------END ROUND SIX CONFIGURATIONS----------------------------------------------

    //---------------------------------------------------ROUND SEVEN CONFIGURATION-------------------------------------------------
    public void buildRoundSevenScene()
    {
        TitledPane rootPane;
        ScrollPane scrollPane = new ScrollPane();
        VBox verticalContainer = new VBox();
        HBox hButtonContainer = new HBox();
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");

        VBox round7Match1BoxHolder = new VBox();

        Round7match1Box = new HBox();

        Round7match1btnBox = new HBox();

        cBoxRound7Match1TeamOne = new ChoiceBox<>();cBoxRound7Match1TeamTwo = new ChoiceBox<>();


        btnRound7Match1Edit = new Button("Edit School Fields");

        btnRound7Match1Save = new Button("Save Field Changes");

        tFieldRound7Match1Team1 = new TextField(); tFieldRound7Match1Team2 = new TextField();

        cBoxRound7Match1 = new ChoiceBox<>();

        btnRound7Match1Submit = new Button("Submit");

        round7Match1Winner = new Label("");

        Round7match1btnBox.getChildren().addAll(btnRound7Match1Edit, round7Match1Winner);

        Round7match1Box.getChildren().addAll(tFieldRound7Match1Team1, tFieldRound7Match1Team2,cBoxRound7Match1,btnRound7Match1Submit);

        Round7match1Box.setSpacing(15);

        btnRound7Match1Submit.setMinSize(120,15);

        cBoxRound7Match1.setMinSize(175,15);

        tFieldRound7Match1Team1.setMinSize(175,15);tFieldRound7Match1Team2.setMinSize(175,15);

        round7Match1BoxHolder.getChildren().addAll(Round7match1Box,Round7match1btnBox);

        Accordion round7matchContainer = new Accordion();
        TitledPane round7Match1Pane = new TitledPane("Match One",round7Match1BoxHolder);

        hButtonContainer.getChildren().addAll(btnBack,btnHome);
        hButtonContainer.setSpacing(200);
        hButtonContainer.setAlignment(Pos.CENTER);

        btnBack.setMinWidth(145);
        btnHome.setMinWidth(145);

        round7matchContainer.getPanes().addAll(round7Match1Pane);

        scrollPane.setContent(round7matchContainer);
        verticalContainer.getChildren().addAll(scrollPane,hButtonContainer);

        rootPane = new TitledPane("Round Seven",verticalContainer);

        rootPane.setCollapsible(false);
        round7matchContainer.setMinWidth(962);

        btnRound7Match1Edit.setMinSize(175,15);

        btnRound7Match1Save.setMinSize(175,15);

        round7Match1BoxHolder.setSpacing(10);

        Round7match1btnBox.setSpacing(15);

        tFieldRound7Match1Team1.setEditable(false);tFieldRound7Match1Team2.setEditable(false);

        btnBack.setOnAction(event -> window.setScene(sceneRoundSelection));
        btnHome.setOnAction(event -> window.setScene(sceneHome));
        verticalContainer.setAlignment(Pos.CENTER);
        verticalContainer.setSpacing(10);

        btnRound7Match1Edit.setOnAction(event -> editRound7SchoolFields(event));

        btnRound7Match1Save.setOnAction(event -> editRound7SchoolFields(event));

        btnRound7Match1Submit.setOnAction(event -> matchResultSubmission(event));

        generateSortedList(round7SceneCode);//Generates a sorted school list
        buildRoundSevenArray();
        round7MatchPairing();
        getRoundSevenWinners();
        sceneRound7 = new Scene(rootPane, 1000, 550); // Testing this Nov 19
    }

    public void buildRoundSevenArray(){
        roundSevenTextField = new TextField[1][2];
        roundSevenBox = new ChoiceBox[1];

        roundSevenTextField[0][0] = tFieldRound7Match1Team1;roundFiveTextField[0][1] = tFieldRound7Match1Team2;

        roundSevenBox[0] = cBoxRound7Match1;
    }//END ROUND SEVEN BUILD ARRAY

    public void getRoundSevenWinners()
    {
        OpenFile.openRoundSevenFile();
        String[] roundSevenWinners = OpenFile.getRoundSevenWinners();

        if(roundSevenWinners[0].length() > 1)
            round7Match1Winner.setText(roundSevenWinners[0] + " Won!");

        OpenFile.closeRoundSevenFile();
    }//END GET ROUND SEVEN WINNERS

    public void editRound7SchoolFields(Event event)
    {
        //---------------------------------------MATCH ONE--------------------------------------------
        if(event.getSource().equals(btnRound7Match1Edit))
        {
            Round7match1Box.getChildren().removeAll(tFieldRound7Match1Team1,tFieldRound7Match1Team2);
            cBoxRound7Match1TeamOne.setMinSize(175,15);
            cBoxRound7Match1TeamTwo.setMinSize(175,15);
            cBoxRound7Match1TeamOne.setValue(tFieldRound7Match1Team1.getText());
            cBoxRound7Match1TeamTwo.setValue(tFieldRound7Match1Team2.getText());
            Round7match1Box.getChildren().add(0, cBoxRound1Match1TeamOne); // Changed
            Round7match1Box.getChildren().add(1, cBoxRound1Match1TeamTwo); // Changed
            cBoxRound7Match1.setVisible(false);
            btnRound7Match1Submit.setVisible(false);

            Round7match1btnBox.getChildren().remove(btnRound7Match1Edit);
            Round7match1btnBox.getChildren().add(0,btnRound7Match1Save);
        }
        else if(event.getSource().equals(btnRound7Match1Save))
        {
            tFieldRound7Match1Team1.setText(cBoxRound1Match1TeamOne.getValue());// This also changed
            tFieldRound7Match1Team2.setText(cBoxRound1Match1TeamTwo.getValue()); // This also changed
            Round7match1Box.getChildren().removeAll(cBoxRound7Match1TeamOne, cBoxRound7Match1TeamTwo);
            Round7match1Box.getChildren().add(0,tFieldRound7Match1Team1);
            Round7match1Box.getChildren().add(1,tFieldRound7Match1Team2);
            Round7match1btnBox.getChildren().remove(cBoxRound1Match1TeamOne); // This is the attempt to remove the unwanted added controls
            Round7match1btnBox.getChildren().remove(cBoxRound1Match1TeamTwo);// This is the attempt to remove the unwanted added controls
            Round7match1btnBox.getChildren().add(0,btnRound7Match1Edit);

            cBoxRound7Match1.getItems().clear();
            cBoxRound7Match1.getItems().addAll(tFieldRound7Match1Team1.getText(),tFieldRound7Match1Team2.getText());
            cBoxRound7Match1.setVisible(true);
            btnRound7Match1Submit.setVisible(true);

        }
        //-------------------------------------END MATCH ONE----------------------------------------
    }//END EDIT SCHOOL FIELDS

    public void round7MatchPairing()
    {
        String [] round5Winners = OpenFile.getRoundFiveWinners();

        if(round5Winners[0].length() > 1)
            tFieldRound7Match1Team1.setText(round5Winners[0]);

        if(round5Winners[1].length() > 1)
            tFieldRound7Match1Team2.setText(round5Winners[1]);

        if(round5Winners[0].length() > 1 & round5Winners[1].length() > 1)
            cBoxRound7Match1.getItems().addAll(round5Winners[0], round5Winners[1]);


    }//END ROUND 7 MATCH PAIRING
    //-------------------------------------------------END ROUND SEVEN CONFIGURATIONS----------------------------------------------


}//END CLASS MAIN

