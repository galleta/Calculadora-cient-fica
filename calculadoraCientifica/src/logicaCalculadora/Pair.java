
package logicaCalculadora;

/**
 * Clase par
 * @author francis
 * @param <Clave> Tipo de dato de la clave del par
 * @param <Valor> Tipo de dato del valor del par
 */
public class Pair<Clave, Valor> 
{
    private Clave first;
    private Valor second;

    public Pair(Clave first, Valor second) 
    {
    	super();
    	this.first = first;
    	this.second = second;
    }

    @Override
    public int hashCode() 
    {
    	int hashFirst = first != null ? first.hashCode() : 0;
    	int hashSecond = second != null ? second.hashCode() : 0;

    	return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    @Override
    public boolean equals(Object other) 
    {
        Boolean devolver = Boolean.FALSE;
    	if (other instanceof Pair) 
        {
    		Pair otherPair = (Pair) other;
    		devolver =  
    		((  this.first == otherPair.first ||
    			( this.first != null && otherPair.first != null &&
    			  this.first.equals(otherPair.first))) &&
    		 (	this.second == otherPair.second ||
    			( this.second != null && otherPair.second != null &&
    			  this.second.equals(otherPair.second))) );
    	}

    	return devolver;
    }

    @Override
    public String toString()
    { 
           return "(" + first + ", " + second + ")"; 
    }

    public Clave getFirst() 
    {
    	return first;
    }

    public void setFirst(Clave first) 
    {
    	this.first = first;
    }

    public Valor getSecond() 
    {
    	return second;
    }

    public void setSecond(Valor second) 
    {
    	this.second = second;
    }
}
