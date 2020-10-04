package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 137 marshal size 8<br>
 * AddVariantsforAirCategory201Insect
 */
public enum AddVariantsforAirCategory201Insect 
{
    /** Vertical Shaped Insect Swarm */
    VERTICAL_SHAPED_INSECT_SWARM (1, "Vertical Shaped Insect Swarm"),
    /** Circular Shaped Insect Swarm */
    CIRCULAR_SHAPED_INSECT_SWARM (2, "Circular Shaped Insect Swarm"),
    /** Irregular Shaped Insect Swarm */
    IRREGULAR_SHAPED_INSECT_SWARM (3, "Irregular Shaped Insect Swarm");

    private int value;
    private final String description;

    AddVariantsforAirCategory201Insect(int value, String description)
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

    public static AddVariantsforAirCategory201Insect getEnumForValue(int i)
    {
       for(AddVariantsforAirCategory201Insect val: AddVariantsforAirCategory201Insect.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AddVariantsforAirCategory201Insect");
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

    public static AddVariantsforAirCategory201Insect unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static AddVariantsforAirCategory201Insect unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "AddVariantsforAirCategory201Insect " + getValue() + " " + name(); 
    }
}
