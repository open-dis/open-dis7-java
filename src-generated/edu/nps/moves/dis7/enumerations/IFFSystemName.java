package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 83 marshal size 16<br>
 * IFFSystemName
 */
public enum IFFSystemName 
{
    /** Not Used (Invalid Value) */
    NOT_USED_INVALID_VALUE (0, "Not Used (Invalid Value)"),
    /** Generic Mark X */
    GENERIC_MARK_X (1, "Generic Mark X"),
    /** Generic Mark XII */
    GENERIC_MARK_XII (2, "Generic Mark XII"),
    /** Generic ATCRBS */
    GENERIC_ATCRBS (3, "Generic ATCRBS"),
    /** Generic Soviet */
    GENERIC_SOVIET (4, "Generic Soviet"),
    /** Generic Mode S */
    GENERIC_MODE_S (5, "Generic Mode S"),
    /** Generic Mark X/XII/ATCRBS */
    GENERIC_MARK_X_XII_ATCRBS (6, "Generic Mark X/XII/ATCRBS"),
    /** Generic Mark X/XII/ATCRBS/Mode S */
    GENERIC_MARK_X_XII_ATCRBS_MODE_S (7, "Generic Mark X/XII/ATCRBS/Mode S"),
    /** ARI 5954 (RRB) */
    ARI_5954_RRB (8, "ARI 5954 (RRB)"),
    /** ARI 5983 (RRB) */
    ARI_5983_RRB (9, "ARI 5983 (RRB)"),
    /** Generic RRB */
    GENERIC_RRB (10, "Generic RRB"),
    /** Generic Mark XIIA */
    GENERIC_MARK_XIIA (11, "Generic Mark XIIA"),
    /** Generic Mode 5 */
    GENERIC_MODE_5 (12, "Generic Mode 5"),
    /** Generic Mark XIIA Combined Interrogator/Transponder (CIT) */
    GENERIC_MARK_XIIA_COMBINED_INTERROGATOR_TRANSPONDER_CIT (13, "Generic Mark XIIA Combined Interrogator/Transponder (CIT)"),
    /** Generic Mark XII Combined Interrogator/Transponder (CIT) */
    GENERIC_MARK_XII_COMBINED_INTERROGATOR_TRANSPONDER_CIT (14, "Generic Mark XII Combined Interrogator/Transponder (CIT)"),
    /** Generic TCAS I/ACAS I Transceiver */
    GENERIC_TCAS_I_ACAS_I_TRANSCEIVER (15, "Generic TCAS I/ACAS I Transceiver"),
    /** Generic TCAS II/ACAS II Transceiver */
    GENERIC_TCAS_II_ACAS_II_TRANSCEIVER (16, "Generic TCAS II/ACAS II Transceiver"),
    /** Generic Mark X (A) */
    GENERIC_MARK_X_A (17, "Generic Mark X (A)"),
    /** Generic Mark X (SIF) */
    GENERIC_MARK_X_SIF (18, "Generic Mark X (SIF)");

    private int value;
    private final String description;

    /** Constructor */
    IFFSystemName(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 16;
    }

    /** provide enumeration for a given value
     * @param i integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static IFFSystemName getEnumForValue(int i)
    {
       for(IFFSystemName val: IFFSystemName.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration IFFSystemName");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }
    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static IFFSystemName unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static IFFSystemName unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "IFFSystemName " + getValue() + " " + name(); 
    }
}
