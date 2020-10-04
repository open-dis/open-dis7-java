package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 411 marshal size 2<br>
 * AppearanceObjectGeneralIEDPresent
 */
public enum AppearanceObjectGeneralIEDPresent 
{
    /** None */
    NONE (0, "None"),
    /** Visible */
    VISIBLE (1, "Visible"),
    /** Partially Hidden */
    PARTIALLY_HIDDEN (2, "Partially Hidden"),
    /** Completely Hidden */
    COMPLETELY_HIDDEN (3, "Completely Hidden");

    private int value;
    private final String description;

    AppearanceObjectGeneralIEDPresent(int value, String description)
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

    public static AppearanceObjectGeneralIEDPresent getEnumForValue(int i)
    {
       for(AppearanceObjectGeneralIEDPresent val: AppearanceObjectGeneralIEDPresent.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AppearanceObjectGeneralIEDPresent");
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

    public static AppearanceObjectGeneralIEDPresent unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static AppearanceObjectGeneralIEDPresent unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "AppearanceObjectGeneralIEDPresent " + getValue() + " " + name(); 
    }
}
