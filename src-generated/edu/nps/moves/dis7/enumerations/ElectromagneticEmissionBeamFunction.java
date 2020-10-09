package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 78 marshal size 8<br>
 * ElectromagneticEmissionBeamFunction
 */
public enum ElectromagneticEmissionBeamFunction 
{
    /** Other */
    OTHER (0, "Other"),
    /** Search */
    SEARCH (1, "Search"),
    /** Height Finding */
    HEIGHT_FINDING (2, "Height Finding"),
    /** Acquisition */
    ACQUISITION (3, "Acquisition"),
    /** Tracking */
    TRACKING (4, "Tracking"),
    /** Acquisition and tracking */
    ACQUISITION_AND_TRACKING (5, "Acquisition and tracking"),
    /** Command guidance */
    COMMAND_GUIDANCE (6, "Command guidance"),
    /** Illumination */
    ILLUMINATION (7, "Illumination"),
    /** Ranging */
    RANGING (8, "Ranging"),
    /** Missile beacon */
    MISSILE_BEACON (9, "Missile beacon"),
    /** Missile Fusing */
    MISSILE_FUSING (10, "Missile Fusing"),
    /** Active radar missile seeker */
    ACTIVE_RADAR_MISSILE_SEEKER (11, "Active radar missile seeker"),
    /** Jamming */
    JAMMING (12, "Jamming"),
    /** IFF */
    IFF (13, "IFF"),
    /** Navigation / Weather */
    NAVIGATION_WEATHER (14, "Navigation / Weather"),
    /** Meteorological */
    METEOROLOGICAL (15, "Meteorological"),
    /** Data transmission */
    DATA_TRANSMISSION (16, "Data transmission"),
    /** Navigational directional beacon */
    NAVIGATIONAL_DIRECTIONAL_BEACON (17, "Navigational directional beacon"),
    /** Time-Shared Search */
    TIME_SHARED_SEARCH (20, "Time-Shared Search"),
    /** Time-Shared Acquisition */
    TIME_SHARED_ACQUISITION (21, "Time-Shared Acquisition"),
    /** Time-Shared Track */
    TIME_SHARED_TRACK (22, "Time-Shared Track"),
    /** Time-Shared Command Guidance */
    TIME_SHARED_COMMAND_GUIDANCE (23, "Time-Shared Command Guidance"),
    /** Time-Shared Illumination */
    TIME_SHARED_ILLUMINATION (24, "Time-Shared Illumination"),
    /** Time-Shared Jamming */
    TIME_SHARED_JAMMING (25, "Time-Shared Jamming");

    private int value;
    private final String description;

    ElectromagneticEmissionBeamFunction(int value, String description)
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

    public static ElectromagneticEmissionBeamFunction getEnumForValue(int i)
    {
       for(ElectromagneticEmissionBeamFunction val: ElectromagneticEmissionBeamFunction.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration ElectromagneticEmissionBeamFunction");
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

    public static ElectromagneticEmissionBeamFunction unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static ElectromagneticEmissionBeamFunction unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "ElectromagneticEmissionBeamFunction " + getValue() + " " + name(); 
    }
}
