package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 425 marshal size 6<br>
 * MinefieldPaintSchemePaintScheme
 */
public enum MinefieldPaintSchemePaintScheme 
{
    /** Other */
    OTHER (0, "Other"),
    /** Standard */
    STANDARD (1, "Standard"),
    /** Camouflage Desert */
    CAMOUFLAGE_DESERT (2, "Camouflage Desert"),
    /** Camouflage Jungle */
    CAMOUFLAGE_JUNGLE (3, "Camouflage Jungle"),
    /** Camouflage Snow */
    CAMOUFLAGE_SNOW (4, "Camouflage Snow"),
    /** Camouflage Gravel */
    CAMOUFLAGE_GRAVEL (5, "Camouflage Gravel"),
    /** Camouflage Pavement */
    CAMOUFLAGE_PAVEMENT (6, "Camouflage Pavement"),
    /** Camouflage Sand */
    CAMOUFLAGE_SAND (7, "Camouflage Sand"),
    /** Natural Wood */
    NATURAL_WOOD (8, "Natural Wood"),
    /** Clear */
    CLEAR (9, "Clear"),
    /** Red */
    RED (10, "Red"),
    /** Blue */
    BLUE (11, "Blue"),
    /** Green */
    GREEN (12, "Green"),
    /** Olive */
    OLIVE (13, "Olive"),
    /** White */
    WHITE (14, "White"),
    /** Tan */
    TAN (15, "Tan"),
    /** Black */
    BLACK (16, "Black"),
    /** Yellow */
    YELLOW (17, "Yellow"),
    /** Brown */
    BROWN (18, "Brown");

    private int value;
    private final String description;

    MinefieldPaintSchemePaintScheme(int value, String description)
    {
        this.value = value;
        this.description = description;
    }

    public int getValue()
    {
        return value;
    }

    public String getDescription()
    {
        return description;
    }
    
    public static int getEnumBitWidth()
    {
      return 6;
    }

    public static MinefieldPaintSchemePaintScheme getEnumForValue(int i)
    {
       for(MinefieldPaintSchemePaintScheme val: MinefieldPaintSchemePaintScheme.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration MinefieldPaintSchemePaintScheme");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    public static MinefieldPaintSchemePaintScheme unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static MinefieldPaintSchemePaintScheme unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
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
        return "MinefieldPaintSchemePaintScheme " + getValue() + " " + name(); 
    }
}
