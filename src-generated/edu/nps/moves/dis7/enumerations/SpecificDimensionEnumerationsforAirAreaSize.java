package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 132 marshal size 8<br>
 * SpecificDimensionEnumerationsforAirAreaSize<br>
 * The gaps in enumeration values are intentional and are reserved for future additions.
 */
public enum SpecificDimensionEnumerationsforAirAreaSize 
{

    /** Small Flock/Swarm (.5km long x 5m wide - 1km x 5m) */
    SMALL_FLOCK_SWARM_5KM_LONG_X_5M_WIDE_1KM_X_5M (222, "Small Flock/Swarm (.5km long x 5m wide - 1km x 5m)"),
    /** Small Flock/Swarm, Dense (.5km long x 5m wide - 1km x 5m) */
    SMALL_FLOCK_SWARM_DENSE_5KM_LONG_X_5M_WIDE_1KM_X_5M (223, "Small Flock/Swarm, Dense (.5km long x 5m wide - 1km x 5m)"),
    /** Medium Flock/Swarm (1km long x 10m wide - 2km x 10m) */
    MEDIUM_FLOCK_SWARM_1KM_LONG_X_10M_WIDE_2KM_X_10M (224, "Medium Flock/Swarm (1km long x 10m wide - 2km x 10m)"),
    /** Medium Flock/Swarm, Dense (1km long x 10m wide - 2km x 10m) */
    MEDIUM_FLOCK_SWARM_DENSE_1KM_LONG_X_10M_WIDE_2KM_X_10M (225, "Medium Flock/Swarm, Dense (1km long x 10m wide - 2km x 10m)"),
    /** Large Flock/Swarm (10km long x 100m wide - 20km x 100m) */
    LARGE_FLOCK_SWARM_10KM_LONG_X_100M_WIDE_20KM_X_100M (226, "Large Flock/Swarm (10km long x 100m wide - 20km x 100m)"),
    /** Large Flock/Swarm, Dense (10km long x 100m wide - 20km x 100m) */
    LARGE_FLOCK_SWARM_DENSE_10KM_LONG_X_100M_WIDE_20KM_X_100M (227, "Large Flock/Swarm, Dense (10km long x 100m wide - 20km x 100m)");

    private int value;
    private final String description;

    /** Constructor */
    SpecificDimensionEnumerationsforAirAreaSize(int value, String description)
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
      return 8;
    }

    /** provide enumeration for a given value
     * @param i integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static SpecificDimensionEnumerationsforAirAreaSize getEnumForValue(int i)
    {
       for(SpecificDimensionEnumerationsforAirAreaSize val: SpecificDimensionEnumerationsforAirAreaSize.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration SpecificDimensionEnumerationsforAirAreaSize");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static SpecificDimensionEnumerationsforAirAreaSize unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static SpecificDimensionEnumerationsforAirAreaSize unmarshalEnum(ByteBuffer byteBuffer) throws Exception
    {
        /*
        try {
            value = (int)byteBuffer.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(byteBuffer.get());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (name().equalsIgnoreCase("DISPDUType") && getValue() < 10)
            padding = "0"; // leading zero for column spacing
        return "SpecificDimensionEnumerationsforAirAreaSize " + padding + getValue() + " " + name();
    }
}
