/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 16-bit fixed binaries
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LiveEntityRelativeWorldCoordinates extends Object implements Serializable
{
   protected short  referencePoint;

   protected short  deltaX;

   protected short  deltaY;

   protected short  deltaZ;


/** Constructor */
 public LiveEntityRelativeWorldCoordinates()
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

   marshalSize += 2;  // referencePoint
   marshalSize += 2;  // deltaX
   marshalSize += 2;  // deltaY
   marshalSize += 2;  // deltaZ

   return marshalSize;
}


/** Setter for {@link LiveEntityRelativeWorldCoordinates#referencePoint}
  * @param pReferencePoint new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setReferencePoint(short pReferencePoint)
{
    referencePoint = pReferencePoint;
    return this;
}
/** Utility setter for {@link LiveEntityRelativeWorldCoordinates#referencePoint}
  * @param pReferencePoint new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setReferencePoint(int pReferencePoint){
    referencePoint = (short) pReferencePoint;
    return this;
}

/** Getter for {@link LiveEntityRelativeWorldCoordinates#referencePoint}
  * @return value of interest */
public short getReferencePoint()
{
    return referencePoint; 
}

/** Setter for {@link LiveEntityRelativeWorldCoordinates#deltaX}
  * @param pDeltaX new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setDeltaX(short pDeltaX)
{
    deltaX = pDeltaX;
    return this;
}
/** Utility setter for {@link LiveEntityRelativeWorldCoordinates#deltaX}
  * @param pDeltaX new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setDeltaX(int pDeltaX){
    deltaX = (short) pDeltaX;
    return this;
}

/** Getter for {@link LiveEntityRelativeWorldCoordinates#deltaX}
  * @return value of interest */
public short getDeltaX()
{
    return deltaX; 
}

/** Setter for {@link LiveEntityRelativeWorldCoordinates#deltaY}
  * @param pDeltaY new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setDeltaY(short pDeltaY)
{
    deltaY = pDeltaY;
    return this;
}
/** Utility setter for {@link LiveEntityRelativeWorldCoordinates#deltaY}
  * @param pDeltaY new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setDeltaY(int pDeltaY){
    deltaY = (short) pDeltaY;
    return this;
}

/** Getter for {@link LiveEntityRelativeWorldCoordinates#deltaY}
  * @return value of interest */
public short getDeltaY()
{
    return deltaY; 
}

/** Setter for {@link LiveEntityRelativeWorldCoordinates#deltaZ}
  * @param pDeltaZ new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setDeltaZ(short pDeltaZ)
{
    deltaZ = pDeltaZ;
    return this;
}
/** Utility setter for {@link LiveEntityRelativeWorldCoordinates#deltaZ}
  * @param pDeltaZ new value of interest
  * @return same object to permit progressive setters */
public LiveEntityRelativeWorldCoordinates setDeltaZ(int pDeltaZ){
    deltaZ = (short) pDeltaZ;
    return this;
}

/** Getter for {@link LiveEntityRelativeWorldCoordinates#deltaZ}
  * @return value of interest */
public short getDeltaZ()
{
    return deltaZ; 
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
       dos.writeShort(referencePoint);
       dos.writeShort(deltaX);
       dos.writeShort(deltaY);
       dos.writeShort(deltaZ);
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
        referencePoint = (short)dis.readUnsignedShort();
        uPosition += 2;
        deltaX = (short)dis.readUnsignedShort();
        uPosition += 2;
        deltaY = (short)dis.readUnsignedShort();
        uPosition += 2;
        deltaZ = (short)dis.readUnsignedShort();
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
   byteBuffer.putShort( (short)referencePoint);
   byteBuffer.putShort( (short)deltaX);
   byteBuffer.putShort( (short)deltaY);
   byteBuffer.putShort( (short)deltaZ);
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
    referencePoint = (short)(byteBuffer.getShort() & 0xFFFF);
    deltaX = (short)(byteBuffer.getShort() & 0xFFFF);
    deltaY = (short)(byteBuffer.getShort() & 0xFFFF);
    deltaZ = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LiveEntityRelativeWorldCoordinates rhs = (LiveEntityRelativeWorldCoordinates)obj;

     if( ! (referencePoint == rhs.referencePoint)) ivarsEqual = false;
     if( ! (deltaX == rhs.deltaX)) ivarsEqual = false;
     if( ! (deltaY == rhs.deltaY)) ivarsEqual = false;
     if( ! (deltaZ == rhs.deltaZ)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" referencePoint: ").append(referencePoint).append("\n");
    sb.append(" deltaX: ").append(deltaX).append("\n");
    sb.append(" deltaY: ").append(deltaY).append("\n");
    sb.append(" deltaZ: ").append(deltaZ).append("\n");

   return sb.toString();
 }
} // end of class
