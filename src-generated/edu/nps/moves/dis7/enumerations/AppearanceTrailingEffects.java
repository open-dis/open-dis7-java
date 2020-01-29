package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 381 marshal size 2<br>
 * Appearance-Trailing Effects
 */
public enum AppearanceTrailingEffects 
{
    /** None */
    NONE (0, "None"),
    /** Small */
    SMALL (1, "Small"),
    /** Medium */
    MEDIUM (2, "Medium"),
    /** Large */
    LARGE (3, "Large");

    private int value;
    private final String description;

    AppearanceTrailingEffects(int value, String description)
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

    public static AppearanceTrailingEffects getEnumForValue(int i)
    {
       for(AppearanceTrailingEffects val: AppearanceTrailingEffects.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AppearanceTrailingEffects");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.put((byte)getValue());
    }

    public static AppearanceTrailingEffects unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static AppearanceTrailingEffects unmarshalEnum(ByteBuffer buff) throws Exception
    {
        /*
        try {
            value = (int)buff.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue((int)buff.get());
    }

    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
    @Override
    public String toString()
    {
        return "AppearanceTrailingEffects: " + name() + ": " + getValue(); 
    }
}
