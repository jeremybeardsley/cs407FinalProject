
package cs407final.creatures;

/**
 * Exception which is thrown when an animal which does not exist is attempted to be 
 * created by the AnimalFactory class.
 * @see AnimalFactory
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class InvalidArgumentException extends Exception {

    public InvalidArgumentException(String type_required) {
    }
    
}
