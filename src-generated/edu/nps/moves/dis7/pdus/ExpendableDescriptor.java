/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Burst of chaff or expendible device. Section 6.2.19.4
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ExpendableDescriptor extends Object implements Serializable
{
   /** Type of the object that exploded */
   protected EntityType  expendableType = new EntityType(); 

   /** Padding */
   protected long  padding = (long)0;


/** Constructor */
 public ExpendableDescriptor()
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

   marshalSize += expendableType.getMarshalledSize();
   marshalSize += 8;  // padding

   return marshalSize;
}


/** Setter for {@link ExpendableDescriptor#expendableType}
  * @param pExpendableType new value of interest
  * @return same object to permit progressive setters */
public ExpendableDescriptor setExpendableType(EntityType pExpendableType)
{
    expendableType = pExpendableType;
    return this;
}

/** Getter for {@link ExpendableDescriptor#expendableType}
  * @return value of interest */
public EntityType getExpendableType()
{
    return expendableType; 
}

/** Setter for {@link ExpendableDescriptor#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public ExpendableDescriptor setPadding(long pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link ExpendableDescriptor#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public ExpendableDescriptor setPadding(int pPadding){
    padding = (long) pPadding;
    return this;
}

/** Getter for {@link ExpendableDescriptor#padding}
  * @return value of interest */
public long getPadding()
{
    return padding; 
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
       expendableType.marshal(dos);
       dos.writeLong(padding);
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
        uPosition += expendableType.unmarshal(dis);
        padding = dis.readLong();
        uPosition += 4;
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
   expendableType.marshal(byteBuffer);
   byteBuffer.putLong( (long)padding);
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
    expendableType.unmarshal(byteBuffer);
    padding = byteBuffer.getLong();
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

     final ExpendableDescriptor rhs = (ExpendableDescriptor)obj;

     if( ! (expendableType.equals( rhs.expendableType) )) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" expendableType: ").append(expendableType).append("\n");
    sb.append(" padding: ").append(padding).append("\n");

   return sb.toString();
 }
} // end of class
