package aslib.util;

/**
 * <p> Contains the options to represent all the numeric class in Java. </p>
 *
 * <table style="width:150px" summary="">
 *  <tr>
 *      <th> Type </th>
 *      <th> Class </th>
 *  </tr>
 *  <tr>
 *      <td> Byte </td>
 *      <td> Byte.class </td>
 *  </tr>
 *  <tr>
 *      <td> Short </td>
 *      <td> Short.class </td>
 *  </tr>
 *  <tr>
 *      <td> Integer </td>
 *      <td> Integer.class </td>
 *  </tr>
 *  <tr>
 *      <td> Long </td>
 *      <td> Long.class </td>
 *  </tr>
 *  <tr>
 *      <td> Float </td>
 *      <td> Float.class </td>
 *  </tr>
 *  <tr>
 *      <td> Double </td>
 *      <td> Double.class </td>
 *  </tr>
 * </table>
 *
 * @author Adriano Siqueira
 * @version 3.0.0
 * @since 6.1
 */
public enum NumericType {
    BYTE(Byte.class),
    SHORT(Short.class),
    INTEGER(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class);

    private final Class<?> numericClass;

    NumericType(Class<?> numericClass) {
        this.numericClass = numericClass;
    }

    /**
     * Gets the numeric type's class.
     *
     * @return The class of the numeric type.
     */
    public Class<?> getNumericClass() {
        return numericClass;
    }
}