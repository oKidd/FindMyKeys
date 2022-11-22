package com.findmykeys.findmykeys;

import java.util.ArrayList;

public class CerraduraController {
    private static ArrayList<Cerradura> listaCerradura = new ArrayList<>();

    public static String addCerradura(int id, String nombre, boolean estado){
        try {
            Cerradura cr = new Cerradura(id,nombre,estado);
            listaCerradura.add(cr);
            return "Cerradura Creada";
        } catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }

    public static  ArrayList<Cerradura> getListaCerradura() { return listaCerradura; }

    public static Cerradura findCerradura(int id){

        for (Cerradura item : listaCerradura) {

            if (item.getIdCerradura() == id){
                return item;
            }
        }
        return null;
    }

    public static String editNombreCerradura(int id, String nombre){

        Cerradura cr = findCerradura(id);
        if (cr != null){
            try{
                cr.setNombreCerradura(nombre);
                return "Cerradura Modificada";
            }catch (Exception e){
                return "Error: "+e.getMessage();
            }
        }else{
            return "Sin Resultados";
        }
    }

    public static String cambiarEstado(int id){
        Cerradura cr = findCerradura(id);
        if (cr != null){
            try{
                boolean estado = cr.isEstado();
                cr.setEstado(!estado);
                return "Estado Modificado";
            }catch (Exception e){
                return "Error: "+e.getMessage();
            }
        }else{
            return "Sin Resultados";
        }
    }

    public static String removeCerradura(int id){
        Cerradura cr = findCerradura(id);
        listaCerradura.remove(cr);
        return "Cerradura eliminada";
    }
}
