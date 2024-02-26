package org.example;

import java.util.*;

/**
 * Una clase Agenda, donde encontramos una lista de contactos y métodos para añadir, eliminar
 * y modificar contactos.
 * @author Antonio Soriano González
 * @version 1.0
 */

public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Método constructor por defecto, para crear objetos de tipo Agenda, que contendrán una lista
     * de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir contactos.
     *
     * @param name String
     * @param phone String
     *
     */

    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para borrar contactos ya existentes
     * @param name String
     */

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *
     * Método para modificar el número de teléfono.
     * @param name String
     * @param oldPhone String
     * @param newPhone String
     *
     */

    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Método getter del atributo contacto
     * @return el valor de contacts
     */

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}