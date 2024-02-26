package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Una clase Contacto que contiene dos atributos. El nombre del contacto y una lista de teléfonos
 * asociados a este.
 *
 * @author Antonio Soriano González
 * @version 1.0
 *
 */
 public class Persona {
    private String name;
    private List<String> phones;

    /**
     * Método constructor con parámetros para crear un objeto de tipo Contacto, que tendrá los datos
     * que pasamos por parámetro.
     * @param name String
     * @param phone String
     */

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Método getter del atributo name
     * @return el valor de name
     */

    public String getName() {
        return this.name;
    }

    /**
     * Método getter del atributo phones
     * @return el valor de phones
     */

    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}