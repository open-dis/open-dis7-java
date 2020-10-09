package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 70 marshal size 16<br>
 * AcknowledgeResponseFlag
 */
public enum AcknowledgeResponseFlag 
{
    /** Other */
    OTHER (0, "Other"),
    /** Able to comply */
    ABLE_TO_COMPLY (1, "Able to comply"),
    /** Unable to comply */
    UNABLE_TO_COMPLY (2, "Unable to comply"),
    /** Pending Operator Action */
    PENDING_OPERATOR_ACTION (3, "Pending Operator Action");

    private int value;
    private final String description;

    AcknowledgeResponseFlag(int value, String description)
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

    public static AcknowledgeResponseFlag getEnumForValue(int i)
    {
       for(AcknowledgeResponseFlag val: AcknowledgeResponseFlag.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AcknowledgeResponseFlag");
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

    public static AcknowledgeResponseFlag unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    public static AcknowledgeResponseFlag unmarshalEnum (ByteBuffer byteBuffer) throws Exception
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
        return "AcknowledgeResponseFlag " + getValue() + " " + name(); 
    }
}
