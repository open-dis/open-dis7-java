/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The unique designation of an attached or unattached radio in an event or exercise Section 6.2.70
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class RadioIdentifier extends Object implements Serializable
{
   /**  site */
   protected short  siteNumber;

   /** application number */
   protected short  applicationNumber;

   /**  reference number */
   protected short  referenceNumber;

   /**  Radio number */
   protected short  radioNumber;


/** Constructor */
 public RadioIdentifier()
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

   marshalSize += 2;  // siteNumber
   marshalSize += 2;  // applicationNumber
   marshalSize += 2;  // referenceNumber
   marshalSize += 2;  // radioNumber

   return marshalSize;
}


/** Setter for {@link RadioIdentifier#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setSiteNumber(short pSiteNumber)
{
    siteNumber = pSiteNumber;
    return this;
}
/** Utility setter for {@link RadioIdentifier#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setSiteNumber(int pSiteNumber){
    siteNumber = (short) pSiteNumber;
    return this;
}

/** Getter for {@link RadioIdentifier#siteNumber}
  * @return value of interest */
public short getSiteNumber()
{
    return siteNumber; 
}

/** Setter for {@link RadioIdentifier#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setApplicationNumber(short pApplicationNumber)
{
    applicationNumber = pApplicationNumber;
    return this;
}
/** Utility setter for {@link RadioIdentifier#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setApplicationNumber(int pApplicationNumber){
    applicationNumber = (short) pApplicationNumber;
    return this;
}

/** Getter for {@link RadioIdentifier#applicationNumber}
  * @return value of interest */
public short getApplicationNumber()
{
    return applicationNumber; 
}

/** Setter for {@link RadioIdentifier#referenceNumber}
  * @param pReferenceNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setReferenceNumber(short pReferenceNumber)
{
    referenceNumber = pReferenceNumber;
    return this;
}
/** Utility setter for {@link RadioIdentifier#referenceNumber}
  * @param pReferenceNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setReferenceNumber(int pReferenceNumber){
    referenceNumber = (short) pReferenceNumber;
    return this;
}

/** Getter for {@link RadioIdentifier#referenceNumber}
  * @return value of interest */
public short getReferenceNumber()
{
    return referenceNumber; 
}

/** Setter for {@link RadioIdentifier#radioNumber}
  * @param pRadioNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setRadioNumber(short pRadioNumber)
{
    radioNumber = pRadioNumber;
    return this;
}
/** Utility setter for {@link RadioIdentifier#radioNumber}
  * @param pRadioNumber new value of interest
  * @return same object to permit progressive setters */
public RadioIdentifier setRadioNumber(int pRadioNumber){
    radioNumber = (short) pRadioNumber;
    return this;
}

/** Getter for {@link RadioIdentifier#radioNumber}
  * @return value of interest */
public short getRadioNumber()
{
    return radioNumber; 
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
       dos.writeShort(siteNumber);
       dos.writeShort(applicationNumber);
       dos.writeShort(referenceNumber);
       dos.writeShort(radioNumber);
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
        siteNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        applicationNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        referenceNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        radioNumber = (short)dis.readUnsignedShort();
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
   byteBuffer.putShort( (short)siteNumber);
   byteBuffer.putShort( (short)applicationNumber);
   byteBuffer.putShort( (short)referenceNumber);
   byteBuffer.putShort( (short)radioNumber);
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
    siteNumber = (short)(byteBuffer.getShort() & 0xFFFF);
    applicationNumber = (short)(byteBuffer.getShort() & 0xFFFF);
    referenceNumber = (short)(byteBuffer.getShort() & 0xFFFF);
    radioNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final RadioIdentifier rhs = (RadioIdentifier)obj;

     if( ! (siteNumber == rhs.siteNumber)) ivarsEqual = false;
     if( ! (applicationNumber == rhs.applicationNumber)) ivarsEqual = false;
     if( ! (referenceNumber == rhs.referenceNumber)) ivarsEqual = false;
     if( ! (radioNumber == rhs.radioNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" siteNumber: ").append(siteNumber).append("\n");
    sb.append(" applicationNumber: ").append(applicationNumber).append("\n");
    sb.append(" referenceNumber: ").append(referenceNumber).append("\n");
    sb.append(" radioNumber: ").append(radioNumber).append("\n");

   return sb.toString();
 }
} // end of class