package advancedJava.dayForth.models.utils;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import advancedJava.dayForth.models.Car;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

//public class Data {
//    public static ImmutableList<Car> getCars() throw ImmutableList<Car> IOException {
//        String json;
//        InputStream inputStream = Resources.getResource("car.json").openStream();
//        json = IOUtils.toString(inputStream);
//        Type listType = new TypeToken<ArrayList<Car>>(){}.getType();
//        List<Car> cars = new Gson().fromJson(json);
//        return ImmutableList.copyOf(cars);
//    }
//}

public class Data {
    public static ImmutableList<Car> getCars()throws IOException {
        InputStream inputStream = Resources.getResource("cars.json").openStream();
        String json = IOUtils.toString(inputStream);
        Type listType = new TypeToken<ArrayList<Car>>(){}.getType();
        List<Car> cars = new Gson().fromJson(json,listType);
        return ImmutableList.copyOf(cars);
    }
    public static ImmutableList<Person> getPeople()throws IOException {
        InputStream inputStream = Resources.getResource("people.json").openStream();
        String json = IOUtils.toString(inputStream);
        Type listType = new TypeToken<ArrayList<Person>>(){}.getType();
        List<Person> persons = new Gson().fromJson(json,listType);
        return ImmutableList.copyOf(persons);
    }
}




















