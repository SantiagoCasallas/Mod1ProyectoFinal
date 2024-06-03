package PatronesComportamentales.Interpreter.Controller;

import java.util.ArrayList;
import java.util.List;

import Interfaz.Interfaz;
import PatronesComportamentales.Interpreter.Model.AddDonacionExpression;
import PatronesComportamentales.Interpreter.Model.ListDonacionesExpression;
import PatronesComportamentales.Interpreter.Model.*;

public class Test {
    public static void main(String[] args) {

        final Interfaz vista = new Interfaz();
        Context context = new Context();
        List<Expression> comandos = new ArrayList<>();

        comandos.add(new AddDonacionExpression("RoPa"));
        comandos.add(new AddDonacionExpression("alimentos"));
        comandos.add(new AddDonacionExpression("ropa"));
        comandos.add(new AddDonacionExpression("alimentos"));
        comandos.add(new ListDonacionesExpression());

        for (Expression comando : comandos) {
            comando.interpret(context);
        }
    }

}
