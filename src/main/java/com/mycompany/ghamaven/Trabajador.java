package com.mycompany.ghamaven;

public class Trabajador extends Persona
{
    private String trabajo;

    public Trabajador(String id, String name, int edad, String trabajo): Persona(id,name,edad)
    {
        this.trabajo = trabajo;
    }

    public int getSueldo()
    {

        if(trabajo="profesor")
        {
            return 4;
        }
        else
        {
            return 3;
        }

    }
}