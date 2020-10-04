package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 418 marshal size 2<br>
 * MinefieldAppearanceMinefieldType
 */
public enum MinefieldAppearanceMinefieldType 
{
    /** Mixed Anti-Personnel and Anti-Tank Minefield */
    MIXED_ANTI_PERSONNEL_AND_ANTI_TANK_MINEFIELD (0, "Mixed Anti-Personnel and Anti-Tank Minefield"),
    /** Pure Anti-Personnel Minefield */
    PURE_ANTI_PERSONNEL_MINEFIELD (1, "Pure Anti-Personnel Minefield"),
    /** Pure Anti-Tank Minefield */
    PURE_ANTI_TANK_MINEFIELD (2, "Pure Anti-Tank Minefield");

    private int value;
    private final String description;

    MinefieldAppearanceMinefieldType(int value, String description)
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
      return 2;
    }

    public static MinefieldAppearanceMinefieldType getEnumForValue(int i)
    {
       for(MinefieldAppearanceMinefieldType val: MinefieldAppearanceMinefieldType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration MinefieldAppearanceMinefieldType");
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

    public static MinefieldAppearanceMinefieldType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static MinefieldAppearanceMinefieldType unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "MinefieldAppearanceMinefieldType " + getValue() + " " + name(); 
    }
}
