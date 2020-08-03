import javax.swing.JOptionPane;


public class Ejercicio7 {
    public static void main(String args[]){
            double consumogasolinaenlitrospor100km, consumogasolinaenlitrosporkm, consumogasolinaenpesospor100km, 
                    consumogasolinaenpesosporkm, dinerogastadoengasolina, galonesgastados, gasolinagastadaenlitros,
                    kilometrosrecorridos, preciogasolinaporgalon,  preciogasolinaporlitro, tiempotardadoenhoras, 
                    tiempotardadoenminutos, velocidadpromediokmporhora, velocidadpromediometrosporsegundo;
            

            kilometrosrecorridos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número de Kilometros recorridos en el viaje (p. ej 300):"));
            
            preciogasolinaporgalon = Double.parseDouble(JOptionPane.showInputDialog(null,"Ahora ingrese el precio de gasolina por galón en pesos (p. ej 9000):"));
            
            dinerogastadoengasolina = Double.parseDouble(JOptionPane.showInputDialog(null,"Cuanto dinero gasto en tanquear su vehiculo en pesos (p. ej 27000)?"));
            
            tiempotardadoenhoras = Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantas horas tardó en realizar el viaje sin contar los minutos (p. ej 2)"));
             
            tiempotardadoenminutos = Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantos minutos adicionales tardó en realizar el viaje para complementar las horas (p. ej 60)"));
            // Obtener numero de galones tanqueados a partir del precio de la gasolina y de la plata invertida
            galonesgastados = dinerogastadoengasolina/preciogasolinaporgalon;
            // Convertir galones gastados a litros
            gasolinagastadaenlitros = galonesalitros(galonesgastados);
            // Calcular el precio del litro de gasolina en pesos colombianos
            preciogasolinaporlitro = (preciogasolinaporgalon/galonesalitros(1));
            // Calcular cuantos litros de gastaron de gasolina por cada kilometro
            consumogasolinaenlitrosporkm = litrogasolinaporkilometro(kilometrosrecorridos,gasolinagastadaenlitros);
            consumogasolinaenlitrospor100km = consumogasolinaenlitrosporkm*100;
            // Calcular el costo en pesos de la gasolina gastada por kilometros
            consumogasolinaenpesosporkm = (consumogasolinaenlitrosporkm*preciogasolinaporlitro);
            consumogasolinaenpesospor100km = consumogasolinaenpesosporkm*100;
            // Calcular velocidad media
            velocidadpromediokmporhora = velocidadpromedioenkilometrosporhora(kilometrosrecorridos,(tiempotardadoenhoras + minutosahoras(tiempotardadoenminutos)));
            velocidadpromediometrosporsegundo = kilometrosporhoraametrosporsegundo(velocidadpromediokmporhora);
            
            JOptionPane.showMessageDialog(null, "Consumo de combustible por Kilometro: "+consumogasolinaenlitrosporkm+"(Litros/Km) \n" +
                "Costo del combustible por Kilometro: $"+consumogasolinaenpesosporkm+"(COP/Km) \n"
                +
                "Consumo de combustible por cada 100 Kilometros: "+consumogasolinaenlitrospor100km+"(Litros/100Km) \n"
                +
                "Costo del combustible por cada 100 Kilometros: $"+consumogasolinaenpesospor100km+"(COP/Km) \n"
                +
                "La velocidad promedio en Km/H es de: "+velocidadpromediokmporhora+"Km/H \n"
                +
                "La velocidad promedio en m/s es de: " + velocidadpromediometrosporsegundo + "m/s"
            );
    }

    // Funcion para convertir galones a litros
    public static double galonesalitros(double galones) {
        double litros;
        litros = galones*3.785;
        return litros;
    }

    // Calcular la cantidad de litros gastados por cada kilometro de una distancia recorrida
    public static double litrogasolinaporkilometro(double distancia_recorrida, double litros_gasolina) {
        double litros;
        litros = (litros_gasolina/distancia_recorrida);
        return litros;
    }

    // Función para convertir minutos a horas
    public static double minutosahoras(double minutos) {
        double litros;
        litros = minutos/60;
        return litros;
    }

    // Función para calcular la velocidad promedio a partir de una distancia recorrida en determinado tiempo
    public static double velocidadpromedioenkilometrosporhora(double distancia_recorrida, double tiempo) {
        double litros;
        litros = distancia_recorrida/tiempo;
        return litros;
    }

    // Función para convertir los kilometros por hora a metros por segundo (Km/H to m/s)
    public static double kilometrosporhoraametrosporsegundo(double velocidad_en_kilometros) {
        double litros;
        litros = (velocidad_en_kilometros*(5.0/18.0));
        return litros;
    }
}