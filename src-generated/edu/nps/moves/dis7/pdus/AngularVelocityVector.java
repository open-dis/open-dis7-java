/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Angular velocity measured in radians per second out each of the entity's own coordinate axes. Order of measurement is angular velocity around the x, y, and z axis of the entity. The positive direction is determined by the right hand rule. Section 6.2.7
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class AngularVelocityVector extends Object implements Serializable
{
   /** velocity about the x axis */
   protected float  x = (float)0;

   /** velocity about the y axis */
   protected float  y = (float)0;

   /** velocity about the zaxis */
   protected float  z = (float)0;


/** Constructor */
 public AngularVelocityVector()
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

   marshalSize += 4;  // x
   marshalSize += 4;  // y
   marshalSize += 4;  // z

   return marshalSize;
}


/** Setter for {@link AngularVelocityVector#x}
  * @param pX new value of interest
  * @return same object to permit progressive setters */
public AngularVelocityVector setX(float pX)
{
    x = pX;
    return this;
}

/** Getter for {@link AngularVelocityVector#x}
  * @return value of interest */
public float getX()
{
    return x; 
}

/** Setter for {@link AngularVelocityVector#y}
  * @param pY new value of interest
  * @return same object to permit progressive setters */
public AngularVelocityVector setY(float pY)
{
    y = pY;
    return this;
}

/** Getter for {@link AngularVelocityVector#y}
  * @return value of interest */
public float getY()
{
    return y; 
}

/** Setter for {@link AngularVelocityVector#z}
  * @param pZ new value of interest
  * @return same object to permit progressive setters */
public AngularVelocityVector setZ(float pZ)
{
    z = pZ;
    return this;
}

/** Getter for {@link AngularVelocityVector#z}
  * @return value of interest */
public float getZ()
{
    return z; 
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
       dos.writeFloat(x);
       dos.writeFloat(y);
       dos.writeFloat(z);
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
        x = dis.readFloat();
        uPosition += 4;
        y = dis.readFloat();
        uPosition += 4;
        z = dis.readFloat();
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
   byteBuffer.putFloat( (float)x);
   byteBuffer.putFloat( (float)y);
   byteBuffer.putFloat( (float)z);
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
    x = byteBuffer.getFloat();
    y = byteBuffer.getFloat();
    z = byteBuffer.getFloat();
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

     final AngularVelocityVector rhs = (AngularVelocityVector)obj;

     if( ! (x == rhs.x)) ivarsEqual = false;
     if( ! (y == rhs.y)) ivarsEqual = false;
     if( ! (z == rhs.z)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" x: ").append(x).append("\n");
    sb.append(" y: ").append(y).append("\n");
    sb.append(" z: ").append(z).append("\n");

   return sb.toString();
 }
} // end of class
