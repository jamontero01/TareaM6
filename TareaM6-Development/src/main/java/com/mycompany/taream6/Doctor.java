/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taream6;

/**
 *
 * @author saman
 */
public class Doctor extends Persona {
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarInformacionDoctor() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de ID: " + getNumId());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Especialidad: " + especialidad);
    }
}