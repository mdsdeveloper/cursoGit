package service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Slf4j
@Service
public class CarService {

    String matricula = "";
    String color = "rojo";
    int anio = 1986;
    String modelo;
    String ramaDos;

    public String getModelo(int anio) {
        if (anio > 1950) {
            modelo = "1";
        } else modelo = "2";


        return modelo;
    }

    public void calcularColor() {
        String color;
    }


}
