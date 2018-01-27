import com.airlines.entity.AirlineCompany;
import com.airlines.model.CargoAirplane;
import com.airlines.model.CargoHelicopter;
import com.airlines.model.PassengerAirplane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Creation airline company
        AirlineCompany company = new AirlineCompany();

        //Adding aircrafts to the company
        company.addAircraft(new PassengerAirplane("Poseidon",100,50));
        company.addAircraft(new CargoHelicopter("Carro",1200,50));
        company.addAircraft(new CargoAirplane("Pedro",500,100));

        company.sort();

        while (true){

        }
    }
}
