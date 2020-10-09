/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * An entity's expendable (chaff, flares, etc.) information. Section 6.2.37
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ExpendableReload extends Object implements Serializable
{
   /** Type of expendable */
   protected EntityType  expendable = new EntityType(); 

   protected int  station;

   protected short  standardQuantity;

   protected short  maximumQuantity;

   protected int  standardQuantityReloadTime;

   protected int  maximumQuantityReloadTime;


/** Constructor */
 public ExpendableReload()
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

   marshalSize += expendable.getMarshalledSize();
   marshalSize += 4;  // station
   marshalSize += 2;  // standardQuantity
   marshalSize += 2;  // maximumQuantity
   marshalSize += 4;  // standardQuantityReloadTime
   marshalSize += 4;  // maximumQuantityReloadTime

   return marshalSize;
}


/** Setter for {@link ExpendableReload#expendable}
  * @param pExpendable new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setExpendable(EntityType pExpendable)
{
    expendable = pExpendable;
    return this;
}

/** Getter for {@link ExpendableReload#expendable}
  * @return value of interest */
public EntityType getExpendable()
{
    return expendable; 
}

/** Setter for {@link ExpendableReload#station}
  * @param pStation new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setStation(int pStation)
{
    station = pStation;
    return this;
}

/** Getter for {@link ExpendableReload#station}
  * @return value of interest */
public int getStation()
{
    return station; 
}

/** Setter for {@link ExpendableReload#standardQuantity}
  * @param pStandardQuantity new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setStandardQuantity(short pStandardQuantity)
{
    standardQuantity = pStandardQuantity;
    return this;
}
/** Utility setter for {@link ExpendableReload#standardQuantity}
  * @param pStandardQuantity new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setStandardQuantity(int pStandardQuantity){
    standardQuantity = (short) pStandardQuantity;
    return this;
}

/** Getter for {@link ExpendableReload#standardQuantity}
  * @return value of interest */
public short getStandardQuantity()
{
    return standardQuantity; 
}

/** Setter for {@link ExpendableReload#maximumQuantity}
  * @param pMaximumQuantity new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setMaximumQuantity(short pMaximumQuantity)
{
    maximumQuantity = pMaximumQuantity;
    return this;
}
/** Utility setter for {@link ExpendableReload#maximumQuantity}
  * @param pMaximumQuantity new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setMaximumQuantity(int pMaximumQuantity){
    maximumQuantity = (short) pMaximumQuantity;
    return this;
}

/** Getter for {@link ExpendableReload#maximumQuantity}
  * @return value of interest */
public short getMaximumQuantity()
{
    return maximumQuantity; 
}

/** Setter for {@link ExpendableReload#standardQuantityReloadTime}
  * @param pStandardQuantityReloadTime new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setStandardQuantityReloadTime(int pStandardQuantityReloadTime)
{
    standardQuantityReloadTime = pStandardQuantityReloadTime;
    return this;
}

/** Getter for {@link ExpendableReload#standardQuantityReloadTime}
  * @return value of interest */
public int getStandardQuantityReloadTime()
{
    return standardQuantityReloadTime; 
}

/** Setter for {@link ExpendableReload#maximumQuantityReloadTime}
  * @param pMaximumQuantityReloadTime new value of interest
  * @return same object to permit progressive setters */
public ExpendableReload setMaximumQuantityReloadTime(int pMaximumQuantityReloadTime)
{
    maximumQuantityReloadTime = pMaximumQuantityReloadTime;
    return this;
}

/** Getter for {@link ExpendableReload#maximumQuantityReloadTime}
  * @return value of interest */
public int getMaximumQuantityReloadTime()
{
    return maximumQuantityReloadTime; 
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
       expendable.marshal(dos);
       dos.writeInt(station);
       dos.writeShort(standardQuantity);
       dos.writeShort(maximumQuantity);
       dos.writeInt(standardQuantityReloadTime);
       dos.writeInt(maximumQuantityReloadTime);
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
        uPosition += expendable.unmarshal(dis);
        station = dis.readInt();
        uPosition += 4;
        standardQuantity = (short)dis.readUnsignedShort();
        uPosition += 2;
        maximumQuantity = (short)dis.readUnsignedShort();
        uPosition += 2;
        standardQuantityReloadTime = dis.readInt();
        uPosition += 4;
        maximumQuantityReloadTime = dis.readInt();
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
   expendable.marshal(byteBuffer);
   byteBuffer.putInt( (int)station);
   byteBuffer.putShort( (short)standardQuantity);
   byteBuffer.putShort( (short)maximumQuantity);
   byteBuffer.putInt( (int)standardQuantityReloadTime);
   byteBuffer.putInt( (int)maximumQuantityReloadTime);
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
    expendable.unmarshal(byteBuffer);
    station = byteBuffer.getInt();
    standardQuantity = (short)(byteBuffer.getShort() & 0xFFFF);
    maximumQuantity = (short)(byteBuffer.getShort() & 0xFFFF);
    standardQuantityReloadTime = byteBuffer.getInt();
    maximumQuantityReloadTime = byteBuffer.getInt();
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

     final ExpendableReload rhs = (ExpendableReload)obj;

     if( ! (expendable.equals( rhs.expendable) )) ivarsEqual = false;
     if( ! (station == rhs.station)) ivarsEqual = false;
     if( ! (standardQuantity == rhs.standardQuantity)) ivarsEqual = false;
     if( ! (maximumQuantity == rhs.maximumQuantity)) ivarsEqual = false;
     if( ! (standardQuantityReloadTime == rhs.standardQuantityReloadTime)) ivarsEqual = false;
     if( ! (maximumQuantityReloadTime == rhs.maximumQuantityReloadTime)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" expendable: ").append(expendable).append("\n");
    sb.append(" station: ").append(station).append("\n");
    sb.append(" standardQuantity: ").append(standardQuantity).append("\n");
    sb.append(" maximumQuantity: ").append(maximumQuantity).append("\n");
    sb.append(" standardQuantityReloadTime: ").append(standardQuantityReloadTime).append("\n");
    sb.append(" maximumQuantityReloadTime: ").append(maximumQuantityReloadTime).append("\n");

   return sb.toString();
 }
} // end of class
