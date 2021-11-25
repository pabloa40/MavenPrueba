package com.mycompany.ghamaven;

public class Trabajador extends Persona
{
    private String trabajo;

    public Trabajador(String id, String name, int edad, String trabajo)
    {
        super(id,name,edad);
        this.trabajo = trabajo;
    }

    public int getSueldo()
    {
        if(this.trabajo="profesor")
        {
            return 4;
        }
        else
        {
            return 3;
        }

    }
}