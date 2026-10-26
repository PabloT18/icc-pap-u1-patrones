package comportamiento.simple.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator: los usuarios se comunican por medio de la sala, no entre sí directamente.
 */
public final class AppMediator {
    private AppMediator() {
    }

    public static void main(String[] args) {
        SalaChat sala = new SalaChat();
        Usuario ana = new Usuario("Ana", sala);
        Usuario luis = new Usuario("Luis", sala);

        sala.agregar(ana);
        sala.agregar(luis);
        ana.enviar("Hola a todos");
    }
}

final class SalaChat {
    private final List<Usuario> usuarios = new ArrayList<>();

    void agregar(Usuario usuario) {
        usuarios.add(usuario);
    }

    void difundir(String mensaje, Usuario remitente) {
        for (Usuario usuario : usuarios) {
            if (usuario != remitente) {
                usuario.recibir(remitente.nombre() + ": " + mensaje);
            }
        }
    }
}

final class Usuario {
    private final String nombre;
    private final SalaChat sala;

    Usuario(String nombre, SalaChat sala) {
        this.nombre = nombre;
        this.sala = sala;
    }

    String nombre() {
        return nombre;
    }

    void enviar(String mensaje) {
        sala.difundir(mensaje, this);
    }

    void recibir(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}
