package org.example;

public class Main {
    public static void main(String[] args) {

        //EN EL MAIN LLAMO A MIS CLASES
        // EN EL MAIN CREO LOS OBJETOS DE MIS CLASES
        //EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
        //EN EL MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOS
        //SI VOY A USAR UNA CLSE DEBO CREAR UN OBJETO


        Invitado objetoDeClaseInvitado=new Invitado();
        Invitado objeto2=new Invitado(27,true,"Daniel",10000);


        //obtener el valor de los atributos
        System.out.println(objetoDeClaseInvitado.nombre);
        System.out.println(objeto2.nombre);





    }
}