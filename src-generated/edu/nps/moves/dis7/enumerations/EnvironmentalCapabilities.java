package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 457 marshal size 32<br>
 * EnvironmentalCapabilities
 */
public class EnvironmentalCapabilities extends DisBitSet implements EntityCapabilities
{
  /**
   * This entry is reserved for backward compatibility and may not be reused
   */
  public static Bits RESERVED = new Bits(0, 5);
  /**
   * The Entity is an IED or contains an IED. The extended appearance record (if available) will identify how well hidden the IED is on the Entity. An Attached Part (if applicable, for instance a jury-rigged munition does not apply here) will identify the IED explicitly.
   */
  public static Bits IEDPRESENCEINDICATOR = new Bits(7, 1);

  public static class Bits
  {
    private int position;
    private int length;
    private int inputmask;
    private Class cls;

    private Bits(int position) {
      this(position,1, null);
    }
    
    private Bits(int position, Class cls) {
      this(position,1, cls);
    }

    private Bits(int position, int length ) {
      this(position,length,null);
    }

    private Bits(int position, int length, Class cls) {
      this.position = position;
      this.length = length;
      this.cls = cls;
      inputmask = calculateMask(length);
    }
  }

  public EnvironmentalCapabilities()
  {
    super(32); // length from bitfield element
  }

  public EnvironmentalCapabilities(Bits wh, int i)
  {
    this();
    set(wh,i);
  }

  public EnvironmentalCapabilities set(Bits wh, int val)
  {
    //if((val & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val);

    setbits(wh.position,wh.length,val);
    return this;
  }
/*
  public EnvironmentalCapabilities set(Bits wh, Object val) throws Exception
  {
    if(val.getClass() != wh.cls)
      throw new EnumNotFoundException("bad enum passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val.getClass().getSimpleName());;
    Method getValueMethod = wh.cls.getMethod("getValue",null);
    int bits = (int)getValueMethod.invoke(val, (Object[])null);
    setbits(wh.position,wh.length,bits);
    return this;
  }
*/
  // Some bitfields are defined without specific bits enumerated 
  public EnvironmentalCapabilities set(int start, int length, int val)
  {
      setbits(start,length,val);
      return this;
  }
  
  @Override
  public String toString()
  {
      return "EnvironmentalCapabilities: " + super.toString();
  }
}
