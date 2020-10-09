package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 21 marshal size 8<br>
 * EnvironmentalSubcategory
 */
public enum EnvironmentalSubcategory implements SubCategory
{
    /** Other */
    OTHER (0, "Other"),
    /** Very Small */
    VERY_SMALL (20, "Very Small"),
    /** Small */
    SMALL (40, "Small"),
    /** Medium */
    MEDIUM (60, "Medium"),
    /** Large */
    LARGE (80, "Large"),
    /** Very Large */
    VERY_LARGE (100, "Very Large");

    private int value;
    private final String description;

    EnvironmentalSubcategory(int value, String description)
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
      return 8;
    }

    public static EnvironmentalSubcategory getEnumForValue(int i)
    {
       for(EnvironmentalSubcategory val: EnvironmentalSubcategory.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration EnvironmentalSubcategory");
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

    public static EnvironmentalSubcategory unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static EnvironmentalSubcategory unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "EnvironmentalSubcategory " + getValue() + " " + name(); 
    }
}
