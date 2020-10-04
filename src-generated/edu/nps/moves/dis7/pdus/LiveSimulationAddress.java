/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * A simulation's designation associated with all Live Entity IDs contained in Live Entity PDUs. Section 6.2.55 
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LiveSimulationAddress extends Object implements Serializable
{
   /** facility, installation, organizational unit or geographic location may have multiple sites associated with it. The Site Number is the first component of the Live Simulation Address, which defines a live simulation. */
   protected byte  liveSiteNumber;

   /** An application associated with a live site is termed a live application. Each live application participating in an event  */
   protected byte  liveApplicationNumber;


/** Constructor */
 public LiveSimulationAddress()
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

   marshalSize += 1;  // liveSiteNumber
   marshalSize += 1;  // liveApplicationNumber

   return marshalSize;
}


/** Setter for {@link LiveSimulationAddress#liveSiteNumber}
  * @param pLiveSiteNumber new value of interest
  * @return same object to permit progressive setters */
public LiveSimulationAddress setLiveSiteNumber(byte pLiveSiteNumber)
{
    liveSiteNumber = pLiveSiteNumber;
    return this;
}
/** Utility setter for {@link LiveSimulationAddress#liveSiteNumber}
  * @param pLiveSiteNumber new value of interest
  * @return same object to permit progressive setters */
public LiveSimulationAddress setLiveSiteNumber(int pLiveSiteNumber){
    liveSiteNumber = (byte) pLiveSiteNumber;
    return this;
}

/** Getter for {@link LiveSimulationAddress#liveSiteNumber}
  * @return value of interest */
public byte getLiveSiteNumber()
{
    return liveSiteNumber; 
}

/** Setter for {@link LiveSimulationAddress#liveApplicationNumber}
  * @param pLiveApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public LiveSimulationAddress setLiveApplicationNumber(byte pLiveApplicationNumber)
{
    liveApplicationNumber = pLiveApplicationNumber;
    return this;
}
/** Utility setter for {@link LiveSimulationAddress#liveApplicationNumber}
  * @param pLiveApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public LiveSimulationAddress setLiveApplicationNumber(int pLiveApplicationNumber){
    liveApplicationNumber = (byte) pLiveApplicationNumber;
    return this;
}

/** Getter for {@link LiveSimulationAddress#liveApplicationNumber}
  * @return value of interest */
public byte getLiveApplicationNumber()
{
    return liveApplicationNumber; 
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
       dos.writeByte(liveSiteNumber);
       dos.writeByte(liveApplicationNumber);
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
        liveSiteNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        liveApplicationNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   byteBuffer.put( (byte)liveSiteNumber);
   byteBuffer.put( (byte)liveApplicationNumber);
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
    liveSiteNumber = (byte)(byteBuffer.get() & 0xFF);
    liveApplicationNumber = (byte)(byteBuffer.get() & 0xFF);
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

     final LiveSimulationAddress rhs = (LiveSimulationAddress)obj;

     if( ! (liveSiteNumber == rhs.liveSiteNumber)) ivarsEqual = false;
     if( ! (liveApplicationNumber == rhs.liveApplicationNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" liveSiteNumber: ").append(liveSiteNumber).append("\n");
    sb.append(" liveApplicationNumber: ").append(liveApplicationNumber).append("\n");

   return sb.toString();
 }
} // end of class