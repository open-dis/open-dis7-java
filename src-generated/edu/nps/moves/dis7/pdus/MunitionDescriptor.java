/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Represents the firing or detonation of a munition. Section 6.2.19.2
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class MunitionDescriptor extends Object implements Serializable
{
   /** What munition was used in the burst */
   protected EntityType  munitionType = new EntityType(); 

   /** type of warhead enumeration uid 60 */
   protected MunitionDescriptorWarhead warhead = MunitionDescriptorWarhead.values()[0];

   /** type of fuse used enumeration uid 61 */
   protected MunitionDescriptorFuse fuse = MunitionDescriptorFuse.values()[0];

   /** how many of the munition were fired */
   protected short  quantity;

   /** rate at which the munition was fired */
   protected short  rate;


/** Constructor */
 public MunitionDescriptor()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += munitionType.getMarshalledSize();
   marshalSize += warhead.getMarshalledSize();
   marshalSize += fuse.getMarshalledSize();
   marshalSize += 2;  // quantity
   marshalSize += 2;  // rate

   return marshalSize;
}


/** Setter for {@link MunitionDescriptor#munitionType}
  * @param pMunitionType new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setMunitionType(EntityType pMunitionType)
{
    munitionType = pMunitionType;
    return this;
}

/** Getter for {@link MunitionDescriptor#munitionType}
  * @return value of interest */
public EntityType getMunitionType()
{
    return munitionType; 
}

/** Setter for {@link MunitionDescriptor#warhead}
  * @param pWarhead new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setWarhead(MunitionDescriptorWarhead pWarhead)
{
    warhead = pWarhead;
    return this;
}

/** Getter for {@link MunitionDescriptor#warhead}
  * @return value of interest */
public MunitionDescriptorWarhead getWarhead()
{
    return warhead; 
}

/** Setter for {@link MunitionDescriptor#fuse}
  * @param pFuse new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setFuse(MunitionDescriptorFuse pFuse)
{
    fuse = pFuse;
    return this;
}

/** Getter for {@link MunitionDescriptor#fuse}
  * @return value of interest */
public MunitionDescriptorFuse getFuse()
{
    return fuse; 
}

/** Setter for {@link MunitionDescriptor#quantity}
  * @param pQuantity new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setQuantity(short pQuantity)
{
    quantity = pQuantity;
    return this;
}
/** Utility setter for {@link MunitionDescriptor#quantity}
  * @param pQuantity new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setQuantity(int pQuantity){
    quantity = (short) pQuantity;
    return this;
}

/** Getter for {@link MunitionDescriptor#quantity}
  * @return value of interest */
public short getQuantity()
{
    return quantity; 
}

/** Setter for {@link MunitionDescriptor#rate}
  * @param pRate new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setRate(short pRate)
{
    rate = pRate;
    return this;
}
/** Utility setter for {@link MunitionDescriptor#rate}
  * @param pRate new value of interest
  * @return same object to permit progressive setters */
public MunitionDescriptor setRate(int pRate){
    rate = (short) pRate;
    return this;
}

/** Getter for {@link MunitionDescriptor#rate}
  * @return value of interest */
public short getRate()
{
    return rate; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       munitionType.marshal(dos);
       warhead.marshal(dos);
       fuse.marshal(dos);
       dos.writeShort(quantity);
       dos.writeShort(rate);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        uPosition += munitionType.unmarshal(dis);
        warhead = MunitionDescriptorWarhead.unmarshalEnum(dis);
        uPosition += warhead.getMarshalledSize();
        fuse = MunitionDescriptorFuse.unmarshalEnum(dis);
        uPosition += fuse.getMarshalledSize();
        quantity = (short)dis.readUnsignedShort();
        uPosition += 2;
        rate = (short)dis.readUnsignedShort();
        uPosition += 2;
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   munitionType.marshal(byteBuffer);
   warhead.marshal(byteBuffer);
   fuse.marshal(byteBuffer);
   byteBuffer.putShort( (short)quantity);
   byteBuffer.putShort( (short)rate);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    munitionType.unmarshal(byteBuffer);
    warhead = MunitionDescriptorWarhead.unmarshalEnum(byteBuffer);
    fuse = MunitionDescriptorFuse.unmarshalEnum(byteBuffer);
    quantity = (short)(byteBuffer.getShort() & 0xFFFF);
    rate = (short)(byteBuffer.getShort() & 0xFFFF);
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final MunitionDescriptor rhs = (MunitionDescriptor)obj;

     if( ! (munitionType.equals( rhs.munitionType) )) ivarsEqual = false;
     if( ! (warhead == rhs.warhead)) ivarsEqual = false;
     if( ! (fuse == rhs.fuse)) ivarsEqual = false;
     if( ! (quantity == rhs.quantity)) ivarsEqual = false;
     if( ! (rate == rhs.rate)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" munitionType: ").append(munitionType).append("\n");
    sb.append(" warhead: ").append(warhead).append("\n");
    sb.append(" fuse: ").append(fuse).append("\n");
    sb.append(" quantity: ").append(quantity).append("\n");
    sb.append(" rate: ").append(rate).append("\n");

   return sb.toString();
 }
} // end of class
