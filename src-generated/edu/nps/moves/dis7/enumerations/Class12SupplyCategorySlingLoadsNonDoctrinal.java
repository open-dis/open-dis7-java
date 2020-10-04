package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 612 marshal size 8<br>
 * Class12SupplyCategorySlingLoads(NonDoctrinal)
 */
public enum Class12SupplyCategorySlingLoadsNonDoctrinal implements Category
{
    /** Other */
    OTHER (1, "Other"),
    /** Sling Load, Blivet */
    SLING_LOAD_BLIVET (2, "Sling Load, Blivet"),
    /** Sling Load, Crate */
    SLING_LOAD_CRATE (3, "Sling Load, Crate"),
    /** Sling Load, Water Bucket */
    SLING_LOAD_WATER_BUCKET (4, "Sling Load, Water Bucket"),
    /** Sling Load, Vehicles */
    SLING_LOAD_VEHICLES (5, "Sling Load, Vehicles"),
    /** Sling Load, Howitzer */
    SLING_LOAD_HOWITZER (6, "Sling Load, Howitzer"),
    /** Sling Load, Collapsible */
    SLING_LOAD_COLLAPSIBLE (7, "Sling Load, Collapsible"),
    /** Sling Load, Bladder */
    SLING_LOAD_BLADDER (8, "Sling Load, Bladder"),
    /** Sling Load, Pallet of Crates */
    SLING_LOAD_PALLET_OF_CRATES (9, "Sling Load, Pallet of Crates"),
    /** Sling Load, Helicopters */
    SLING_LOAD_HELICOPTERS (10, "Sling Load, Helicopters"),
    /** Sling Load, Hoist */
    SLING_LOAD_HOIST (11, "Sling Load, Hoist"),
    /** Sling Load, Concrete Block */
    SLING_LOAD_CONCRETE_BLOCK (12, "Sling Load, Concrete Block");

    private int value;
    private final String description;

    Class12SupplyCategorySlingLoadsNonDoctrinal(int value, String description)
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

    public static Class12SupplyCategorySlingLoadsNonDoctrinal getEnumForValue(int i)
    {
       for(Class12SupplyCategorySlingLoadsNonDoctrinal val: Class12SupplyCategorySlingLoadsNonDoctrinal.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration Class12SupplyCategorySlingLoadsNonDoctrinal");
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

    public static Class12SupplyCategorySlingLoadsNonDoctrinal unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static Class12SupplyCategorySlingLoadsNonDoctrinal unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
        return "Class12SupplyCategorySlingLoadsNonDoctrinal " + getValue() + " " + name(); 
    }
}
