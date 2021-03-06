/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The unique designation of each entity in an event or exercise that is contained in a Live Entity PDU. Section 6.2.54 
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LiveEntityIdentifier extends Object implements Serializable
{
   /** Live Simulation Address record (see 6.2.54)  */
   protected LiveSimulationAddress  liveSimulationAddress = new LiveSimulationAddress(); 

   /** Live entity number  */
   protected short  entityNumber;


/** Constructor */
 public LiveEntityIdentifier()
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

   marshalSize += liveSimulationAddress.getMarshalledSize();
   marshalSize += 2;  // entityNumber

   return marshalSize;
}


/** Setter for {@link LiveEntityIdentifier#liveSimulationAddress}
  * @param pLiveSimulationAddress new value of interest
  * @return same object to permit progressive setters */
public LiveEntityIdentifier setLiveSimulationAddress(LiveSimulationAddress pLiveSimulationAddress)
{
    liveSimulationAddress = pLiveSimulationAddress;
    return this;
}

/** Getter for {@link LiveEntityIdentifier#liveSimulationAddress}
  * @return value of interest */
public LiveSimulationAddress getLiveSimulationAddress()
{
    return liveSimulationAddress; 
}

/** Setter for {@link LiveEntityIdentifier#entityNumber}
  * @param pEntityNumber new value of interest
  * @return same object to permit progressive setters */
public LiveEntityIdentifier setEntityNumber(short pEntityNumber)
{
    entityNumber = pEntityNumber;
    return this;
}
/** Utility setter for {@link LiveEntityIdentifier#entityNumber}
  * @param pEntityNumber new value of interest
  * @return same object to permit progressive setters */
public LiveEntityIdentifier setEntityNumber(int pEntityNumber){
    entityNumber = (short) pEntityNumber;
    return this;
}

/** Getter for {@link LiveEntityIdentifier#entityNumber}
  * @return value of interest */
public short getEntityNumber()
{
    return entityNumber; 
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
       liveSimulationAddress.marshal(dos);
       dos.writeShort(entityNumber);
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
        uPosition += liveSimulationAddress.unmarshal(dis);
        entityNumber = (short)dis.readUnsignedShort();
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
   liveSimulationAddress.marshal(byteBuffer);
   byteBuffer.putShort( (short)entityNumber);
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
    liveSimulationAddress.unmarshal(byteBuffer);
    entityNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LiveEntityIdentifier rhs = (LiveEntityIdentifier)obj;

     if( ! (liveSimulationAddress.equals( rhs.liveSimulationAddress) )) ivarsEqual = false;
     if( ! (entityNumber == rhs.entityNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" liveSimulationAddress: ").append(liveSimulationAddress).append("\n");
    sb.append(" entityNumber: ").append(entityNumber).append("\n");

   return sb.toString();
 }
} // end of class
