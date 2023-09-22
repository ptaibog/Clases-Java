package com.campusdual.EjListinTelefonico;

import com.campusdual.Utils;

public class Exercise {

    /* Crear un programa que sea una agenda
     * La agenda contendrá una serie de personas, que tendrán información sobre ellas, como puede ser:
     * Nombre, apellido, ciudad, codigo postal, dni y listas de telefonos, de tal manera
     * que una persona tengaa 1 telefono movil o un telefono fijo,  dos teléfonos móviles, 4 teléfono móviles... etc.
     * Uno de esos teléfonos tiene que ser el teléfono principal
     * La agenda tiene que tener metodos para añadir, eliminar  y listar su contenido
     * La persona podrá llamar a otra persona de la agenda ( a su número principal )
     */



    public static void main(String[] args) {

        Agenda agenda1 = new Agenda();
        Person p = new Person();
        p.addNumber(Utils.string("Introduce el número de teléfono: "));

        agenda1.addContact(p);

// Ctrl + /
//       Person pepito = new Person("Pepito", "Pepitez", "Ourense", 32005, "50006077Y");
//        pepito.addNumber("678678678");
//
//        Person juanito = new Person("Juanito", "Juanitez", "Vigo", 36205, "51116177B");
//        juanito.addNumber("667667667");
//
//        pepito.callPerson(juanito);


    }
}
