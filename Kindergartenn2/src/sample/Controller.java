package sample;

import connectivity.ConnectionClass;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.util.Callback;

import java.sql.*;

public class Controller {

    public TextField firstName;
    public TextField lastName;
    public DatePicker birthDate;
    public TextField medCer;
    public TextField passport;
    public DatePicker joinDate;
    public TextField childID;
    public ComboBox gender;
    public ComboBox classID;
    public TableView tableView;
    public TextField searchField;
    private ObservableList<ObservableList> data;

    public void buildData() {
        Connection c;
        data = FXCollections.observableArrayList();
        tableView.getColumns().clear();
        try {
            c = new ConnectionClass().getConnection();
            String SQL = "SELECT ChildID, FirstName, LastName, BirthDate, Age, Gender, ClassID FROM Child;";
            ResultSet rs = c.createStatement().executeQuery(SQL);
            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                col.setPrefWidth(105);
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tableView.getColumns().addAll(col);
            }
            while (rs.next()) {
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) row.add(rs.getString(i));
                data.add(row);
            }
            tableView.setItems(data);
        } catch (Exception e) {
            System.out.println("Error on Building Data");
        }
    }

    public void add(ActionEvent actionEvent) {
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            Connection connection = connectionClass.getConnection();
            String SPsql = "EXEC addChild ?, ?, ?, ?, ?, ?, ?, ?, ?";
            PreparedStatement ps = connection.prepareStatement(SPsql);
            ps.setObject(1, childID.getText());
            ps.setObject(2, classID.getEditor().getText());
            ps.setObject(3, firstName.getText());
            ps.setObject(4, lastName.getText());
            ps.setObject(5, birthDate.getEditor().getText());
            ps.setObject(6, gender.getEditor().getText());
            ps.setObject(7, medCer.getText());
            ps.setObject(8, passport.getText());
            ps.setObject(9, joinDate.getEditor().getText());
            ps.execute();
            childID.clear();
            classID.getEditor().clear();
            firstName.clear();
            lastName.clear();
            birthDate.getEditor().clear();
            gender.getEditor().clear();
            medCer.clear();
            passport.clear();
            joinDate.getEditor().clear();
            System.out.println("YES");
        } catch (Exception e) {
            System.out.println("Data wasn't added!");
        }
    }

    public void clear(ActionEvent actionEvent) {
        childID.clear();
        classID.getEditor().clear();
        firstName.clear();
        lastName.clear();
        birthDate.getEditor().clear();
        gender.getEditor().clear();
        medCer.clear();
        passport.clear();
        joinDate.getEditor().clear();
    }

    public void hideData(ActionEvent actionEvent) {
        tableView.getColumns().clear();
    }

    public void updateData(ActionEvent actionEvent) {
        ConnectionClass connectionClass = new ConnectionClass();
        try {
            Connection connection = connectionClass.getConnection();
            String Psql = "EXEC updateChild ?, ?";
            PreparedStatement statement = connection.prepareStatement(Psql);
            statement.setObject(1, childID.getText());
            statement.setObject(2, classID.getEditor().getText());
            statement.execute();
            childID.clear();
            classID.getEditor().clear();
        } catch (Exception e) {
            System.out.println("Data wasn't updated!");
        }
    }

    public void deleteChild(ActionEvent actionEvent) {
        ConnectionClass connectionClass = new ConnectionClass();
        try {
            Connection connection = connectionClass.getConnection();
            String psql = "EXEC deleteChild ?";
            PreparedStatement statement = connection.prepareStatement(psql);
            statement.setObject(1, childID.getText());
            statement.execute();
            childID.clear();
        } catch (SQLException e) {
            System.out.println("Data wasn't deleted!");
        }
    }
}
