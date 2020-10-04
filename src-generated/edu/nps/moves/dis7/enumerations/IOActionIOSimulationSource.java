package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 286 marshal size 16<br>
 * IOActionIOSimulationSource<br>
 * Values 1-999 are reserved for United States IO Simulation Sources - See applicable agreement of the organizers of the event (training, exercise, etc.) in which information operations is included.
 */
public enum IOActionIOSimulationSource 
{

    /** No Statement */
    NO_STATEMENT (0, "No Statement");

    private int value;
    private final String description;

    IOActionIOSimulationSource(int value, String description)
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
      return 16;
    }

    public static IOActionIOSimulationSource getEnumForValue(int i)
    {
       for(IOActionIOSimulationSource val: IOActionIOSimulationSource.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration IOActionIOSimulationSource");
       return null;
    }

 
   public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }

    public static IOActionIOSimulationSource unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    public static IOActionIOSimulationSource unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
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
        return "IOActionIOSimulationSource " + getValue() + " " + name(); 
    }
}
