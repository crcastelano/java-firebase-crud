package principal;

import static conexao.Conexao.initFirebase;
import view.UsuarioView;

public class Main {

    public static void main(String[] args) {
        initFirebase();

        new UsuarioView().setVisible(true);
    }

}
