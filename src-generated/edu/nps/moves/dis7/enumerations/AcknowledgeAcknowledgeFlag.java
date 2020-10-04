package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 69 marshal size 16<br>
 * AcknowledgeAcknowledgeFlag
 */
public enum AcknowledgeAcknowledgeFlag 
{
    /** Create Entity */
    CREATE_ENTITY (1, "Create Entity"),
    /** Remove Entity */
    REMOVE_ENTITY (2, "Remove Entity"),
    /** Start/Resume */
    START_RESUME (3, "Start/Resume"),
    /** Stop/Freeze */
    STOP_FREEZE (4, "Stop/Freeze"),
    /** Transfer Ownership */
    TRANSFER_OWNERSHIP (5, "Transfer Ownership");

    private int value;
    private final String description;

    AcknowledgeAcknowledgeFlag(int value, String description)
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

    public static AcknowledgeAcknowledgeFlag getEnumForValue(int i)
    {
       for(AcknowledgeAcknowledgeFlag val: AcknowledgeAcknowledgeFlag.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AcknowledgeAcknowledgeFlag");
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

    public static AcknowledgeAcknowledgeFlag unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    public static AcknowledgeAcknowledgeFlag unmarshalEnum (ByteBuffer byteBuffer) throws Exception
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
        return "AcknowledgeAcknowledgeFlag " + getValue() + " " + name(); 
    }
}
