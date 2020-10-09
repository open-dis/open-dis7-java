package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 422 marshal size 7<br>
 * MinefieldFusingFuseType
 */
public enum MinefieldFusingFuseType 
{
    /** No Fuse */
    NO_FUSE (0, "No Fuse"),
    /** Other */
    OTHER (1, "Other"),
    /** Pressure */
    PRESSURE (2, "Pressure"),
    /** Magnetic */
    MAGNETIC (3, "Magnetic"),
    /** Tilt Rod */
    TILT_ROD (4, "Tilt Rod"),
    /** Command */
    COMMAND (5, "Command"),
    /** Trip Wire */
    TRIP_WIRE (6, "Trip Wire");

    private int value;
    private final String description;

    MinefieldFusingFuseType(int value, String description)
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
      return 7;
    }

    public static MinefieldFusingFuseType getEnumForValue(int i)
    {
       for(MinefieldFusingFuseType val: MinefieldFusingFuseType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration MinefieldFusingFuseType");
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

    public static MinefieldFusingFuseType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static MinefieldFusingFuseType unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "MinefieldFusingFuseType " + getValue() + " " + name(); 
    }
}
