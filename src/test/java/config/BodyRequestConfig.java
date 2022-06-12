package config;

import com.google.gson.Gson;
import model.BodyRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BodyRequestConfig {
    private File bodyRequest;

    public BodyRequest getBodyRequest() throws FileNotFoundException {
        Gson gsonFile = new Gson();
        return gsonFile.fromJson(new FileReader(new File("src/test/resources/bodyRequest.json")), BodyRequest.class);
    }

    public void setBodyRequest(File bodyRequest) {
        this.bodyRequest = bodyRequest;
    }
}
