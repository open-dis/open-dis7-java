/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * indicate weapons (munitions) previously communicated via the Munition record. Section 6.2.61 
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class MunitionReload extends Object implements Serializable
{
   /**  This field shall identify the entity type of the munition. See section 6.2.30. */
   protected EntityType  munitionType = new EntityType(); 

   /** The station or launcher to which the munition is assigned. See Annex I */
   protected int  station;

   /** The standard quantity of this munition type normally loaded at this station/launcher if a station/launcher is specified. */
   protected short  standardQuantity;

   /** The maximum quantity of this munition type that this station/launcher is capable of holding when a station/launcher is specified  */
   protected short  maximumQuantity;

   /** numer of seconds of sim time required to reload the std qty */
   protected int  standardQuantityReloadTime;

   /** The number of seconds of sim time required to reload the max possible quantity */
   protected int  maximumQuantityReloadTime;


/** Constructor */
 public MunitionReload()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += munitionType.getMarshalledSize();
   marshalSize += 4;  // station
   marshalSize += 2;  // standardQuantity
   marshalSize += 2;  // maximumQuantity
   marshalSize += 4;  // standardQuantityReloadTime
   marshalSize += 4;  // maximumQuantityReloadTime

   return marshalSize;
}


/** Setter for {@link MunitionReload#munitionType}
  * @param pMunitionType new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setMunitionType(EntityType pMunitionType)
{
    munitionType = pMunitionType;
    return this;
}

/** Getter for {@link MunitionReload#munitionType}
  * @return value of interest */
public EntityType getMunitionType()
{
    return munitionType; 
}

/** Setter for {@link MunitionReload#station}
  * @param pStation new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setStation(int pStation)
{
    station = pStation;
    return this;
}

/** Getter for {@link MunitionReload#station}
  * @return value of interest */
public int getStation()
{
    return station; 
}

/** Setter for {@link MunitionReload#standardQuantity}
  * @param pStandardQuantity new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setStandardQuantity(short pStandardQuantity)
{
    standardQuantity = pStandardQuantity;
    return this;
}
/** Utility setter for {@link MunitionReload#standardQuantity}
  * @param pStandardQuantity new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setStandardQuantity(int pStandardQuantity){
    standardQuantity = (short) pStandardQuantity;
    return this;
}

/** Getter for {@link MunitionReload#standardQuantity}
  * @return value of interest */
public short getStandardQuantity()
{
    return standardQuantity; 
}

/** Setter for {@link MunitionReload#maximumQuantity}
  * @param pMaximumQuantity new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setMaximumQuantity(short pMaximumQuantity)
{
    maximumQuantity = pMaximumQuantity;
    return this;
}
/** Utility setter for {@link MunitionReload#maximumQuantity}
  * @param pMaximumQuantity new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setMaximumQuantity(int pMaximumQuantity){
    maximumQuantity = (short) pMaximumQuantity;
    return this;
}

/** Getter for {@link MunitionReload#maximumQuantity}
  * @return value of interest */
public short getMaximumQuantity()
{
    return maximumQuantity; 
}

/** Setter for {@link MunitionReload#standardQuantityReloadTime}
  * @param pStandardQuantityReloadTime new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setStandardQuantityReloadTime(int pStandardQuantityReloadTime)
{
    standardQuantityReloadTime = pStandardQuantityReloadTime;
    return this;
}

/** Getter for {@link MunitionReload#standardQuantityReloadTime}
  * @return value of interest */
public int getStandardQuantityReloadTime()
{
    return standardQuantityReloadTime; 
}

/** Setter for {@link MunitionReload#maximumQuantityReloadTime}
  * @param pMaximumQuantityReloadTime new value of interest
  * @return same object to permit progressive setters */
public MunitionReload setMaximumQuantityReloadTime(int pMaximumQuantityReloadTime)
{
    maximumQuantityReloadTime = pMaximumQuantityReloadTime;
    return this;
}

/** Getter for {@link MunitionReload#maximumQuantityReloadTime}
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
       munitionType.marshal(dos);
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
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        uPosition += munitionType.unmarshal(dis);
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
   munitionType.marshal(byteBuffer);
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
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    munitionType.unmarshal(byteBuffer);
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

     final MunitionReload rhs = (MunitionReload)obj;

     if( ! (munitionType.equals( rhs.munitionType) )) ivarsEqual = false;
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

    sb.append(" munitionType: ").append(munitionType).append("\n");
    sb.append(" station: ").append(station).append("\n");
    sb.append(" standardQuantity: ").append(standardQuantity).append("\n");
    sb.append(" maximumQuantity: ").append(maximumQuantity).append("\n");
    sb.append(" standardQuantityReloadTime: ").append(standardQuantityReloadTime).append("\n");
    sb.append(" maximumQuantityReloadTime: ").append(maximumQuantityReloadTime).append("\n");

   return sb.toString();
 }
} // end of class
