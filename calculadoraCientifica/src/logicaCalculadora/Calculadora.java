/*
    Ejemplos de operaciones:

    operacion = "2--5";
    operacion = "129/2845+45*16.3-7*2.5";
    operacion = "1+seno(90)*7*seno(45)+seno(45)";
    operacion = "seno(90)*tangente(45)+2";
    operacion = "pi+2*e";
    operacion = "sqrt(pi)^e";
    operacion = "pi%e";
    operacion = "LN(e)+pi%e";
    operacion = "factorial(7)";
    operacion = "129/(seno(90)+coseno(45)*16.3-7*2.5)";
*/

package logicaCalculadora;

import java.util.List;
import java.util.ArrayList;

/**
 * Esta clase representa una calculadora científica
 * @author francis
 */
public class Calculadora 
{
    // Atributos privados de la clase
    private enum TipoOperacion { MONARIA, BINARIA; };
    private enum Operacion { SUMA, RESTA, PRODUCTO, DIVISION, RESTO, POTENCIA, FACTORIAL, RAIZ, LOG10, LN, SENO, COSENO, TANGENTE; };
    
    private final List<String> operacionesposibles;
    private final List<String> digitos;
    private final List<Operacion> operacionespendientes;
    private final List<Operacion> prioridades;
    private String digito, textotraza;
    private TipoOperacion tipooperacion;
    
    /**
     * Constructor por defecto
     */
    public Calculadora()
    {
        operacionesposibles = new ArrayList<>();
        digitos = new ArrayList<>();
        operacionespendientes = new ArrayList<>();
        prioridades = new ArrayList<>();
        digito = "";
        textotraza = "";
        introducirOperaciones();
        definirPrioridadOperaciones();
    }
    
    // Métodos privados de la clase
    
    /**
     * Calcula el factorial de un número
     * @param numero
     * @return 
     */
    private double factorial(double numero)
    {	
	for(double i = numero-1; i > 0; i--)
		numero *= i;
	
	return numero;
    }
    
    /**
     * Evalúa una operación, suma, resta, producto ...
     * @param digito1 Dígito uno de la operación
     * @param digito2 Dígitos dos de la operación (sólo para operaciones binarias)
     * @param operacion Tipo de operación
     * @return Valor de la operación
     */
    private double evaluarOperacion(String digito1, String digito2, Operacion operacion)
    {
        double valor = 0f;
        
        switch(operacion)
        {
            case SUMA:
                valor = Double.parseDouble(digito1) + Double.parseDouble(digito2);
                break;
            case RESTA:
                valor = Double.parseDouble(digito1) - Double.parseDouble(digito2);
                break;
            case PRODUCTO:
                valor = Double.parseDouble(digito1) * Double.parseDouble(digito2);
                break;
            case DIVISION:
                valor = Double.parseDouble(digito1) / Double.parseDouble(digito2);
                break;
            case SENO:
                valor = Math.sin(Math.toRadians(Double.parseDouble(digito1)));
                break;
            case COSENO:
                valor = Math.cos(Math.toRadians(Double.parseDouble(digito1)));
                break;
            case TANGENTE:
                valor = Math.tan(Math.toRadians(Double.parseDouble(digito1)));
                break;
            case RAIZ:
                valor = Math.sqrt(Double.parseDouble(digito1));
                break;
            case POTENCIA:
                valor = Math.pow(Double.parseDouble(digito1), Double.parseDouble(digito2));
                break;
            case RESTO:
                valor = Double.parseDouble(digito1) % Double.parseDouble(digito2);
                break;
            case LOG10:
                valor = Math.log10(Double.parseDouble(digito1));
                break;
            case LN:
                valor = Math.log(Double.parseDouble(digito1));
                break;
            case FACTORIAL:
                valor = factorial(Double.parseDouble(digito1));
                break;
        }
        
        return valor;
    }
    
    /**
     * Muestra los dítigos y los operandos de una expresión en la traza
     * @param digitos Dígitos de la expresión
     * @param operacionespendientes Operaciones de la expresión
     */
    private void mostrarDatos(List<String> digitos, List<Operacion> operacionespendientes)
    {
        textotraza += "\nHay " + digitos.size() + " digitos -> " + digitos;
        textotraza += "\nOperaciones pendientes de efectuar -> " + operacionespendientes;
    }
    
    /**
     * Extrae los operandos y los operadores de todas las operaciones de la expresión
     * @param expresion Expresión a evaluar
     */
    private void extraerDigitosOperaciones(String expresion)
    {        
        boolean esseno, escoseno, estangente, esraiz, eslog10, esLN, esfactorial;
        
        for(int i = 0; i < expresion.length();)
        {
            tipooperacion = TipoOperacion.BINARIA;
            esseno = Boolean.FALSE;
            escoseno = Boolean.FALSE;
            estangente = Boolean.FALSE;
            esraiz = Boolean.FALSE;
            eslog10 = Boolean.FALSE;
            esLN = Boolean.FALSE;
            esfactorial = Boolean.FALSE;
            while( (tipooperacion == TipoOperacion.BINARIA) && (i < expresion.length()) && (!operacionesposibles.contains( new String() + expresion.charAt(i)) ) )
            {
                if( expresion.charAt(i) != 's' && expresion.charAt(i) != 'c' && expresion.charAt(i) != 't' && expresion.charAt(i) != 'l' && expresion.charAt(i) != 'L' && expresion.charAt(i) != 'f' )
                {
                    digito += expresion.charAt(i++);
                }
                else
                {
                    // Miro la operación monaria que es
                    switch( expresion.charAt(i) )
                    {
                        case 's':
                            switch( expresion.charAt(i+1) )
                            {
                                case 'e':
                                    esseno = Boolean.TRUE;
                                    break;
                                case 'q':
                                    esraiz = Boolean.TRUE;
                                    break;
                            }
                            break;
                        case 'c':
                            escoseno = Boolean.TRUE;
                            break;
                        case 't':
                            estangente = Boolean.TRUE;
                            break;
                        case 'l':
                            eslog10 = Boolean.TRUE;
                            break;
                        case 'L':
                            esLN = Boolean.TRUE;
                            break;
                        case 'f':
                            esfactorial = Boolean.TRUE;
                            break;
                    }                            
                    
                    tipooperacion = TipoOperacion.MONARIA;
                    String numeroseno = expresion.substring(expresion.indexOf('(', i)+1, expresion.indexOf(')', i));
                    
                    digito = numeroseno;
                    i = expresion.indexOf(')', i)+1;
                }
            }
            if ( (i < expresion.length()) && (tipooperacion == TipoOperacion.BINARIA) ) // se ha encontrado una operación no monaria
            {
                switch( expresion.charAt(i++) )
                {
                    case '+':
                        operacionespendientes.add(Operacion.SUMA);
                        break;
                    case '-':
                        // Compruebo que sea una resta y no un número negativo
                        if( (i - 2) >= 0 &&
                            expresion.charAt(i-2) != '+' &&
                            expresion.charAt(i-2) != '-' &&
                            expresion.charAt(i-2) != '*' &&
                            expresion.charAt(i-2) != '/' &&
                            expresion.charAt(i-2) != '^' &&
                            expresion.charAt(i-2) != '%' )
                            operacionespendientes.add(Operacion.RESTA);
                        else
                        {
                            // Obtengo el número negativo sin signo
                            while( i < expresion.length() &&
                                   expresion.charAt(i) != '+' &&
                                   expresion.charAt(i) != '-' &&
                                   expresion.charAt(i) != '*' &&
                                   expresion.charAt(i) != '/' &&
                                   expresion.charAt(i) != '^' &&
                                   expresion.charAt(i) != '%' )
                                digito += expresion.charAt(i++);
                            // Pongo sigo negativo al número
                            double digitoaux = Double.valueOf(digito);
                            digitoaux *= (-1);
                            digito = Double.toString(digitoaux);
                        }
                        break;
                    case '*':
                        operacionespendientes.add(Operacion.PRODUCTO);
                        break;
                    case '/':
                        operacionespendientes.add(Operacion.DIVISION);
                        break;
                    case '^':
                        operacionespendientes.add(Operacion.POTENCIA);
                        break;
                    case '%':
                        operacionespendientes.add(Operacion.RESTO);
                        break;
                }
            }
            else
                if( i <= expresion.length() )
                {
                    if( esseno )
                        operacionespendientes.add(Operacion.SENO);
                    else
                        if( escoseno )
                            operacionespendientes.add(Operacion.COSENO);
                        else
                            if( estangente )
                                operacionespendientes.add(Operacion.TANGENTE);
                            else
                                if( esraiz )
                                    operacionespendientes.add(Operacion.RAIZ);
                                else
                                    if( eslog10 )
                                        operacionespendientes.add(Operacion.LOG10);
                                    else
                                        if( esLN )
                                            operacionespendientes.add(Operacion.LN);
                                        else
                                            if( esfactorial )
                                                operacionespendientes.add(Operacion.FACTORIAL);
                }
            
            if( !digito.equals("") )
            {
                digitos.add(digito);
                digito = "";
            }
        }
    }
    
    /**
     * Evalúa una expresión, es decir, calcula su valor
     * @param digitos Dígitos de los operandos de todas las operaciones
     * @param operacionespendientes Todas las operaciones a realizar en la expresión
     * @return Resultado de la expresión
     */
    private double evaluarExpresion(List<String> digitos, List<Operacion> operacionespendientes)
    {
        int posicionoperacion;
        
        // Sustituyo los pi y los e
        if( digitos.contains("pi") || digitos.contains("e") )
        {
            for(int i = 0; i < digitos.size(); i++)
            {
                switch (digitos.get(i)) 
                {
                    case "pi":
                        digitos.set(i, Double.toString(Math.PI));
                        break;
                    case "e":
                        digitos.set(i, Double.toString(Math.E));
                        break;
                }
            }
        }
        
        for(int iteracion = 0; !digitos.isEmpty() && iteracion < prioridades.size(); iteracion++)
        {
            Operacion operaciondeturno = prioridades.get(iteracion);
            textotraza += "\n***** Realizo las operaciones " + operaciondeturno + " *****";
            while( operacionespendientes.contains(operaciondeturno) )
            {
                mostrarDatos(digitos, operacionespendientes);
                // Busco la última ocurrencia de la operación que me toque hacer en el array de operaciones pendientes de hacer
                //posicionoperacion = operacionespendientes.lastIndexOf(operaciondeturno);
                posicionoperacion = operacionespendientes.indexOf(operaciondeturno);
                
                if( posicionoperacion != -1 )
                {
                    textotraza += "\nHay una operación " + operaciondeturno + " en la posición " + posicionoperacion;
                    double valor;
                    // Actualizo las operaciones y los dígitos
                    // Operaciones monarias: seno, coseno, tangente, raíz, potencia, log10, LN, factorial
                    if( operaciondeturno.equals(Operacion.SENO) || operaciondeturno.equals(Operacion.COSENO) || operaciondeturno.equals(Operacion.TANGENTE) || operaciondeturno.equals(Operacion.RAIZ) || operaciondeturno.equals(Operacion.LOG10) || operaciondeturno.equals(Operacion.LN) || operaciondeturno.equals(Operacion.FACTORIAL) )
                    {
                        // Miro a ver si la operación es de tipo monaria operacion monaria
                        // Si dos operaciones antes hay otra monaria es monaria con monaria
                        if( (posicionoperacion-2 >= 0) && ((operacionespendientes.get(posicionoperacion-2).equals(Operacion.SENO)) || (operacionespendientes.get(posicionoperacion-2).equals(Operacion.COSENO)) || (operacionespendientes.get(posicionoperacion-2).equals(Operacion.TANGENTE)) || (operacionespendientes.get(posicionoperacion-2).equals(Operacion.RAIZ)) || (operacionespendientes.get(posicionoperacion-2).equals(Operacion.LOG10)) || (operacionespendientes.get(posicionoperacion-2).equals(Operacion.LN)) || (operacionespendientes.get(posicionoperacion-2).equals(Operacion.FACTORIAL)) ) )
                        {
                            int posicionoperando;
                            
                            if( posicionoperacion == 0 )
                                posicionoperando = 0;
                            else
                                posicionoperando = posicionOperandoMonariaOperacionMonaria(posicionoperacion);
                            
                            textotraza += "\nHay una operación monaria con otra monaria en la posición " + posicionoperando;
                            valor = evaluarOperacion(digitos.get(posicionoperando), "", operaciondeturno);
                            textotraza += "\nOperación a hacer: " + operaciondeturno + "(" + digitos.get(posicionoperando) + ") = " + valor;
                            digitos.set(posicionoperando, Double.toString(valor));
                        }
                        // Miro a ver si la operación es de tipo digito operacion monaria
                        else
                        {
                            valor = evaluarOperacion(digitos.get(posicionoperacion), "", operaciondeturno);
                            textotraza += "\nOperación a hacer: " + operaciondeturno + "(" + digitos.get(posicionoperacion) + ") = " + valor;
                    
                            digitos.set(posicionoperacion, Double.toString(valor));
                        }
                    }
                    // Operaciones binarias: +, -, *, /, ^, %
                    else
                    {
                        valor = evaluarOperacion(digitos.get(posicionoperacion), digitos.get(posicionoperacion+1), operaciondeturno);
                        textotraza += "\nOperación a hacer: " + digitos.get(posicionoperacion) + " " + operaciondeturno + " " + digitos.get(posicionoperacion+1) + " = " + valor;
                        
                        digitos.remove(posicionoperacion+1);
                        digitos.set(posicionoperacion, Double.toString(valor));
                    }
                    
                    operacionespendientes.remove(posicionoperacion);
                    
                }
            }
        }
        double devolver = Double.parseDouble(digitos.get(0));
        operacionespendientes.clear();
        digitos.clear();
        return devolver;
    }
    
    /**
     * Obtiene la posición donde está el operando de la operación monaria en caso
     * de que haya una operación estilo: monaria operación monaria
     * Ejemplo: seno(45)*coseno(45)
     * @param posicionoperacion Posición de la operación monaria
     * @return Posición del operando correspondiente a la operación monaria de la posición posicionoperacion
     */
    private int posicionOperandoMonariaOperacionMonaria(int posicionoperacion)
    {
        /*
            El truco está en que la si la operación está en el lugar 9 su operando está en el 5
            Si la operación está en el lugar 8 su operando está en el 5
            Es decir, en el número par/impar que sea, 9 es el quinto impar y 8 el quinto par
            Salvo si es 0, entonces el operando está en 0
        */
        int posicion = 0;
            
        posicion += (posicionoperacion/2);        
        
        return posicion;
    }
    
    /**
     * Introduce las operaciones binarias posibles
    */
    private void introducirOperaciones()
    {
        // Aquí tengo que meter las posibles operaciones binarias que hay
        if( operacionesposibles.isEmpty() )
        {
            operacionesposibles.add("+");
            operacionesposibles.add("-");
            operacionesposibles.add("*");
            operacionesposibles.add("/");
            operacionesposibles.add("^");
            operacionesposibles.add("%");
        }
    }
    
    /**
     * Define la prioridad de operaciones
     */
    private void definirPrioridadOperaciones()
    {
        // Defino las prioridades de las operaciones
        if( prioridades.isEmpty() )
        {
            prioridades.add(Operacion.TANGENTE);
            prioridades.add(Operacion.COSENO);
            prioridades.add(Operacion.SENO);
            prioridades.add(Operacion.LN);
            prioridades.add(Operacion.LOG10);
            prioridades.add(Operacion.FACTORIAL);
            prioridades.add(Operacion.RAIZ);
            prioridades.add(Operacion.POTENCIA);
            prioridades.add(Operacion.RESTO);
            prioridades.add(Operacion.DIVISION);
            prioridades.add(Operacion.PRODUCTO);
            prioridades.add(Operacion.RESTA);
            prioridades.add(Operacion.SUMA);
        }
    }
    
    /**
     * Busca y resuelve las expresiones que haya dentro de paréntesis en la expresión a resolver
     * @param operacion Expresión a resolver
     * @return Valor de la expresión entre paréntesis mas externa
     */
    private String buscarExpresionParentesis(String operacion)
    {
        int posicioninicioparentesis;
        
        posicioninicioparentesis = operacion.indexOf("(");
        
        // Compruebo que el paréntesis no sea de una operación monaria
        while( posicioninicioparentesis != -1 &&
            operacion.charAt(posicioninicioparentesis-1) != '+' &&
            operacion.charAt(posicioninicioparentesis-1) != '-' &&
            operacion.charAt(posicioninicioparentesis-1) != '*' &&
            operacion.charAt(posicioninicioparentesis-1) != '/' &&
            operacion.charAt(posicioninicioparentesis-1) != '^' &&
            operacion.charAt(posicioninicioparentesis-1) != '%' )
            posicioninicioparentesis = operacion.indexOf("(", posicioninicioparentesis+1);
        
        if( posicioninicioparentesis != -1 )
        {
            String suboperacion, trozoantesparentesis = "", trozodespuesparentesis = "", resultadoparentesis;
            int posicionfinalparentesis;        
            
            posicionfinalparentesis = operacion.lastIndexOf(")");
            
            suboperacion = operacion.substring(posicioninicioparentesis+1, posicionfinalparentesis);
            
            if( posicioninicioparentesis > 0 )
                trozoantesparentesis = operacion.substring(0, posicioninicioparentesis);
            
            trozodespuesparentesis = operacion.substring(posicionfinalparentesis+1, operacion.length());
            textotraza += "\nVoy a resolver: (" + suboperacion + ")";
            resultadoparentesis = Double.toString(resolverExpresion(suboperacion));
            textotraza += "\nHe resuelto: (" + suboperacion + ") = " + resultadoparentesis;
            
            operacion = trozoantesparentesis + resultadoparentesis + trozodespuesparentesis;
            
            // Vacío las operaciones y los dígitos de la operación que había en el paréntesis
            operacionespendientes.clear();
            digitos.clear();
        }
        return operacion;
    }
    
    /**
     * Resuelve una expresión
     * @param expresion Expresión a resolver
     * @return Valor de la expresión
     */
    private double resolverExpresion(String expresion)
    {
        introducirOperaciones();
        definirPrioridadOperaciones();
        expresion = buscarExpresionParentesis(expresion);
        extraerDigitosOperaciones(expresion);
        return evaluarExpresion(digitos, operacionespendientes);
    }
    
    // Métodos públicos de la clase
    
    /**
     * Resuelve una expresión
     * @param expresion Expresión a resolver
     * @return Valor de la expresión y su traza
     */
    public Pair<String, String> resolverValorExpresion(String expresion)
    {
        textotraza = "";
        return new Pair(Double.toString(resolverExpresion(expresion)), textotraza);
    }
}
