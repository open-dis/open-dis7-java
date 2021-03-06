package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 443 marshal size 8<br>
 * PlatformSurfaceTankerSubcategories<br>
 * Subcategories for Surface Platform Category 82.
 */
public enum PlatformSurfaceTankerSubcategories implements SubCategory
{

    /** Liquid Petroleum Gas (LPG)Tanker */
    LIQUID_PETROLEUM_GAS_LPGTANKER (1, "Liquid Petroleum Gas (LPG)Tanker"),
    /** Chemical Tanker */
    CHEMICAL_TANKER (2, "Chemical Tanker"),
    /** Liquid Natural Gas (LNG) Tanker */
    LIQUID_NATURAL_GAS_LNG_TANKER (3, "Liquid Natural Gas (LNG) Tanker"),
    /** Coastal Trading Vessel (Coaster) */
    COASTAL_TRADING_VESSEL_COASTER (4, "Coastal Trading Vessel (Coaster)"),
    /** Crude Oil Tanker (up to 159,999 DWT) */
    CRUDE_OIL_TANKER_UP_TO_159_999_DWT (5, "Crude Oil Tanker (up to 159,999 DWT)"),
    /** Liquid Bulk Tanker */
    LIQUID_BULK_TANKER (6, "Liquid Bulk Tanker"),
    /** Very Large Crude Carrier (160,000-319,999 DWT) */
    VERY_LARGE_CRUDE_CARRIER_160_000_319_999_DWT (7, "Very Large Crude Carrier (160,000-319,999 DWT)"),
    /** Ultra Large Crude Carrier (320,000-549,999 DWT) */
    ULTRA_LARGE_CRUDE_CARRIER_320_000_549_999_DWT (8, "Ultra Large Crude Carrier (320,000-549,999 DWT)"),
    /** Condensate Storage Tanker */
    CONDENSATE_STORAGE_TANKER (9, "Condensate Storage Tanker");

    private int value;
    private final String description;

    /** Constructor */
    PlatformSurfaceTankerSubcategories(int value, String description)
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
    public static PlatformSurfaceTankerSubcategories getEnumForValue(int i)
    {
       for(PlatformSurfaceTankerSubcategories val: PlatformSurfaceTankerSubcategories.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration PlatformSurfaceTankerSubcategories");
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
    public static PlatformSurfaceTankerSubcategories unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformSurfaceTankerSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "PlatformSurfaceTankerSubcategories " + padding + getValue() + " " + name();
    }
}
