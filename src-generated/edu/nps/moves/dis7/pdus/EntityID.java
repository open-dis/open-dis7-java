/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * also referred to as EntityIdentifier
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class EntityID extends Object implements Serializable
{
   /** Site ID */
   protected short  siteID;

   /** application number ID */
   protected short  applicationID;

   /** Entity number ID */
   protected short  entityID;


/** Constructor */
 public EntityID()
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

   marshalSize += 2;  // siteID
   marshalSize += 2;  // applicationID
   marshalSize += 2;  // entityID

   return marshalSize;
}


/** Setter for {@link EntityID#siteID}
  * @param pSiteID new value of interest
  * @return same object to permit progressive setters */
public EntityID setSiteID(short pSiteID)
{
    siteID = pSiteID;
    return this;
}
/** Utility setter for {@link EntityID#siteID}
  * @param pSiteID new value of interest
  * @return same object to permit progressive setters */
public EntityID setSiteID(int pSiteID){
    siteID = (short) pSiteID;
    return this;
}

/** Getter for {@link EntityID#siteID}
  * @return value of interest */
public short getSiteID()
{
    return siteID; 
}

/** Setter for {@link EntityID#applicationID}
  * @param pApplicationID new value of interest
  * @return same object to permit progressive setters */
public EntityID setApplicationID(short pApplicationID)
{
    applicationID = pApplicationID;
    return this;
}
/** Utility setter for {@link EntityID#applicationID}
  * @param pApplicationID new value of interest
  * @return same object to permit progressive setters */
public EntityID setApplicationID(int pApplicationID){
    applicationID = (short) pApplicationID;
    return this;
}

/** Getter for {@link EntityID#applicationID}
  * @return value of interest */
public short getApplicationID()
{
    return applicationID; 
}

/** Setter for {@link EntityID#entityID}
  * @param pEntityID new value of interest
  * @return same object to permit progressive setters */
public EntityID setEntityID(short pEntityID)
{
    entityID = pEntityID;
    return this;
}
/** Utility setter for {@link EntityID#entityID}
  * @param pEntityID new value of interest
  * @return same object to permit progressive setters */
public EntityID setEntityID(int pEntityID){
    entityID = (short) pEntityID;
    return this;
}

/** Getter for {@link EntityID#entityID}
  * @return value of interest */
public short getEntityID()
{
    return entityID; 
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
       dos.writeShort(siteID);
       dos.writeShort(applicationID);
       dos.writeShort(entityID);
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
        siteID = (short)dis.readUnsignedShort();
        uPosition += 2;
        applicationID = (short)dis.readUnsignedShort();
        uPosition += 2;
        entityID = (short)dis.readUnsignedShort();
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
   byteBuffer.putShort( (short)siteID);
   byteBuffer.putShort( (short)applicationID);
   byteBuffer.putShort( (short)entityID);
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
    siteID = (short)(byteBuffer.getShort() & 0xFFFF);
    applicationID = (short)(byteBuffer.getShort() & 0xFFFF);
    entityID = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final EntityID rhs = (EntityID)obj;

     if( ! (siteID == rhs.siteID)) ivarsEqual = false;
     if( ! (applicationID == rhs.applicationID)) ivarsEqual = false;
     if( ! (entityID == rhs.entityID)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" siteID: ").append(siteID).append("\n");
    sb.append(" applicationID: ").append(applicationID).append("\n");
    sb.append(" entityID: ").append(entityID).append("\n");

   return sb.toString();
 }
} // end of class
