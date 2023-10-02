package core.Helper;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReaderHelper {

    public String readFile(String filePath) {
        String data = null;
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    ////////// TEST /////////////////

    public String readFile2(String filePath1, String filePath2) {
        String data = null;
        try {
            File myObj = new File(filePath1,filePath2);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }




    //////// TEST /////////////////

    public void writeFile(String filePath, String value) {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(value);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    public void updateFile(String filePath, String value) {
        try {
            clearFile(filePath);
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(value);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    public void clearFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public JSONObject readJsonFile(String filePath){
        JSONObject jsonFile = new JSONObject();
        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            jsonFile = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonFile;
    }

//////////////Experiment Dump//////////////////////////

    public JSONArray readJsonArray(String filePath) {
        JSONArray jsonFile = new JSONArray();
        try {
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)),
                    StandardCharsets.UTF_8);
            JSONArray jsonArray = new JSONArray(jsonContent);
            return jsonArray;

        } catch (Exception e) {
            System.out.println("EROOOOOOOOOOOOOOOOOOOOOR");
            e.printStackTrace();
        }

        return null;
    }

}
