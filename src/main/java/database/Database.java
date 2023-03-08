package database;

import database.UserModel;
import entities.User;
import entities.Student;
import entities.Admin;
import entities.Timetable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.util.ArrayList;

class Database {

    private ArrayList<UserModel> database;
    public ArrayList<UserModel> getDatabase() {
        JSONParser parser = new JSONParser();
        try {
            JSONArray a = (JSONArray) parser.parse(new FileReader("c:\\exer4-courses.json"));
            ArrayList<UserModel> aList = new ArrayList<UserModel>();
            for (Object o : a) {
                JSONObject user = (JSONObject) o;
                String username = (String) user.get("username");
                String password = (String) user.get("password");
                String email = (String) user.get("email");
                UserModel usermodel = new UserModel(username, password, email);
                aList.add(usermodel);
            }
            database = aList;
            return database;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return database;
    }

    public void setDatabase(ArrayList<UserModel> database) {
        // TODO
        this.database = database;
    }
}