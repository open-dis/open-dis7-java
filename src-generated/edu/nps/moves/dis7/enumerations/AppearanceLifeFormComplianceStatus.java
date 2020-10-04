package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 391 marshal size 4<br>
 * AppearanceLifeFormComplianceStatus
 */
public enum AppearanceLifeFormComplianceStatus 
{
    /** Not Specified */
    NOT_SPECIFIED (0, "Not Specified"),
    /** Detained */
    DETAINED (1, "Detained"),
    /** Surrender */
    SURRENDER (2, "Surrender"),
    /** Using Fists */
    USING_FISTS (3, "Using Fists"),
    /** Verbal Abuse Level 1 */
    VERBAL_ABUSE_LEVEL_1 (4, "Verbal Abuse Level 1"),
    /** Verbal Abuse Level 2 */
    VERBAL_ABUSE_LEVEL_2 (5, "Verbal Abuse Level 2"),
    /** Verbal Abuse Level 3 */
    VERBAL_ABUSE_LEVEL_3 (6, "Verbal Abuse Level 3"),
    /** Passive Resistance Level 1 */
    PASSIVE_RESISTANCE_LEVEL_1 (7, "Passive Resistance Level 1"),
    /** Passive Resistance Level 2 */
    PASSIVE_RESISTANCE_LEVEL_2 (8, "Passive Resistance Level 2"),
    /** Passive Resistance Level 3 */
    PASSIVE_RESISTANCE_LEVEL_3 (9, "Passive Resistance Level 3"),
    /** Using Non-Lethal Weapon 1 */
    USING_NON_LETHAL_WEAPON_1 (10, "Using Non-Lethal Weapon 1"),
    /** Using Non-Lethal Weapon 2 */
    USING_NON_LETHAL_WEAPON_2 (11, "Using Non-Lethal Weapon 2"),
    /** Using Non-Lethal Weapon 3 */
    USING_NON_LETHAL_WEAPON_3 (12, "Using Non-Lethal Weapon 3"),
    /** Using Non-Lethal Weapon 4 */
    USING_NON_LETHAL_WEAPON_4 (13, "Using Non-Lethal Weapon 4"),
    /** Using Non-Lethal Weapon 5 */
    USING_NON_LETHAL_WEAPON_5 (14, "Using Non-Lethal Weapon 5"),
    /** Using Non-Lethal Weapon 6 */
    USING_NON_LETHAL_WEAPON_6 (15, "Using Non-Lethal Weapon 6");

    private int value;
    private final String description;

    AppearanceLifeFormComplianceStatus(int value, String description)
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
      return 4;
    }

    public static AppearanceLifeFormComplianceStatus getEnumForValue(int i)
    {
       for(AppearanceLifeFormComplianceStatus val: AppearanceLifeFormComplianceStatus.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AppearanceLifeFormComplianceStatus");
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

    public static AppearanceLifeFormComplianceStatus unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static AppearanceLifeFormComplianceStatus unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "AppearanceLifeFormComplianceStatus " + getValue() + " " + name(); 
    }
}
