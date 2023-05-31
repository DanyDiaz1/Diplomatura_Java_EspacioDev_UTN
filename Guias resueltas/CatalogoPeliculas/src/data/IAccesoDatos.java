package data;

import java.util.List;

import domain.Pelicula;
import exceptions.*;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
